@file:OptIn(ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.kotlin.plugin.compose")
    id("org.jetbrains.compose")
}


kotlin {
    js {
        outputModuleName = "composeApp"
        browser {
            commonWebpackConfig {
                outputFileName = "composeApp.js"
            }
        }
        binaries.executable()
    }
    wasmJs {
        outputModuleName = "composeApp"
        browser {
            commonWebpackConfig {
                outputFileName = "composeApp.js"
            }
        }
        binaries.executable()
    }
    jvm()
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.compose.runtime:runtime:1.11.0-alpha01")
                implementation("org.jetbrains.compose.foundation:foundation:1.11.0-alpha01")
                implementation("org.jetbrains.compose.ui:ui:1.11.0-alpha01")
                implementation("org.jetbrains.compose.material3:material3:1.11.0-alpha01")
            }
        }
        val jvmMain by getting {
            dependencies {
                runtimeOnly(compose.desktop.currentOs)
            }
        }
    }
}