pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
    }
    plugins {
        val kotlinVersion = "2.1.0-RC"
        val composeVersion = "1.7.1"

        kotlin("multiplatform").version(kotlinVersion)
        kotlin("plugin.compose").version(kotlinVersion)
        id("org.jetbrains.compose").version(composeVersion)
    }
}

rootProject.name = "example"

include("module1")
