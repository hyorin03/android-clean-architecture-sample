package com.cleanarchitecutre.domain.usecase

import com.cleanarchitecutre.domain.entity.ImageEntity
import com.cleanarchitecutre.domain.repository.ImageRepository

class GetImagesUseCase(private val repository: ImageRepository) {
    suspend fun invoke(): List<ImageEntity> {
        return repository.fetchImages()
    }
}