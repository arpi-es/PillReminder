package com.example.mypillreminder.features.home

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.mypillreminder.R
import com.example.mypillreminder.databinding.FragmentHomeBinding
import com.example.mypillreminder.service.model.Pill
import com.example.mypillreminder.view.adapter.PillAdapter
import com.example.mypillreminder.view.callback.PillClickCallback
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.util.*

class HomeFragment : Fragment() {

    companion object {
        private const val TAG = "HomeFragment"
    }

    val viewModel: HomeViewModel by viewModel()
    private lateinit var binding: FragmentHomeBinding

    private lateinit var pillAdapter: PillAdapter

    private lateinit var navController: NavController

    private val pillClickCallback = object : PillClickCallback {

        override fun onTakeClick(pill: Pill) {
            viewModel.onTakeClicked(pill)
            binding.pillList.adapter?.notifyDataSetChanged()
        }

        override fun onAlreadyTakenClick(pill: Pill) {
            viewModel.onAlreadyTakenClick(pill)
        }

        override fun onSkipClick(pill: Pill) {
            viewModel.onSkipClick(pill)
            binding.pillList.adapter?.notifyDataSetChanged()
        }

        override fun onEditClicked(pill: Pill) {
            val action = HomeFragmentDirections.actionHomeFragmentToAddEditPillFragment(pill.pillIdentifier)
            navController.navigate(action)
        }

        override fun onDeleteClicked(pill: Pill) {
            viewModel.onDeleteClicked(pill)
            binding.pillList.adapter?.notifyDataSetChanged()
        }
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        navController = findNavController()

        pillAdapter = PillAdapter(pillClickCallback)
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        binding.pillList.apply {
            adapter = pillAdapter

        }

        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        setItemTouchHelper()

        return binding.root
    }


    private fun setItemTouchHelper(){
        ItemTouchHelper(object :
            ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT.or(ItemTouchHelper.RIGHT)) {
            override fun onMove(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder, target: RecyclerView.ViewHolder): Boolean {
                return false
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val pill= pillAdapter.getItemPillAt(viewHolder.adapterPosition)
                viewModel.onItemSwiped(pill)
                Toast.makeText(context, "Note Deleted!", Toast.LENGTH_SHORT).show()
            }

        }
        ).attachToRecyclerView(binding.pillList)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        observeViewModel()
    }

    override fun onResume() {
        super.onResume()
        requireActivity().title = getString(R.string.app_name)
//        (activity as AppCompatActivity?)!!.supportActionBar!!.title = getString(R.string.app_name)
    }

    private fun observeViewModel() {
        viewModel.navigateToAddPill.observe(viewLifecycleOwner, Observer {
            if (it == true) { // Observed state is true.
//                navigateToAddEditPage(-1)
                val action = HomeFragmentDirections.actionHomeFragmentToAddEditPillFragment(null)
                navController.navigate(action)
                viewModel.doneNavigating()
            }
        })

        viewModel.openChooseDate.observe(viewLifecycleOwner, Observer {
            if (it == true) { // Observed state is true.
                pickDateTime()
                viewModel.doneChooseDate()
            }
        })
    }

    private fun pickDateTime() {
        val currentDateTime = Calendar.getInstance()
        val startYear = currentDateTime.get(Calendar.YEAR)
        val startMonth = currentDateTime.get(Calendar.MONTH)
        val startDay = currentDateTime.get(Calendar.DAY_OF_MONTH)
        val startHour = currentDateTime.get(Calendar.HOUR_OF_DAY)
        val startMinute = currentDateTime.get(Calendar.MINUTE)

        DatePickerDialog(requireContext(), { _, year, month, day ->

            TimePickerDialog(requireContext(), { _, hour, minute ->
                val pickedDateTime = Calendar.getInstance()
                pickedDateTime.set(year, month, day, hour, minute)
//                    doSomethingWith(pickedDateTime)
                dateTimeSet(pickedDateTime)

            }, startHour, startMinute, false).show()
        }, startYear, startMonth, startDay).show()


    }

    fun dateTimeSet(pickedDateTime: Calendar) {
        viewModel.setLastTakenDate(pickedDateTime.timeInMillis)
        Log.i("MYTAG", pickedDateTime.toString())
    }
}

