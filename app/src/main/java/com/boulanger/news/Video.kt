package com.boulanger.news


import com.google.gson.annotations.SerializedName

data class Video(
    @SerializedName("associatedPlaylist")
    val associatedPlaylist: String,
    @SerializedName("duration")
    val duration: String,
    @SerializedName("freeWheel")
    val freeWheel: FreeWheel,
    @SerializedName("headline")
    val headline: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("label")
    val label: String,
    @SerializedName("mpxID")
    val mpxID: String,
    @SerializedName("preview")
    val preview: String,
    @SerializedName("published")
    val published: String,
    @SerializedName("summary")
    val summary: String,
    @SerializedName("tease")
    val tease: String,
    @SerializedName("tracking")
    val tracking: TrackingX,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("videoUrl")
    val videoUrl: String
)