/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.kolokvij0.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

/**
 *
 * @author marija
 */
@Entity
public class Zarucnica  extends Entitet{
    
    private String bojaKose;
    private String jmbag;
    private String hlace;
    private String modelNaocala;
    private double narukvica;
    private double ogrlica;
    @ManyToOne
    private Cura cura;

    public String getBojaKose() {
        return bojaKose;
    }

    public void setBojaKose(String bojaKose) {
        this.bojaKose = bojaKose;
    }

    public String getJmbag() {
        return jmbag;
    }

    public void setJmbag(String jmbag) {
        this.jmbag = jmbag;
    }

    public String getHlace() {
        return hlace;
    }

    public void setHlace(String hlace) {
        this.hlace = hlace;
    }

    public String getModelNaocala() {
        return modelNaocala;
    }

    public void setModelNaocala(String modelNaocala) {
        this.modelNaocala = modelNaocala;
    }

    public double getNarukvica() {
        return narukvica;
    }

    public void setNarukvica(double narukvica) {
        this.narukvica = narukvica;
    }

    public double getOgrlica() {
        return ogrlica;
    }

    public void setOgrlica(double ogrlica) {
        this.ogrlica = ogrlica;
    }

    public Cura getCura() {
        return cura;
    }

    public void setCura(Cura cura) {
        this.cura = cura;
    }

    @Override
    public String toString() {
        return "zarucnica" + jmbag;
    }
    
    
    
}
