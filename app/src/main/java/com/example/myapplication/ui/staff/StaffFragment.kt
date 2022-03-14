package com.example.myapplication.ui.staff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.NavigationUI
import com.example.myapplication.R
import com.example.myapplication.adapters.staffAdapter.StaffRecyclerAdapter
import com.example.myapplication.databinding.FragmentStaffBinding
import timber.log.Timber

class StaffFragment : Fragment() {

    private val viewModel: ReviewViewModel by activityViewModels()
    private var _binding: FragmentStaffBinding? = null
    private val binding: FragmentStaffBinding
        get() = _binding!!
    private val staffAdapter : StaffRecyclerAdapter by lazy {
        StaffRecyclerAdapter()
    }
    private val args : StaffFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setHasOptionsMenu(true)
        _binding = FragmentStaffBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.reviewRecyclerView.adapter = staffAdapter
        viewModel.staffDataList.observe(viewLifecycleOwner) {
            staffAdapter.setData(it)
        }
        viewModel.refreshStatus.observe(viewLifecycleOwner) {
            binding.swipeRefreshLayout.isRefreshing = it
        }
        binding.swipeRefreshLayout.setOnRefreshListener {
            viewModel.downloadStaff()
        }
        if (viewModel.firstDownload) {
            viewModel.downloadStaff()
        }
        if(args.removeId != -1){
            viewModel.removeWithId(args.removeId)
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
                viewModel.downloadStaff()
            }
        }
        return NavigationUI.onNavDestinationSelected(
            item,
            findNavController()
        ) || super.onOptionsItemSelected(item)
    }

}