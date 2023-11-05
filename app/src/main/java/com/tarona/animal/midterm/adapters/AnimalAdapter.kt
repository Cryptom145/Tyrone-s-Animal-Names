package com.tarona.animal.midterm.adapters

import android.view.ViewGroup
import android.content.Intent
import android.content.Context
import android.view.LayoutInflater
import com.tarona.animal.midterm.models.Animal
import androidx.recyclerview.widget.RecyclerView
import com.tarona.animal.midterm.AnimalDetailsActivity
import com.tarona.animal.midterm.databinding.ContentBinding

class AnimalAdapter(private val context: Context, private val animalList: List<Animal>) : RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {

    inner class AnimalViewHolder(private val binding: ContentBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val animal = animalList[position]
                    val intent = Intent(context, AnimalDetailsActivity::class.java)
                    intent.putExtra("animal", animal)
                    context.startActivity(intent)
                }
            }

        }

        fun bind(animal: Animal) {
            binding.name.text = animal.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val binding = ContentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnimalViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.bind(animalList[position])
    }

    override fun getItemCount(): Int {
        return animalList.size
    }
}
