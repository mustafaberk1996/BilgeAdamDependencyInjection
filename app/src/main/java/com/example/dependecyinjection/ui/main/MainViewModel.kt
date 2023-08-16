package com.example.dependecyinjection.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dependecyinjection.data.repository.PostRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val postRepository: PostRepository
):ViewModel() {


    fun getAllPosts(){
        //apiye iste atma
        viewModelScope.launch {
            postRepository.getAllPosts().forEach {
                println(it)
            }
        }
    }

}