package com.example.viewpagerdemo.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagerdemo.view.InnerListFragment

/**
 * Created by blasius.n.puspika on 20/10/21.
 */

class InnerListPagerAdapter(fragmentActivity: FragmentActivity) :
  FragmentStateAdapter(fragmentActivity) {

  private companion object {
    const val TAB_NUMBS = 3
  }

  override fun getItemCount(): Int {
    return TAB_NUMBS
  }

  override fun createFragment(position: Int): Fragment {
    return InnerListFragment.getInstance(position)
  }
}