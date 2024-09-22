package com.application.grocery.cart.domain.usecase

import com.application.grocery.cart.data.dao.GroceryListDao
import com.application.grocery.cart.domain.model.GroceryList
import com.application.grocery.cart.domain.repository.GroceryListRepository
import com.application.grocery.cart.domain.repository.GroceryListRepositoryImpl
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.kotlin.mock


class CreateGroceryListUnitTest {
    private lateinit var repository: GroceryListRepository

    @Before
    fun setUp() {
        val dao: GroceryListDao = mock()
        repository = GroceryListRepositoryImpl(dao)
    }

    @Test
    fun `Should add a new grocery list`() = runTest {
        `when`(repository.findAll()).thenReturn(listOf(GroceryList(name = "Test grocery list", budget = 500.00)))

        val create = CreateGroceryListImpl(repository)
        create.create(name = "Test grocery list", budget = 500.00)
        val findAll = FindAllGroceryListImpl(repository)
        val list = findAll.find()
        assertEquals(1, list.size)
    }
}