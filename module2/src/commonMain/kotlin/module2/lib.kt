package module2

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties


@Composable
fun <E> Test1(
    arg: E?
) {
    Popup(
        properties = PopupProperties(),
        onDismissRequest = { }
    ) {
        Test2(
            arg = arg
        )
    }
}


@Suppress("NOTHING_TO_INLINE")
@Composable
inline fun <E> Test2(
    arg: E?
) {
    LazyColumn {
        items(
            items = emptyList<E>(),
        ) {
            val x: E? by remember {
                @Suppress("UNCHECKED_CAST")
                mutableStateOf(null)
            }
        }
    }
}