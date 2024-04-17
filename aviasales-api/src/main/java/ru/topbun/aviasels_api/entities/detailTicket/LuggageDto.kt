package ru.topbun.aviasels_api.entities.detailTicket

import com.google.gson.annotations.SerializedName

data class LuggageDto(
    @SerializedName("has_luggage")
    val hasLuggage: Boolean,
    @SerializedName("price")
    val price: PriceDto
)