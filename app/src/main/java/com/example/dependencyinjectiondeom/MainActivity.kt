package com.example.dependencyinjectiondeom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anushka.didemo.SIMCard
import com.anushka.didemo.ServiceProvider
import com.anushka.didemo.SmartPhone
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var smartPhone: SmartPhone
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // write code to get the application & get the smart phone component from it
        (application as SmartPhoneApplication).smartPhoneComponent.inject(this)
        smartPhone.makeACallWithRecording()



            // .create cause error since our module has a state
//        DaggerSmartPhoneComponent.builder()
//            .memoryCardModule(MemoryCardModule(100))
//            .build().inject(this)


//        DaggerSmartPhoneComponent.create().inject(this)
//        smartPhone.makeACallWithRecording()

//        val battery = Battery()
//        val memoryCard = MemoryCard()
//        val serviceProvider = ServiceProvider()
//        val simCard = SIMCard(serviceProvider)
//        // this is the dependency injection we injected the dependency to the constructor
//        val smartPhone = SmartPhone(battery,simCard,memoryCard)
//        smartPhone.makeACallWithRecording()
//        val smartPhone : SmartPhone = SmartPhone(Battery(),
//            SIMCard(ServiceProvider()), MemoryCard()
//        )



    }
}