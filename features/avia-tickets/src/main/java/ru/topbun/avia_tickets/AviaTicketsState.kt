package ru.topbun.avia_tickets

import ru.topbun.domain.entities.OfferEntity

sealed class AviaTicketsState {

    data class Error(val message: String): AviaTicketsState()
    data class Loading(val isStartLoader: Boolean = true): AviaTicketsState()
    data class Offers(val data: List<OfferEntity>): AviaTicketsState()

}