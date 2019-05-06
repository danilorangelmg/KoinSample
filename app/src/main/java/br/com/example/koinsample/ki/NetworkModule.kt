package br.com.example.koinsample.ki

import br.com.example.koinsample.network.RetrofitConf
import org.koin.dsl.module.module

object NetworkModule {

    val retrofitModule = module {
        single { RetrofitConf() }
    }
}