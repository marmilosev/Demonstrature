/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.controller;

import ffos.model.Sport;
import java.util.List;

/**
 *
 * @author marija
 */
public class ObradaSport extends Obrada<Sport>{
    
    public void setPodaci(String naziv, String vrsta){
        if(entitet == null){
            entitet = new Sport();
        }
        entitet.setNaziv(naziv);
        entitet.setVrsta(vrsta);
    }

    @Override
    public void kontrolaCreate() throws Exception {
        
    }

    @Override
    public void kontrolaUpdate() throws Exception {
        
    }

    @Override
    public void kontrolaDelete() throws Exception {
        
    }

    @Override
    public List<Sport> read() {
        return (List<Sport>) session.createSelectionQuery("from Sport").list();
    }

    @Override
    public void setNew() {
        entitet = new Sport();
    }
    
}
