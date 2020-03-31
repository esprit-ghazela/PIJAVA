/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.services;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author aziz khbou
 */
public interface IService2<P> {
    public void ajouter(P p);
    public void supprimer(P p);
    public void modifier(P p);
    public List<P> afficher()throws SQLException;
    
}
