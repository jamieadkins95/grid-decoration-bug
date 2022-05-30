package com.example.griddecorationbug

import androidx.recyclerview.widget.RecyclerView
import com.example.griddecorationbug.databinding.ItemExampleBinding

class ExampleViewHolder(
    private val binding: ItemExampleBinding,
) : RecyclerView.ViewHolder(binding.root) {


    fun bind(data: ExampleData) {
        binding.text.text = data.position.toString()
    }
}
