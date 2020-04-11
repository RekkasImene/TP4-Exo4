package com.example.tp4exo4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detailed_seance.*

class detailedSeance  : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_seance)



        tvEnseignant.setOnClickListener {
            val intent1 = Intent(this, detailedEnseignant::class.java)
            intent1.putExtra("enseignant",intent.getStringExtra("enseignant"))
            intent1.putExtra("nom",intent.getStringExtra("nom"))
            intent1.putExtra("prenom",intent.getStringExtra("prenom"))
            intent1.putExtra("adresse",intent.getStringExtra("adresse"))
            intent1.putExtra("age",intent.getStringExtra("age"))
            intent1.putExtra("tel",intent.getStringExtra("tel"))
            intent1.putExtra("diplome",intent.getStringExtra("diplome"))

            // start your next activity
            startActivity(intent1)
        }

        var title=intent.getStringExtra("title")
        var seance_name:TextView= findViewById(R.id.seance_name)
        seance_name.text= title.toString()
        var intitule=intent.getStringExtra("intitule")
        var tvIntitule:TextView= findViewById(R.id.tvIntitule)
        tvIntitule.text= intitule.toString()
        var duree=intent.getStringExtra("duree")
        var tvDuree:TextView= findViewById(R.id.tvDuree)
        tvDuree.text= duree.toString()
        var enseignant=intent.getStringExtra("enseignant")
        var tvEnseignant:TextView= findViewById(R.id.tvEnseignant)
        tvEnseignant.text= enseignant.toString()


    }


}
