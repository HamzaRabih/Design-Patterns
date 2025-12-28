package ma.rabih.enset.iibdcc.eommsapp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Context context = new Context();
        Scanner scanner = new Scanner(System.in);

        int choix;

        do {
            System.out.println("\n=== MENU STRATEGY ===");
            System.out.println("1️⃣  Exécuter Strategy 1");
            System.out.println("2️⃣  Exécuter Strategy 2");
            System.out.println("3️⃣  Exécuter Strategy 3");
            System.out.println("0️⃣  Quitter");
            System.out.print("👉 Votre choix : ");

            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    context.setStrategy(new StrategyImpl1());
                    break;
                case 2:
                    context.setStrategy(new StrategyImpl2());
                    break;
                case 3:
                    context.setStrategy(new StrategyImpl3());
                    break;
                case 0:
                    System.out.println("Au revoir 👋");
                    break;
                default:
                    System.out.println("Choix invalide, stratégie par défaut !");
                    context.setStrategy(new DefaultStrategyImpl());
            }

            if (choix != 0) {
                context.effectuerOperation();
            }

        } while (choix != 0);

        scanner.close();
    }
}
