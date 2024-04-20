package ru.topbun.api.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.topbun.api.ApiFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AviasalesApiModule {


    @[Provides Singleton]
    fun provideAviasalesDao() = ApiFactory.aviasalesApi

}