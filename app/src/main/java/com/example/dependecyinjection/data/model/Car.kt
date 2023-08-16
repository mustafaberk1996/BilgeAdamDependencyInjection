package com.example.dependecyinjection.data.model

class Car(private val engine: Engine) {

    //private val engine:DieselEngine = DieselEngine()

    fun drive(){
       val isEngineRun = engine.start()
        println(isEngineRun)
    }
}