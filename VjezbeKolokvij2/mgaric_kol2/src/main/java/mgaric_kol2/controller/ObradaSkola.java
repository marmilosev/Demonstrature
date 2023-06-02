/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mgaric_kol2.controller;

import java.util.List;
import mgaric_kol2.model.Mjesto;
import mgaric_kol2.model.Skola;

/**
 *
 * @author Korisnik
 */
public class ObradaSkola extends Obrada<Skola>{

    @Override
    public List<Skola> read() {
              return session.createQuery("from Skola", Skola.class).list();
    }

    @Override
    protected void kontrolaCreate() throws Exception {

    }

    @Override
    protected void kontrolaUpdate() throws Exception {
     }

    @Override
    protected void kontrolaDelete() throws Exception {
  
    }
    
    
    
    
}
