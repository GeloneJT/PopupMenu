package com.example.popupmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn1)
    }

    fun showMenu(v: View) {
        var pop: PopupMenu = PopupMenu(this, btn)
        pop.menuInflater.inflate(R.menu.mymenu, pop.menu)

        pop.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.c -> Toast.makeText(this, "Call", Toast.LENGTH_LONG).show()
                R.id.m -> Toast.makeText(this, "Message", Toast.LENGTH_LONG).show()
                R.id.e -> finish()
            }
            true
        })
        pop.show()
    }

}