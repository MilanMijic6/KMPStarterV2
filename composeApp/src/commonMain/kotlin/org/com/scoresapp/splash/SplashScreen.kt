package org.com.scoresapp.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.com.scoresapp.auth.login.LoginScreen
import org.com.scoresapp.main.MainScreen
import org.jetbrains.compose.resources.painterResource
import org.koin.compose.koinInject
import scoresapp.composeapp.generated.resources.Res
import scoresapp.composeapp.generated.resources.ic_logo

class SplashScreen : Screen {

    @Composable
    override fun Content() {
        val splashScreenViewModel: SplashViewModel = koinInject()
        val navigator = LocalNavigator.currentOrThrow
        ShowSplashContent()
        LaunchedEffect(Unit) {
            splashScreenViewModel.effect.collect {
                when (it) {
                    SplashContract.Effect.NavigateToLoginScreen -> navigator.push(LoginScreen())
                    SplashContract.Effect.NavigateToMainScreen -> navigator.push(MainScreen(navigator))
                }
            }
        }
    }
}

@Composable
private fun ShowSplashContent() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.Black
            ),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(Res.drawable.ic_logo),
                contentDescription = "Logo image"
            )
        }
    }
}