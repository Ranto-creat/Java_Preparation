package org.example.PreparationExamen.Ferry;
import java.util.Date;
import lombok.*;

@Getter

public class Voyageur extends Personne{
    Date date_de_voyage;

    public Voyageur(String nom, String prenom, Date date_de_naissance, String adresse, double poids) {
        super(nom, prenom, date_de_naissance, adresse, poids);
    }

    @Override
    public String getVoyager() {
        return "";
    }
}