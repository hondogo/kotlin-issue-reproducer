pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
    }
    plugins {
        val kotlinVersion = "2.1.0"

        kotlin("multiplatform").version(kotlinVersion)
    }
}

rootProject.name = "example"

include("module1")
