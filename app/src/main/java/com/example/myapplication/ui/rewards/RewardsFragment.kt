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
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapters.itemDecorators.GridMarginItemDecoration
import com.example.myapplication.adapters.rewardsAdapter.RewardsRecyclerAdapter
import com.example.myapplication.databinding.FragmentRewardsBinding
import com.example.myapplication.network.DataResponseState
import timber.log.Timber


class RewardsFragment : Fragment() {


    private var _binding: FragmentRewardsBinding? = null
    private val binding: FragmentRewardsBinding
        get() = _binding!!
    private val viewModel: RewardsViewModel by activityViewModels()
    private val adapter: RewardsRecyclerAdapter by lazy {
        RewardsRecyclerAdapter(requireContext())
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
        binding.recyclerviewRewards.addItemDecoration(
            GridMarginItemDecoration(
                resources.getDimensionPixelSize(
                    R.dimen.cardview_margin
                ), 2
            )
        )
        viewModel.bonusesList.observe(viewLifecycleOwner) {
            adapter.setData(it)
        }
        viewModel.responseStatus.observe(viewLifecycleOwner) {
            when (it) {
                DataResponseState.LOADING -> {
                    binding.swipeRefreshLayout.isRefreshing = true
                    binding.statusTextView.visibility = View.INVISIBLE
                }
                DataResponseState.ERROR -> {
                    Timber.d("error happened")
                    binding.swipeRefreshLayout.isRefreshing = false
                    binding.statusTextView.text = resources.getString(R.string.refresh_error)
                    binding.statusTextView.visibility = View.VISIBLE
                }
                DataResponseState.EMPTY -> {
                    Timber.d("is empty")
                    binding.swipeRefreshLayout.isRefreshing = false
                    binding.statusTextView.text = resources.getString(R.string.rewards_empty)
                    binding.statusTextView.visibility = View.VISIBLE
                }
                DataResponseState.FULL -> {
                    binding.swipeRefreshLayout.isRefreshing = false
                    binding.statusTextView.visibility = View.INVISIBLE
                }
                else -> {
                    binding.swipeRefreshLayout.isRefreshing = false
                    binding.statusTextView.visibility = View.INVISIBLE
                    Timber.d("None")
                }
            }
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