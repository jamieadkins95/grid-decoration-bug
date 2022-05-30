# Horiontal Grid Layout Manager with decorations

The decoration does not behave as expected. In this example we want to add some spacing above every row except the first one.

We set our decoration up like this:

```
override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
    val spanIndex = (view.layoutParams as GridLayoutManager.LayoutParams).spanIndex
    outRect.top = if (spanIndex > 0) paddingSmall else 0
}
```

Unexpectedly, we get a double spacing in span index 1, and then expected spacing for the rest of the rows:

![Screenshot_20220530_172656](https://user-images.githubusercontent.com/9338082/171032079-3a38d151-9b1a-45a5-9705-921de3a04025.png)
