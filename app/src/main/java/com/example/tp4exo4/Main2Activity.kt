package com.example.tp4exo4


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.TextView


class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val extras = intent.extras

        val bundle = Bundle()
        bundle.putString("ens",extras?.getString("ens"))
        bundle.putString("duree",extras?.getString("duree"))
        bundle.putString("intitule",extras?.getString("intitule"))

        val fragment = BlankFragment()
        fragment.arguments=bundle
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.contaner, fragment)
        transaction.commit()
    }
}
