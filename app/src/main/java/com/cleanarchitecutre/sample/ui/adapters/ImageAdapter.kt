package com.cleanarchitecutre.sample.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.cleanarchitecutre.domain.entity.ImageEntity
import com.cleanarchitecutre.sample.databinding.ViewHolderImageBinding

class ImageAdapter : ListAdapter<ImageEntity, ImageAdapter.ImageViewHolder>(ImageDiffCallback) {
    inner class ImageViewHolder(private val binding: ViewHolderImageBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(imageEntity: ImageEntity) {
            binding.text.text = imageEntity.downloadUrl
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ViewHolderImageBinding.inflate(layoutInflater, parent, false)
        return ImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}