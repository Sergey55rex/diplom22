package ru.netology.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.netology.category.Post
import ru.netology.category.Work

object WorkRepositoryInMemoryImpl: WorkRepository {
    var works = listOf(
        Work(
        1,
        2,
        "работа1",
        "https://upload.wikimedia.org/wikipedia/en/4/45/Bloodshot_-_official_film_poster.jpeg",
        "ffffffffff",
        3,
        null,
        null
        ),
        Work(
            2,
            3,
            "работа2",
            "https://upload.wikimedia.org/wikipedia/en/e/e1/Joker_%282019_film%29_poster.jpg",
            "kkkkkkk",
            3,
            null,
            null
        )
    )
    private  val data = MutableLiveData(works)


    override fun getAll(): LiveData<List<Work>> = data

}