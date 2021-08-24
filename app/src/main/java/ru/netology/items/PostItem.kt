package ru.netology.items

import android.widget.PopupMenu
import com.squareup.picasso.Picasso
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.item_post.*
import ru.netology.R

import ru.netology.category.Post

interface OnInteractionListenerPost {

    fun onEdit(post: Post) {}
    fun onRemove(post: Post) {}
}
class PostItem(val post: Post, private val OnInteractionListenerPost: OnInteractionListenerPost?): Item() {
    override fun getLayout() = R.layout.item_post


    override fun bind(viewHolder: GroupieViewHolder, position: Int) {

        viewHolder.text_post.text = post.author
        viewHolder.text_post2.text = post.content

        Picasso.get()
            .load(post.authorAvatar)
            .into(viewHolder.image_post)

        viewHolder.menu.setOnClickListener{
            PopupMenu(it.context, it).apply {
                    inflate(R.menu.options_post)
                    setOnMenuItemClickListener { item ->
                        when (item.itemId) {
                            R.id.remove -> {
                                OnInteractionListenerPost?.onRemove(post)
                                true
                            }
                            R.id.edit -> {
                                OnInteractionListenerPost?.onEdit(post)
                                true
                            }

                            else -> false
                        }
                    }
                }.show()
        }



    }


}


