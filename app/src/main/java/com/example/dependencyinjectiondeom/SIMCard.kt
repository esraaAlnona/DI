package com.anushka.didemo

import android.util.Log
import javax.inject.Inject

class SIMCard @Inject constructor(private val serviceProvider: ServiceProvider) {
    // we can set the falue of this field from main activity this called field injection
    //public lateinit var serviceProvider: ServiceProvider


    init {
        Log.i("MYTAG","SIM Card Constructed")
    }
// method injection <Dependency injection using function>
//    fun setServiceProvider(){
//        this.serviceProvider = serviceProvider
//    }
    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}