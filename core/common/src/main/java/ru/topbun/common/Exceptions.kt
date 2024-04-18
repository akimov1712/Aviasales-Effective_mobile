package ru.topbun.common

open class AppException(): RuntimeException()

class ParseBackendResponseException(message:String = ""): AppException()

class ConnectedException(message:String = ""): AppException()

class ClientException(message:String = "Client error", code: Int = 400): AppException()
class ServerException(message:String = "Server error", code: Int = 500): AppException()