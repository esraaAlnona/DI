package com.example.dependencyinjectiondeom

import android.app.Application

class SmartPhoneApplication : Application() {
    // define instance of the smart phone component interface
    lateinit var smartPhoneComponent:SmartPhoneComponent
    override fun onCreate() {
        smartPhoneComponent = initDagger()
        super.onCreate()
    }
    // create function to initialize dagger related component
    private fun initDagger() :SmartPhoneComponent =  DaggerSmartPhoneComponent.builder()
        .memoryCardModule(MemoryCardModule(100))
        .build()
}