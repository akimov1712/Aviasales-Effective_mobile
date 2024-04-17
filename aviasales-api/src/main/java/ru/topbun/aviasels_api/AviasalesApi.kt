package ru.topbun.aviasels_api

import kotlinx.coroutines.CoroutineScope
import retrofit2.http.GET
import ru.topbun.aviasels_api.entities.offer.OfferResponse
import ru.topbun.aviasels_api.entities.tickets.TicketResponse

interface AviasalesApi {

    @GET("/u/0/uc?id=1o1nX3uFISrG1gR-jr_03Qlu4_KEZWhav&export=download")
    suspend fun getOffers(): OfferResponse

    @GET("/u/0/uc?id=13WhZ5ahHBwMiHRXxWPq-bYlRVRwAujta&export=download")
    suspend fun getTicketsOffers(): TicketResponse

    @GET("/u/0/uc?id=1HogOsz4hWkRwco4kud3isZHFQLUAwNBA&export=download")
    suspend fun getDetailTickets()

}