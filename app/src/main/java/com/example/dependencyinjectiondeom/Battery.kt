package com.example.dependencyinjectiondeom

import android.util.Log
import javax.inject.Inject

interface Battery {
//    init {
//        Log.i("MYTAG","Battery Constructed")
//    }

    fun getPower()

//    {
//        Log.i("MYTAG","Battery power is available")
//    }
}