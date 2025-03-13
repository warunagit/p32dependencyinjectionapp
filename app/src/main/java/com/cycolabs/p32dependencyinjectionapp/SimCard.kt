package com.cycolabs.p32dependencyinjectionapp

import android.util.Log

class SimCard() {

    //method injection
    //private lateinit var serviceProvider: ServiceProvider

    //field injection
    public lateinit var serviceProvider: ServiceProvider

    fun setServiceProvider(serviceProvider: ServiceProvider){
        this.serviceProvider = serviceProvider
    }

    init {
        Log.i("TAGY","Sim Card Created")

    }

    fun connectToNetwork(){
        serviceProvider.getServiceProvider()
    }
}