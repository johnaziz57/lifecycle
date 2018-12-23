package com.john.lifecycle

import android.app.Activity
import android.content.Context
import android.support.v4.app.Fragment
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A placeholder fragment containing a simple view.
 */
class MainActivityFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.v("LIFE_CYCLE", "MainFragment: onCreateView")
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.v("LIFE_CYCLE", "MainFragment: onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onAttach(activity: Activity?) {
        Log.v("LIFE_CYCLE", "MainFragment: onAttach")
        super.onAttach(activity)
    }

    override fun onAttach(context: Context?) {
        Log.v("LIFE_CYCLE", "MainFragment: onAttach")
        super.onAttach(context)
    }

    override fun onStart() {
        Log.v("LIFE_CYCLE", "MainFragment: onStart")
        super.onStart()
    }

    override fun onStop() {
        Log.v("LIFE_CYCLE", "MainFragment: onStop")
        super.onStop()
    }

    override fun onResume() {
        Log.v("LIFE_CYCLE", "MainFragment: onResume")
        super.onResume()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.v("LIFE_CYCLE", "MainFragment: onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        Log.v("LIFE_CYCLE", "MainFragment: onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroy() {
        Log.v("LIFE_CYCLE", "MainFragment: onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.v("LIFE_CYCLE", "MainFragment: onDetach")
        super.onDetach()
    }

    override fun onPause() {
        Log.v("LIFE_CYCLE", "MainFragment: onPause")
        super.onPause()
    }

    override fun onDestroyView() {
        Log.v("LIFE_CYCLE", "MainFragment: onDestroyView")
        super.onDestroyView()
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        Log.v("LIFE_CYCLE", "MainFragment: onViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }
}
