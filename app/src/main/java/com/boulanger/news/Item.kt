package com.boulanger.news


import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("headline")
    val headline: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("images")
    val images: List<Image>,
    @SerializedName("label")
    val label: String,
    @SerializedName("published")
    val published: String,
    @SerializedName("summary")
    val summary: String,
    @SerializedName("tease")
    val tease: String,
    @SerializedName("tracking")
    val tracking: Tracking,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)