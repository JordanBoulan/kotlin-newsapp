package com.boulanger.news


import com.google.gson.annotations.SerializedName

data class Nielsen(
    @SerializedName("airdate")
    val airdate: String,
    @SerializedName("assetid")
    val assetid: String,
    @SerializedName("crossId2")
    val crossId2: String,
    @SerializedName("isfullepisode")
    val isfullepisode: String,
    @SerializedName("length")
    val length: String,
    @SerializedName("program")
    val program: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String
)