package br.com.example.koinsample.ki

import br.com.example.koinsample.db.DatabaseConf
import br.com.example.koinsample.network.RetrofitConf
import org.koin.dsl.module.module

object AppModule {

    val globalModule = module {
        single { RetrofitConf() }
        single { DatabaseConf() }
    }
}