package com.example.dependecyinjection.data.repository

import com.example.dependecyinjection.data.model.Post

interface PostRepository {

    suspend fun getAllPosts():List<Post>
}