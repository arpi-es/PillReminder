package com.example.mypillreminder.view.callback

import com.example.mypillreminder.service.model.Pill

interface PillClickCallback {

    fun onTakeClick(pill: Pill)
    fun onAlreadyTakenClick(pill: Pill)
    fun onSkipClick(pill: Pill)
    fun onEditClicked(pill: Pill)
    fun onDeleteClicked(pill: Pill)
}