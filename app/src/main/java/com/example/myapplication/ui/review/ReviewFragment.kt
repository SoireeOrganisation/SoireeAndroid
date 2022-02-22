package com.example.myapplication.ui.review

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.myapplication.adapters.StaffRecyclerAdapter
import com.example.myapplication.databinding.FragmentReviewBinding
import com.example.myapplication.databinding.FragmentRewardsBinding

class ReviewFragment : Fragment() {

    private val viewModel: ReviewViewModel by activityViewModels()
    private var _binding: FragmentReviewBinding? = null
    private val binding: FragmentReviewBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentReviewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.staffDataList.observe(viewLifecycleOwner) {
            binding.reviewRecyclerView.adapter = StaffRecyclerAdapter(it)
        }
        viewModel.downloadStaff()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}