package br.com.example.koinsample.ui.home

import br.com.example.koinsample.R
import br.com.example.koinsample.ui.activity.BaseActivy

class StartActivity: BaseActivy() {

    override fun getLayoutResource(): Int {
        return R.layout.activity_start
    }

    override fun getNavigationHost(): Int {
        return R.id.nav_host
    }

}