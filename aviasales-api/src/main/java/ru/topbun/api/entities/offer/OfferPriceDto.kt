package ru.topbun.api.entities.offer

import com.google.gson.annotations.SerializedName

data class OfferPriceDto(

    @SerializedName("value")
    val value: Int
)