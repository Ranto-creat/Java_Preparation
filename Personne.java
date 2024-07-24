package org.example.PreparationExamen.Ferry;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@ToString

public abstract class Personne {
    private String nom;
    private String prenom;
    private Date date_de_naissance;
    private String adresse;
    private double poids ;

    public abstract String getVoyager();
}
