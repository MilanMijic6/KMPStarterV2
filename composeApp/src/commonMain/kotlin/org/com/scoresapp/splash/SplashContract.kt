package org.com.scoresapp.splash

import org.com.scoresapp.ViewEvent
import org.com.scoresapp.ViewSideEffect
import org.com.scoresapp.ViewState

class SplashContract {
    sealed class Event : ViewEvent

    class State : ViewState

    sealed class Effect : ViewSideEffect {
        data object NavigateToMainScreen : Effect()
        data object NavigateToLoginScreen : Effect()
    }
}