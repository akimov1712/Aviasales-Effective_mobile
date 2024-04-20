package ru.topbun.avia_tickets

import ru.topbun.domain.entities.OfferEntity

sealed class AviaTicketsState {

    data object Loading: AviaTicketsState()
    data class Offers(val data: List<OfferEntity>): AviaTicketsState()

}