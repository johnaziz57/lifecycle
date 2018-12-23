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
class SubActivityFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.v("LIFE_CYCLE", "SubFragment: onCreateView")
        return inflater.inflate(R.layout.fragment_sub, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.v("LIFE_CYCLE", "SubFragment: onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onAttach(activity: Activity?) {
        Log.v("LIFE_CYCLE", "SubFragment: onAttach")
        super.onAttach(activity)
    }

    override fun onAttach(context: Context?) {
        Log.v("LIFE_CYCLE", "SubFragment: onAttach")
        super.onAttach(context)
    }

    override fun onStart() {
        Log.v("LIFE_CYCLE", "SubFragment: onStart")
        super.onStart()
    }

    override fun onStop() {
        Log.v("LIFE_CYCLE", "SubFragment: onStop")
        super.onStop()
    }

    override fun onResume() {
        Log.v("LIFE_CYCLE", "SubFragment: onResume")
        super.onResume()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.v("LIFE_CYCLE", "SubFragment: onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        Log.v("LIFE_CYCLE", "SubFragment: onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroy() {
        Log.v("LIFE_CYCLE", "SubFragment: onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.v("LIFE_CYCLE", "SubFragment: onDetach")
        super.onDetach()
    }

    override fun onPause() {
        Log.v("LIFE_CYCLE", "SubFragment: onPause")
        super.onPause()
    }

    override fun onDestroyView() {
        Log.v("LIFE_CYCLE", "SubFragment: onDestroyView")
        super.onDestroyView()
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        Log.v("LIFE_CYCLE", "SubFragment: onViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }
}
