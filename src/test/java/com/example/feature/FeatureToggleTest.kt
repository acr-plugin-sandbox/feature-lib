package com.example.feature

import org.junit.Assert.assertTrue
import org.junit.Test

class FeatureToggleTest {
    @Test
    fun usesDefaults() {
        assertTrue(FeatureToggle(mapOf("sync" to true)).isEnabled("sync"))
    }
}
