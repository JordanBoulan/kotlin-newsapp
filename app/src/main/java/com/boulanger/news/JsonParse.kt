package com.boulanger.news


import com.google.gson.annotations.SerializedName

data class JsonParse(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("tracking")
    val tracking: TrackingXX
)