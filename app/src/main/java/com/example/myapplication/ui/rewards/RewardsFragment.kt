package com.example.myapplication.ui.rewards

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.myapplication.R
import com.example.myapplication.adapters.rewardsAdapter.RewardsRecyclerAdapter
import com.example.myapplication.databinding.FragmentRewardsBinding
import timber.log.Timber


class RewardsFragment : Fragment() {


    private var _binding: FragmentRewardsBinding? = null
    private val binding: FragmentRewardsBinding
        get() = _binding!!
    private val viewModel: RewardsViewModel by activityViewModels()
    private val adapter : RewardsRecyclerAdapter by lazy {
        RewardsRecyclerAdapter()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setHasOptionsMenu(true)
        _binding = FragmentRewardsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerviewRewards.adapter = adapter
        viewModel.bonusesList.observe(viewLifecycleOwner) {
            adapter.setData(it)
        }
        viewModel.refreshStatus.observe(viewLifecycleOwner) {
            binding.swipeRefreshLayout.isRefreshing = it
        }
        binding.swipeRefreshLayout.setOnRefreshListener {
            viewModel.getBonuses()
        }
        if (viewModel.firstDownload)
            viewModel.getBonuses()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.refresh -> {
                Timber.d("fragment refreshed")
                viewModel.getBonuses()
            }
        }
        return NavigationUI.onNavDestinationSelected(
            item,
            findNavController()
        ) || super.onOptionsItemSelected(item)
    }
}