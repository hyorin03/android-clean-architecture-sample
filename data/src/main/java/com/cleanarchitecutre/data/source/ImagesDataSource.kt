package com.cleanarchitecutre.data.source

import com.cleanarchitecutre.data.source.model.Image

interface ImagesDataSource {
    suspend fun fetchImages(): List<Image>
}