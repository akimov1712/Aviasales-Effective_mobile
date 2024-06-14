package ru.topbun.choice_derection

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.topbun.choice_derection.navigation.ChoiceDirectionNavigation
import ru.topbun.domain.entities.PopularDirectionEntity
import javax.inject.Inject

@HiltViewModel
class ChoiceDirectionViewModel @Inject constructor(
    private val navigator: ChoiceDirectionNavigation
): ViewModel() {

    private val directionList = listOf(
        PopularDirectionEntity(0, "Стамбул", ru.topbun.theme.R.drawable.image_stambul),
        PopularDirectionEntity(1, "Сочи", ru.topbun.theme.R.drawable.image_sochi),
        PopularDirectionEntity(2, "Пхукет", ru.topbun.theme.R.drawable.image_phuket),
    )

    fun getDirectionList() = directionList.toList()

    fun openPlugFragment(){
        navigator.openPlugFragment()
    }

    fun openSelectedTourFragment(nameCountry: String){
        navigator.openSelectedTourFragment(nameCountry)
    }

}