import androidx.compose.desktop.Window
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp

fun main() = Window(title = "Material components", size = IntSize(600, 900)) {
    var text by remember { mutableStateOf("Insribirse ahora") }

    MaterialTheme {
        val typography = MaterialTheme.typography

        Card(elevation = 8.dp, modifier = Modifier.padding(24.dp)) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    "Maestría en ciencias computacionales",
                    style = typography.h5
                )
                Text(
                    "Amigo Oscar ",
                    style = typography.body1
                )
                Text(
                    "Enero 2019",
                    style = typography.body2
                )
                Spacer(Modifier.height(16.dp))
                Image(
                    bitmap = imageFromResource("mcc_aula.jpeg"),
                    contentDescription = null,
                    modifier = Modifier
                        .height(240.dp)
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(8.dp)),
                    contentScale = ContentScale.Crop
                )
                Spacer(Modifier.height(16.dp))
                Button(onClick = {
                    text = "Inscribirse ahora"
                }) {
                    Text(text)
                }
                Spacer(Modifier.height(16.dp))
                Text(
                    """
                        La maestría en ciencias computacionales del instituto tecnológico de culiacán
                        En el personal docente se incluye a la dra. María Lucía Barrón Estrada y al dr. Ricardo Quintero
                    """.trimIndent(),
                    style = typography.body2,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                for (name in 1..5) {
                    Text("Hello $name")
                }
            }
        }
    }
}
