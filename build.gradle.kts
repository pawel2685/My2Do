// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.4" apply false // AGP latest stable version
    id("com.android.library") version "8.7.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false // Latest stable Kotlin version
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Other dependencies are now managed in the plugins block above.
    }
}

tasks.register<Delete>("clean") {
    delete(layout.buildDirectory)
}

