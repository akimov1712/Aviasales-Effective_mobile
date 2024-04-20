package ru.topbun.aviasales_effective_mobile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.topbun.domain.repositories.AviaSalesRepository
import ru.topbun.domain.useCases.GetDetailsTicketsUseCase
import ru.topbun.domain.useCases.GetOffersUseCase
import ru.topbun.domain.useCases.GetTicketsUseCase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DomainModule {

    @[Provides Singleton]
    fun provideGetOffersUseCase(repository: AviaSalesRepository) = GetOffersUseCase(repository)

    @[Provides Singleton]
    fun provideGetTicketsUseCase(repository: AviaSalesRepository) = GetTicketsUseCase(repository)

    @[Provides Singleton]
    fun provideGetDetailsTicketsUseCase(repository: AviaSalesRepository) = GetDetailsTicketsUseCase(repository)

}