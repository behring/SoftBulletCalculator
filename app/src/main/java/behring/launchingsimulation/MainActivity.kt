package behring.launchingsimulation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import behring.launchingsimulation.data.NativeLaunchingSimulationApi
import behring.launchingsimulation.ui.theme.SoftBulletCalculatorTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SoftBulletCalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                    Button(modifier = Modifier.size(30.dp), onClick = {
                        NativeLaunchingSimulationApi().launchSimulation(
                            cylinderLength = 1f,
                            cylinderInsideDiameter = 2f,
                            springLength = 3f,
                            springOutsideDiameter = 4f,
                            springThickness = 5f,
                            springPreloadLength = 6f,
                            pistonMess = 7f,
                            barrelLength = 8f,
                            barrelCaliber = 9f,
                            bulletMess = 10f
                        )
                    }) {
                        Text("start")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SoftBulletCalculatorTheme {
        Greeting("Android")
    }
}