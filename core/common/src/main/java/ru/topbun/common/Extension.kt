package ru.topbun.common

fun Int.formatPrice() = toString().reversed().chunked(3).joinToString(" ").reversed()