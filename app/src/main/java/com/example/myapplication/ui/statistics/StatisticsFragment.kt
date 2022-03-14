package com.example.myapplication.ui.statistics

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
import com.example.myapplication.adapters.userAdapter.UserReviewRecyclerAdapter
import com.example.myapplication.databinding.FragmentStatisticsBinding
import com.example.myapplication.network.DataResponseState
import timber.log.Timber


class StatisticsFragment : Fragment() {

    private val viewModel: StatisticsViewModel by activityViewModels()
    private var _binding: FragmentStatisticsBinding? = null
    private val binding: FragmentStatisticsBinding
        get() = _binding!!

    private val adapter: UserReviewRecyclerAdapter by lazy {
        UserReviewRecyclerAdapter(requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setHasOptionsMenu(true)
        _binding = FragmentStatisticsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.statisticsRecyclerView.adapter = adapter
        viewModel.responseStatus.observe(viewLifecycleOwner) {
            when (it) {
                DataResponseState.LOADING -> {
                    binding.swipeRefreshLayout.isRefreshing = true
                    binding.statusTextView.visibility = View.INVISIBLE
                }
                DataResponseState.ERROR -> {
                    binding.swipeRefreshLayout.isRefreshing = false
                    binding.statusTextView.text = resources.getString(R.string.refresh_error)
                    binding.statusTextView.visibility = View.VISIBLE
                }
                DataResponseState.EMPTY -> {
                    Timber.d("is empty")
                    binding.swipeRefreshLayout.isRefreshing = false
                    binding.statusTextView.text = resources.getString(R.string.statistics_empty)
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
            viewModel.reviewList.observe(viewLifecycleOwner) {
                adapter.setData(it)
            }
            binding.swipeRefreshLayout.setOnRefreshListener {
                viewModel.getReviews()
            }
            if (viewModel.firstDownload)
                viewModel.getReviews()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.refresh -> {
                Timber.d("fragment refreshed")
                viewModel.getReviews()
            }
        }
        return NavigationUI.onNavDestinationSelected(
            item,
            findNavController()
        ) || super.onOptionsItemSelected(item)
    }
}
