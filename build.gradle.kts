import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnLockMismatchReport
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnPlugin
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnRootExtension

plugins {
    kotlin("multiplatform") version "2.2.20-Beta2" apply false
}

allprojects {
    group = "org.example"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

plugins.withType(YarnPlugin::class.java) {
    project.configure<YarnRootExtension> {
        yarnLockMismatchReport = YarnLockMismatchReport.NONE
        reportNewYarnLock = true
        yarnLockAutoReplace = true
    }
}