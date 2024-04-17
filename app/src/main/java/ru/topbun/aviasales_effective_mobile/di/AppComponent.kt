package ru.topbun.aviasales_effective_mobile.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import ru.topbun.aviasales_effective_mobile.MainActivity

@ApplicationScope
@Component(
    modules = [
        DomainModule::class,
        DataModule::class
    ]
)
interface AppComponent {

    fun inject(activity: MainActivity)

    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance application: Application
        ): AppComponent
    }

}