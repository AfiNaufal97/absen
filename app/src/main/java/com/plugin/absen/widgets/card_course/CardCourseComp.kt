import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.plugin.absen.R
import com.plugin.absen.ui.theme.Grey
import com.plugin.absen.ui.theme.Orange
import com.plugin.absen.ui.theme.SecondaryColor
import com.plugin.absen.ui.theme.SecondaryDarkColor
import com.plugin.absen.widgets.text.TextComp

@Composable
fun CardCourseComp(
    title: String,
    money: String,
    textColor: Color = Color.Black,
    course: Boolean = false,
    imageUrl: String? = null,
    creatorName: String = "Creator",
    level: String = "All Level",
    imageInLeft: Boolean = true
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),

            ) {
            if (imageInLeft)
                Card(
                    modifier = Modifier
                        .width(75.dp)
                        .height(75.dp),
                    shape = RoundedCornerShape(15.dp),
                    backgroundColor = SecondaryColor
                ) {
                    if (imageUrl == null)

                        Icon(
                            painter = painterResource(id = R.drawable.ic_cirlce),
                            tint = Grey,
                            modifier = Modifier
                                .padding(25.dp),
                            contentDescription = "Image Default"
                        )
                    else
                        Image(
                            painter = rememberAsyncImagePainter(model = imageUrl),
                            contentDescription = "image from url"
                        )
                }

            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Column {
                    TextComp(text = title, size = 12.0, textColor)
                    Spacer(modifier = Modifier.height(5.dp))
                    TextComp(text = money, size = 12.0, textColor)
                }

                if (course)
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            modifier = Modifier
                                .width(10.dp)
                                .height(10.dp),
                            tint = Orange,
                            imageVector = Icons.Default.Star,
                            contentDescription = "Icon Image"
                        )

                        TextComp(text = creatorName, size = 12.0, textColor)
                        Spacer(modifier = Modifier.width(5.dp))
                        TextComp(text = level, size = 12.0, textColor)
                    }
                else
                    Spacer(modifier = Modifier)
            }

            if (!imageInLeft)
                if (imageUrl == null)
                    Image(
                        painter = painterResource(id = R.drawable.ic_profile),
                        contentDescription = "Image Default"
                    )
                else
                    Image(
                        painter = rememberAsyncImagePainter(model = imageUrl),
                        contentDescription = "image from url"
                    )

        }
    }
}