package com.example.trafficlightsystem


import android.app.AppComponentFactory
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val red = RedFragment()
        val yellow= YellowFragment()
        val green = GreenFragment()
        val redbtn = findViewById<Button>(R.id.btnred)
        val yelbtn  = findViewById<Button>(R.id.btnyellow)
        val greenbtn = findViewById<Button>(R.id.btngreen)
        val navi = findViewById<Button>(R.id.navigate)
        supportFragmentManager.beginTransaction().apply() {
              replace(R.id.flFragment, red)
            commit()
        }
        redbtn.setOnClickListener{
            supportFragmentManager.beginTransaction().apply(){
                replace(R.id.flFragment, red)
                commit()
            }
        }
        yelbtn.setOnClickListener{
            supportFragmentManager.beginTransaction().apply(){
                replace(R.id.flFragment, yellow)
                commit()
            }
        }
        greenbtn.setOnClickListener{
            supportFragmentManager.beginTransaction().apply(){
                replace(R.id.flFragment, green)
                commit()
            }
        }




    }
}


