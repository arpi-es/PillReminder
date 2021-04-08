package com.example.mypillreminder.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mypillreminder.databinding.PillListItemBinding
import com.example.mypillreminder.service.model.Pill
import com.example.mypillreminder.view.callback.PillClickCallback

class PillAdapter(private val pillClickCallback: PillClickCallback) : ListAdapter<Pill, PillAdapter.PillViewHolder>(PillDiffUtil()) {

    class PillViewHolder private constructor(val binding: PillListItemBinding, val pillClickCallback: PillClickCallback) : RecyclerView.ViewHolder(binding.root){

        companion object{
            fun getInstance(parent: ViewGroup, pillClickCallback: PillClickCallback): PillViewHolder {
                val inflater = LayoutInflater.from(parent.context)
                val binding = PillListItemBinding.inflate(inflater, parent, false)
                return PillViewHolder(binding, pillClickCallback)
            }
        }

        fun bind(pill: Pill) {
            binding.pill = pill
            bindLoadListItemImage(binding.imgPoster , pill.pillImage)
//            binding..setImageURI(data?.data)
            binding.viewHolder = this
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PillViewHolder =
        PillViewHolder.getInstance(parent, pillClickCallback)

    override fun onBindViewHolder(holder: PillViewHolder, position: Int) {
       val pill = getItem(position)
        pill?.let {
            holder.bind(it)
            holder.binding.executePendingBindings()
        }
    }

    fun getItemPillAt(position: Int): Pill {
        return getItem(position)!!
    }
}

class PillDiffUtil : DiffUtil.ItemCallback<Pill>() {
    override fun areItemsTheSame(oldItem: Pill, newItem: Pill): Boolean {
        return oldItem.pillIdentifier == newItem.pillIdentifier
    }

    override fun areContentsTheSame(oldItem:Pill, newItem: Pill): Boolean {
        return oldItem == newItem
    }
}