package com.example.griddecorationbug

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.griddecorationbug.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val exampleAdapter = ExampleAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gridLayoutManager = GridLayoutManager(this, 4, LinearLayoutManager.HORIZONTAL, false)
        binding.carousel.apply {
            layoutManager = gridLayoutManager
            addItemDecoration(CarouselDecoration(this@MainActivity))
            adapter = exampleAdapter
        }

        val data = (0..23).map { ExampleData(it) }
        exampleAdapter.submitList(data)
    }
}
