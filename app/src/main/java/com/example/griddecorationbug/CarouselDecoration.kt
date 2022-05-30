package com.example.griddecorationbug

import android.content.Context
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CarouselDecoration(
    context: Context,
) : RecyclerView.ItemDecoration() {

    private val paddingSmall = context.resources.getDimension(R.dimen.padding_small).toInt()

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        val spanIndex = (view.layoutParams as GridLayoutManager.LayoutParams).spanIndex
        outRect.top = if (spanIndex > 0) paddingSmall else 0
    }
}
