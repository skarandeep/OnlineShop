package com.androidtest.onlineshop.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.androidtest.onlineshop.Model.Category
import com.androidtest.onlineshop.R
import com.androidtest.onlineshop.Services.DataService.categories

class CategoryAdapter (val context: Context, val categories: List<Category>): BaseAdapter() {
// Unit means NOTHING
    override fun getCount(): Int {
        return categories.count()
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val holder : ViewHolder
        val categoryView: View
        if(convertView == null){
            holder = ViewHolder()
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)

            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)

            categoryView.tag = holder // setting unique value to view, i.e. HOLDER
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        /*
        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
        val categoryImage: ImageView = categoryView.findViewById(R.id.categoryImage)        //TODO - Samjho, does putting a DOT in-between attach assets?
        val categoryName : TextView = categoryView.findViewById(R.id.categoryName)
        */

        val category = categories[position]  // grab specific category for corresponding values TODO - Samjho

        //find the resouce based on its categoryName
       val resourceId = context.resources.getIdentifier(category.image,"drawable", context.packageName)     //TODO - ratta = CTM
        holder.categoryImage?.setImageResource(resourceId)
        println(resourceId)

        holder.categoryName?.text = category.title

        return categoryView
    }

    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }
}