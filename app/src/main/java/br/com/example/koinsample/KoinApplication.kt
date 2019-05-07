package br.com.example.koinsample

import android.app.Application
import android.util.Log
import br.com.example.koinsample.ki.AppModule
import br.com.example.koinsample.ui.home.injection.HomeModule
import org.koin.android.ext.android.startKoin

class KoinApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d("APP", "In6it application")
        startKoin(this, listOf(AppModule.globalModule, HomeModule.myModule))
    }
}