package com.cycolabs.p32dependencyinjectionapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //dependancy injection
    //1-through constructor
    //2-through method


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val battery = Battery()
        val display = Display()
        val serviceProvider = ServiceProvider()
        val simCard = SimCard(serviceProvider)
        val mobile = Mobile(battery,simCard,display)*/

        //dependancy inject through method
        val serviceProvider = ServiceProvider()
        val simCard = SimCard()
        simCard.setServiceProvider(serviceProvider)

        //dependancy injection through constructor
        val mobile = Mobile(
            Battery(),
            simCard,
            Display())

        mobile.turnOnMobile()
    }
}