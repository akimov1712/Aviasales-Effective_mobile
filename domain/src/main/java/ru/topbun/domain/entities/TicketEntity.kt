package ru.topbun.domain.entities

data class TicketEntity(
    val id: Int,
    val price: Int,
    val timeRange: List<String>,
    val title: String
)
