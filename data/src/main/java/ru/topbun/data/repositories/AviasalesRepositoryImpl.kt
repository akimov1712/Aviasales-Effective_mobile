package ru.topbun.data.repositories

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import ru.topbun.common.ClientException
import ru.topbun.common.ConnectedException
import ru.topbun.common.ServerException
import ru.topbun.data.mappers.toListEntity
import ru.topbun.domain.entities.OfferEntity
import ru.topbun.domain.entities.TicketEntity
import ru.topbun.domain.entities.detailTicket.DetailTicketEntity
import ru.topbun.domain.repositories.AviaSalesRepository
import java.io.IOException
import javax.inject.Inject

class AviasalesRepositoryImpl @Inject constructor(
    private val api: AviasalesApi
): AviaSalesRepository {

    override suspend fun getOffers(): Flow<List<OfferEntity>> {
        return flow {
            val response = api.getOffers().checkExceptions()
            emit(response.toListEntity())
        }
    }

    override suspend fun getTicketsOffers(): Flow<List<TicketEntity>> {
        return flow {
            val response = api.getTicketsOffers().checkExceptions()
            emit(response.toListEntity())
        }
    }

    override suspend fun getDetailTickets(): Flow<List<DetailTicketEntity>> {
        return flow {
            val response = api.getDetailTickets().checkExceptions()
            emit(response.toListEntity())
        }
    }

    private fun <T> Response<T>.checkExceptions(): T{
        if (this.isSuccessful){
            when(val code = this.code()){
                in (400..499) -> { throw ClientException(code = code) }
                in (500..599) -> { throw ServerException(code = code) }
                else -> {
                    return this.body() ?: throw IOException()
                }
            }
        } else {
            throw ConnectedException("Соединение не установлено")
        }
    }

}