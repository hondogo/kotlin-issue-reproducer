import androidx.compose.runtime.Composable


@Composable
fun App() {
    Test(TestArgImpl())
}


@Composable
fun Test(
    arg: TestArg
) {
    arg.test {

    }
}