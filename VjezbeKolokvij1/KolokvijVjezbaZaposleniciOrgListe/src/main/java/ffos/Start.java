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
    
    private List<Organizacija> organizacije;

    public Start() {
        organizacije = new ArrayList<>();
        Pomocno.ulaz = new Scanner(System.in);
        
        ucitajOrganizacije();
        ispisOrganizacije();
        
        Pomocno.ulaz.close();
    }
    
    

    public static void main(String[] args) {
        new Start();
    }

    private void ucitajOrganizacije() {
        do{
            ucitajOrganizaciju();
        }while(!Pomocno.ucitajString("Unesi x ili X za prekid unosa organizacije").trim().toLowerCase().equals("x"));
    }

    private void ucitajOrganizaciju() {
        System.out.println("Unos organizacije");
        Organizacija o = new Organizacija();
        o.setSifra(Pomocno.ucitajInt("Unesi šifru organizacije"));
        o.setNaziv(Pomocno.ucitajString("Unesi naziv organizacije"));
        o.setMaksimalnoZaposlenika(Pomocno.ucitajInt("Unesi maksimalan broj zaposlenika"));
        int maksimmalanBrojZaposlenika = o.getMaksimalnoZaposlenika();
        o.setZaposlenici(ucitajZaposlenike());
        
        organizacije.add(o);
    }

    private List<Zaposlenik> ucitajZaposlenike() {
        List<Zaposlenik> zaposlenici = new ArrayList<>();
        do{
            zaposlenici.add(ucitajZaposlenika());
        }while(!Pomocno.ucitajString("Unesi C za prekid unosa zaposlenika").equals("C"));
        return zaposlenici;
    }

    private Zaposlenik ucitajZaposlenika() {
        System.out.println("Unos zaposlenika");
        Zaposlenik z = new Zaposlenik();
        z.setIme(Pomocno.ucitajString("Unesi ime zaposlenika"));
        z.setPrezime(Pomocno.ucitajString("Unesi prezime zaposlenika"));
        z.setPlaca(Pomocno.ucitajFloat("Unesi plaću zaposlenika"));
        z.setDatumZaposlenja(Pomocno.ucitajDatum("Unesi datum zaposlenja u formatu dd.MM.yyyy."));
        return z;
    }

    private void ispisOrganizacije() {
        
        for(Organizacija o : organizacije){
            float suma = 0;
            for(Zaposlenik z : o.getZaposlenici()){
                suma += z.getPlaca();
            }
            System.out.println(o.getNaziv() + " mora izdvojiti " + suma + " + bruto za isplatu plaća zaposlenika.");
        }
    }
    
    
}
