package com.boulanger.news


import com.google.gson.annotations.SerializedName

data class Tracking(
    @SerializedName("adobe")
    val adobe: Adobe
)