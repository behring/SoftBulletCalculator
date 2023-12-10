package behring.launchingsimulation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import behring.launchingsimulation.generateMockSimulationRecordItems
import behring.launchingsimulation.ui.theme.SoftBulletCalculatorTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimulationScreen(navController: NavController) {
    Scaffold(
        bottomBar = {  // Fixed button at the bottom
            Button(
                onClick = {
                    // Navigate to SimulationScreen on button click
                    navController.navigate("simulationRecord")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(text = "关闭")
            }
        },
        content = { it ->
           Text("Simulation")
        },
    )

}


@Preview(showBackground = true)
@Composable
fun SimulationScreenPreview() {
    SoftBulletCalculatorTheme {
        SimulationScreen(rememberNavController())
    }
}