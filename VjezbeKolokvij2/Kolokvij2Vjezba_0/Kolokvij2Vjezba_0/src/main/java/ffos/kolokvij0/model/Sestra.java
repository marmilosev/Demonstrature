/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.kolokvij0.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import java.util.Date;
import java.util.List;

/**
 *
 * @author marija
 */

@Entity
public class Sestra extends Entitet{
    
    private Date treciPuta;
    private int nausnica;
    private String suknja;
    private String bojaOciju;
    private Date datetime;
    private double kuna;
    @ManyToMany
    private List<Muskarac> muskarac;

    public Date getTreciPuta() {
        return treciPuta;
    }

    public void setTreciPuta(Date treciPuta) {
        this.treciPuta = treciPuta;
    }

    public int getNausnica() {
        return nausnica;
    }

    public void setNausnica(int nausnica) {
        this.nausnica = nausnica;
    }

    public String getSuknja() {
        return suknja;
    }

    public void setSuknja(String suknja) {
        this.suknja = suknja;
    }

    public String getBojaOciju() {
        return bojaOciju;
    }

    public void setBojaOciju(String bojaOciju) {
        this.bojaOciju = bojaOciju;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public double getKuna() {
        return kuna;
    }

    public void setKuna(double kuna) {
        this.kuna = kuna;
    }

    public List<Muskarac> getMuskarci() {
        return muskarac;
    }

    public void setMuskarci(List<Muskarac> muskarci) {
        this.muskarac = muskarac;
    }

    @Override
    public String toString() {
        return "sestra" + nausnica;
    }
    
    
    
    
}
