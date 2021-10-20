package com.example.viewpagerdemo.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpagerdemo.R
import com.example.viewpagerdemo.adapter.InnerListPagerAdapter
import com.example.viewpagerdemo.animation.ZoomOutPageTransformer
import com.google.android.material.chip.Chip


/**
 * Created by blasius.n.puspika on 20/10/21.
 */

class InnerViewPagerFragment : Fragment() {

  companion object {

    fun getInstance(): InnerViewPagerFragment {
      return InnerViewPagerFragment()
    }
  }

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    super.onCreateView(inflater, container, savedInstanceState)
    return inflater.inflate(R.layout.fragment_second, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    val viewPager = view.findViewById<ViewPager2>(R.id.vp_second_fragment)
    val chipTypeA = view.findViewById<Chip>(R.id.c_type_a)
    val chipTypeB = view.findViewById<Chip>(R.id.c_type_b)
    val chipTypeC = view.findViewById<Chip>(R.id.c_type_c)

    activity?.let {
      viewPager.adapter = InnerListPagerAdapter(it)
      viewPager.setPageTransformer(ZoomOutPageTransformer())
    }

    chipTypeA.setOnClickListener {
      viewPager.currentItem = 0
    }

    chipTypeB.setOnClickListener {
      viewPager.currentItem = 1
    }

    chipTypeC.setOnClickListener {
      viewPager.currentItem = 2
    }
  }
}