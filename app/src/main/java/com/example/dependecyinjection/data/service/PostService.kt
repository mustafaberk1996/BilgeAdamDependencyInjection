package com.example.dependecyinjection.data.service

import com.example.dependecyinjection.data.model.Post
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface PostService {


    @GET("posts")
    suspend fun getAll():List<Post>

    @POST("posts")
    fun create(@Body post:Post)


}