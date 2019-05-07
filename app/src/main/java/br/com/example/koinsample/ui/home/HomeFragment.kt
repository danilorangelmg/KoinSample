package br.com.example.koinsample.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import br.com.example.koinsample.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment: Fragment() {

    val viewModel: HomeViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("APP", "INIT FRAGMENT")

        viewModel.observe.observe(this, Observer {
            Log.d("APP", it)
        })

        return layoutInflater.inflate(R.layout.fragment_home, container, false)
    }

}