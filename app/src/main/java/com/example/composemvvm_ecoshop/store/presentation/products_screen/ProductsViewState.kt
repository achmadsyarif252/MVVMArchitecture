package com.example.composemvvm_ecoshop.store.presentation.products_screen

import com.example.composemvvm_ecoshop.store.domain.model.Product

data class ProductsViewState(
    val isLoading: Boolean = false,
    val products: List<Product> = emptyList(),
    val error: String? = null
)