package com.cleanarchitecutre.domain.entity

data class ImageEntity(
    val id: String,
    val author: String,
    val width: String,
    val height: String,
    val source: String,
    val downloadUrl: String,
)
