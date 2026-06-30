plugins {
    kotlin("multiplatform") version "2.4.20-Beta1" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.4.20-Beta1" apply false
    id("org.jetbrains.compose") version "1.12.0-alpha02" apply false
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