/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.tests;

import com.esprit.models.Commande;
import com.esprit.models.Livraison;
import com.esprit.models.Paiement;
import com.esprit.services.ServiceCommande;
import com.esprit.services.ServiceLivraison;
import com.esprit.services.ServicePaiement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author aziz khbou
 */
public class PIJAVA {

    public static void main(String[] args) throws SQLException {
       /* DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();*/
        ServiceCommande sc = new ServiceCommande();
        sc.ajouter(new Commande(1, 10, 15, 5,"velo"));
        sc.afficher().forEach(System.out::println);
        /* Commande s = new Commande(4, 10, 15, 5, "velo");
       /* sc.modifier(s);
        sc.supprimer(s);/*

        /*ServicePaiement sp = new ServicePaiement();
        sp.ajouter(new Paiement(1, "azizkhbou@gmail.com", "esprit", "france", "ariana", 2050));
        Paiement v = new Paiement(9, "azizk@gmail.com", "msb", "france", "ariana", 2050);
        sp.modifier(v);

        sp.supprimer(v);

        sp.afficher().forEach(System.out::println);
        ServiceLivraison sl = new ServiceLivraison();
        sl.ajouter(new Livraison(1, "cité ennasr ariana", "livré"));
        Livraison t = new Livraison(3, "ghazela ariana", "en attente");
        sl.modifier(t);
        sl.afficher().forEach(System.out::println);*/
    }

}
