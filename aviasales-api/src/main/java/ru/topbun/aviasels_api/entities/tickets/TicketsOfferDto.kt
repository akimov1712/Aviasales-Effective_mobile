package ru.topbun.aviasels_api.entities.tickets

import com.google.gson.annotations.SerializedName

data class TicketsOfferDto(

    @SerializedName("id")
    val id: Int,

    @SerializedName("price")
    val price: TicketPriceDto,

    @SerializedName("time_range")
    val timeRange: List<String>,

    @SerializedName("title")
    val title: String
)