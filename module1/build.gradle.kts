import org.jetbrains.kotlin.gradle.plugin.PLUGIN_CLASSPATH_CONFIGURATION_NAME

plugins {
    kotlin("jvm") version ("2.2.20")
}

dependencies {
    add(PLUGIN_CLASSPATH_CONFIGURATION_NAME, project(":plugin"))
}