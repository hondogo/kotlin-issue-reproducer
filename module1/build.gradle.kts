plugins {
    kotlin("multiplatform")
}

kotlin {
    js {
        browser()
        binaries.executable()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-browser:0.4")


            }
        }
    }
}