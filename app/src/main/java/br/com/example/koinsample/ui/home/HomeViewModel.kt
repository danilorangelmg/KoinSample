package br.com.example.koinsample.ui.home

import android.util.Log
import androidx.lifecycle.ViewModel
import br.com.example.koinsample.network.RetrofitConf

class HomeViewModel(val service: RetrofitConf): ViewModel() {

    init {
        Log.d("APP", "INIT VIEWMODEL")
    }

}