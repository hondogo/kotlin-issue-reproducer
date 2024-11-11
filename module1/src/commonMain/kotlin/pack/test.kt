package pack

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
inline fun TestComposable( // if remove 'inline' there will be no warning will
    content: @Composable () -> Unit
) {
    Box(
        modifier = Modifier.background(
            color = MaterialTheme.colorScheme.primary // the cause of warning
        )
    ) {
        content()
    }
}
