package com.example.viewpagerdemo.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpagerdemo.R
import com.example.viewpagerdemo.adapter.ListAAdapter
import com.example.viewpagerdemo.adapter.ListBAdapter
import com.example.viewpagerdemo.constant.Mode
import com.example.viewpagerdemo.customview.BottomSheet

/**
 * Created by blasius.n.puspika on 19/10/21.
 */

class ListFragment : Fragment() {

  companion object {

    private const val POSITION_KEY = "POSITION"
    private const val MODE_KEY = "MODE"

    fun getInstance(position: Int, mode: Mode): ListFragment {
      val fragment = ListFragment()
      fragment.arguments = bundleOf(
        POSITION_KEY to position,
        MODE_KEY to mode.mode
      )
      return fragment
    }
  }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
  ): View? {
    super.onCreateView(inflater, container, savedInstanceState)
    return inflater.inflate(R.layout.fragment_first, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    val clFragment = view.findViewById<ConstraintLayout>(R.id.cl_fragment)
    val rvList = view.findViewById<RecyclerView>(R.id.rv_list)

    setupRecycleView(rvList)
    setupViewPagerContent(clFragment)
  }

  private fun setupRecycleView(rvList: RecyclerView) {
    arguments?.takeIf { arg -> arg.containsKey(MODE_KEY) }?.apply {
      if (getString(MODE_KEY) == Mode.MODE_A.mode) {
        rvList.adapter = ListAAdapter() {
          BottomSheet().show(parentFragmentManager, "BottomSheet")
        }
      } else {
        rvList.adapter = ListBAdapter()
      }

      rvList.layoutManager = LinearLayoutManager(activity)
    }
  }

  private fun setupViewPagerContent(clFragment: ConstraintLayout) {
    context?.let { ctx ->
      arguments?.takeIf { arg -> arg.containsKey(POSITION_KEY) }?.apply {
        when (getInt(POSITION_KEY)) {
          0 -> {
            clFragment.setBackgroundColor(ContextCompat.getColor(ctx, R.color.purple_200))
          }
          1 -> {
            clFragment.setBackgroundColor(ContextCompat.getColor(ctx, R.color.purple_700))
          }
          2 -> {
            clFragment.setBackgroundColor(ContextCompat.getColor(ctx, R.color.teal_200))
          }
          else -> { //No implementation required}
          }
        }
      }
    }
  }
}