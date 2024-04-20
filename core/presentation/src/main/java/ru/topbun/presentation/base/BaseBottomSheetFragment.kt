package ru.topbun.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


open class BaseBottomSheetFragment<VB : ViewBinding>(
    private val inflate: Inflate<VB>
) : BottomSheetDialogFragment() {

    private var _binding: VB? = null
    val binding get() = _binding ?: throw RuntimeException("ViewBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViews()
        observeViewModel()
    }

    open fun setViews() {
        setListenersInView()
        setAdapters()
    }

    open fun setListenersInView() {}
    open fun setAdapters() {}

    open fun observeViewModel() {}

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}