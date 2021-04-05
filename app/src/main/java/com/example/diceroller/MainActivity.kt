package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {
    lateinit var diceImage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bt: Button =findViewById(R.id.roll_button)
        bt.setOnClickListener{
                rolldice()
    }
        diceImage=findViewById(R.id.dice_image)
}

    private fun rolldice() {
        var random_result= Random().nextInt(6)+1
        val whats_drawn_res=when (random_result){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6
        }
        diceImage.setImageResource(whats_drawn_res)
    }
    }


