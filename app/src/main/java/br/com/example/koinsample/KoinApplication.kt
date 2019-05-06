package br.com.example.koinsample

import android.app.Application
import android.util.Log
import br.com.example.koinsample.ui.home.injection.myModule
import org.koin.android.ext.android.startKoin

class KoinApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d("APP", "Init application")
        startKoin(this@KoinApplication, listOf(myModule))
    }
}