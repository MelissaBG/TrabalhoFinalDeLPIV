package com.fundatec.trabalhofinaldelpiv.home

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fundatec.trabalhofinaldelpiv.databinding.ListItemBinding
import trabalhofinaldelpiv.home.data.CharacterResponse

class ListItemViewHolder (
    private val binding: ListItemBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: CharacterResponse) {
        binding.tvName.text = item.name
        Glide.with(itemView.context)
            .load(item.image)
            .into(binding.ivName)
    }
}

