package ru.topbun.data.mappers

import ru.topbun.api.entities.tickets.TicketResponse
import ru.topbun.api.entities.tickets.TicketsDto
import ru.topbun.domain.entities.TicketEntity


internal fun TicketResponse.toListEntity() = this.ticketsOffers.map { it.toEntity() }

private fun TicketsDto.toEntity() = TicketEntity(
    id = this.id,
    price = this.price.value,
    timeRange = this.timeRange,
    title = this.title
)
