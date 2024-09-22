package com.application.grocery.cart.di.modules

import com.application.grocery.cart.domain.usecase.CreateGroceryList
import com.application.grocery.cart.domain.usecase.CreateGroceryListImpl
import com.application.grocery.cart.domain.usecase.FindAllGroceryList
import com.application.grocery.cart.domain.usecase.FindAllGroceryListImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class UseCaseModules {
    @Binds
    abstract fun bindCreateGroceryList(createGroceryListImpl: CreateGroceryListImpl): CreateGroceryList

    @Binds
    abstract fun bindFindGroceryList(findAllGroceryListImpl: FindAllGroceryListImpl): FindAllGroceryList

}