package br.com.example.koinsample.ui.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.example.koinsample.db.DatabaseConf
import br.com.example.koinsample.network.RetrofitConf

class HomeViewModel(val service: RetrofitConf, val database: DatabaseConf): ViewModel() {

    val observe: MutableLiveData<String> = MutableLiveData()

    init {
        Log.d("APP", "INIT VIEWMODEL")
        observe.postValue("aaaa")
    }


}