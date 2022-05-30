package com.example.griddecorationbug

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.griddecorationbug.databinding.ItemExampleBinding

internal class ExampleAdapter : ListAdapter<ExampleData, ExampleViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val binding = ItemExampleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ExampleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private companion object {

        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<ExampleData>() {
            override fun areItemsTheSame(oldItem: ExampleData, newItem: ExampleData): Boolean {
                return oldItem.position == newItem.position
            }

            override fun areContentsTheSame(oldItem: ExampleData, newItem: ExampleData): Boolean {
                return oldItem.position == newItem.position
            }
        }
    }
}
