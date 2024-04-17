package ru.topbun.aviasales_effective_mobile.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import ru.topbun.data.repositories.AviasalesRepositoryImpl
import ru.topbun.domain.useCases.GetDetailsTicketsUseCase
import ru.topbun.domain.useCases.GetOffersUseCase
import ru.topbun.domain.useCases.GetTicketsUseCase

@Module
class DomainModule {

    @ApplicationScope
    @Provides
    fun provideGetOffersUseCase(repository: AviasalesRepositoryImpl) = GetOffersUseCase(repository)

    @ApplicationScope
    @Provides
    fun provideGetTicketUseCase(repository: AviasalesRepositoryImpl) = GetTicketsUseCase(repository)

    @ApplicationScope
    @Provides
    fun provideGetDetailsTicketsUseCase(repository: AviasalesRepositoryImpl)
            = GetDetailsTicketsUseCase(repository)

}