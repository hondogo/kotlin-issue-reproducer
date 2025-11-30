import androidx.compose.ui.window.Window
import androidx.compose.ui.window.awaitApplication

suspend fun main() { // Jvm working OK
    awaitApplication {
        Window(
            onCloseRequest = {exitApplication()}
        ) {
            App()
        }
    }
}