package com.example.hazem_test_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val w: TextView =findViewById(R.id.watch_id)
        w.setOnClickListener{

            var wd= DialogFragment()
            wd.show(supportFragmentManager,"All Watches")
        }
        val g: TextView =findViewById(R.id.glasses_id)
        g.setOnClickListener{

            var gd= DialogFragment()
            gd.show(supportFragmentManager,"All Glasses")
        }
    }
    fun receiveFeedback(feedback: String){
        val watches_ : TextView = findViewById(R.id.watch_id)
        val glasses_ : TextView = findViewById(R.id.glasses_id)
        /*
        watches_.text = feedback;
        glasses_.text = feedback;
       */
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
       val inflater = menuInflater
       inflater.inflate(R.menu.menu_1, menu)
       return super.onCreateOptionsMenu(menu)
   }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
   when(item.itemId){
       R.id.item0 -> Toast.makeText(this, "Cart selected", Toast.LENGTH_SHORT).show()
       R.id.item1 -> Toast.makeText(this, "Settings selected", Toast.LENGTH_SHORT).show()
       R.id.item2 -> Toast.makeText(this, "Account selected", Toast.LENGTH_SHORT).show()
       R.id.subitem1 -> Toast.makeText(this, "Information selected", Toast.LENGTH_SHORT).show()
   }
   return true;
    }

}