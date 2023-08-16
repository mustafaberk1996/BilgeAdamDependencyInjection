package com.example.dependecyinjection.data.di

import com.example.dependecyinjection.data.repository.PostRepository
import com.example.dependecyinjection.data.repository.PostRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun providePostRepository(postRepositoryImpl: PostRepositoryImpl):PostRepository = postRepositoryImpl

}