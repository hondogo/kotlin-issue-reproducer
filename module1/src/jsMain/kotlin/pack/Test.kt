package pack

class Test(
    val name: String = test()
) {

    companion object {
        fun test(): String {
            return "A"
        }
    }
}