package ru.topbun.avia_tickets.adapter

import androidx.recyclerview.widget.DiffUtil
import ru.topbun.domain.entities.OfferEntity

class ToursDiffCallback:DiffUtil.ItemCallback<OfferEntity>() {

    override fun areItemsTheSame(oldItem: OfferEntity, newItem: OfferEntity): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: OfferEntity, newItem: OfferEntity): Boolean {
        return oldItem == newItem
    }
}