package com.androidtest.onlineshop.Controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.widget.ListView
import com.androidtest.onlineshop.Adapters.ProductsAdapter
import com.androidtest.onlineshop.R
import com.androidtest.onlineshop.Services.DataService
import com.androidtest.onlineshop.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {
    lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)

        adapter = ProductsAdapter(this, DataService.getProducts(categoryType))

        var spanCount = 2
        val orientation = resources.configuration.orientation

        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720){
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        val productsListView = findViewById<ListView>(R.id.productListView)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter

    }
}