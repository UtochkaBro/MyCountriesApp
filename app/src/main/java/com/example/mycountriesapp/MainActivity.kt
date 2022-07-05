package com.example.mycountriesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.mycountriesapp.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.searchButton.setOnClickListener{
            val countryName: String = binding.countryNameEditText.text.toString()

                lifecycleScope.launch {
                    val countries: List<Country> = restCountriesApi.getCountryByName(countryName)
                    val country: Country = countries[0]

                    binding.countryNameTextView.text = country.name.toString()
                    binding.capitalTextView.text = country.capital.toString()
                    binding.populationTextView.text = country.population.toString()
                    binding.areaTextView.text = country.area.toString()
                    binding.languagesTextView.text = country.languages.toString()
                }




        }
    }
}