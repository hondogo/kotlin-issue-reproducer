import pack.Test

fun main() {
}

// if put it in pack/Test.kt file then prod build also run successfully
@Suppress("DEPRECATION")
@OptIn(ExperimentalStdlibApi::class)
@EagerInitialization
val init = run {
    println(Test().name)
}