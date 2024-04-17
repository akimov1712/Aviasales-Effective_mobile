package ru.topbun.aviasels_api.entities.detailTicket

import com.google.gson.annotations.SerializedName

data class DetailTicketsResponse(
    @SerializedName("tickets")
    val tickets: List<DetailTicketDto>
)