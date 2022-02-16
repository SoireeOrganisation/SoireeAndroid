package com.example.myapplication.ui.statistics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
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

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
        }
}
