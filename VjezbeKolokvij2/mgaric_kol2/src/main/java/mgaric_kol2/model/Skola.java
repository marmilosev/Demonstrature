/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mgaric_kol2.model;

import jakarta.persistence.Entity;

/**
 *
 * @author Korisnik
 */
@Entity
public class Skola extends Entitet{
    
    private String naziv;
    private String vrsta;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    @Override
    public String toString() {
        return naziv;
    }
    
    
    
}
