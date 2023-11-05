package com.tarona.animal.midterm

import android.os.Bundle
import android.widget.Toast
import com.tarona.animal.midterm.models.Animal
import androidx.appcompat.app.AppCompatActivity
import com.tarona.animal.midterm.databinding.ActivityAnimalDetailsBinding

@Suppress("DEPRECATION")
class AnimalDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAnimalDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimalDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animal = intent.getSerializableExtra("animal") as Animal
        binding.name.text = animal.name
        binding.description.text = animal.description

        binding.blockButton.setOnClickListener{

            Toast.makeText(this, "Blocked", Toast.LENGTH_LONG).show()

        }
    }
}