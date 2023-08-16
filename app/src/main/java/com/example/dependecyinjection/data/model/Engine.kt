package com.example.dependecyinjection.data.model

interface Engine {

    fun start():String
    fun stop():String
    fun isFault():Boolean

}