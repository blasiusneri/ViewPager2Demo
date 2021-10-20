package com.example.viewpagerdemo.customview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpagerdemo.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

/**
 * Created by blasius.n.puspika on 21/10/21.
 */

class BottomSheet : BottomSheetDialogFragment() {

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    super.onCreateView(inflater, container, savedInstanceState)
    return inflater.inflate(R.layout.layout_bottom_sheet, container, false)
  }
}