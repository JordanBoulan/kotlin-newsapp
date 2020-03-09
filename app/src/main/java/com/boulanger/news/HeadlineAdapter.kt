package com.boulanger.news

import android.app.ActionBar
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.AsyncTask
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.setPadding
import java.io.InputStream
import java.net.URL


class HeadlineAdapter (var activity: Activity, var mResource:Int, var mObjects:ArrayList<Item>) : ArrayAdapter<Item>(activity, mResource, mObjects){

    private class ViewHolder(row: View?) {
        var text: TextView? = null
        var linear:LinearLayout? = null;
        var image: ImageView? = null

        init {
            this.text = row?.findViewById<TextView>(R.id.headline)
            this.linear = row?.findViewById<LinearLayout>(R.id.row)

        }
    }

    private class DownloadImageTask(var bmImage: ImageView) :
        AsyncTask<String?, Void?, Bitmap?>() {


        override fun onPostExecute(result: Bitmap?) {
            bmImage.setImageBitmap(result)
        }

        override fun doInBackground(vararg urls: String?): Bitmap? {
            val url = urls[0]
            var mImage: Bitmap? = null
            try {
                val `in`: InputStream = URL(url).openStream()
                mImage = BitmapFactory.decodeStream(`in`)
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return mImage
        }

    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val viewHolder: ViewHolder
        var item = mObjects[position]
        if (convertView == null) {
            val inflater = activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.headline_list, null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
            viewHolder.text?.text = item.headline

            if (item.tease != null){
                var image = ImageView(activity)
                viewHolder.image = image
                viewHolder.linear?.addView(image)
                viewHolder.image?.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
                viewHolder.image?.adjustViewBounds = true
                viewHolder.image?.scaleType = ImageView.ScaleType.FIT_XY
                viewHolder.image?.setPadding(0, 10, 0, 10)

                DownloadImageTask(image).execute(item.tease);
            }
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        viewHolder.linear?.setOnClickListener {
            val browserIntent =
                Intent(Intent.ACTION_VIEW, Uri.parse(item.url))
                activity.startActivity(browserIntent)
        }
        return view as View

    }


}