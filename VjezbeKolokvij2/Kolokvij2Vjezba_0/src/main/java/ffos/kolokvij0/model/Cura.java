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
public class Cura extends Entitet{
    
    private double maraka;
    private String vesta;
    private double kuna;
    private String dukserica;

    public double getMaraka() {
        return maraka;
    }

    public void setMaraka(double maraka) {
        this.maraka = maraka;
    }

    public String getVesta() {
        return vesta;
    }

    public void setVesta(String vesta) {
        this.vesta = vesta;
    }

    public double getKuna() {
        return kuna;
    }

    public void setKuna(double kuna) {
        this.kuna = kuna;
    }

    public String getDukserica() {
        return dukserica;
    }

    public void setDukserica(String dukserica) {
        this.dukserica = dukserica;
    }

    @Override
    public String toString() {
        return "cura" + maraka;
    }
    
    
    
    
}
