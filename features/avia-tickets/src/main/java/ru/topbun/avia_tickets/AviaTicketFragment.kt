package ru.topbun.avia_tickets

import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import ru.topbun.presentation.base.BaseFragment
import ru.topbun.avia_tickets.adapter.ToursAdapter
import ru.topbun.avia_tickets.databinding.FragmentAviaTicketBinding


class AviaTicketFragment :
    BaseFragment<FragmentAviaTicketBinding>(FragmentAviaTicketBinding::inflate) {

    private val adapter by lazy { ToursAdapter() }

//    @Inject
//    lateinit var viewModelFactory: ViewModelFactory
//    private val viewModel by lazy { ViewModelProvider(this, viewModelFactory)[AviaTicketViewModel::class.java] }


    override fun observeViewModel() {
        super.observeViewModel()
        lifecycleScope.launch {
//            viewModel.state.collect{
//                when(it){
//                    is AviaTicketsState.Loading -> {}
//                    is AviaTicketsState.Offers -> {
//                        adapter.submitList(it.data)
//                    }
//                }
//            }
        }
    }

    override fun setAdapters() {
        super.setAdapters()
        binding.rvTour.adapter = adapter
    }
}