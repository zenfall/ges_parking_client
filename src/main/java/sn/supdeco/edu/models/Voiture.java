package sn.supdeco.edu.models;

import java.io.Serializable;

public class Voiture implements Serializable {
    private String matricule;
    private String type_vehicule;
    private Utilisateur utilisateur;
    private String codeParking;

    public Voiture(String matricule, String type_vehicule, Utilisateur utilisateur) {
        this.matricule = matricule;
        this.type_vehicule = type_vehicule;
        this.utilisateur = utilisateur;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getType_vehicule() {
        return type_vehicule;
    }

    public void setType_vehicule(String type_vehicule) {
        this.type_vehicule = type_vehicule;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getCodeParking() {
        return codeParking;
    }

    public void setCodeParking(String codeParking) {
        this.codeParking = codeParking;
    }
}
