package com.example.composemvvm_ecoshop.di

import com.example.composemvvm_ecoshop.store.data.repository.ProductsRepositoryImpl
import com.example.composemvvm_ecoshop.store.domain.repository.ProductsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun provideProductsRepository(impl: ProductsRepositoryImpl): ProductsRepository

}