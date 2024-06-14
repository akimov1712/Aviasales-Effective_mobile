package ru.topbun.avia_tickets

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import ru.topbun.avia_tickets.navigation.AviaTicketsNavigation
import ru.topbun.common.ClientException
import ru.topbun.common.ConnectedException
import ru.topbun.common.ParseBackendResponseException
import ru.topbun.common.ServerException
import ru.topbun.domain.useCases.GetOffersUseCase
import javax.inject.Inject

@HiltViewModel
class AviaTicketViewModel @Inject constructor(
    private val getOffersUseCase: GetOffersUseCase,
    private val navigator: AviaTicketsNavigation
): ViewModel() {

    private val _state = MutableStateFlow<AviaTicketsState>(AviaTicketsState.Loading())
    val state get() = _state.asStateFlow()

    fun openChoiceDirection(){
        navigator.openChoiceDirection()
    }

    private fun getOffers() = viewModelScope.launch {
        try {
            val result = getOffersUseCase()
            _state.value = AviaTicketsState.Offers(result)
        } catch (e: ParseBackendResponseException){
            _state.value = AviaTicketsState.Error(e.message)
        } catch (e: ConnectedException){
            _state.value = AviaTicketsState.Error(e.message)
        } catch (e: ClientException){
            _state.value = AviaTicketsState.Error(e.message + "code: ${e.code}")
        } catch (e: ServerException){
            _state.value = AviaTicketsState.Error(e.message + "code: ${e.code}")
        } finally {
            _state.value = AviaTicketsState.Loading(false)
        }
    }

    init {
        getOffers()
    }

}