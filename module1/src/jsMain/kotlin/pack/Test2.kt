package pack

class Test2(
    val name: String = test2()
) {

    companion object {
        fun test2(): String {
            return Test1.test1() + "B"
        }
    }
}