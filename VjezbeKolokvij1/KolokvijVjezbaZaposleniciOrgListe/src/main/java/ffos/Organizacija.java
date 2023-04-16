/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos;

import java.util.List;

/**
 *
 * @author marija
 */
public class Organizacija {
    
    private int sifra;
    private String naziv;
    private int maksimalnoZaposlenika;
    private List<Zaposlenik> zaposlenici;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getMaksimalnoZaposlenika() {
        return maksimalnoZaposlenika;
    }

    public void setMaksimalnoZaposlenika(int maksimalnoZaposlenika) {
        this.maksimalnoZaposlenika = maksimalnoZaposlenika;
    }

    public List<Zaposlenik> getZaposlenici() {
        return zaposlenici;
    }

    public void setZaposlenici(List<Zaposlenik> zaposlenici) {
        this.zaposlenici = zaposlenici;
    }
    
    
    
}
