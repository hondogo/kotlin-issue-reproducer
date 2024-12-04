package test

import pack.throwTestException
import pack.tryTest
import kotlin.test.Test

class Test1 {

    @Test
    fun test() {
        tryTest {
            throwTestException() // fail with: java.lang.IllegalAccessError: failed to access class pack.TestException from class test.Test1 (pack.TestException and test.Test1 are in unnamed module of loader 'app')
        }
    }
}