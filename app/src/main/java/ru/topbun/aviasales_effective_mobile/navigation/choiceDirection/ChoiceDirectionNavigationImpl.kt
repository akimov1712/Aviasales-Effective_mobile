package ru.topbun.aviasales_effective_mobile.navigation.choiceDirection

import androidx.navigation.NavController
import ru.topbun.choice_derection.navigation.ChoiceDirectionNavigation
import ru.topbun.tabs.TabsFragmentDirections
import ru.topbun.choice_derection.ChoiceDirectionFragmentDirections
import javax.inject.Inject

class ChoiceDirectionNavigationImpl @Inject constructor(
    private val navController: NavController
): ChoiceDirectionNavigation {

    override fun openPlugFragment() {
        navController.navigate(ChoiceDirectionFragmentDirections
            .actionChoiceDirectionFragmentToPlugFragment())
    }

    override fun openSelectedTourFragment(nameCountry: String) {
        navController.navigate(ChoiceDirectionFragmentDirections
            .actionChoiceDirectionFragmentToSelectedTourFragment(nameCountry))
    }
}