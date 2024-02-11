package com.example.composemvvm_ecoshop.store.data.repository

import arrow.core.Either
import com.example.composemvvm_ecoshop.store.data.maper.toGeneralError
import com.example.composemvvm_ecoshop.store.data.remote.ProductsApi
import com.example.composemvvm_ecoshop.store.domain.model.NetworkError
import com.example.composemvvm_ecoshop.store.domain.model.Product
import com.example.composemvvm_ecoshop.store.domain.repository.ProductsRepository
import javax.inject.Inject


class ProductsRepositoryImpl @Inject constructor(
    private val productsApi: ProductsApi
) : ProductsRepository {
    override suspend fun getProducts(): Either<NetworkError, List<Product>> {
        return Either.catch {
            productsApi.getProducts()
        }.mapLeft { it.toGeneralError() }
    }
}