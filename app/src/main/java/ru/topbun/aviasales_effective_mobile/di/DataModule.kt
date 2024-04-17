package ru.topbun.aviasales_effective_mobile.di

import dagger.Module
import dagger.Provides
import ru.topbun.api.ApiFactory

@Module
class DataModule {

    @ApplicationScope
    @Provides
    fun provideAviasalesDao() = ApiFactory.aviasalesApi

}