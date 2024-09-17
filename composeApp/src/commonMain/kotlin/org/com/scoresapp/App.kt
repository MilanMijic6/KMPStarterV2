package org.com.scoresapp

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import com.vega.di.apiModule
import com.vega.di.remoteModule
import com.vega.di.repositoryModule
import com.vega.di.settingsStorageModule
import com.vega.di.useCaseModule
import org.com.scoresapp.di.viewModelModule
import org.com.scoresapp.splash.SplashScreen
import org.koin.compose.KoinApplication

@Composable
fun App() {
    KoinApplication(
        application = {
            modules(
                viewModelModule + useCaseModule + repositoryModule + remoteModule + apiModule + settingsStorageModule
            )
        },
    ) {
        Navigator(
            screen = SplashScreen()
        ) {
            SlideTransition(it)
        }
    }
}

