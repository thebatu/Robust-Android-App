package com.ahmedadel.robustandroid.presentation.mvvm.home.di

import androidx.lifecycle.ViewModelProvider
import com.ahmedadel.robustandroid.core.di.PresentationScope
import com.ahmedadel.robustandroid.core.di.scheduler.BaseSchedulerProviderModule
import com.ahmedadel.robustandroid.presentation.mvvm.di.ViewModelFactoryModule
import com.ahmedadel.robustandroid.presentation.mvvm.home.HomeViewModel
import dagger.Component

/**
 * Created at Tito on 3/16/19
 */

@PresentationScope
@Component(
    modules = [
        HomeMappersModule::class,
        HomeViewModelModule::class,
        ViewModelFactoryModule::class,
        BaseSchedulerProviderModule::class
    ],
    dependencies = [
        HomeUseCasesComponent::class
    ]
)
interface HomeViewModelComponent {

    fun homeViewModel(): HomeViewModel

    fun viewModelFactory(): ViewModelProvider.Factory

}