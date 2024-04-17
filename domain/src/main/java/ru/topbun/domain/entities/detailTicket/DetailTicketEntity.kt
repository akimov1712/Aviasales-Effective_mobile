package ru.topbun.domain.entities.detailTicket

data class DetailTicketEntity(
    val arrival: AirPointEntity,
    val badge: String,
    val company: String,
    val departure: AirPointEntity,
    val handLuggage: HandLuggageEntity,
    val hasTransfer: Boolean,
    val hasVisaTransfer: Boolean,
    val id: Int,
    val isExchangable: Boolean,
    val isReturnable: Boolean,
    val luggage: LuggageEntity,
    val price: Int,
    val providerName: String
)
