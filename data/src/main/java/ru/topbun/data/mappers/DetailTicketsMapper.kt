package ru.topbun.data.mappers

import ru.topbun.api.entities.detailTicket.DetailTicketDto
import ru.topbun.api.entities.detailTicket.DetailTicketsResponse
import ru.topbun.domain.entities.detailTicket.AirPointEntity
import ru.topbun.domain.entities.detailTicket.DetailTicketEntity
import ru.topbun.domain.entities.detailTicket.HandLuggageEntity
import ru.topbun.domain.entities.detailTicket.LuggageEntity


internal fun DetailTicketsResponse.toListEntity() = this.tickets.map { it.toEntity() }

private fun DetailTicketDto.toEntity() = DetailTicketEntity(
    id = this.id,
    price = this.price.value,
    badge = this.badge,
    company = this.company,
    hasTransfer = this.hasTransfer,
    hasVisaTransfer = this.hasVisaTransfer,
    isExchangable = this.isExchangable,
    isReturnable = this.isReturnable,
    providerName = this.providerName,
    arrival = arrivalToEntity(),
    departure = departureToEntity(),
    luggage = luggageToEntity(),
    handLuggage = handLuggageToEntity()
)

private fun DetailTicketDto.handLuggageToEntity() = HandLuggageEntity(
    hasHandLuggage = this.handLuggage.hasHandLuggage,
    size = this.handLuggage.size
)

private fun DetailTicketDto.luggageToEntity() = LuggageEntity(
    hasLuggage = this.luggage.hasLuggage,
    price = this.luggage.price.value
)

private fun DetailTicketDto.arrivalToEntity() = AirPointEntity(
    airport = this.arrival.airport,
    date = this.arrival.date,
    town = this.arrival.town,
)

private fun DetailTicketDto.departureToEntity() = AirPointEntity(
    airport = this.departure.airport,
    date = this.departure.date,
    town = this.departure.town,
)
