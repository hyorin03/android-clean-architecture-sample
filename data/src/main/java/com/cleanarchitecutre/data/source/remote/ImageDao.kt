package com.cleanarchitecutre.data.source.remote

import com.cleanarchitecutre.data.source.model.Image
import retrofit2.http.GET

interface ImageDao {
    @GET("v2/list")
    suspend fun fetchImages(): List<Image>

}