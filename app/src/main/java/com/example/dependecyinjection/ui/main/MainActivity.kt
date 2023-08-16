package com.example.dependecyinjection.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.dependecyinjection.R
import com.example.dependecyinjection.data.model.Car
import com.example.dependecyinjection.data.model.DieselEngine
import com.example.dependecyinjection.data.model.GasolineEngine
import com.example.dependecyinjection.data.model.MetinPrinter
import com.example.dependecyinjection.data.model.Phone
import com.example.dependecyinjection.data.model.ZebraPrinter
import com.example.dependecyinjection.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {



    private lateinit var binding:ActivityMainBinding

    private val viewModel:MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnGetPosts.setOnClickListener {
            viewModel.getAllPosts()
        }



        val car = Car(GasolineEngine())
        val car2 = Car(DieselEngine())

//        car.drive()
//        car2.drive()
//
//        val phone = Phone()
//        phone.setPrinter(metinPrinter)
//
//        val phone1 = Phone()
//        phone1.setPrinter(zebraPrinter)
//
//        phone.searchAndPair()
//        phone1.searchAndPair()

    }
}