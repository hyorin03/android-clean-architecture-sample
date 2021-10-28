package com.cleanarchitecutre.data.mapper

import com.cleanarchitecutre.data.source.model.Image
import com.cleanarchitecutre.domain.entity.ImageEntity

object ImageMapper {

    fun mapperFromRemote(image: Image): ImageEntity {
        return ImageEntity(
            id = image.id,
            author = image.author,
            width = image.width,
            height = image.height,
            source = image.url,
            downloadUrl = image.downloadUrl
        )
    }
}