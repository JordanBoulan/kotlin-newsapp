package com.boulanger.news


import com.google.gson.annotations.SerializedName

data class AdobeXX(
    @SerializedName("news.contentcategory")
    val newsContentcategory: String,
    @SerializedName("news.newpagetype")
    val newsNewpagetype: String,
    @SerializedName("news.pagename")
    val newsPagename: String
)