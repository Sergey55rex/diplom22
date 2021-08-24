package ru.netology.repository

import androidx.lifecycle.LiveData
import ru.netology.category.Post

interface PostRepository {
    fun getAll(): LiveData<List<Post>>
    fun removeById(id: Long)
}