plugins {
    id("weather.android.application")
    id("weather.android.application.compose")
    id("weather.android.feature")
    id("weather.android.hilt")
}

android {
    namespace = "com.example.weatherapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.weatherapp"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.splashscreen)
    implementation(libs.bundles.androidx.navigation)
    implementation(libs.material3.compose)
    implementation(libs.coil.compose)
    implementation(libs.activity.compose)

    implementation(libs.retrofit.core)
    implementation(libs.retrofit.kotlin.serialization)
    implementation(libs.okhttp.logging)
    implementation(libs.bundles.coroutine)
    implementation(libs.kotlinx.serialization.json)

    debugImplementation(libs.ui.tooling)
}