package com.androidtest.onlineshop.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.androidtest.onlineshop.Adapters.CategoryAdapter
import com.androidtest.onlineshop.Adapters.CategoryRecycleAdapter
import com.androidtest.onlineshop.Model.Category
import com.androidtest.onlineshop.R
import com.androidtest.onlineshop.Services.DataService

class MainActivity : AppCompatActivity() {
    lateinit var adapter: CategoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories)

        val categoryListView = findViewById<ListView>(R.id.categoryListView)
        categoryListView.adapter = adapter

        /*
        categoryListView.setOnItemClickListener { parent, view, position, id ->
            val category = DataService.categories[position]
            Toast.makeText(this, "You clicked on ${category.title} cell", Toast.LENGTH_SHORT).show()
        }
        */

        val layoutManager = LinearLayoutManager(this)
        // TODO - TYPE MISMATCH HERE ->  categoryListView.layoutMode = layoutManager

        //for optimization
        categoryListView.setHasTransientState(true)

    }

}

abstract class LayoutManager()