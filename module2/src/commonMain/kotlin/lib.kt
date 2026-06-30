import androidx.compose.runtime.Composable


interface TestArg {
    @Composable
    fun test(
        arg0: @Composable (() -> Unit)? = null
    ) {
        arg0?.invoke()
    }
}


class TestArgImpl : TestArg {
    @Composable
    override fun test(
        arg0: @Composable (() -> Unit)?
    ) {
        arg0?.invoke()
    }
}