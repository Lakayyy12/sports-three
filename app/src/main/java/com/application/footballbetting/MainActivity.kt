package com.application.footballbetting

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.application.footballbetting.Navigator.Companion.replaceFragment
import com.google.android.material.navigation.NavigationBarView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import footballbetting.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initBottomNavigaitionView()
        replaceFragment(BetFragment(), supportFragmentManager)

    }
    private fun initBottomNavigaitionView() {
        bottomNavigationView.setOnItemSelectedListener(object : OnTabSelectedListener,
            NavigationBarView.OnItemSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {}
            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when(item.itemId) {
                    R.id.page_1 -> replaceFragment(BetFragment(), supportFragmentManager)
                    R.id.page_2 -> replaceFragment(PlayFragment(), supportFragmentManager)
                    R.id.page_3 -> replaceFragment(LeaguesFragment(), supportFragmentManager)
                }
                return false
            }
        })
    }
    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}
