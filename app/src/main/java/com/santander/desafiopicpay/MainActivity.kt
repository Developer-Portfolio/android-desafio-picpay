package com.santander.desafiopicpay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import com.santander.desafiopicpay.RegisterCreditCardActivity.Companion.KEY_CREDIT_CARD_NUMBER
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val numberCreditCard = intent.getStringExtra(KEY_CREDIT_CARD_NUMBER)
       // Log.i('número do Cartao',numberCreditCard?:"")

       // etCreditCardNumber.text = Editable.Factory.getInstance().newEditable(numberCreditCard)
        //println(numberCreditCard)
       // Log.i('df',"onCreate")
      //  initComponents()
    }
    private fun initComponents(){
        etCreditCardNumber.addTextChangedListener(MaskWatcher(etCreditCardNumber,getString(R.string.credit_card_mask)))
        etCreditCardExpiration.addTextChangedListener(MaskWatcher(etCreditCardExpiration, getString(R.string.expiration_mask)))
        etCreditCardCvv.addTextChangedListener(MaskWatcher(etCreditCardCvv, getString(R.string.cvv_mask)))


        /*btCreditCardSave.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }*/
        /*btCreditCardSave.setOnClickListener {
            val expirationDate = etCreditCardExpiration.text.toString()
            val monthYear = expirationDate.split("/")

            if(monthYear.first().toInt() > 12){
                tilCreditCardExpiration.error="Data de expiração é inválida"
            } else {
                tilCreditCardExpiration.isErrorEnabled = false
            }
        }*/
    }
}