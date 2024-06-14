package ru.topbun.avia_tickets

import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.net.toUri
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import ru.topbun.avia_tickets.adapter.ToursAdapter
import ru.topbun.avia_tickets.databinding.FragmentAviaTicketBinding
import ru.topbun.presentation.base.BaseFragment

@AndroidEntryPoint
class AviaTicketFragment :
    BaseFragment<FragmentAviaTicketBinding>(FragmentAviaTicketBinding::inflate) {


    private val adapter by lazy { ToursAdapter() }
    private val viewModel by viewModels<AviaTicketViewModel>()

    override fun setListenersInView() {
        super.setListenersInView()
        with(binding) {
            etTo.setOnFocusChangeListener { v, hasFocus ->
                if (hasFocus) {
                    viewModel.openChoiceDirection()
                    etTo.clearFocus()
                }
            }
        }
    }

    override fun observeViewModel() {
        super.observeViewModel()
        lifecycleScope.launch {
            viewModel.state.collect {
                when (it) {
                    is AviaTicketsState.Loading -> {
                        binding.loaderTours.isVisible = it.isStartLoader
                    }

                    is AviaTicketsState.Offers -> {
                        adapter.submitList(it.data)
                    }

                    is AviaTicketsState.Error -> {
                        Toast.makeText(requireContext(), it.message, Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }

    override fun setAdapters() {
        super.setAdapters()
        binding.rvTour.adapter = adapter
    }
}