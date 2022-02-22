package com.example.myapplication.ui.statistics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.myapplication.adapters.UserReviewRecyclerAdapter
import com.example.myapplication.databinding.FragmentStatisticsBinding


class StatisticsFragment : Fragment() {

    private val viewModel: StatisticsViewModel by activityViewModels()
    private var _binding: FragmentStatisticsBinding? = null
    private val binding: FragmentStatisticsBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStatisticsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.refreshStatus.observe(viewLifecycleOwner) {
            binding.swipeRefreshLayout.isRefreshing = it
        }
        viewModel.reviewList.observe(viewLifecycleOwner) {
            binding.statisticsRecyclerView.adapter = UserReviewRecyclerAdapter(requireContext(), it)
        }
        binding.swipeRefreshLayout.setOnRefreshListener {
            viewModel.getReviews()
        }
        viewModel.getReviews()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
