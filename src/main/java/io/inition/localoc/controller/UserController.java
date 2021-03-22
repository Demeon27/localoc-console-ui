package io.inition.localoc.controller;

import io.inition.localoc.core.service.UserService;
import io.inition.localoc.core.entity.User;

import java.util.Scanner;

public class UserController {

    private UserService userService;
    public UserController(){this.userService = new UserService();}

    public void creerUser(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quel est le nom de l'utilisateur ?");
        String nom = sc.nextLine();

        System.out.println("Quel est le prénom de l'utilisateur ?");
        String prenom = sc.nextLine();

        System.out.println("Quel est l'adresse e-mail de l'utilisateur ?");
        String mail = sc.nextLine();

        System.out.println("Quel est le numéro de téléphone de l'utilisateur ?");
        String tel = sc.nextLine();

        System.out.println("Quel est l'adresse de l'utilisateur ?");
        String adresse = sc.nextLine();

        System.out.println("Quel est le Code Postal de l'utilisateur ?");
        Integer cp = sc.nextInt();

        System.out.println("L'utilisateur est il activé 1=oui 0=non ?");
        Integer actif = sc.nextInt();

        System.out.println("L'utilisateur est il client = 2 ou membre du personnel= 1 ?");
        Integer lvl = sc.nextInt();

        User user = new User();
        user.setNom(nom);
        user.setPrenom(prenom);
        user.setMail(mail);
        user.setTel(tel);
        user.setAdresse(adresse);
        user.setCp(cp);
        user.setActif(actif);
        user.setLvl(lvl);

        userService.createUser(user);
        System.out.println("L'utilisateur crée à "+user.getId()+"comme id unique !");

    }

    public void supprimerUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est L'indentifiant de l'utilisateur à supprimer ?");
        int identifiant = scanner.nextInt();
        userService.supprimerUser(identifiant);
        }

    public void afficheDetailsUser(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Quel est l'identifiant de l'utilisateur dont vous voulez afficher les informations ?");
        int identifiant=scanner.nextInt();
        User user = userService.getUser(identifiant);
        System.out.println("Le joueur séléctionné s'appelle "+user.getPrenom()+" "+user.getNom());
    }

}


