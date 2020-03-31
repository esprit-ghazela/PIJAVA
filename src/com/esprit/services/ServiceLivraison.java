/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.services;

import com.esprit.models.Commande;
import com.esprit.models.Livraison;
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
public class ServiceLivraison implements IService<Livraison> {

    Connection cnx = DataSource.getInstance().getCnx();
    private Statement pst;

    @Override
    public void ajouter(Livraison l) {
        try {
            String requete = "INSERT INTO livraison (adresseLivr,etat)Values (?,?)";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setString(1, l.getAdresseLivr());
            pst.setString(2, l.getEtat());
            pst.executeUpdate();
            System.out.println("Livraison ajoutée !");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

    }

    @Override
    public void supprimer(Livraison l) {
        try {
            String requete = "DELETE FROM livraison WHERE id=? ";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setInt(1, l.getId());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void modifier(Livraison l) {
     try {
            String requete = "UPDATE livraison SET adresseLivr='" + l.getAdresseLivr()+ "',etat='" + l.getEtat()+"'WHERE id=" + l.getId();
            pst = cnx.createStatement();
            pst.executeUpdate(requete);
            System.out.println("Commande modifiée !");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public List<Livraison> afficher() {
        List<Livraison> list = new ArrayList<>();

        try {
            String requete = "SELECT * FROM livraison";
            PreparedStatement pst = cnx.prepareStatement(requete);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                list.add(new Livraison(rs.getInt("id"),rs.getString(3), rs.getString(4)));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return list;

    }

}
