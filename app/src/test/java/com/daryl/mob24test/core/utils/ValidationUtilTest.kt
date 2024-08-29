package com.daryl.mob24test.core.utils

import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class ValidationUtilTest {
    @Test
    fun `validateEmail should return true for a@adotcom`() {
        assertTrue(ValidationUtil.validateEmail("a@a.com"))
    }
    @Test
    fun `validateEmail should return false for a@1234`() {
        assertFalse(ValidationUtil.validateEmail("a@1234"))
    }
    @Test
    fun `validateEmail should return false for a@adotcom$`() {
        assertFalse(ValidationUtil.validateEmail("a@a.com$"))
    }
}