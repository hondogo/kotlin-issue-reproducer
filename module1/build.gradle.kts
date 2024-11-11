plugins {
    kotlin("multiplatform")
    kotlin("plugin.compose")
    id("org.jetbrains.compose")
}

kotlin {
    js {
        browser()
        binaries.executable()
    }
    sourceSets {
        val commonMain by getting  {
            dependencies {
                implementation(compose.material3)
            }
        }
    }
}