import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


interface TestValue {

    @Composable
    fun compose(modifier: Modifier = Modifier)

    @Composable
    fun compose(
        container: TestContainer
    ) {
        container.layout {
            compose(Modifier)
        }
    }
}


interface TestContainer {

    @Composable
    fun layout(content: @Composable () -> Unit)
}
