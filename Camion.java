package org.example.PreparationExamen.Ferry;

import java.sql.Driver;
import java.util.List;

public class Camion extends Vehicule{

    List<Camion> cargaison ;

    public Camion(String modele, String immatriculation, int kilometrage, int poidsVide, int longueur, double carburant, Driver conducteur) {
        super(modele, immatriculation, kilometrage, poidsVide, longueur, carburant, conducteur);
    }

    public void AjouterColis(Camion c){
        cargaison.add(c);
        nouveauPoids();
    }
    public void retireColis(Camion c){
        cargaison.remove(c);
        nouveauPoids();
    }

    private void nouveauPoids() {
        double poidsTotal = 0;
        for (Camion cargaison : cargaison) {
            poidsTotal += cargaison.getPoids();
        }
        this.carburant += poidsTotal;
    }
}
