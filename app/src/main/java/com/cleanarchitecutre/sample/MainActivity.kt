package com.cleanarchitecutre.sample

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cleanarchitecutre.data.repository.ImageRepositoryImpl
import com.cleanarchitecutre.domain.usecase.GetImagesUseCase
import com.cleanarchitecutre.sample.viewmodel.ImageViewModel
import kotlinx.coroutines.newSingleThreadContext

class MainActivity : AppCompatActivity() {
    private val imageViewModel by lazy {
        ImageViewModel(GetImagesUseCase(ImageRepositoryImpl()))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageViewModel.getImages()

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            var images = imageViewModel.images.value
            Log.d("Test value", images.toString())
        }

    }
}