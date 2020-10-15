package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

lateinit var edtxNum1 : EditText
    lateinit var edtxNum2 : EditText
    lateinit var txtResltado : TextView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtxNum1 = findViewById(R.id.edtxNum1)
        edtxNum2 =findViewById(R.id.edtxNum2)
        txtResltado = findViewById(R.id.txtResultado)

    }
    fun suma(v:View){
        var num1 : Int = edtxNum1.text.toString().toInt()
        var num2 : Int = edtxNum2.text.toString().toInt()
        var res = num1+num2
        txtResltado.setText("$res")

    }
    fun resta(v: View){
        var num1 = edtxNum1.text.toString().toInt()
        var num2 = edtxNum2.text.toString().toInt()
        var res = num1-num2
        txtResltado.setText("$res")
    }

    fun multiplicacion(v: View){
        var num1 = edtxNum1.text.toString().toInt()
        var num2 = edtxNum2.text.toString().toInt()
        var res = num1*num2
        txtResltado.setText("$res")
    }

    fun div(v: View){
        var num1 = edtxNum1.text.toString().toInt()
        var num2 = edtxNum2.text.toString().toInt()
        var res = num1/num2
        txtResltado.setText("$res")
    }

}