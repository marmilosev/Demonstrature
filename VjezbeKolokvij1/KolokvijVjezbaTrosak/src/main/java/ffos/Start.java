/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ffos;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author marija
 */
public class Start {
    
    private List<Projekt> projekti;
    
    
    public Start() {
        projekti = new ArrayList<>();
        Pomocno.ulaz = new Scanner(System.in);
        //sve metode - unutar konstruktora
        ucitajProjekte();
        
        ispisProjekata();
        ispisProsjekPlace();
        
        Pomocno.ulaz.close();
    }
    
    
    

    public static void main(String[] args) {
        new Start();
    }

    private void ucitajProjekte() {
        System.out.println("Unos novog projekta");
        do{
          ucitajProjekt();  
        }while(!Pomocno.ucitajString("Gotov s unosom projekata (g)?").equals("g"));
    }

    private void ucitajProjekt() {
//        System.out.println("Unos novog projekta");
        Projekt p = new Projekt();
        p.setSifra(Pomocno.ucitajString("Upiši šifru projekta"));
        p.setNaziv(Pomocno.ucitajString("Upiši naziv projekta"));
        p.setZavrsen(Pomocno.ucitajBoolean("Da li je projekt gotov (true/false)"));
        p.setVoditelj(ucitajVoditelja());
        projekti.add(p);
    }

    private Voditelj ucitajVoditelja() {
//        System.out.println("Unos novog voditelja");
        Voditelj v = new Voditelj();
        v.setIme(Pomocno.ucitajString("Unesi ime voditelja"));
        v.setPrezime(Pomocno.ucitajString("Unesi prezime voditelja"));
        v.setGodisnjaPlaca(Pomocno.ucitajFloat("Unesi godišnju plaću voditelja"));
        return v;
    }

    private void ispisProjekata() {
        for(Projekt p : projekti){
            System.out.println(p.getNaziv() + ": " + (p.getVoditelj().getGodisnjaPlaca()/12));
        }
    }

    private void ispisProsjekPlace() {
        DecimalFormat df = new DecimalFormat("0.00");
        float suma = 0;
        int projektZavrseni = 0;
        for(Projekt p : projekti){
            if(p.isZavrsen() == true){
                suma += p.getVoditelj().getGodisnjaPlaca()/12;
                projektZavrseni++;
            }
        }
        System.out.println("Prosjek mjesečnih plaća završenih projekata: " + df.format(suma/projektZavrseni));
    }
    
   
}
