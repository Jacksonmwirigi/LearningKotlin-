package com.techweezy.firstkotlinapp.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.techweezy.firstkotlinapp.R
import com.techweezy.firstkotlinapp.holders.CardHolder

class ArticleAdapter : RecyclerView.Adapter<CardHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHolder {

        var cardItem =LayoutInflater.from(parent?.context).inflate(R.layout.card_item_list,parent,false)
        return CardHolder(cardItem)
    }

    override fun onBindViewHolder(holder: CardHolder, position: Int) {

    }

    override fun getItemCount(): Int {

        return 15
    }




}