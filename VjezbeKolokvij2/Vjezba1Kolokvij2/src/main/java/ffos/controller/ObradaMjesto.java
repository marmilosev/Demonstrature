/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.controller;

import ffos.model.Mjesto;
import java.util.List;

/**
 *
 * @author marija
 */
//nasljeđuje generičku klasu
public class ObradaMjesto extends Obrada<Mjesto>{
    //Ova metoda postavlja podatke za entitet tipa Mjesto. Prima naziv kao parametar i postavlja ga na entitet.
    public void setPodaci(String naziv){
        //Ako entitet nije inicijaliziran (null), stvara se nova instanca Mjesto objekta.
        if(entitet == null){
            entitet = new Mjesto();
        }
        //Nakon toga, postavlja se naziv na entitet putem entitet.setNaziv(naziv).
        entitet.setNaziv(naziv);
    }

    //Klasa ObradaMjesto mora implementirati sve apstraktne metode definirane u nadređenoj klasi Obrada<Mjesto>. 
    //U ovom slučaju, metode kontrolaCreate(), kontrolaUpdate(), kontrolaDelete(), read() i setNew() moraju biti implementirane.
    @Override
    public void kontrolaCreate() throws Exception {
        
    }

    @Override
    public void kontrolaUpdate() throws Exception {
        
    }

    @Override
    public void kontrolaDelete() throws Exception {
        
    }

    //Metoda read() koristi createSelectionQuery metodu umjesto zastarjele createQuery metode koja je prethodno spomenuta. 
    //Ovdje se koristi session.createSelectionQuery("from Mjesto").list() za dohvaćanje svih objekata tipa Mjesto iz baze podataka.
    @Override
    public List<Mjesto> read() {
        return session.createQuery("from Mjesto", Mjesto.class).list();
    }

    //metoda inicijalizira entitet Mjesto tako da stvara novu instancu Mjesto objekta i dodjeljuje je atributu entitet.
    @Override
    public void setNew() {
        entitet = new Mjesto();
    }
    
}
