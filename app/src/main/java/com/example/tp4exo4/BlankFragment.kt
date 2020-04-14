package com.example.tp4exo4

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.content.Intent
import android.widget.Toast


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [BlankFragment2.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [BlankFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)
        var array = arrayOf(
            Ens("Benkrid","Soumia","Alger","30ans","Doctorate","0549693436"),
            Ens("Hassini","Soumia","Alger","30ans","Doctorate","0549693436"),
            Ens("Mostefai","Amine","Alger","40ans","Doctorate","0549693436"),
            Ens("Hadji","Rachid","Alger","40ans","Doctorate","0549693436"))

        val bundle = this.arguments
        val ens = view.findViewById(R.id.ens) as Button
        val duree = view.findViewById(R.id.duree) as TextView
        val intitule=view.findViewById(R.id.intitule) as TextView
        val index = bundle?.getString("ens")
        val index1 = bundle?.getString("duree")
        val index2 = bundle?.getString("intitule")
        ens.setText(index)
        duree.setText(index1)
        intitule.setText(index2)


        ens.setOnClickListener {
            val bundle = Bundle()


            if (index=="Ens Benkrid")
            {

                bundle.putString("name", array[0].getName())
                bundle.putString("prenom", array[0].getPrenom())
                bundle.putString("adresse", array[0].getAdresse())
                bundle.putString("age", array[0].getAge())
                bundle.putString("deplome", array[0].getDeplome())
                bundle.putString("telephone", array[0].getTelephne())
            }
            Toast.makeText(getActivity(), index,
                Toast.LENGTH_LONG).show();


            if (index.equals("Mostfai"))
            {
                bundle.putString("name",array[2].getName())
                bundle.putString("prenom",array[2].getPrenom())
                bundle.putString("adresse",array[2].getAdresse())
                bundle.putString("age",array[2].getAge())
                bundle.putString("deplome",array[2].getDeplome())
                bundle.putString("telephone",array[2].getTelephne())

            }
            if (index.equals("Hassini"))
            {
                bundle.putString("name",array[1].getName())
                bundle.putString("prenom",array[1].getPrenom())
                bundle.putString("adresse",array[1].getAdresse())
                bundle.putString("age",array[1].getAge())
                bundle.putString("deplome",array[1].getDeplome())
                bundle.putString("telephone",array[1].getTelephne())

            }
            if (index.equals("Hadji"))
            {
                bundle.putString("name",array[3].getName())
                bundle.putString("prenom",array[3].getPrenom())
                bundle.putString("adresse",array[3].getAdresse())
                bundle.putString("age",array[3].getAge())
                bundle.putString("deplome",array[3].getDeplome())
                bundle.putString("telephone",array[3].getTelephne())

            }


            val fragment = BlankFragment()

            val fragmentManager = activity!!.supportFragmentManager

            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.contaner, fragment)
            fragment.arguments=bundle
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //you can set the title for your toolbar here for different fragments different titles
        activity!!.title = "Emploi De Temps"
    }
}
