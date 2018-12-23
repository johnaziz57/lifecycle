package com.john.lifecycle

import android.app.Fragment
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.v("LIFE_CYCLE", "Main: onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            startActivity(Intent(this@MainActivity, SubActivity::class.java))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onAttachedToWindow() {
        Log.v("LIFE_CYCLE", "Main: onAttachedToWindow")
        super.onAttachedToWindow()
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        Log.v("LIFE_CYCLE", "Main: onCreate with PersistableBundle")
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onDestroy() {
        Log.v("LIFE_CYCLE", "Main: onDestroy")
        super.onDestroy()
    }


    override fun onPostCreate(savedInstanceState: Bundle?) {
        Log.v("LIFE_CYCLE", "Main: onPostCreate")
        super.onPostCreate(savedInstanceState)
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        Log.v("LIFE_CYCLE", "MainActivity: onSaveInstanceState")
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        Log.v("LIFE_CYCLE", "MainActivity: onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onStart() {
        Log.v("LIFE_CYCLE", "Main: onStart")
        super.onStart()
    }

    override fun onPostResume() {
        Log.v("LIFE_CYCLE", "Main: onPostResume")
        super.onPostResume()
    }

    override fun onResume() {
        Log.v("LIFE_CYCLE", "Main: onResume")
        super.onResume()
    }

    override fun onResumeFragments() {
        Log.v("LIFE_CYCLE", "Main: onResumeFragments")
        super.onResumeFragments()
    }

    override fun onStop() {
        Log.v("LIFE_CYCLE", "Main: onStop")
        super.onStop()
    }

    override fun onPause() {
        Log.v("LIFE_CYCLE", "Main: onPause")
        super.onPause()
    }

    override fun onAttachFragment(fragment: Fragment?) {
        Log.v("LIFE_CYCLE", "Main: onAttachFragment")
        super.onAttachFragment(fragment)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        Log.v("LIFE_CYCLE", "Main: onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState)
    }
}
