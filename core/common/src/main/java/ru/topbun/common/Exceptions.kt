package ru.topbun.common

open class AppException(): RuntimeException()

class ParseBackendResponseException(override val message:String = "Ошибка при получении данных"): AppException()

class ConnectedException(override val message:String = ""): AppException()

class ClientException(override val message:String = "Client error", val code: Int = 400): AppException()
class ServerException(override val message:String = "Server error", val code: Int = 500): AppException()