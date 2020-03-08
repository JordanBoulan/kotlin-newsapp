package com.boulanger.news


import com.google.gson.annotations.SerializedName

data class Target(
    @SerializedName("sect")
    val sect: String,
    @SerializedName("topic")
    val topic: String
)