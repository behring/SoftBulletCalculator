package behring.launchingsimulation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import behring.launchingsimulation.ui.ComponentSelectionScreen
import behring.launchingsimulation.ui.SimulationRecordScreen
import behring.launchingsimulation.ui.SimulationScreen
import behring.launchingsimulation.ui.theme.SoftBulletCalculatorTheme
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SoftBulletCalculatorTheme {
                val navController = rememberNavController()
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavHost(navController, startDestination = "simulationRecord") {
                        composable("simulationRecord") {
                            SimulationRecordScreen(navController)
                        }
                        composable("componentSelection") {
                            ComponentSelectionScreen(navController)
                        }
                        composable("simulation") {
                            SimulationScreen(navController)
                        }


                    }
                }
            }
        }
    }
}

//NativeLaunchingSimulationApi().launchSimulation(
//cylinderLength = 1f,
//cylinderInsideDiameter = 2f,
//springLength = 3f,
//springOutsideDiameter = 4f,
//springThickness = 5f,
//springPreloadLength = 6f,
//pistonMess = 7f,
//barrelLength = 8f,
//barrelCaliber = 9f,
//bulletMess = 10f
//)

fun generateMockSimulationRecordItems(): List<SimulationRecordItem> {
    return List(20) { index ->
        val dateFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
        val currentTime = dateFormat.format(Date())

        SimulationRecordItem(
            time = currentTime,
            energyUtilization = (index + 1) * 5 // Mock data for energy utilization
        )
    }
}

data class SimulationRecordItem(
    val time: String,
    val energyUtilization: Int
)