package ru.topbun.aviasales_api.entities.detailTicket

import com.google.gson.annotations.SerializedName

data class ArrivalDto(
    @SerializedName("airport")
    val airport: String,
    @SerializedName("date")
    val date: String,
    @SerializedName("town")
    val town: String
)