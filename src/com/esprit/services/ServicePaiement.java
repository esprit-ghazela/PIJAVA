/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.services;

import com.esprit.models.Paiement;
import com.esprit.utils.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aziz khbou
 */
public class ServicePaiement implements IService2<Paiement> {

    Connection cnx = DataSource.getInstance().getCnx();

    private Statement pst;

    @Override
    public void ajouter(Paiement p) {
        try {
            String requete = "INSERT INTO paiement (email,nom_companie,pays,district,codePostal)Values (?,?,?,?,?)";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setString(1, p.getEmail());
            pst.setString(2, p.getNom_companie());
            pst.setString(3, p.getPays());
            pst.setString(4, p.getDistrict());
            pst.setInt(5, p.getCodePostal());

            pst.executeUpdate();
            System.out.println("Paiement ajoutée !");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public List afficher() throws SQLException {
        List<Paiement> list = new ArrayList<>();
        pst = cnx.createStatement();

        ResultSet rs = pst.executeQuery("select * from paiement");
        while (rs.next()) {
            int id = rs.getInt(1);
            String email = rs.getString(4);
            String nom_companie = rs.getString(5);
            String pays = rs.getString(6);
            String district = rs.getString(7);
            int codePostal = rs.getInt("codePostal");

            Paiement p = new Paiement(id, email, nom_companie, pays, district, codePostal);
            list.add(p);
        }
        return list;
    }

    @Override
    public void supprimer(Paiement p) {
        try {
            String requete = "DELETE FROM paiement WHERE id=?";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setInt(1, p.getId());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void modifier(Paiement p) {
        try {
            String requete = "UPDATE paiement SET email='" + p.getEmail() + "',nom_companie='" + p.getNom_companie()+ "',pays='" + p.getPays()+"',district='" + p.getDistrict()+ "',codePostal='" + p.getCodePostal()+"'WHERE id=" + p.getId();
            pst = cnx.createStatement();
            pst.executeUpdate(requete);
            System.out.println("Paiement modifiée !");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

}
