package ru.netology.category


import ru.netology.attach.Attachment

data class Post(
        val id: Long,
        val authorId: Long,
        val author: String,
        val authorAvatar: String,
        val content: String,
        val published: Long,
        val coords: Coords? = null,
        val attachment: Attachment? = null


)

data class Coords(
         val lat: Double,
         val long: Double
 )


