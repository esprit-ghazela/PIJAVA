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
public interface IService3 <L>{
     public void ajouter(L l);
    public void supprimer(L l);
    public void modifier(L l);
    public List<L> afficher()throws SQLException;
}
