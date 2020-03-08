package com.boulanger.news


import com.google.gson.annotations.SerializedName

data class Comscore(
    @SerializedName("ns_st_ce")
    val nsStCe: String,
    @SerializedName("ns_st_ci")
    val nsStCi: String,
    @SerializedName("ns_st_cl")
    val nsStCl: String,
    @SerializedName("ns_st_ddt")
    val nsStDdt: String,
    @SerializedName("ns_st_en")
    val nsStEn: String,
    @SerializedName("ns_st_ep")
    val nsStEp: String,
    @SerializedName("ns_st_ge")
    val nsStGe: String,
    @SerializedName("ns_st_ia")
    val nsStIa: String,
    @SerializedName("ns_st_pr")
    val nsStPr: String,
    @SerializedName("ns_st_pu")
    val nsStPu: String,
    @SerializedName("ns_st_sn")
    val nsStSn: String,
    @SerializedName("ns_st_tdt")
    val nsStTdt: String,
    @SerializedName("ns_st_ti")
    val nsStTi: String
)