package ru.topbun.domain.repositories

import kotlinx.coroutines.flow.Flow
import ru.topbun.domain.entities.OfferEntity
import ru.topbun.domain.entities.TicketEntity
import ru.topbun.domain.entities.detailTicket.DetailTicketEntity

interface AviaSalesRepository {

    suspend fun getOffers(): List<OfferEntity>
    suspend fun getTicketsOffers(): List<TicketEntity>
    suspend fun getDetailTickets(): List<DetailTicketEntity>

}