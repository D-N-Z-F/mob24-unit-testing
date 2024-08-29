package com.daryl.mob24test.ui.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {
    val message: MutableStateFlow<String> = MutableStateFlow("")
    suspend fun fetchData(): String {
        delay(1000L)
        return "Hello World"
    }
    fun loadMessage() {
        viewModelScope.launch {
            message.value = "HelloStateFlow"
        }
    }
    fun greet(): String = "Hello Unit Test"
}