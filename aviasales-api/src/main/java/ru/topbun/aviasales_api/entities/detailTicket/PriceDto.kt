package ru.topbun.aviasales_api.entities.detailTicket

import com.google.gson.annotations.SerializedName

data class PriceDto(
    @SerializedName("value")
    val value: Int
)