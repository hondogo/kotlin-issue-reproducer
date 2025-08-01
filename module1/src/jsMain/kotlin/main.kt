import androidx.compose.material3.Text
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.window
import org.jetbrains.skiko.wasm.onWasmReady


@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    window.onload = {
        println("test")
        onWasmReady {
            ComposeViewport(
                viewportContainerId = "viewport"
            ) {
                Text(
                    text = "test"
                )
            }
        }
    }
}
