package com.cleanarchitecutre.data.source.remote

import com.cleanarchitecutre.data.source.ImagesDataSource
import com.cleanarchitecutre.data.source.model.Image

class ImagesRemoteDataSourceImpl : ImagesDataSource {
    override suspend fun fetchImages(): List<Image> {
        return RetrofitClient.imageService.fetchImages()
    }
}