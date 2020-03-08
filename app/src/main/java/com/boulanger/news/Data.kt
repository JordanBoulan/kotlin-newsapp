package com.boulanger.news


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("header")
    val header: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("item")
    val item: Item,
    @SerializedName("items")
    val items: List<Item>,
    @SerializedName("showMore")
    val showMore: Boolean,
    @SerializedName("subHeader")
    val subHeader: String,
    @SerializedName("tease")
    val tease: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("videos")
    val videos: List<Video>
)