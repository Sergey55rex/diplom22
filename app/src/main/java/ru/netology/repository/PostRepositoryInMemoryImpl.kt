package ru.netology.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.netology.category.Post

object PostRepositoryInMemoryImpl: PostRepository {
    var posts  = listOf(
        Post(
        1,
        2,
        "repository1",
        "https://upload.wikimedia.org/wikipedia/en/4/45/Bloodshot_-_official_film_poster.jpeg",
        "ffffffffff",
        3,
        null,
        null
        ),
        Post(
            1,
            2,
            "repository2",
            "https://upload.wikimedia.org/wikipedia/en/e/e1/Joker_%282019_film%29_poster.jpg",
            "ffffffffff",
            3,
            null,
            null
        )
    )
    private  val data = MutableLiveData(posts)


    override fun getAll(): LiveData<List<Post>> = data

    override fun removeById(id: Long) {
        posts = posts.filter { it.id != id }
        data.value = posts
    }

}