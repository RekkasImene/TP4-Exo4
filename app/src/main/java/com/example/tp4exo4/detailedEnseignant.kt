package com.example.tp4exo4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class detailedEnseignant : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_enseignant)

        var enseignant=intent.getStringExtra("enseignant")
        var tvEnseignant: TextView = findViewById(R.id.tvEnseignant)
        tvEnseignant.text= enseignant.toString()
        var nom=intent.getStringExtra("nom")
        var tvNom: TextView = findViewById(R.id.tvNom)
        tvNom.text= nom.toString()
        var prenom=intent.getStringExtra("prenom")
        var tvPrenom: TextView = findViewById(R.id.tvPrenom)
        tvPrenom.text= prenom.toString()
        var age=intent.getStringExtra("age")
        var tvAge: TextView = findViewById(R.id.tvAge)
        tvAge.text= age.toString()
        var adresse=intent.getStringExtra("adresse")
        var tvAdresse: TextView = findViewById(R.id.tvAdresse)
        tvAdresse.text= adresse.toString()
        var tel=intent.getStringExtra("tel")
        var tvTel: TextView = findViewById(R.id.tvTel)
        tvTel.text= tel.toString()
        var diplome=intent.getStringExtra("diplome")
        var tvDiplome: TextView = findViewById(R.id.tvDiplome)
        tvDiplome.text= diplome.toString()
    }
}
