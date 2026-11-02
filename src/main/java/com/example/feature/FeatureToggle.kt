package com.example.feature

class FeatureToggle(private val defaults: Map<String, Boolean>) {
    private val overrides = mutableMapOf<String, Boolean>()

    fun isEnabled(key: String): Boolean = overrides[key] ?: defaults[key] ?: false

    fun reset(key: String) {
        overrides.remove(key)
    }

    fun override(key: String, enabled: Boolean) {
        overrides[key] = enabled
    }
}
