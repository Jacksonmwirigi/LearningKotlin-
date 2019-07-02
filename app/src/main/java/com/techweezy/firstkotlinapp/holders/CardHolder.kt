package com.techweezy.firstkotlinapp.holders

import android.view.View
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import android.widget.TextView
import com.techweezy.firstkotlinapp.R
import kotlinx.android.synthetic.main.card_item_list.view.*

class CardHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val articleImage:ImageView =itemView.findViewById<ImageView>(R.id.article_image)
    val articleTxt:TextView = itemView.findViewById<TextView>(R.id.article_txt)

}