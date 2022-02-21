package com.example.myapplication.ui.review

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.myapplication.ui.rewards.RewardsViewModel
import com.example.myapplication.databinding.FragmentRewardsBinding

class ReviewFragment : Fragment() {

    private val viewModel: RewardsViewModel by activityViewModels()
    private var _binding: FragmentRewardsBinding? = null
    private val binding: FragmentRewardsBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRewardsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}