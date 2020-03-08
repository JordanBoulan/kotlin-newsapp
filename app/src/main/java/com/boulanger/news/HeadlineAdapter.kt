package com.boulanger.news

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class HeadlineAdapter (var activity: Activity, var mResource:Int, var mObjects:ArrayList<Item>) : ArrayAdapter<Item>(activity, mResource, mObjects){

    private class ViewHolder(row: View?) {
        var text: TextView? = null

        init {
            this.text = row?.findViewById<TextView>(R.id.headline)
        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val viewHolder: ViewHolder
        if (convertView == null) {
            val inflater = activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.headline_list, null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var item = mObjects[position]
        viewHolder.text?.text = item.headline


        return view as View

    }


}