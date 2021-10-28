package com.cleanarchitecutre.sample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cleanarchitecutre.domain.entity.ImageEntity
import com.cleanarchitecutre.domain.usecase.GetImagesUseCase
import kotlinx.coroutines.launch

class ImageViewModel(private val getImagesUseCase: GetImagesUseCase) : ViewModel() {

    private val _images: MutableLiveData<List<ImageEntity>> = MutableLiveData()
    val images: LiveData<List<ImageEntity>> = _images

    fun getImages() {
        viewModelScope.launch { _images.value = getImagesUseCase.invoke() }
    }
}