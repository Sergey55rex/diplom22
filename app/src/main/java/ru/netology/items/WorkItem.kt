package ru.netology.items

import com.squareup.picasso.Picasso
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.item_work.*
import ru.netology.R
import ru.netology.category.Work

class WorkItem(val work: Work) : Item() {
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.text_work.text = work.author
        viewHolder.text_work2.text = work.content

        Picasso.get()
            .load(work.authorAvatar)
            .into(viewHolder.image_work)
    }

    override fun getLayout() = R.layout.item_work
}