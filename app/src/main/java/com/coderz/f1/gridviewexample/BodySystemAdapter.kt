package com.coderz.f1.gridviewexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.coderz.f1.gridviewexample.databinding.GridItemBinding

class BodySystemAdapter(private val context: Context, private val items:ArrayList<GridViewEntry>): BaseAdapter() {

    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): GridViewEntry {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        if(convertView == null) {
            val inflater = LayoutInflater.from(context)
            val binding: GridItemBinding = GridItemBinding.inflate(inflater)
            binding.buttonSystem.text = items[position].title
            binding.imageBodySystem.setImageResource(items[position].image)
            return binding.root
        }
        return convertView
    }

}