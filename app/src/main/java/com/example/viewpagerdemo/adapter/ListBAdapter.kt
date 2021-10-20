package com.example.viewpagerdemo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpagerdemo.R

/**
 * Created by blasius.n.puspika on 21/10/21.
 */
class ListBAdapter() : RecyclerView.Adapter<ListBAdapter.ListBViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListBViewHolder {
    val view =
      LayoutInflater.from(parent.context).inflate(R.layout.layout_item_list_b, parent, false)
    return ListBViewHolder(view)
  }

  override fun onBindViewHolder(holder: ListBAdapter.ListBViewHolder, position: Int) {
    holder.onBind()
  }

  override fun getItemCount(): Int {
    return 15
  }

  private fun onSelectAll() {}

  inner class ListBViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val checkBox: CheckBox = itemView.findViewById(R.id.cb_item_a)

    fun onBind() {

    }
  }
}