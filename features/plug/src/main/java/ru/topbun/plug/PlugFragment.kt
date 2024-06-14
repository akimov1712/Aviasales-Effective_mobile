package ru.topbun.plug

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ru.topbun.plug.databinding.FragmentPlugBinding
import ru.topbun.presentation.base.BaseFragment


class PlugFragment : BaseFragment<FragmentPlugBinding>(FragmentPlugBinding::inflate) {

    override fun setListenersInView() {
        super.setListenersInView()
        binding.btnBack.setOnClickListener{
            findNavController().navigateUp()
        }
    }
}