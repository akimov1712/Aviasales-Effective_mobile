package ru.topbun.api

import com.google.gson.JsonIOException
import com.google.gson.JsonParseException
import ru.topbun.common.ParseBackendResponseException
import java.io.IOException
import java.net.ConnectException

class BaseRetrofitSource {

    suspend fun <T>wrapRetrofitExceptions(block: suspend() -> T): T{
        return try {
            block()
        } catch (e: JsonIOException){
            throw ParseBackendResponseException("Ошибка. Не удалось спарсить данные")
        } catch (e: JsonParseException){
            throw ParseBackendResponseException("Ошибка. Не удалось спарсить данные")
        } catch (e: IOException){
            throw ConnectException("Ошибка подключения")
        }
    }

}