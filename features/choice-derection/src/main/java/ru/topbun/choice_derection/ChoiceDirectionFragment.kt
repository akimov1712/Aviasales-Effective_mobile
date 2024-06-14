package ru.topbun.choice_derection

import android.util.DisplayMetrics
import androidx.fragment.app.viewModels
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import ru.topbun.choice_derection.adapter.DirectionAdapter
import ru.topbun.choice_derection.databinding.FragmentChoiceDirectionBinding
import ru.topbun.presentation.base.BaseBottomSheetFragment


class ChoiceDirectionFragment: BaseBottomSheetFragment<FragmentChoiceDirectionBinding>
    (FragmentChoiceDirectionBinding::inflate) {

    private val adapter by lazy { DirectionAdapter() }
    private val viewModel by viewModels<ChoiceDirectionViewModel>()

    override fun setListenersInView() {
        super.setListenersInView()
        with(binding){
            btnClear.setOnClickListener {
                etTo.setText("")
            }
            btnHotTicket.setOnClickListener { openPlugFragment() }
            btnWeekend.setOnClickListener { openPlugFragment() }
            btnHardRoute.setOnClickListener { openPlugFragment() }
        }
    }

    private fun openPlugFragment(){
        viewModel.openPlugFragment()
    }

    override fun setAdapters() {
        super.setAdapters()
        adapter.submitList(viewModel.getDirectionList())
        adapter.setOnClickItemListener = {
            viewModel.openSelectedTourFragment(it)
        }
        binding.rvDirection.adapter = adapter
    }

    override fun setViews() {
        super.setViews()
        val bottomSheet = dialog as BottomSheetDialog
        bottomSheet.behavior.state = BottomSheetBehavior.STATE_EXPANDED // Расстянуть на весь экран
    }

    override fun onStart() {
        super.onStart()
        setDimension()
    }

    private fun setDimension(){
        val metrics = DisplayMetrics()
        requireActivity().windowManager?.defaultDisplay?.getMetrics(metrics)
        binding.root.layoutParams.height = metrics.heightPixels
        binding.root.requestLayout()
    }
}