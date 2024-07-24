package org.example.PreparationExamen.Ferry;

public class Vehicule {
    private String modele;
    private String immatriculation;
    private int kilometrage;
    private int poids ;
    private int longueur ; // en mètres
    private double carburant ; // en litres
    private String conducteur ;

    public void changerConducteur(String conducteur) {
        this.conducteur = conducteur;
    }
}
