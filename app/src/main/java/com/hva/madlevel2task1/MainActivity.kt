package com.hva.madlevel2task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hva.madlevel2task1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val places = arrayListOf<Place>()
    private val placeAdapter = PlaceAdapter(places)
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        binding.rvPlaces
    }
}