package com.example.dependecyinjection.data.model

class MetinPrinter:Printer {
    override fun search() {
       println("metin printer is searching")
    }

    override fun pair(): Boolean {
        return false
    }
}