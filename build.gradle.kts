import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnLockMismatchReport
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnPlugin
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnRootExtension

plugins {
    kotlin("multiplatform") version "2.2.20-Beta2" apply false
    kotlin("plugin.compose") version "2.2.20-Beta2" apply false
    id("org.jetbrains.compose") version "1.9.0-beta01" apply false
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

plugins.withType(YarnPlugin::class.java) {
    project.configure<YarnRootExtension> {
        yarnLockMismatchReport = YarnLockMismatchReport.NONE
        reportNewYarnLock = true
        yarnLockAutoReplace = true
    }
}