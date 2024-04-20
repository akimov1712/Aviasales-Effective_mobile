package ru.topbun.data.repositories

import retrofit2.Response
import ru.topbun.api.AviasalesApi
import ru.topbun.api.BaseRetrofitSource
import ru.topbun.common.ClientException
import ru.topbun.common.ConnectedException
import ru.topbun.common.ServerException
import ru.topbun.data.mappers.toListEntity
import ru.topbun.domain.entities.TicketEntity
import ru.topbun.domain.entities.detailTicket.DetailTicketEntity
import ru.topbun.domain.repositories.AviaSalesRepository
import java.io.IOException
import javax.inject.Inject

class AviasalesRepositoryImpl @Inject constructor(
    private val api: AviasalesApi,
    private val baseRetrofitSource: BaseRetrofitSource
) : AviaSalesRepository {

    override suspend fun getOffers() = baseRetrofitSource.wrapRetrofitExceptions{
        val response = api.getOffers().checkExceptions()
        return@wrapRetrofitExceptions response.toListEntity()
    }

    override suspend fun getTicketsOffers(): List<TicketEntity> = baseRetrofitSource.wrapRetrofitExceptions {
        val response = api.getTicketsOffers().checkExceptions()
        return@wrapRetrofitExceptions response.toListEntity()
    }

    override suspend fun getDetailTickets(): List<DetailTicketEntity> = baseRetrofitSource.wrapRetrofitExceptions{
        val response = api.getDetailTickets().checkExceptions()
        return@wrapRetrofitExceptions response.toListEntity()
    }

    private fun <T> Response<T>.checkExceptions(): T {
        if (this.isSuccessful) {
            when (val code = this.code()) {
                in (400..499) -> {throw ClientException(code = code)}
                in (500..599) -> {throw ServerException(code = code)}
                else -> {return this.body() ?: throw IOException()}
            }
        } else {
            throw ConnectedException("Соединение не установлено")
        }
    }

}