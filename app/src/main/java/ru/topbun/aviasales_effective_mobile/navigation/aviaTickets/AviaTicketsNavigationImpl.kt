package ru.topbun.aviasales_effective_mobile.navigation.aviaTickets

import androidx.navigation.NavController
import ru.topbun.avia_tickets.navigation.AviaTicketsNavigation
import ru.topbun.tabs.TabsFragmentDirections
import javax.inject.Inject

class AviaTicketsNavigationImpl @Inject constructor(
     private val navController: NavController
): AviaTicketsNavigation {

    override fun openChoiceDirection() {
        navController.navigate(TabsFragmentDirections.actionTabsFragmentToChoiceDirectionFragment())
    }
}