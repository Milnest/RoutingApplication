package com.milnest.routingapplication.Presentation.Start

import android.support.v4.app.FragmentManager
import android.view.View
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.milnest.routingapplication.R

@InjectViewState
class StartPresenter : MvpPresenter<StartView>(){
    private lateinit var fragmentManager: FragmentManager
    fun setFragmentManager(supportFragmentManager: FragmentManager?) {
        fragmentManager = supportFragmentManager!!
    }

    val onClickListener: View.OnClickListener
        get() = object : View.OnClickListener {
            override fun onClick(item: View?) {
               // val fragmentDiagram = fragmentManager.findFragmentById(R.id.diagramFragment)
                val fragmentTransaction = fragmentManager.beginTransaction()
                when (item!!.id) {
                    R.id.button_to_diag -> {
                        /*if (fragmentDiagram == null) {
                            fragmentTransaction.add(R.id.container, DiagramFragment())
                        }
                        else {
                            fragmentTransaction.replace(R.id.container, fragmentDiagram)
                        }*/
                    }
                }
                fragmentTransaction.addToBackStack("fragmentDiag")
                fragmentTransaction.commit()
            }

        }
}