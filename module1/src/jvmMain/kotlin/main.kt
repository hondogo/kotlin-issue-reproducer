import androidx.compose.ui.window.Window
import androidx.compose.ui.window.awaitApplication
import module1.App

suspend fun main() { // Jvm working OK
    awaitApplication {
        Window(
            onCloseRequest = {exitApplication()}
        ) {
            App()
        }
    }
}