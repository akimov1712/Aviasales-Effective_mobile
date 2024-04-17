package ru.topbun.aviasales_api.entities.detailTicket

import com.google.gson.annotations.SerializedName

data class DetailTicketDto(

    @SerializedName("arrival")
    val arrival: ArrivalDto,

    @SerializedName("badge")
    val badge: String,

    @SerializedName("company")
    val company: String,

    @SerializedName("departure")
    val departure: DepartureDto,

    @SerializedName("hand_luggage")
    val handLuggage: HandLuggageDto,

    @SerializedName("has_transfer")
    val hasTransfer: Boolean,

    @SerializedName("has_visa_transfer")
    val hasVisaTransfer: Boolean,

    @SerializedName("id")
    val id: Int,

    @SerializedName("is_exchangable")
    val isExchangable: Boolean,

    @SerializedName("is_returnable")
    val isReturnable: Boolean,

    @SerializedName("luggage")
    val luggage: LuggageDto,

    @SerializedName("price")
    val price: PriceDto,

    @SerializedName("provider_name")
    val providerName: String
)