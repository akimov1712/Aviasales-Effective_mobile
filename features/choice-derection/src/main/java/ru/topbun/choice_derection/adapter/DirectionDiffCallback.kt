package ru.topbun.choice_derection.adapter

import androidx.recyclerview.widget.DiffUtil
import ru.topbun.domain.entities.PopularDirectionEntity

class DirectionDiffCallback: DiffUtil.ItemCallback<PopularDirectionEntity>() {

    override fun areItemsTheSame(
        oldItem: PopularDirectionEntity,
        newItem: PopularDirectionEntity
    ): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(
        oldItem: PopularDirectionEntity,
        newItem: PopularDirectionEntity
    ): Boolean {
        return oldItem == newItem
    }
}