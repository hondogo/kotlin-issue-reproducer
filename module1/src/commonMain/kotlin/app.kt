import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun TestCompose(
    arg: @Composable () -> Unit
) {
    arg()
}

@Composable
fun TestCompose1() {
    Text(
        text = "Test"
    )
}


@Composable
fun App() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        TestCompose(::TestCompose1) // for Web target (Js or WasmJs) method reference fails with compiler internal error. For JVM it is OK
    }
}