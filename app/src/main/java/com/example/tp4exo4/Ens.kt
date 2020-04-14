package com.example.tp4exo4

class Ens {
    private val Name: String
    private val  Prenom:String
    private val  Adresse:String
    private val Age: String
    private val  Diplome:String
    private val  Telephone:String


    constructor(Name: String,name:String,adr:String,age:String,dip:String,tel:String){
        //code
        this.Name= Name

        this.Prenom=name
        this.Adresse=adr
        this.Age=age
        this.Diplome=dip
        this.Telephone=tel
    }

    fun getName(): String {
        return this.Name
    }
    fun getPrenom(): String {
        return this.Prenom
    }
    fun getAdresse(): String {
        return this.Adresse
    }

    fun getAge(): String {
        return this.Age
    }

    fun getTelephne(): String {
        return this.Telephone
    }
    fun getDeplome(): String {
        return this.Diplome
    }
}