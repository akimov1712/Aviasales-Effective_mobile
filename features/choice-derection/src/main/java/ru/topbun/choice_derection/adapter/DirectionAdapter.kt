package ru.topbun.choice_derection.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import ru.topbun.choice_derection.databinding.ItemDirectionBinding
import ru.topbun.domain.entities.PopularDirectionEntity

class DirectionAdapter: ListAdapter<PopularDirectionEntity, DirectionViewHolder>(DirectionDiffCallback()) {

    var setOnClickItemListener: ((String) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DirectionViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemDirectionBinding.inflate(inflater, parent, false)
        return DirectionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DirectionViewHolder, position: Int) {
        val item = getItem(position)
        with(holder.binding){
            tvTitle.text = item.countryName
            ivPreview.setImageResource(item.previewResId)
        }
        holder.itemView.setOnClickListener { setOnClickItemListener?.invoke(item.countryName) }
    }
}