package com.example.loscarlos.view

import androidx.appcompat.app.AppCompatActivity
//import androidx.activity.viewModels
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.loscarlos.databinding.ActivityMainBinding
import com.example.loscarlos.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    //private val quoteViewModel : QuoteViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        quoteViewModel.quoteModel.observe(this, Observer {
//            binding.usuario.text = it.usuario
//            binding.password.text = it.password
//        })
//
//        binding.pantalla.setOnClickListener{
//            quoteViewModel.randomQuote()
//        }
    }
}