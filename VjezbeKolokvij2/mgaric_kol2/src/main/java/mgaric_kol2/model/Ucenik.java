/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mgaric_kol2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import java.util.Date;

/**
 *
 * @author Korisnik
 */
@Entity
public class Ucenik extends Entitet {
    
    private Date datumRodenja;
    private String ime;
    private String prezime;
    @ManyToOne
    private Mjesto mjesto;
    @ManyToOne
    private Skola skola;

    public Date getDatumRodenja() {
        return datumRodenja;
    }

    public void setDatumRodenja(Date datumRodenja) {
        this.datumRodenja = datumRodenja;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Mjesto getMjesto() {
        return mjesto;
    }

    public void setMjesto(Mjesto mjesto) {
        this.mjesto = mjesto;
    }

    public Skola getSkola() {
        return skola;
    }

    public void setSkola(Skola skola) {
        this.skola = skola;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
    
    
    
    
    
    
    
}
