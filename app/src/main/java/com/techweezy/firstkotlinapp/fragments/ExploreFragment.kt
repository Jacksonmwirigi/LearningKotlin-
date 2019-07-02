package com.techweezy.firstkotlinapp.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.CardView
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView

import com.techweezy.firstkotlinapp.R
import com.techweezy.firstkotlinapp.activities.SearchActivity
import com.techweezy.firstkotlinapp.adapter.ArticleAdapter
import kotlinx.android.synthetic.main.fragment_explore.*
import kotlin.math.exp

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ExploreFragment : Fragment() {

    var searchViewCard:CardView? =null
    var exploreRecyclerView:RecyclerView?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
       val view =inflater.inflate(R.layout.fragment_explore, container, false)
        searchViewCard=view.findViewById<CardView>(R.id.search_cardView)
        exploreRecyclerView=view.findViewById<RecyclerView>(R.id.explore_recyclerView)


        search_cardView.setOnClickListener(){
            val searchIntent = Intent(context,SearchActivity::class.java)
            context!!.startActivity(searchIntent)
        }

        explore_recyclerView.layoutManager=LinearLayoutManager(context)
        explore_recyclerView.adapter=ArticleAdapter()

        return view
    }

}
