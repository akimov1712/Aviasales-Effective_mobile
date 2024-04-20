package ru.topbun.avia_tickets.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import ru.topbun.avia_tickets.R
import ru.topbun.avia_tickets.databinding.ItemTourBinding
import ru.topbun.common.formatPrice
import ru.topbun.domain.entities.OfferEntity

class ToursAdapter: ListAdapter<OfferEntity, ToursViewHolder>(ToursDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToursViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemTourBinding.inflate(inflater, parent, false)
        return ToursViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ToursViewHolder, position: Int) {
        val item = getItem(position)
        with(holder.binding){
            val preview = previewById[item.id]?: throw RuntimeException("Preview by id not found")
            ivPreview.setImageResource(preview)
            tvTitle.text = item.title
            tvCity.text = item.town
            tvPrice.text = "От ${item.price.formatPrice()} ₽"
        }
    }

    private val previewById = mapOf(
        1 to ru.topbun.theme.R.drawable.image_tours_budapest,
        2 to ru.topbun.theme.R.drawable.image_tours_peterburg,
        3 to ru.topbun.theme.R.drawable.image_tours_moscow,
    )

}