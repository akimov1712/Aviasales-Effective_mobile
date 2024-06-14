package ru.topbun.aviasales_effective_mobile.navigation.choiceDirection

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.topbun.choice_derection.navigation.ChoiceDirectionNavigation
import ru.topbun.aviasales_effective_mobile.navigation.choiceDirection.ChoiceDirectionNavigationImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface ChoiceDirectionNavigationModule{

    @Binds
    @Singleton
    fun bindChoiceDirectionNavigation(
        impl: ChoiceDirectionNavigationImpl
    ): ChoiceDirectionNavigation

}

