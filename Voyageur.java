package org.example.PreparationExamen.Ferry;

import lombok.*;

import java.time.LocalDate;

@Getter

public class Voyageur extends Personne{
    LocalDate date_de_voyage;

    public Voyageur(String nom, String prenom, LocalDate date_de_naissance, String adresse, double poids) {
        super(nom, prenom, date_de_naissance, adresse, poids);
    }

    @Override
    public String getVoyager() {
        return "Voyage";
    }
}