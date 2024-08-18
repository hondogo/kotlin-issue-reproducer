import pack.Test2

fun main() {
}

@Suppress("DEPRECATION")
@OptIn(ExperimentalStdlibApi::class)
@EagerInitialization
val init = run {
    println(Test2().name)
}