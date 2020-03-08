package com.boulanger.news


import com.google.gson.annotations.SerializedName

data class Adobe(
    @SerializedName("news.author")
    val newsAuthor: String,
    @SerializedName("news.contentcategory")
    val newsContentcategory: String,
    @SerializedName("news.contentsource")
    val newsContentsource: String,
    @SerializedName("news.docid")
    val newsDocid: String,
    @SerializedName("news.headline")
    val newsHeadline: String,
    @SerializedName("news.modpagepublishdate")
    val newsModpagepublishdate: String,
    @SerializedName("news.newpagetype")
    val newsNewpagetype: String,
    @SerializedName("news.origpagepublishdate")
    val newsOrigpagepublishdate: String,
    @SerializedName("news.pagename")
    val newsPagename: String,
    @SerializedName("news.show")
    val newsShow: String,
    @SerializedName("news.subcat1")
    val newsSubcat1: String,
    @SerializedName("news.subcat2")
    val newsSubcat2: String,
    @SerializedName("news.subcat3")
    val newsSubcat3: String,
    @SerializedName("news.subverticalname")
    val newsSubverticalname: String,
    @SerializedName("news.verticalname")
    val newsVerticalname: String
)