plugins {
    id("com.android.library") version "8.7.3"
    id("org.jetbrains.kotlin.android") version "2.1.0"
}

android {
    namespace = "com.example.feature"
    compileSdk = 35
    defaultConfig {
        minSdk = 24
    }
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}
