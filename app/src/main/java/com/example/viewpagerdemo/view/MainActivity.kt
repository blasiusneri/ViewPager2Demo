package com.example.viewpagerdemo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpagerdemo.R
import com.example.viewpagerdemo.adapter.OuterListPagerAdapter
import com.example.viewpagerdemo.animation.ZoomOutPageTransformer
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

  private lateinit var viewPager: ViewPager2
  private lateinit var tabLayout: TabLayout

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    viewPager = findViewById(R.id.vp_main)
    tabLayout = findViewById(R.id.tl_main)

    viewPager.adapter = OuterListPagerAdapter(this)
    viewPager.setPageTransformer(ZoomOutPageTransformer())
    TabLayoutMediator(tabLayout, viewPager) { tab, position ->
      tab.text = "Tab $position"
    }.attach()
  }
}