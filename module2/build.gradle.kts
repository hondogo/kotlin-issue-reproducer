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
        binaries.library()
    }
    wasmJs {
        browser()
        binaries.library()
    }
    jvm()
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.compose.runtime:runtime:1.11.0-beta01")
                implementation("org.jetbrains.compose.foundation:foundation:1.11.0-beta01")
                implementation("org.jetbrains.compose.ui:ui:1.11.0-beta01")
            }
        }
    }
}