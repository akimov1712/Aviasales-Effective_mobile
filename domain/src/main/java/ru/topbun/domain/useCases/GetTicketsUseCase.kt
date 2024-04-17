package ru.topbun.domain.useCases

import ru.topbun.domain.repositories.AviaSalesRepository

class GetTicketsUseCase(
    private val repository: AviaSalesRepository
) {

    suspend operator fun invoke() = repository.getTicketsOffers()

}