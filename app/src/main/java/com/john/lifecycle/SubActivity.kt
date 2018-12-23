package com.john.lifecycle

import android.app.Fragment
import android.os.Bundle
import android.os.PersistableBundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log

import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.v("LIFE_CYCLE", "Sub: onCreate")
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_sub)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onAttachedToWindow() {
        Log.v("LIFE_CYCLE", "Sub: onAttachedToWindow")
        super.onAttachedToWindow()
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        Log.v("LIFE_CYCLE", "Sub: onCreate with PersistableBundle")
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onDestroy() {
        Log.v("LIFE_CYCLE", "Sub: onDestroy")
        super.onDestroy()
    }


    override fun onPostCreate(savedInstanceState: Bundle?) {
        Log.v("LIFE_CYCLE", "Sub: onPostCreate")
        super.onPostCreate(savedInstanceState)
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        Log.v("LIFE_CYCLE", "SubActivity: onSaveInstanceState")
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        Log.v("LIFE_CYCLE", "SubActivity: onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onStart() {
        Log.v("LIFE_CYCLE", "Sub: onStart")
        super.onStart()
    }

    override fun onPostResume() {
        Log.v("LIFE_CYCLE", "Sub: onPostResume")
        super.onPostResume()
    }

    override fun onResume() {
        Log.v("LIFE_CYCLE", "Sub: onResume")
        super.onResume()
    }

    override fun onResumeFragments() {
        Log.v("LIFE_CYCLE", "Sub: onResumeFragments")
        super.onResumeFragments()
    }

    override fun onStop() {
        Log.v("LIFE_CYCLE", "Sub: onStop")
        super.onStop()
    }

    override fun onPause() {
        Log.v("LIFE_CYCLE", "Sub: onPause")
        super.onPause()
    }

    override fun onAttachFragment(fragment: Fragment?) {
        Log.v("LIFE_CYCLE", "Sub: onAttachFragment")
        super.onAttachFragment(fragment)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        Log.v("LIFE_CYCLE", "Sub: onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState)
    }
}
