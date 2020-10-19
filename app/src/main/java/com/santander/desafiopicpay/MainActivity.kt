package com.santander.desafiopicpay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // Log.i('df',"onCreate")
        initComponents()
    }
    private fun initComponents(){
        etCreditCardNumber.addTextChangedListener(MaskWatcher(etCreditCardNumber,getString(R.string.credit_card_mask)))
        etCreditCardExpiration.addTextChangedListener(MaskWatcher(etCreditCardExpiration, getString(R.string.expiration_mask)))
        etCreditCardCvv.addTextChangedListener(MaskWatcher(etCreditCardCvv, getString(R.string.cvv_mask)))

        btCreditCardSave.setOnClickListener {
            val expirationDate = etCreditCardExpiration.text.toString()
            val monthYear = expirationDate.split("/")

            if(monthYear.first().toInt() > 12){
                tilCreditCardExpiration.error="Data de expiração é inválida"
            } else {
                tilCreditCardExpiration.isErrorEnabled = false
            }
        }
    }
}