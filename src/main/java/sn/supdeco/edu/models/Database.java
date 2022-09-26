package sn.supdeco.edu.models;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static List<Utilisateur> utilisateurs = new ArrayList<>();
    private static List<Voiture> voitures = new ArrayList<>();
    private Database(){};

    public static void addVoiture(Voiture voiture){
        voitures.add(voiture);
    }

    public static List<Voiture> geVoitures(){
        return voitures;
    }

    public static void addUtilisateur(Utilisateur utilisateur){
        utilisateurs.add(utilisateur);
    }

    public static List<Utilisateur> geUtilisateurs(){
        return utilisateurs;
    }


}
