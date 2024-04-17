package ru.topbun.aviasels_api.entities.offer

import com.google.gson.annotations.SerializedName

data class OfferPriceDto(

    @SerializedName("value")
    val value: Int
)