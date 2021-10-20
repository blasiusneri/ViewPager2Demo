package com.example.viewpagerdemo.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.example.viewpagerdemo.R

/**
 * Created by blasius.n.puspika on 20/10/21.
 */

class InnerListFragment : Fragment() {

  companion object {

    private const val POSITION_KEY = "POSITION"

    fun getInstance(position: Int): InnerListFragment {
      val fragment = InnerListFragment()
      fragment.arguments = bundleOf(POSITION_KEY to position)
      return fragment
    }
  }

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    super.onCreateView(inflater, container, savedInstanceState)
    return inflater.inflate(R.layout.fragment_inner_second, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    val clFragment = view.findViewById<ConstraintLayout>(R.id.cl_fragment)
    context?.let { ctx ->
      arguments?.takeIf { arg -> arg.containsKey(POSITION_KEY) }?.apply {
        when (getInt(POSITION_KEY)) {
          0 -> clFragment.setBackgroundColor(ContextCompat.getColor(ctx, R.color.teal_700))
          1 -> clFragment.setBackgroundColor(ContextCompat.getColor(ctx, R.color.purple_500))
          2 -> clFragment.setBackgroundColor(ContextCompat.getColor(ctx, R.color.purple_700))
        }
      }
    }
  }
}