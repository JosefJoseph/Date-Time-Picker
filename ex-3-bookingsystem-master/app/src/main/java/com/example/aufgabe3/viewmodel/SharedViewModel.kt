package com.example.aufgabe3.viewmodel

import androidx.lifecycle.ViewModel
import com.example.aufgabe3.model.BookingEntry
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SharedViewModel: ViewModel() {
    private val _bookingsEntries = MutableStateFlow<List<BookingEntry>>(emptyList())
    val bookingsEntries: StateFlow<List<BookingEntry>> = _bookingsEntries

    fun addBookingEntry(bookingEntry: BookingEntry){
        // TODO create a new booking entry and save it
        val newBookingEntry = bookingEntry
        _bookingsEntries.value += newBookingEntry
    }

    fun deleteBookingEntry(bookingEntry: BookingEntry){
        // TODO delete a new booking entry
        val newBookingEntry = bookingEntry
        _bookingsEntries.value -= newBookingEntry
    }
}