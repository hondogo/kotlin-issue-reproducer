plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm { }
    sourceSets.jvmMain.dependencies {
        implementation(kotlin("test"))
    }
}