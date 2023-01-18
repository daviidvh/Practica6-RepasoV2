package com.example.practica6_repasov2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.example.practica6_repasov2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    binding.botonComenzar.setOnClickListener(){
        binding.botonComenzar.setText("Finalizar")
            binding.txt.visibility= View.VISIBLE
            if (binding.txt.text.toString()=="")
                binding.txt.hint="Introduce tu nombre"
            if (binding.txt.text.toString() == "Wayne"){
                binding.logo.setVisibility(View.VISIBLE)
                //binding.logo.isVisible=true

            }else if (binding.txt.text.toString()== "Joker"){
                binding.botonComenzar.setBackgroundColor(Color.parseColor("#d22bed"))
            }

        }
    }
}


