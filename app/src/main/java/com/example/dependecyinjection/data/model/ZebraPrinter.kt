package com.example.dependecyinjection.data.model

class ZebraPrinter:Printer {
    override fun search() {
        println("zebra printer is searching")
    }

    override fun pair(): Boolean {
        return true
    }


}