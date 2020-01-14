package com.tes.firstpage

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.tes.library.R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            com.google.android.material.snackbar.Snackbar.make(
                view,
                "Replace with your own action",
                com.google.android.material.snackbar.Snackbar.LENGTH_LONG
            )
                .setAction("Action", null).show()
        }
    }

}
