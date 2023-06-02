/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.kolokvij0.model;

import jakarta.persistence.Entity;

/**
 *
 * @author marija
 */
@Entity
public class Muskarac extends Entitet{
    
    private int narukvica;
    private String bojaOciju;
    private boolean indiferentno;

    public int getNarukvica() {
        return narukvica;
    }

    public void setNarukvica(int narukvica) {
        this.narukvica = narukvica;
    }

    public String getBojaOciju() {
        return bojaOciju;
    }

    public void setBojaOciju(String bojaOciju) {
        this.bojaOciju = bojaOciju;
    }

    public boolean isIndiferentno() {
        return indiferentno;
    }

    public void setIndiferentno(boolean indiferentno) {
        this.indiferentno = indiferentno;
    }

    @Override
    public String toString() {
        return "muskarac" + narukvica;
    }
    
    
    
}
