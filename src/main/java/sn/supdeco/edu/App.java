package sn.supdeco.edu;

import sn.supdeco.edu.models.Utilisateur;
import sn.supdeco.edu.models.Voiture;
import sn.supdeco.edu.services.IParking;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws RemoteException, NotBoundException, MalformedURLException {
        IParking parking = (IParking) Naming.lookup("rmi://localhost:2000/parking");
        Scanner scanner = new Scanner(System.in);
        Utilisateur utilisateur = null;
        String message ="";


        int i = 1;

        // test expression
        while (i ==1) {
            System.out.println("Faites votre choix:");
            System.out.println("1. Stationner vehicule");
            System.out.println("2. Recuperer  vehicule");
            System.out.println("3. Quitter");

            int choice = scanner.nextInt();

            switch ( choice){
                case 1:
                    System.out.println("*********Information client****************");
                    System.out.println("Saisir l'identifiant de l'utilisateur");
                    String id = scanner.next();
                    System.out.println("Saisir le nom de l'utilisateur");
                    String nom = scanner.next();
                    System.out.println("Saisir le prenom de l'utilisateur");
                    String prenom = scanner.next();
                    utilisateur = new Utilisateur(id,nom,prenom);
                    System.out.println(utilisateur.getId()+" "+utilisateur.getNom());
                    message = parking.creerUtilisateur(utilisateur);
                    System.out.println(message);

                    System.out.println("*********Information Vehicule****************");
                    System.out.println("Saisir le matricule de votre voiture");
                    String matricule = scanner.next();
                    System.out.println("Saisir le type de votre voiture");
                    String typeVoiture = scanner.next();

                    Voiture voiture = new Voiture(matricule,typeVoiture,utilisateur);
                    message = parking.creerVoiture(voiture,utilisateur);
                    System.out.println(message);
                    i=1;
                    break;
                case 2:

                    System.out.println("Merci de renseigner votre code de parking avant de sortir");
                    String code = scanner.next();
                    message = parking.recupererVoiture(code);
                    System.out.println(message);

                    i=1;
                    break;
                case 3:

                    i=2;
                    break;

            }


        }




    }
}
