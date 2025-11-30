import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


class TestValueImpl : TestValue {
    @Composable
    override fun compose(modifier: Modifier) {
        BasicTextField(
            value = "AAA",
            onValueChange = {},
            modifier = modifier
        )
    }
}

class TestContainerImpl : TestContainer {
    @Composable
    override fun layout(content: @Composable () -> Unit) {
        content()
    }
}

@Composable
fun App() {
    TestValueImpl().compose(TestContainerImpl()) // Js and WasmJs fails with IrLinkageError, Jvm working OK
 }