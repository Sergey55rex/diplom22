package ru.netology.items

import com.squareup.picasso.Picasso
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.item_event.*
import kotlinx.android.synthetic.main.item_post.*
import ru.netology.R
import ru.netology.category.Event


class EventItem(val event: Event): Item() {
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.text_event.text = event.author

        Picasso.get()
            .load(event.authorAvatar)
            .into(viewHolder.image_event)
    }
    override fun getLayout() = R.layout.item_event
}


