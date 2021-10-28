package com.cleanarchitecutre.domain.repository

import com.cleanarchitecutre.domain.entity.ImageEntity

interface ImageRepository {
    suspend fun getImages(): List<ImageEntity>
}