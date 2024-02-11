package com.example.composemvvm_ecoshop.store.data.remote

import com.example.composemvvm_ecoshop.store.domain.model.Product
import retrofit2.http.GET

interface ProductsApi {

    @GET("products")
    suspend fun getProducts(): List<Product>

}