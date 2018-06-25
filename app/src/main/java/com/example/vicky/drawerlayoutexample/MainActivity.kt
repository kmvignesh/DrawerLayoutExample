package com.example.vicky.drawerlayoutexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBarDrawerToggle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mDrawerToggle : ActionBarDrawerToggle? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mDrawerToggle = ActionBarDrawerToggle(this,drawer_layout,toolbar,R.string.open,R.string.close)
        mDrawerToggle!!.syncState()
    }

    fun update(view : View){
        tv_content.text = (view as TextView).text
        drawer_layout!!.closeDrawer(8388611)
    }

}
