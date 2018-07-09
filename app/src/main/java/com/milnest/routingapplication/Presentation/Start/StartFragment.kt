package com.milnest.routingapplication.Presentation.Start

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.milnest.routingapplication.R

class StartFragment : MvpAppCompatFragment(), StartView {
    @InjectPresenter
    lateinit var presenter: StartPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        //presenter.setFragmentManager(activity!!.supportFragmentManager)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_start, container, false)
        bindViews()
        (activity as MvpAppCompatActivity).supportActionBar
/*        val actBar = (activity as AppCompatActivity).supportActionBar
        actBar!!.title = "Start"*/
        //actBar.setDisplayHomeAsUpEnabled(true)
        return view
    }

    private fun bindViews() {
        val diagButton: Button = view!!.findViewById(R.id.button_to_diag)
        //diagButton.setOnClickListener(presenter.onClickListener)
        (activity as MvpAppCompatActivity).supportActionBar!!.title = "Start"
    }

    /*override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item!!.itemId){
            android.R.id.home -> {}
        }
        return true
    }*/
}
