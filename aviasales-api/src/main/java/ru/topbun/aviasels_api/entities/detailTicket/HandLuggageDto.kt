package ru.topbun.aviasels_api.entities.detailTicket

import com.google.gson.annotations.SerializedName

data class HandLuggageDto(
    @SerializedName("has_hand_luggage")
    val hasHandLuggage: Boolean,
    @SerializedName("size")
    val size: String
)