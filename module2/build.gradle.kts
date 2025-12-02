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
    jvm()
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.compose.runtime:runtime:1.10.0-rc01")
                implementation("org.jetbrains.compose.foundation:foundation:1.10.0-rc01")
                implementation("org.jetbrains.compose.ui:ui:1.10.0-rc01")
            }
        }
    }
}