package com.example.appretrofit.data.remote

import com.example.appretrofit.data.model.Post
import retrofit2.http.GET

interface PostApi {
    @GET("posts")
    suspend fun getPosts(): List<Post>
}
