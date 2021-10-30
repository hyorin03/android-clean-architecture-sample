package com.cleanarchitecutre.sample.ui.adapters

import androidx.recyclerview.widget.DiffUtil
import com.cleanarchitecutre.domain.entity.ImageEntity

object ImageDiffCallback : DiffUtil.ItemCallback<ImageEntity>() {
    override fun areItemsTheSame(oldItem: ImageEntity, newItem: ImageEntity): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ImageEntity, newItem: ImageEntity): Boolean {
        return oldItem == newItem
    }
}