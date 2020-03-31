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
interface IService<C> {
    public void ajouter(C c);
    public void supprimer(C c);
    public void modifier(C c);
    public List<C> afficher()throws SQLException ;
    
}
