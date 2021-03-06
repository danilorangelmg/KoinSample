package br.com.example.koinsample.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation

abstract class BaseActivy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResource())
    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, getNavigationHost()).navigateUp()
    }

    abstract fun getLayoutResource(): Int

    abstract fun getNavigationHost(): Int
}