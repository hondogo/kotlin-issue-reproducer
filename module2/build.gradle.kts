@file:OptIn(ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.kotlin.plugin.compose")
    id("org.jetbrains.compose")
}


kotlin {
    js {
        browser()
        useEsModules()
        binaries.executable()
        browser {
            commonWebpackConfig {
                outputFileName = "composeApp.js"
            }
        }
    }
    wasmJs {
        browser()
        binaries.executable()
        browser {
            commonWebpackConfig {
                outputFileName = "composeApp.js"
            }
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.compose.runtime:runtime:1.11.0-alpha02")
                implementation("org.jetbrains.compose.foundation:foundation:1.11.0-alpha02")
                implementation("org.jetbrains.compose.ui:ui:1.11.0-alpha02")
                implementation("org.jetbrains.compose.material3:material3:1.11.0-alpha02")
            }
        }
    }
}