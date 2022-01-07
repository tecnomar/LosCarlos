package com.example.loscarlos.model

class QuoteProvider {
    companion object {
        fun random():QuoteModel{
            val position:Int = (0..10).random()
            return quote[position]
        }
        private val quote = listOf<QuoteModel>(
            QuoteModel("omar","160800Omar"),
            QuoteModel("arturo","160800Arturo"),
            QuoteModel("carmen","160800Carmen"),
            QuoteModel("carlos","160800Carlos"),
            QuoteModel("mario","160800Mario"),
            QuoteModel("alfredo","160800Alfredo"),
            QuoteModel("lucho","160800Lucho"),
            QuoteModel("pacho","160800Pacho"),
            QuoteModel("jose","160800Jose"),
            QuoteModel("enrique","160800Enrique"),
            QuoteModel("lorenzo","160800Lorenzo")
        )
    }

}