package com.milnest.routingapplication.Presentation.Main

import android.support.v4.app.FragmentManager
import com.arellomobile.mvp.MvpPresenter
import com.milnest.routingapplication.Presentation.Start.StartFragment
import com.milnest.routingapplication.R

class MainPresenter : MvpPresenter<MainView>() {

    private lateinit var fragmentManager: FragmentManager

    fun setFragmentManager(supportFragmentManager: FragmentManager) {
        fragmentManager = supportFragmentManager
    }

    fun createFragment(){
        val fragmentTransaction = fragmentManager.beginTransaction()
        if (fragmentManager.findFragmentById(R.id.startFragment) == null) {
            fragmentTransaction.add(R.id.container, StartFragment())
            //fragmentTransaction.addToBackStack("fragmentStart")
            fragmentTransaction.commit()
        }
    }
}