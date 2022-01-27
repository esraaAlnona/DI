package com.example.dependencyinjectiondeom

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class BatteryModule {

    @Binds
    abstract fun providesBattery(batteryImplementation: BatteryImplementation):Battery
}