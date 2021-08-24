package ru.netology.activity


import android.os.Bundle
import android.view.LayoutInflater

import androidx.appcompat.app.AppCompatActivity
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item


//import ru.netology.data.EventData.events
//import ru.netology.data.PostData
//import ru.netology.data.WorkData.works

import ru.netology.databinding.ActivityMainBinding

import ru.netology.items.ContItem

import ru.netology.items.EventItem
import ru.netology.items.PostItem
import ru.netology.items.WorkItem
import ru.netology.repository.EventRepositoryInMemoryImpl.events

import ru.netology.repository.PostRepositoryInMemoryImpl.posts
import ru.netology.repository.WorkRepositoryInMemoryImpl.works


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val movies = listOf(
            getPost(),
            getEvent(),
            getWork()
        )



    binding.itemsContainer.adapter = GroupAdapter<GroupieViewHolder>().apply { addAll(movies) }


    }


    private fun getPost( ): Item {
        return ContItem(
            "Список постов", "Посты", ::onItemClick,
            posts.orEmpty().map { PostItem(it, null) })
    }

    private fun getEvent(): Item {
        return  ContItem(
            "Список событий", "События", ::onItemClick,
            events.orEmpty().map { EventItem(it) })

    }

    private fun getWork(): Item {
        return ContItem(
            "Список работ", "Работа", ::onItemClick,
            works.orEmpty().map { WorkItem(it) })
    }


    fun onItemClick(items: String) {
    }

}









