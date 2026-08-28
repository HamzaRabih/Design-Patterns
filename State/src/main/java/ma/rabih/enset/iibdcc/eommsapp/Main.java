package ma.rabih.enset.iibdcc.eommsapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Document document = new Document("Rapport de stage");
        Scanner scanner = new Scanner(System.in);

        int choix;

        do {
            System.out.println("\n=== MENU STATE ===");
            System.out.println("1  Publier (l'effet depend de l'etat courant)");
            System.out.println("2  Afficher le document");
            System.out.println("3  Basculer redacteur / administrateur");
            System.out.println("0  Quitter");
            System.out.print("Votre choix : ");

            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    document.publier();
                    break;
                case 2:
                    document.afficher();
                    break;
                case 3:
                    document.setAdministrateur(!document.estAdministrateur());
                    System.out.println("Profil courant : "
                            + (document.estAdministrateur() ? "administrateur" : "redacteur"));
                    break;
                case 0:
                    System.out.println("Au revoir");
                    break;
                default:
                    System.out.println("Choix invalide");
            }

        } while (choix != 0);

        scanner.close();
    }
}
