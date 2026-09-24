import androidx.compose.runtime.*


@Composable
fun App() {
    Test1(
        fetcher = { "test" }
    )
}

// Carshes for WEB target. For JVM target is OK
// when inline - then it crashes at build time with: java.lang.IllegalStateException: Given symbol is unbound and have no signature: Unbound private symbol org.jetbrains.kotlin.ir.symbols.impl.IrTypeParameterSymbolImpl@61cbafbd
// when not inline - then it crashes at runtime with: kotlin.internal.IrLinkageError: Reference to declaration 'result' can not be evaluated: Expression uses unlinked type parameter symbol '/Test1|Test1(kotlin.coroutines.SuspendFunction0<0:0>;androidx.compose.runtime.Composer?;kotlin.Int){0§<kotlin.Any>}[0]:1:2:3' declared in file app.kt
@Composable
fun <T : Any> Test1(
    fetcher: () -> T
) {
    LamdbaWrapper {
        var result: T? by remember { mutableStateOf(fetcher()) }
        result.toString() // when not inlined then crashes here
    }
}

@Composable
fun LamdbaWrapper(
    content: @Composable () -> Unit
) {
    content()
}