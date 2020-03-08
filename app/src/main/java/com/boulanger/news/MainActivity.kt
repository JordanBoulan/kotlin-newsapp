package com.boulanger.news


import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import java.io.InputStreamReader


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var assetManager = assets
        var reader = InputStreamReader(assetManager.open("news.json"))

        var data = Gson().fromJson(reader, JsonParse::class.java)

        var arrayAdapter : HeadlineAdapter
        var mList = ArrayList<Item>()
        data.data.iterator().forEach { it ->
            if (it.item != null && it.item.headline != null)
                mList.add(it.item)
            if (it.items != null) {
                it.items.iterator().forEach { item ->
                    if (item != null && item.headline != null)
                    mList.add(item)
                }

            }

        }


        // access the listView from xml file
        var mListView = findViewById<ListView>(R.id.userlist)
        arrayAdapter = HeadlineAdapter(this,
            R.layout.headline_list, mList)



        mListView.adapter = arrayAdapter

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.menu_images) {
            val intent = Intent(this, ImageActivity::class.java)
            startActivity(intent)
        }
        if (id == R.id.menu_videos) {
            val intent = Intent(this, VideoActivity::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}
