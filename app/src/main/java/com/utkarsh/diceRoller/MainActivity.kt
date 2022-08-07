package com.utkarsh.diceRoller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var dice_image : ImageView
    lateinit var success_toast : Toast
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton : Button = findViewById(R.id.roll_button)
        rollbutton.text = "Let's Roll"
        rollbutton.setOnClickListener {
            rolldice()
            MotionToast.createToast(this,"Success","Rolled Successfully",
                MotionToastStyle.SUCCESS,MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helvetica_regular))
        }

        dice_image = findViewById(R.id.Img_view);

    }

    private fun rolldice() {
        val ranInt = Random.nextInt(6)+1
         val result = when (ranInt){
             1 -> R.drawable.dice_1
             2 -> R.drawable.dice_2
             3 -> R.drawable.dice_3
             4 -> R.drawable.dice_4
             5 -> R.drawable.dice_5
             else -> R.drawable.dice_6
         }
         dice_image.setImageResource(result)

    }
}