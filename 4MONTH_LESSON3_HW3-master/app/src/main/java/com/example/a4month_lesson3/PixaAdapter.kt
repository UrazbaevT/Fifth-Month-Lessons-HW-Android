package com.example.a4month_lesson3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.example.a4month_lesson3.databinding.ItemImageBinding

class PixaAdapter(var list: ArrayList<Hit>) : Adapter<PixaAdapter.PixaViewHolder>() {

    fun addData(list:List<Hit>){
        this.list.addAll(list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PixaViewHolder {
        return PixaViewHolder(
            ItemImageBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: PixaViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class PixaViewHolder(private val binding: ItemImageBinding) : ViewHolder(binding.root) {
        fun bind(hit: Hit) {
            binding.imageView.load(hit.largeImageURL)
        }
    }

}