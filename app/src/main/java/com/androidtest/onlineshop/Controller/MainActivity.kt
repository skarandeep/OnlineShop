package com.androidtest.onlineshop.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.androidtest.onlineshop.Adapters.CategoryAdapter
import com.androidtest.onlineshop.Model.Category
import com.androidtest.onlineshop.R
import com.androidtest.onlineshop.Services.DataService

class MainActivity : AppCompatActivity() {
    lateinit var adapter: CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)

        val categoryListView = findViewById<ListView>(R.id.categoryListView)
        categoryListView.adapter = adapter

        /*
        categoryListView.setOnItemClickListener { parent, view, position, id ->
            val category = DataService.categories[position]
            Toast.makeText(this, "You clicked on ${category.title} cell", Toast.LENGTH_SHORT).show()
        }
        */


    }

}

abstract class LayoutManager()