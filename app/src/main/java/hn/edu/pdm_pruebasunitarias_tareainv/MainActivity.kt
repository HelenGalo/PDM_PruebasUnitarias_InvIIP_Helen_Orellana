package hn.edu.pdm_pruebasunitarias_tareainv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigInteger


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getNombre()
        btnFactorial.setOnClickListener { NumeroFactorial( txtNumero.text.toString().toInt()) }
    }

    fun NumeroFactorial(numero: Int) {


        if (txtNombre.text.toString()!="Helen") {
            Toast.makeText(
                    this, "Ingrese el Nombre de usuario Correcto", Toast.LENGTH_SHORT
            ).show()

        } else {
            if (txtNumero.text.toString().isEmpty()) {
                Toast.makeText(this, "Ingrese un numero", Toast.LENGTH_SHORT).show()
            } else {
                val numero = txtNumero.text.toString().toInt()
                if (numero > 1) {
                 numero* factorial(numero - 1)
                } else {
                    numero
                }
            }
            txvResultado.text = " El Factorial del numero   " + factorial(numero)


        }
    }

    fun factorial(numero: Int): Int {
        if (numero > 1) {
            return numero * factorial(numero - 1)
        } else {
            return numero

        }



    }
    fun getNombre() {
        val bundle = intent.extras
        val nombre = bundle?.get("nombre")
        txvResultado.text = getString(R.string.txvnum, nombre)
    }
}