package ru.topbun.avia_tickets

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import ru.topbun.domain.useCases.GetOffersUseCase
import javax.inject.Inject

class AviaTicketViewModel @Inject constructor(
    private val getOffersUseCase: GetOffersUseCase
): ViewModel() {

    private val _state = MutableStateFlow<AviaTicketsState>(AviaTicketsState.Loading)
    val state get() = _state.asStateFlow()

    private fun getOffers() = viewModelScope.launch {
        getOffersUseCase().collect{
            _state.value = AviaTicketsState.Offers(it)
        }
    }

    init {
        getOffers()
    }

}