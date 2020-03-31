/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Commande {

    private int id;
    private int prixprod;
    private int amount;
    private int prixlivr;
    private String produit;

    public Commande(int id, int prixprod, int amount, int prixlivr, String produit) {
        this.id = id;
        this.prixprod = prixprod;
        this.amount = amount;
        this.prixlivr = prixlivr;
        this.produit = produit;
    }

 


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrixprod() {
        return prixprod;
    }

    public void setPrixprod(int prixprod) {
        this.prixprod = prixprod;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;

    }

    public int getPrixlivr() {
        return prixlivr;
    }

    public void setPrixlivr(int prixlivr) {
        this.prixlivr = prixlivr;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }

    @Override
    public String toString() {
        return "Commande{" + "id=" + id + ", prixprod=" + prixprod + ", amount=" + amount + ", prixlivr=" + prixlivr + ", produit=" + produit + '}';
    }

}
