/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import java.util.Date;

/**
 *
 * @author marija
 */
@Entity
public class Kulen extends Entitet{
    
    private int broj;
    private Date datumProizvodnje;
    @ManyToOne
    private Mesar mesar;
    @ManyToOne
    private Mjesto mjesto;

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public Date getDatumProizvodnje() {
        return datumProizvodnje;
    }

    public void setDatumProizvodnje(Date datumProizvodnje) {
        this.datumProizvodnje = datumProizvodnje;
    }

    public Mesar getMesar() {
        return mesar;
    }

    public void setMesar(Mesar mesar) {
        this.mesar = mesar;
    }

    public Mjesto getMjesto() {
        return mjesto;
    }

    public void setMjesto(Mjesto mjesto) {
        this.mjesto = mjesto;
    }

    @Override
    public String toString() {
        return String.valueOf(broj);
    }

    
    
    
    
    
}
