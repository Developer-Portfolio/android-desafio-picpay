package com.santander.desafiopicpay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register_credit_card.*

class RegisterCreditCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_credit_card)

        initComponents()
    }

    private fun initComponents() {
        btRegisterCreditCard.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(KEY_CREDIT_CARD_NUMBER,1111222233334444)
            startActivity(intent)
        }
    }

    companion object{
        const val KEY_CREDIT_CARD_NUMBER = "number_credit_card"
    }
}