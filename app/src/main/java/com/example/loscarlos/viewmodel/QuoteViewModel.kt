package com.example.loscarlos.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.loscarlos.model.QuoteModel
import com.example.loscarlos.model.QuoteProvider

class QuoteViewModel : ViewModel() {
    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote : QuoteModel = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}