package com.milnest.routingapplication.Presentation.Main

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.milnest.routingapplication.R

class MainActivity : MvpAppCompatActivity(), MainView {
    @InjectPresenter
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.setFragmentManager(supportFragmentManager)
        presenter.createFragment()
    }
}
