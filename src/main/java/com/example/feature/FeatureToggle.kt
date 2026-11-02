package com.example.feature

/** Feature switches, with an icon from the generated catalog. */
class FeatureToggle(private val defaults: Map<String, Boolean>) {
    private val overrides = mutableMapOf<String, Boolean>()

    fun isEnabled(key: String): Boolean = overrides[key] ?: defaults[key] ?: false

    fun override(key: String, enabled: Boolean) {
        overrides[key] = enabled
    }
}
