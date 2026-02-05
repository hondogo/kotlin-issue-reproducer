package module2

import org.jetbrains.skiko.wasm.onWasmReady

actual fun onReady(lambda: ()-> Unit) {
    onWasmReady(lambda)
}