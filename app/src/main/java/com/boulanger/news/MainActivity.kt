package com.boulanger.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import com.google.gson.Gson
import java.io.FileReader
import java.io.InputStreamReader
import java.io.Reader

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var assetManager = assets
        var reader = InputStreamReader(assetManager.open("news.json"))

        var data = Gson().fromJson(reader, JsonParse::class.java)

        var arrayAdapter: ArrayAdapter<String>
        var mList = ArrayList<String>()
        data.data.iterator().forEach { it ->
            if (it.item != null && it.item.headline != null)
                mList.add(it.item.headline)
            if (it.items != null) {
                it.items.iterator().forEach { item ->
                    if (item != null && item.headline != null)
                    mList.add(item.headline)
                }

            }

        }


        // access the listView from xml file
        var mListView = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, mList)
        mListView.setOnItemClickListener {parent, view, position, id ->

        }


        mListView.adapter = arrayAdapter

    }
}
