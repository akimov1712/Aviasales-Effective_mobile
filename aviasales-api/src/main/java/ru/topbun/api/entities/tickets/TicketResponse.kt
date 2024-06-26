package ru.topbun.api.entities.tickets

import com.google.gson.annotations.SerializedName

data class TicketResponse(

    @SerializedName("tickets_offers")
    val ticketsOffers: List<TicketsDto>
)