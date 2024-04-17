package ru.topbun.domain.useCases

import ru.topbun.domain.repositories.AviaSalesRepository

class GetOffersUseCase(
    private val repository: AviaSalesRepository
) {

    suspend operator fun invoke() = repository.getOffers()

}