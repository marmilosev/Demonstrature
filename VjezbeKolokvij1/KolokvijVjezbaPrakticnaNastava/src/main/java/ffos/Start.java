/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ffos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author marija
 */
public class Start {
    
    private List<RadniDan> radniDani;

    public Start() {
        radniDani = new ArrayList<>();
        Pomocno.ulaz = new Scanner(System.in);
        ucitajRadniDane();
        
        ispisZaradjeno();
        ispisStudenti();
        
        Pomocno.ulaz.close();
    }
    
    

    public static void main(String[] args) {
        new Start();
    }

    private void ucitajRadniDane() {
        do {            
            ucitajRadniDan();
        } while (!Pomocno.ucitajString("Unos t za prekid unosa").equals("t"));
        
    }

    private void ucitajRadniDan() {
        System.out.println("Unos novog radnog dana");
        RadniDan r = new RadniDan();
        r.setMjestoIzvodjenja(Pomocno.ucitajMjesto("Upiši mjesto"));
        r.setZaradjeniIznos(Pomocno.ucitajFloat("Upiši zarađeni iznos"));
        r.setStudent(ucitajStudenta());
        radniDani.add(r);
    }

    private Student ucitajStudenta() {
        System.out.println("Unos studenta na radni dan");
        Student s = new Student();
        s.setIme(Pomocno.ucitajString("Unesi ime"));
        s.setPrezime(Pomocno.ucitajString("Unesi prezime"));
        s.setSpol(Pomocno.ucitajString("Unesi spol studenta"));
        return s;
    }

    private void ispisZaradjeno() {
        float suma = 0;
        for(RadniDan r : radniDani){
            suma += r.getZaradjeniIznos();
        }
        System.out.println("Ukupno zarađeni iznos na svim danima: " + suma);
    }

    private void ispisStudenti() {
        int z = 0;
        int m = 0;
        for(RadniDan r : radniDani){
            if(r.getStudent().getSpol().equalsIgnoreCase("Žensko")){
                z++;
            }
            if(r.getStudent().getSpol().equalsIgnoreCase("Muško")){
                m++;
            }
        }
        System.out.println("Žensko: " + z);
        System.out.println("Muško: " + m);
    }
    
    
    
    
}
