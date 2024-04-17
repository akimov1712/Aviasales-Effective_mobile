package ru.topbun.domain.entities

data class OfferEntity(
    val id: Int,
    val price: Int,
    val title: String,
    val town: String
)
