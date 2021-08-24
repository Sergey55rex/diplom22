package ru.netology.repository

import androidx.lifecycle.LiveData
import ru.netology.category.Event


interface EventRepository {
    fun getAll(): LiveData<List<Event>>
}