package ru.topbun.aviasales_effective_mobile.navigation.aviaTickets

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.topbun.avia_tickets.navigation.AviaTicketsNavigation
import ru.topbun.aviasales_effective_mobile.navigation.aviaTickets.AviaTicketsNavigationImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface AviaTicketsNavigationModule{

    @Binds
    @Singleton
    fun bindAviaTicketsNavigation(
        impl: AviaTicketsNavigationImpl
    ): AviaTicketsNavigation

}

