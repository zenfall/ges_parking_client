package sn.supdeco.edu.services;


import sn.supdeco.models.Utilisateur;
import sn.supdeco.models.Voiture;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IParking extends Remote {

    public String creerUtilisateur(Utilisateur utilisateur) throws RemoteException;
    public String creerVoiture(Voiture voiture, Utilisateur utilisateur) throws RemoteException;
    public String recupererVoiture(String codeParking) throws RemoteException;
}
