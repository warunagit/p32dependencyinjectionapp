package com.cycolabs.p32dependencyinjectionapp

import android.util.Log

class Mobile(val battery: Battery, val simCard: SimCard, val display: Display) {

    init {
        battery.displayBatteryPower()
        simCard.connectToNetwork()
        display.turnOnScreen()

        Log.i("TAGY","Mobile is created successfully")
    }

    fun turnOnMobile(){
        Log.i("TAGY","Mobile is turned on")
    }
}