package com.cleanarchitecutre.sample.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.cleanarchitecutre.data.repository.ImageRepositoryImpl
import com.cleanarchitecutre.domain.usecase.GetImagesUseCase
import com.cleanarchitecutre.sample.R
import com.cleanarchitecutre.sample.databinding.FragmentHomeBinding
import com.cleanarchitecutre.sample.ui.adapters.ImageAdapter
import com.cleanarchitecutre.sample.ui.viewmodel.ImageViewModel


class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding
    private val imageViewModel by lazy {
        ImageViewModel(GetImagesUseCase(ImageRepositoryImpl()))
            .apply {
                getImages()
            }
    }
    private val imageAdapter by lazy {
        ImageAdapter()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)

        setRecyclerView()
        connectDataToAdapter()
    }

    private fun connectDataToAdapter() {
        imageViewModel.images.observe(viewLifecycleOwner, { image ->
            imageAdapter.submitList(image)
        })
    }

    private fun setRecyclerView() {
        with(binding.imageRV) {
            adapter = imageAdapter
            layoutManager = GridLayoutManager(requireContext(), 2)
        }
    }

}