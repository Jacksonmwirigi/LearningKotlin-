package com.techweezy.firstkotlinapp.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.techweezy.firstkotlinapp.R
import com.techweezy.firstkotlinapp.adapter.ArticleAdapter
import com.techweezy.firstkotlinapp.adapter.ListArticleItemAdapter
import kotlinx.android.synthetic.main.fragment_history.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class HistoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         val view = inflater.inflate(R.layout.fragment_history, container, false)
        history_recyclerView.layoutManager=LinearLayoutManager(context)
        history_recyclerView.adapter= ListArticleItemAdapter()
        return view
    }


}
