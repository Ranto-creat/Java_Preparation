package org.example.PreparationExamen.Ferry;

import java.sql.Driver;

import lombok.*;

@AllArgsConstructor
@Getter

public class Vehicule {
    double carburant; // en litres
    private String modele;
    private String immatriculation;
    private int kilometrage;
    private int poidsVide;
    private int longueur; // en mètres
    private Driver conducteur;

    public double getPoids() {
        return poidsVide + carburant;//+ (conducteur != null ? conducteur.weight : 0);
    }

    public void allerAlaPompe(int quantite) {
        this.carburant += quantite;
    }

    public void rouler(double distance, double taux_de_consommation) throws Exception {
        if (conducteur != null) {
            throw new Exception("Pas de conducteur");
        } else if (carburant < (taux_de_consommation * distance)) {
            throw new Exception("pas assez de carburant");
        } else {
            this.carburant = this.carburant - (distance * taux_de_consommation);
            this.kilometrage = (int) (this.kilometrage + distance);
        }
    }
}
