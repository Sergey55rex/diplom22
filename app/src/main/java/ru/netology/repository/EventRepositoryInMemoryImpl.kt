package ru.netology.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.netology.category.Event
import ru.netology.category.Post

object EventRepositoryInMemoryImpl: EventRepository {
    var events = listOf(
        Event(
        1,
        2,
        "event1 repository",
            "https://upload.wikimedia.org/wikipedia/en/e/e1/Joker_%282019_film%29_poster.jpg",
        "ffffffffff",
        3,
        "ONLINE",
        "https://netology.ru/programs/android-app",
        null,
        null

        ),
        Event(
            1,
            2,
            "event2 repository",
            "https://upload.wikimedia.org/wikipedia/en/4/45/Bloodshot_-_official_film_poster.jpeg",
            "ffffffffff",
            3,
            "ONLINE",
            "https://netology.ru/programs/android-app",
            null,
            null

        )
    )
    private  val data = MutableLiveData(events)


    override fun getAll(): LiveData<List<Event>> = data

}