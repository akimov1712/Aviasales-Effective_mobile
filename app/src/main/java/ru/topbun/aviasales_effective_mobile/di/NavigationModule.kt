package ru.topbun.aviasales_effective_mobile.di

import android.content.Context
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ru.topbun.aviasales_effective_mobile.R
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class NavigationModule {

    @[Provides Singleton]
    fun provideNavController(activity: FragmentActivity): NavController {
        val navHostFragment = activity.supportFragmentManager
            .findFragmentById(R.id.app_fragment_container) as NavHostFragment
        return navHostFragment.navController
    }
}