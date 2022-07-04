package com.example.tiptime

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CalculatorTests {

    // inits first and interacts with the activity:
    @get:Rule()
    val activity = ActivityScenarioRule(MainActivity::class.java)

    // this calculates the test's logic:
    @Test
    fun calculate_20_percent_tip() {
    }
}

