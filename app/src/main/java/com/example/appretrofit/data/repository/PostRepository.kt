package com.example.appretrofit.data.repository

import com.example.appretrofit.data.model.Post
import com.example.appretrofit.data.remote.RetrofitInstance


class PostRepository {
    suspend fun getPosts(): List<Post> {
        return RetrofitInstance.api.getPosts()
    }
}