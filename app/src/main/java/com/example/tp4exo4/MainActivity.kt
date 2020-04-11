package com.example.tp4exo4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity(),recyclerViewAdapter.OnItemClickListener {
    override fun onItemClick(seance: seanceDataModel) {

        var intent =Intent(this@MainActivity,detailedSeance::class.java)
        intent.putExtra("title",seance.title)
        intent.putExtra("intitule",seance.intitule)
        intent.putExtra("duree",seance.duree)
        intent.putExtra("enseignant",seance.enseignant)
        intent.putExtra("nom",seance.nom)
        intent.putExtra("prenom",seance.prenom)
        intent.putExtra("adresse",seance.adresse)
        intent.putExtra("age",seance.age)
        intent.putExtra("tel",seance.tel)
        intent.putExtra("diplome",seance.diplome)
        startActivity(intent)
          }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        var seance = ArrayList<seanceDataModel>()
        seance.add(seanceDataModel("TP SGBD","configuration du oracle","2h30mn dim de 8:30 à 11h","Benkrid","Benkrid","Soumia","Alger","30ans","0549693436","Doctorate"))
        seance.add(seanceDataModel("TD IHM","fabriquation du cahier des charge","1h dim de 11:10 à 12:10","Hassini","Hassini","Soumia","Alger","30ans","0549693436","Doctorate"))
        seance.add(seanceDataModel("TDM","Conception d’Interfaces","4h dim de 13:00 à 17:00","Mostefai","Mostefai","Amine","Alger","40ans","0549693436","Doctorate"))
        seance.add(seanceDataModel("Cours HPC","Open Mp","2h lun de 8:30 à 10:30 ","Hadji","Hadji","Rachid","Alger","40ans","0549693436","Doctorate"))

        var adapter =recyclerViewAdapter(seance,this)
        recyclerView.setAdapter(adapter)
    }

}
