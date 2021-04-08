package com.example.mypillreminder.features.addeditpill

import android.app.Activity
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
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
import androidx.navigation.fragment.navArgs
import com.example.mypillreminder.R
import com.example.mypillreminder.databinding.FragmentAddEditPillBinding
import me.himanshusoni.quantityview.QuantityView
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf
import java.util.*


class AddEditPillFragment : Fragment(), QuantityView.OnQuantityChangeListener {

    private val args by navArgs<AddEditPillFragmentArgs>()
    private lateinit var binding: FragmentAddEditPillBinding
    private lateinit var navController: NavController
    private val viewModel: AddEditPillViewModel by viewModel {
        parametersOf(args.pillIdentifier)
    }

    val REQUEST_IMAGE = 100


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        navController = findNavController()

        binding = FragmentAddEditPillBinding.inflate(layoutInflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        binding.quantityViewInterval.onQuantityChangeListener = this

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        if (args.pillIdentifier.isNullOrEmpty()) { requireActivity().title = getString( R.string.pagetitle_add) }
        else{ requireActivity().title =getString( R.string.pagetitle_edit) }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        observeViewModel()
    }

    private fun observeViewModel() {

        viewModel.navigateToHome.observe(viewLifecycleOwner, Observer {
            if (it == true) { // Observed state is true.

                this.findNavController().navigate(
                    AddEditPillFragmentDirections.actionAddEditPillFragmentToHomeFragment()
                )
                viewModel.doneNavigating()
            }
        })

        viewModel.openChooseDate.observe(viewLifecycleOwner, Observer {
            if (it == true) { // Observed state is true.

                pickDateTime()
                viewModel.doneChooseDate()
            }
        })

        viewModel.openChooseImage.observe(viewLifecycleOwner, {
            if (it == true) { // Observed state is true.

                selectProfilePicture()
                viewModel.doneChooseImage()
            }
        })


        viewModel.interval.observe(viewLifecycleOwner, {
            binding.quantityViewInterval.quantity = it
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
        viewModel.setStartDate(pickedDateTime.timeInMillis)
        Log.i("MYTAG", pickedDateTime.toString())
    }

    override fun onQuantityChanged(oldQuantity: Int, newQuantity: Int, programmatically: Boolean) {
        Log.i("MYTAG", newQuantity.toString())
        Toast.makeText(context, "onQuantityChanged : $newQuantity", Toast.LENGTH_SHORT).show()
        viewModel.setInterval(newQuantity)
    }

    override fun onLimitReached() {

    }


    fun selectProfilePicture(){
        val intent = Intent(Intent.ACTION_GET_CONTENT).apply {
            type = "image/*"
        }
        if (intent.resolveActivity(requireActivity().packageManager) != null){
            startActivityForResult(intent, REQUEST_IMAGE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE && resultCode == Activity.RESULT_OK){
            val imageUri = data?.data
//            Log.i("MYTAG", "URI ${imageUri}")
            val profilePicturePath = imageUri.toString()
            viewModel.setImagePath(profilePicturePath!!)
//            binding.uploadProfilePictureImageView.setImageURI(imageUri)

        }
    }
}