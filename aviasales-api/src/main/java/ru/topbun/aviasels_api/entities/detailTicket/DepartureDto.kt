package ru.topbun.aviasels_api.entities.detailTicket

import com.google.gson.annotations.SerializedName

data class DepartureDto(
    @SerializedName("airport")
    val airport: String,
    @SerializedName("date")
    val date: String,
    @SerializedName("town")
    val town: String
)