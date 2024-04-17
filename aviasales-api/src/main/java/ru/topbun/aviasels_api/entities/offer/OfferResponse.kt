package ru.topbun.aviasels_api.entities.offer

import com.google.gson.annotations.SerializedName

data class OfferResponse(

    @SerializedName("offers")
    val offers: List<OfferDto>
)