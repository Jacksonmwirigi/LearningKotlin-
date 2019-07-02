package com.techweezy.firstkotlinapp.activities

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import com.techweezy.firstkotlinapp.R
import com.techweezy.firstkotlinapp.fragments.ExploreFragment
import com.techweezy.firstkotlinapp.fragments.FavouritesFragment
import com.techweezy.firstkotlinapp.fragments.HistoryFragment
import kotlinx.android.synthetic.main.activity_main_window.*

class MainWindow : AppCompatActivity() {
    private val exploreFragment: ExploreFragment
    private val historyFragment :HistoryFragment
    private val favouritesFragment:FavouritesFragment

    init {
        exploreFragment= ExploreFragment()
        historyFragment= HistoryFragment()
        favouritesFragment= FavouritesFragment()
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->

        val transaction =supportFragmentManager.beginTransaction()
        transaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)

        when(item.itemId){
            R.id.navigation_explore ->transaction.replace(R.id.fragment_container,exploreFragment)
            R.id.navigation_favorite ->transaction.replace(R.id.fragment_container,favouritesFragment)
            R.id.navigation_history ->transaction.replace(R.id.fragment_container,historyFragment)

        }
        transaction.commit()

        true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_window)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        val transaction =supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container,exploreFragment)
        transaction.commit()
    }
}
