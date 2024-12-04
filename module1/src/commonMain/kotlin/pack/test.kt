package pack


inline fun tryTest(lambda: () -> Unit) {
    try {
        lambda()
    } catch (_: TestException) {
    }
}


fun throwTestException() {
    throw TestException
}


private object TestException : RuntimeException()
