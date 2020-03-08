package com.boulanger.news


import com.google.gson.annotations.SerializedName

data class AdobeX(
    @SerializedName("a.media.length")
    val aMediaLength: String,
    @SerializedName("videocliptype")
    val videocliptype: String,
    @SerializedName("videocontentrating")
    val videocontentrating: String,
    @SerializedName("videocontentsource")
    val videocontentsource: String,
    @SerializedName("videocontenttype")
    val videocontenttype: String,
    @SerializedName("videoguid")
    val videoguid: String,
    @SerializedName("videompxid")
    val videompxid: String,
    @SerializedName("videonetwork")
    val videonetwork: String,
    @SerializedName("videoplaylist")
    val videoplaylist: String,
    @SerializedName("videoplaylistid")
    val videoplaylistid: String,
    @SerializedName("videoprogram")
    val videoprogram: String,
    @SerializedName("videopublishdate")
    val videopublishdate: String,
    @SerializedName("videotitle")
    val videotitle: String
)