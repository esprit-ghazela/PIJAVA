/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.services;

import com.esprit.models.Commande;
import com.esprit.models.Paiement;
import com.esprit.utils.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aziz khbou
 */
public class ServiceCommande implements IService<Commande> {

    Connection cnx = DataSource.getInstance().getCnx();
    private Statement pst;

    @Override
    public void ajouter(Commande c) {

        try {

            String requete = "INSERT INTO commande (prixprod,amount,prixlivr,produit)Values (?,?,?,?)";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setInt(1, c.getPrixprod());
            pst.setInt(2, c.getAmount());
            pst.setInt(3, c.getPrixlivr());
            pst.setString(4, c.getProduit());
            pst.executeUpdate();
            System.out.println("Commande ajoutée !");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public List afficher() throws SQLException {
        List<Commande> list = new ArrayList<>();
        pst = cnx.createStatement();

        ResultSet rs = pst.executeQuery("select * from commande");
        while (rs.next()) {
            int id = rs.getInt("id");
            int prixprod = rs.getInt("prixprod");
            int ammount = rs.getInt("amount");
            int prixlivr = rs.getInt("prixlivr");
            String produit = rs.getString(7);

            Commande c = new Commande(id, prixprod, ammount, prixlivr, produit);
            list.add(c);
        }
        return list;
    }

    @Override
    public void modifier(Commande c) {
       try {
            String requete = "UPDATE commande SET prixprod='" + c.getPrixprod()+ "',amount='" + c.getAmount()+ "',prixlivr='" + c.getPrixlivr()+"',produit='" + c.getProduit()+"'WHERE id=" + c.getId();
            pst = cnx.createStatement();
            pst.executeUpdate(requete);
            System.out.println("Commande modifiée !");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    

    @Override
    public void supprimer(Commande c) {

        try {
            String requete = "DELETE FROM commande WHERE id=?";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setInt(1, c.getId());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
