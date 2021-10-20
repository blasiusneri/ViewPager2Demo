package com.example.viewpagerdemo.adapter

import androidx.fragment.app.*
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagerdemo.view.ListFragment
import com.example.viewpagerdemo.view.InnerViewPagerFragment

/**
 * Created by blasius.n.puspika on 19/10/21.
 */

class OuterListPagerAdapter(fragmentActivity: FragmentActivity) :
  FragmentStateAdapter(fragmentActivity) {

  private companion object {
    const val NUM_PAGES = 4
  }

  override fun getItemCount(): Int {
    return NUM_PAGES
  }

  override fun createFragment(position: Int): Fragment {
    return if (position == NUM_PAGES - 1) {
      InnerViewPagerFragment.getInstance()
    } else {
      ListFragment.getInstance(position)
    }
  }
}