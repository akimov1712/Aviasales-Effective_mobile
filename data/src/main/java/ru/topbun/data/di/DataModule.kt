package ru.topbun.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.topbun.data.repositories.AviasalesRepositoryImpl
import ru.topbun.domain.repositories.AviaSalesRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

    @[Binds Singleton]
    fun bindAviasalesRepository(impl: AviasalesRepositoryImpl): AviaSalesRepository

}