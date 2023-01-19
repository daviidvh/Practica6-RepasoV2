package com.example.practica6_repasov2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.core.view.isVisible


import com.example.practica6_repasov2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    binding.botonComenzar.setOnClickListener() {
        if (binding.botonComenzar.text=="Comenzar"){
            binding.botonComenzar.text = "Finalizar"
            binding.txt.visibility= View.VISIBLE
        }else if (binding.botonComenzar.text=="Finalizar") {
            binding.botonComenzar.text = "Comenzar"
            binding.txt.isVisible=false
            binding.logo.isVisible=false
            binding.botonComenzar.setBackgroundColor(Color.parseColor("#6618c6"))
            binding.botonComenzar.setTextColor(Color.parseColor("#ffffff"))

        }
        binding.txt.setOnFocusChangeListener(){x,foco ->
            if (!foco)
                binding.txt.setText("")
        }

    }
        binding.txt.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                // TODO Auto-generated method stub
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // TODO Auto-generated method stub
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (binding.txt.text.toString()=="")
                    binding.txt.hint="Introduce tu nombre"
                if (binding.txt.text.toString() == "Wayne") {
                    binding.logo.visibility = View.VISIBLE
                } else{
                      binding.logo.isVisible=false
                }
                if (binding.txt.text.toString()== "Joker") {
                   binding.botonComenzar.setBackgroundColor(Color.parseColor("#d22bed"))
                   binding.botonComenzar.setTextColor(Color.parseColor("#3ac10f"))
                }else{
                   binding.botonComenzar.setBackgroundColor(Color.parseColor("#6618c6"))
                    binding.botonComenzar.setTextColor(Color.parseColor("#ffffff"))

                }

            }
        })

        }



    }



