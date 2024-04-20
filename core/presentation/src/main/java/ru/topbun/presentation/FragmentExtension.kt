package ru.topbun.presentation

import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController

fun Fragment.findTopNavController(): NavController {
    val topLevelHost = requireActivity().supportFragmentManager
        .findFragmentById(ru.topbun.theme.R.id.app_fragment_container) as NavHostFragment?
    return topLevelHost?.navController ?: findNavController()
}