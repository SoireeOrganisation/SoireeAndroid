package com.example.myapplication.ui.staff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.myapplication.adapters.StaffRecyclerAdapter
import com.example.myapplication.databinding.FragmentStaffBinding

class StaffFragment : Fragment() {

    private val viewModel: ReviewViewModel by activityViewModels()
    private var _binding: FragmentStaffBinding? = null
    private val binding: FragmentStaffBinding
        get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStaffBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.staffDataList.observe(viewLifecycleOwner) {
            binding.reviewRecyclerView.adapter = StaffRecyclerAdapter(it)
        }
        viewModel.refreshStatus.observe(viewLifecycleOwner) {
            binding.swipeRefreshLayout.isRefreshing = it
        }
        viewModel.downloadStaff()
        binding.swipeRefreshLayout.setOnRefreshListener {
            viewModel.downloadStaff()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}