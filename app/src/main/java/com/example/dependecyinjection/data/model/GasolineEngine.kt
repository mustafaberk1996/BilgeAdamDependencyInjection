package com.example.dependecyinjection.data.model

class GasolineEngine:Engine {
    override fun start(): String {
        return "Gasoline Engine calisti"
    }

    override fun stop(): String {
        TODO("Not yet implemented")
    }

    override fun isFault(): Boolean {
        TODO("Not yet implemented")
    }
}