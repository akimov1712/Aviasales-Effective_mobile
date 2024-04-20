package ru.topbun.tabs

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import dagger.hilt.android.AndroidEntryPoint
import ru.topbun.presentation.base.BaseFragment
import ru.topbun.tabs.databinding.FragmentTabsBinding


@AndroidEntryPoint
class TabsFragment : BaseFragment<FragmentTabsBinding>(FragmentTabsBinding::inflate) {

    override fun setViews() {
        super.setViews()
        setBottomBar()
    }

    private fun setBottomBar(){
        val navHostFragment =
            childFragmentManager.findFragmentById(R.id.tabs_container) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bottomMenu.setupWithNavController(navController)
    }

}