package ru.netology.repository

import androidx.lifecycle.LiveData
import ru.netology.category.Event
import ru.netology.category.Work


interface WorkRepository {
    fun getAll(): LiveData<List<Work>>
}