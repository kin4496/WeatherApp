package com.example.convention

enum class BuildType(val applicationIdSuffix: String? = null) {
    DEBUG(".debug"),
    RELEASE,
}