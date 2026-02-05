import androidx.compose.material3.Text
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import module2.onReady


@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    onReady {
        ComposeViewport(viewportContainerId = "ComposeTarget") {
            Text("")
        }
    }
}

