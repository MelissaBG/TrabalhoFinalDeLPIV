package com.fundatec.trabalhofinaldelpiv.home

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fundatec.trabalhofinaldelpiv.databinding.ListItemBinding

class ListItemViewHolder (
    private val binding: ListItemBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: String) {
        binding.tvName.text = item
        Glide.with(itemView.context)
            .load(item)
            .into(binding.ivName)
    }
}

