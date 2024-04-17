package ru.topbun.api.entities.detailTicket

import com.google.gson.annotations.SerializedName

data class DetailTicketsResponse(
    @SerializedName("tickets")
    val tickets: List<DetailTicketDto>
)