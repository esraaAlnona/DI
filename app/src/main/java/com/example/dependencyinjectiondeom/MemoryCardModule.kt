package com.example.dependencyinjectiondeom

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule(val memorySize:Int) {
    // create provider function with <MemoryCard return type>
    @Provides
    fun providesMemoryCard():MemoryCard{
        Log.i("myTag","memory size is $memorySize")
        return MemoryCard()
    }
}