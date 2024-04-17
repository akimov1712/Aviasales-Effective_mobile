package ru.topbun.aviasales_api.entities.offer

import com.google.gson.annotations.SerializedName

data class OfferDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("price")
    val price: OfferPriceDto,
    @SerializedName("title")
    val title: String,
    @SerializedName("town")
    val town: String
)