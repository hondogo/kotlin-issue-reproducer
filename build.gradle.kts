plugins {
    kotlin("multiplatform") version "2.3.0-RC2" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.3.0-RC2" apply false
    id("org.jetbrains.compose") version "1.10.0-rc01" apply false
}

allprojects {
    group = "org.example"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
    }
}