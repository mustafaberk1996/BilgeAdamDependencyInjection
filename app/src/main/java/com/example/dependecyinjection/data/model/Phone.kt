package com.example.dependecyinjection.data.model

class Phone {

    private var printer: Printer? = null


    fun setPrinter(printer: Printer){
        this.printer = printer
    }

    fun searchAndPair(){
        printer?.search()
        printer?.pair()
    }
}