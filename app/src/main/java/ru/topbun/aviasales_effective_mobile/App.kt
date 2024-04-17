package ru.topbun.aviasales_effective_mobile

import android.app.Application
import ru.topbun.aviasales_effective_mobile.di.DaggerAppComponent

class App: Application() {

    val component by lazy {
        DaggerAppComponent.factory().create(this)
    }
}