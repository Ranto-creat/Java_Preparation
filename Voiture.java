package org.example.PreparationExamen.Ferry;


import java.sql.Driver;
import java.util.List;

public class Voiture extends Vehicule {
    public Voiture(String modele, String immatriculation, int kilometrage, int poidsVide, int longueur, double carburant, Driver conducteur) {
        super(modele, immatriculation, kilometrage, poidsVide, longueur, carburant, conducteur);
    }

    public void monter(){
        List<Personne> passagers ;
        int maxPassagers;


    }
}
