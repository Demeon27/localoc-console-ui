package io.inition.localoc;

import io.inition.localoc.controller.UserController;
import io.inition.localoc.core.entity.User;

import java.util.Scanner;

public class UI {

    public static void main(String... args) {
        UserController userController = new UserController();

        Scanner in = new Scanner(System.in);

        // afficher un menu

        for (int i = 1; i <= 5; i++)

            System.out.println(i + ". Menu #" + i);

        System.out.println("0. Quit");

        // Lire les information du clavier avec la class scanner

        boolean quit = false;

        int menuItem;

        do {

            System.out.print("Choix dans le menu ?: ");

            menuItem = in.nextInt();

            switch (menuItem) {

                case 1:

                    System.out.println("1.Crée un utilisateur");

                    userController.creerUser();

                    break;

                case 2:

                    System.out.println("2.Supprimer un utilisateur");

                    userController.supprimerUser();

                    break;

                case 3:

                    System.out.println("3.Afficher un utilisateur");

                    userController.afficheDetailsUser();

                    break;

                case 4:

                    System.out.println("You've chosen item #4");

                    // do something...

                    break;

                case 5:

                    System.out.println("You've chosen item #5");

                    // do something...

                    break;

                case 0:

                    quit = true;

                    break;

                default:

                    System.out.println("Invalid choice.");

            }

        } while (!quit);

        System.out.println("Bye-bye!");

    }
}