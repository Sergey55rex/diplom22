package ru.netology.category

import ru.netology.attach.Attachment


data class Work (
    val id: Long,
    val authorId: Long,
    val author: String,
    val authorAvatar: String,
    val content: String,
    val published: Long,
    val coords: Coords2? = null,
    val attachment: Attachment? = null

)

data class Coords2(
    val lat: Double,
    val long: Double
)

