package ru.topbun.aviasales_api.entities.tickets

import com.google.gson.annotations.SerializedName

data class TicketPriceDto(

    @SerializedName("value")
    val value: Int
)