package com.boulanger.news


import com.google.gson.annotations.SerializedName

data class FreeWheel(
    @SerializedName("fileName")
    val fileName: String,
    @SerializedName("target")
    val target: Target
)