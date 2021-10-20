package com.example.viewpagerdemo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.viewpagerdemo.R

/**
 * Created by blasius.n.puspika on 21/10/21.
 */

class ListAAdapter(private val onLongPressListener: () -> Unit) : BaseListAdapter() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAViewHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item_list_a, parent, false)
    return ListAViewHolder(view, onLongPressListener)
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    (holder as? ListAViewHolder)?.onBind()
  }

  override fun getItemCount(): Int {
    return 15
  }

  inner class ListAViewHolder(itemView: View, onLongPressListener: () -> Unit) : BaseListAdapter.ViewHolder(itemView) {
    val checkBox: CheckBox = itemView.findViewById(R.id.cb_item_a)
    val clItemA: ConstraintLayout = itemView.findViewById(R.id.cl_item_a)

    init {
      clItemA.setOnLongClickListener {
        onLongPressListener.invoke()
        true
      }
    }

    fun onBind() {
    }


  }
}