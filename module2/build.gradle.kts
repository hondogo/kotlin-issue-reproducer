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
                implementation("org.jetbrains.compose.runtime:runtime:1.12.0-beta02")
                implementation("org.jetbrains.compose.foundation:foundation:1.12.0-beta02")
                implementation("org.jetbrains.compose.ui:ui:1.12.0-beta02")
            }
        }
    }
}