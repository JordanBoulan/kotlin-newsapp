package com.boulanger.news


import com.google.gson.annotations.SerializedName

data class TrackingX(
    @SerializedName("adobe")
    val adobe: AdobeX,
    @SerializedName("comscore")
    val comscore: Comscore,
    @SerializedName("nielsen")
    val nielsen: Nielsen
)