package org.example.PreparationExamen.Ferry;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@ToString

public abstract class Personne {
    private String nom;
    private String prenom;
    private LocalDate date_de_naissance;
    private String adresse;
    private double poids ;

    public abstract String getVoyager();
}
