package com.cleanarchitecutre.data.repository

import com.cleanarchitecutre.data.mapper.ImageMapper
import com.cleanarchitecutre.data.source.remote.ImagesRemoteDataSourceImpl
import com.cleanarchitecutre.domain.entity.ImageEntity
import com.cleanarchitecutre.domain.repository.ImageRepository

class ImageRepositoryImpl : ImageRepository {
    override suspend fun fetchImages(): List<ImageEntity> {
        return ImagesRemoteDataSourceImpl().fetchImages().map { image ->
            ImageMapper.mapperFromRemote(image)
        }
    }
}