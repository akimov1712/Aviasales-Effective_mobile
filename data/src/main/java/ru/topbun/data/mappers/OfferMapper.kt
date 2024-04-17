package ru.topbun.data.mappers

import ru.topbun.api.entities.offer.OfferDto
import ru.topbun.api.entities.offer.OfferResponse
import ru.topbun.domain.entities.OfferEntity


internal fun OfferResponse.toListEntity() = this.offers.map { it.toEntity() }

private fun OfferDto.toEntity() = OfferEntity(
    id = this.id,
    price = this.price.value,
    title = this.title,
    town = this.town
)
