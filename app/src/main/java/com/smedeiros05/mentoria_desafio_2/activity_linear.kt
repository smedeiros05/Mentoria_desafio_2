package com.smedeiros05.mentoria_desafio_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_linear.*
import kotlinx.android.synthetic.main.activity_main.*

class activity_linear : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)
        btn_send.setOnClickListener(){
            resultado.text = "Fui clicado"
        }

    }
}