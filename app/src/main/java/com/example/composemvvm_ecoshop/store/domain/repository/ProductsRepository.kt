package com.example.composemvvm_ecoshop.store.domain.repository

import arrow.core.Either
import com.example.composemvvm_ecoshop.store.domain.model.NetworkError
import com.example.composemvvm_ecoshop.store.domain.model.Product

interface ProductsRepository {

    suspend fun getProducts(): Either<NetworkError, List<Product>>

}
