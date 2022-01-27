package com.example.dependencyinjectiondeom

import com.anushka.didemo.SmartPhone
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MemoryCardModule::class,BatteryModule::class])
interface SmartPhoneComponent {
//    fun getSmartPhone():SmartPhone
    // create injector function
    fun inject(mainActivity: MainActivity)

}