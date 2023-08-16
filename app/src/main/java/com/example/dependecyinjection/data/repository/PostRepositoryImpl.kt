package com.example.dependecyinjection.data.repository

import com.example.dependecyinjection.data.model.Post
import com.example.dependecyinjection.data.service.PostService
import retrofit2.Retrofit
import javax.inject.Inject

class PostRepositoryImpl @Inject constructor(
    private val retrofit: Retrofit
):PostRepository {


    override suspend fun getAllPosts(): List<Post> {
      return retrofit.create(PostService::class.java).getAll()
    }


}