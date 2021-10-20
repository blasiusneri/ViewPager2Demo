package com.example.viewpagerdemo.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagerdemo.constant.Mode
import com.example.viewpagerdemo.view.InnerListFragment
import com.example.viewpagerdemo.view.ListFragment

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
    return if (position == 0) {
      ListFragment.getInstance(position, Mode.MODE_A)
    } else {
      ListFragment.getInstance(position, Mode.MODE_B)
    }
  }
}