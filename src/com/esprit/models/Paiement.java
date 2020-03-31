/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.models;

/**
 *
 * @author aziz khbou
 */
public class Paiement {

    private int id;
    private String email;
    private String nom_companie;
    private String pays;
    private String district;
    private int codePostal;

    public Paiement(int id, String email, String nom_companie, String pays, String district, int codePostal) {
        this.id = id;
        this.email = email;
        this.nom_companie = nom_companie;
        this.pays = pays;
        this.district = district;
        this.codePostal = codePostal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getNom_companie() {
        return nom_companie;
    }

    public void setNom_companie(String nom_companie) {
        this.nom_companie = nom_companie;
    }

    @Override
    public String toString() {
        return "Paiement{" + "id=" + id + ", email=" + email + ", nom_companie=" + nom_companie + ", pays=" + pays + ", district=" + district + ", codePostal=" + codePostal + '}';
    }

}
