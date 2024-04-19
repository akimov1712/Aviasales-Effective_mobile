package ru.topbun.aviasales_effective_mobile.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import ru.topbun.aviasales_effective_mobile.SingleActivity

@ApplicationScope
@Component(
    modules = [
        DomainModule::class,
        DataModule::class
    ]
)
interface AppComponent {

    fun inject(activity: SingleActivity)

    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance application: Application
        ): AppComponent
    }

}