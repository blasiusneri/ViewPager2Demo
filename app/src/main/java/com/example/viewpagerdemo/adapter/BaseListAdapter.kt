package com.example.viewpagerdemo.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by blasius.n.puspika on 21/10/21.
 */

abstract class BaseListAdapter : RecyclerView.Adapter<BaseListAdapter.ViewHolder>() {

  fun onSelectAll() {}

  abstract inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
  }
}