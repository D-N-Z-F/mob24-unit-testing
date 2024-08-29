package com.daryl.mob24test.ui.viewModels

import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class HomeViewModelTest {
    private val viewModel = HomeViewModel()
    @Before
    fun setup() {
        val testDispatcher = UnconfinedTestDispatcher()
        Dispatchers.setMain(testDispatcher)
    }
    @After
    fun reset() {
        Dispatchers.resetMain()
    }
    @Test
    fun testCoroutine() = runTest {
        assertEquals(viewModel.fetchData(), "Hello World")
    }
    @Test
    fun testStateFlow() = runTest {
        // For some reason, when using a different Dispatcher like IO or Default, putting a delay
        // in a test would pass it. But without it, it will fail.
        viewModel.loadMessage()
        assertEquals(viewModel.message.value, "HelloStateFlow")
    }
}