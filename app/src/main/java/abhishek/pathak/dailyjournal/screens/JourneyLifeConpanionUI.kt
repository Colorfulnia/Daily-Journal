package abhishek.pathak.dailyjournal.screens

import abhishek.pathak.dailyjournal.R
import abhishek.pathak.dailyjournal.ui.theme.ColumnBackground
import abhishek.pathak.dailyjournal.ui.theme.TextColor
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun JourneyCompanionScreenPrev() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(ColumnBackground),
        horizontalAlignment = Alignment.CenterHorizontally,
        //verticalArrangement = Arrangement.Center

    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = R.drawable.baseline_library_books_24),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)
                    .padding(top = 20.dp, end = 5.dp)
            )
            Text(
                text = "JOURNEY",
                color = TextColor,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 20.dp)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.c7),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .padding(15.dp)
        )



        Text(
            text = "Your Life Companion",
            color = TextColor,
            fontSize = 40.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(15.dp)

        )
        Text(
            text = "Journey is a place to keep your memories and confide in privately",
            color = TextColor,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 15.dp, end = 15.dp)

        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .wrapContentHeight()
                .padding(top = 40.dp),
            colors = ButtonDefaults.buttonColors(TextColor)
        ) {
            Text(text = "Next")
        }

    }
}

    @Preview
    @Composable
    fun ShowJourneyCompanionScreenPrev() {
        Box {
            JourneyCompanionScreenPrev()
        }
    }

