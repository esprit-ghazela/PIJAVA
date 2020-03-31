/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.models;

import java.time.LocalDate;

/**
 *
 * @author aziz khbou
 */
public class Livraison {

    private int id;
    private String adresseLivr;
    private String etat;

    public Livraison(int id, String adresseLivr, String etat) {
        this.id = id;
        this.adresseLivr = adresseLivr;
        this.etat = etat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresseLivr() {
        return adresseLivr;
    }

    public void setAdresseLivr(String adresseLivr) {
        this.adresseLivr = adresseLivr;
    }

  

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Livraison{" + "id=" + id + ", adresseLivr=" + adresseLivr + ", etat=" + etat + '}';
    }

   

    

   

}
