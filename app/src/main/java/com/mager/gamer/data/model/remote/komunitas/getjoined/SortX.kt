package com.mager.gamer.data.model.remote.komunitas.getjoined


import com.google.gson.annotations.SerializedName

data class SortX(
    @SerializedName("empty")
    val empty: Boolean,
    @SerializedName("sorted")
    val sorted: Boolean,
    @SerializedName("unsorted")
    val unsorted: Boolean
)