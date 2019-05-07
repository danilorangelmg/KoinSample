package br.com.example.koinsample.ui.home.injection

import br.com.example.koinsample.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

object HomeModule {
    val myModule = module {
        viewModel { HomeViewModel(get(), get()) }
    }
}