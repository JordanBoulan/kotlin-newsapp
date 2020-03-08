package com.boulanger.news


import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("caption")
    val caption: String,
    @SerializedName("copyright")
    val copyright: String,
    @SerializedName("graphic")
    val graphic: Boolean,
    @SerializedName("headline")
    val headline: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("published")
    val published: String,
    @SerializedName("url")
    val url: String
)