package org.example.PreparationExamen.Ferry;

import java.util.Date;

public class Conducteur extends Voyageur{
    private int numero_de_permis ;

    public Conducteur(String nom, String prenom, Date date_de_naissance, String adresse, double poids) {
        super(nom, prenom, date_de_naissance, adresse, poids);
    }
}
