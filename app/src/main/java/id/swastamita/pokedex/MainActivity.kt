package id.swastamita.pokedex

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.ramcosta.composedestinations.DestinationsNavHost
import id.swastamita.pokedex.model.User
import id.swastamita.pokedex.ui.screen.LoginScreen
import id.swastamita.pokedex.ui.screen.NavGraphs
import id.swastamita.pokedex.ui.screen.PostScreen
import id.swastamita.pokedex.ui.screen.ProfileScreen
import id.swastamita.pokedex.ui.theme.PokedexTheme
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokedexTheme {
                DestinationsNavHost(navGraph = NavGraphs.root)
            }
        }
    }
}