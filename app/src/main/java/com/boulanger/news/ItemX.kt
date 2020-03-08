package com.boulanger.news


import com.google.gson.annotations.SerializedName

data class ItemX(
    @SerializedName("header")
    val header: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("tease")
    val tease: String
)