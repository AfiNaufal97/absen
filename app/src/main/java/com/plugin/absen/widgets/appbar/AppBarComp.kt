import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.plugin.absen.R
import com.plugin.absen.ui.theme.MainColor
import com.plugin.absen.ui.theme.White
import com.plugin.absen.widgets.text.TextComp

@Composable
fun AppBarComp(title: String) {
    TopAppBar(
        modifier = Modifier
            .fillMaxWidth(),
        elevation = 0.dp,
        backgroundColor = MainColor,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 12.dp),

            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(modifier = Modifier
                    .width(30.dp)
                    .height(30.dp)
                    .clickable {

                    }, contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_arrow_back),
                        contentDescription = "Back Button",
                        modifier = Modifier
                            .width(7.dp)
                            .height(12.dp),
                        tint = White
                    )
                }

                Spacer(modifier = Modifier.width(10.dp))
                TextComp(text = title, size = 14.0)
            }


            Box(modifier = Modifier
                .width(30.dp)
                .height(30.dp)
                .clickable {

                }, contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_cart),
                    contentDescription = "Back Button",
                    modifier = Modifier
                        .width(20.dp)
                        .height(15.dp),
                    tint = White
                )
            }
        }

    }
}