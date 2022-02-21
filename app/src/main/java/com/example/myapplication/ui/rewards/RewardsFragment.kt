package com.example.myapplication.ui.rewards

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.myapplication.adapters.RewardsRecyclerAdapter
import com.example.myapplication.data.RewardsData
import com.example.myapplication.databinding.FragmentRewardsBinding
import kotlin.random.Random


class RewardsFragment : Fragment() {


    private var _binding: FragmentRewardsBinding? = null
    private val binding: FragmentRewardsBinding
        get() = _binding!!
    private val viewModel: RewardsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRewardsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = RewardsRecyclerAdapter(
            requireContext(), generateData(100)
        )
        binding.recyclerviewRewards.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun generateData(size: Int): List<RewardsData> {
        val rnd = Random(1337)
        val list: MutableList<RewardsData> = mutableListOf()
        for (i in 0 until size) {
            list.add(RewardsData(rnd.nextInt(size).toString(), rnd.nextInt()))
        }
        return list.toList()
    }
}