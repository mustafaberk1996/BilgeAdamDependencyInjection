package com.example.dependecyinjection.data.model

class DieselEngine:Engine {

    override fun start():String {
        return "Diesel Engine calisti"
    }

    override fun stop(): String {
        TODO("Not yet implemented")
    }

    override fun isFault(): Boolean {
        TODO("Not yet implemented")
    }
}