package com.example.dependencyinjectiondeom

import android.util.Log
import dagger.Module
import dagger.Provides
import javax.inject.Inject

class BatteryImplementation @Inject constructor(): Battery {
    override fun getPower() {
        Log.i("MYTAG","power from esraa")
    }
}