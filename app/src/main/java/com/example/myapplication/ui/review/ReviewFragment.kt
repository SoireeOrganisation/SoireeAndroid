package com.example.myapplication.ui.review

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.CompoundButton
import android.widget.TableRow
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.myapplication.R
import com.example.myapplication.data.Category
import com.example.myapplication.databinding.FragmentReviewBinding
import com.example.myapplication.network.ResponseState
import com.google.android.material.radiobutton.MaterialRadioButton
import com.google.android.material.textview.MaterialTextView
import timber.log.Timber

class ReviewFragment : Fragment() {


    private var _binding: FragmentReviewBinding? = null
    private val binding: FragmentReviewBinding
        get() = _binding!!
    private val args: ReviewFragmentArgs by navArgs()
    private val viewModel: ReviewViewModel by viewModels { ReviewViewModelFactory(args.workerData) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setHasOptionsMenu(true)
        _binding = FragmentReviewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Timber.d("myData: ${args.workerData}")
        viewModel.categoriesList.observe(viewLifecycleOwner) {
            updateView(it)
        }
        viewModel.getCategories()
        binding.buttonSubmit.setOnClickListener {
            getMarks()
        }
        viewModel.responseState.observe(viewLifecycleOwner) {
            binding.progressBar.visibility = View.INVISIBLE
            when (it) {
                ResponseState.ERROR -> Toast.makeText(
                    requireContext(),
                    resources.getString(R.string.post_failed),
                    Toast.LENGTH_SHORT
                ).show()
                ResponseState.LOADING -> binding.progressBar.visibility = View.VISIBLE
                ResponseState.SUCCESSFUL -> {
                    val action =
                        ReviewFragmentDirections.actionRateFragmentToStaffFragment(args.workerData.id)
                    findNavController().navigate(action)
                    Toast.makeText(
                        requireContext(),
                        resources.getString(R.string.post_successful),
                        Toast.LENGTH_SHORT
                    ).show()
                }
                else -> {
                    Timber.d("none")
                }
            }
        }
    }

    private fun getMarks() {
        val list: MutableList<Int> = mutableListOf()
        for (i in 1 until binding.tableLayout.childCount) {
            val row = binding.tableLayout.getChildAt(i) as TableRow
            var flag = false
            for (j in 1 until row.childCount) {
                val child = row.getChildAt(j) as CompoundButton
                if (child.isChecked) {
                    flag = true
                    list.add(child.id)
                }
            }
            if (!flag) {
                Toast.makeText(
                    requireContext(),
                    resources.getString(R.string.not_all_fields_filled),
                    Toast.LENGTH_SHORT
                ).show()
                return
            }
        }
        viewModel.postMarks(list)
    }

    private fun updateView(categories: List<Category>) {
        while (binding.tableLayout.childCount > 1) {
            binding.tableLayout.removeViewAt(binding.tableLayout.childCount - 1)
        }
        categories.forEach {
            Timber.d("category: $it")
            val tr = TableRow(requireContext())
            tr.id = View.generateViewId()
            tr.layoutParams = ViewGroup.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
            )

            tr.addView(createTextView(it.name))
            for (i in 1 until 6) {
                val child = MaterialRadioButton(requireContext())
                child.gravity = Gravity.CENTER
                child.layoutParams = TableRow.LayoutParams(
                    TableRow.LayoutParams.MATCH_PARENT,
                    TableRow.LayoutParams.WRAP_CONTENT
                )
                child.id = i
                child.setOnCheckedChangeListener { buttonView, isChecked ->
                    resetButtons(tr, buttonView, isChecked)
                }
                tr.addView(child)
            }
            binding.tableLayout.addView(tr)
        }
    }

    private fun resetButtons(tr: TableRow, btn: CompoundButton, state: Boolean) {
        if (!state)
            return
        for (i in 1 until tr.childCount) {
            val child = (tr.getChildAt(i) as CompoundButton)
            Timber.d("${tr.childCount}")
            if (child != btn)
                child.isChecked = false
        }
    }


    private fun createTextView(s: String): MaterialTextView {
        val label = MaterialTextView(requireContext())
        label.id = View.generateViewId()
        label.text = s
        val params = TableRow.LayoutParams(
            TableRow.LayoutParams.MATCH_PARENT,
            TableRow.LayoutParams.WRAP_CONTENT
        )
        params.weight = 1f
        label.layoutParams = params
        return label
    }



}



