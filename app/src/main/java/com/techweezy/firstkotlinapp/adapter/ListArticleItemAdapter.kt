package com.techweezy.firstkotlinapp.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.techweezy.firstkotlinapp.R
import com.techweezy.firstkotlinapp.holders.CardHolder
import com.techweezy.firstkotlinapp.holders.ListItemHolder

class ListArticleItemAdapter : RecyclerView.Adapter<ListItemHolder>() {


    override fun onBindViewHolder(holder: ListItemHolder, position: Int) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemHolder {

        var cardItem =LayoutInflater.from(parent?.context).inflate(R.layout.article_list,parent,false)
        return ListItemHolder(cardItem)
    }

    override fun getItemCount(): Int {

        return 15
    }




}