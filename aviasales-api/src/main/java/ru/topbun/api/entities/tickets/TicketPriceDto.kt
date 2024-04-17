package ru.topbun.api.entities.tickets

import com.google.gson.annotations.SerializedName

data class TicketPriceDto(

    @SerializedName("value")
    val value: Int
)