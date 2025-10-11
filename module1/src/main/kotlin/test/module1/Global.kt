package test.module1


object Global {

    fun test(lambda: (GlobalContext) -> Unit) {
        lambda(GlobalContext())
    }
}


class GlobalContext {

    fun test() {
        println("test")
    }
}