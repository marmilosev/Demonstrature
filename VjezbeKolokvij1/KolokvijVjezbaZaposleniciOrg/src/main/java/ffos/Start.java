/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

    List<Zaposlenik> zaposlenici;

    public Start() {
        Pomocno.ulaz = new Scanner(System.in);
        zaposlenici = new ArrayList<>();

        unosZaposlenici();
        
        ispisZaposlenikaPlace();
        ispisOrganizacijaNajmanjeZaposlenika();
        ispisUneseniZaposlenici();
    }

    private void unosZaposlenici() {
        do {
            unosZaposlenika();
        } while (!Pomocno.unosString("Unesi x za prekid unosa zaposlenika").equals("x"));
    }
        
    private void unosZaposlenika() {
        Zaposlenik z = new Zaposlenik();
        z.setIme(Pomocno.unosString("Unesi ime zaposlenika:"));
        z.setPrezime(Pomocno.unosString("Unesi prezime zaposlenika:"));
        z.setDatumZaposlenja(Pomocno.unosDate("Unesi datum zaposlenja zaposlenika: "));
        z.setPlaca(Pomocno.unosFloat("Unesi plaću zaposlenika: "));
        z.setOrganizacija(unosOrganizacija());
        zaposlenici.add(z);
    }

    private Organizacija unosOrganizacija() {
        System.out.println("Unos organizacije");
        Organizacija o = new Organizacija();
        o.setSifra(Pomocno.unosInteger("Unesi šifru organizacije:"));
        o.setNaziv(Pomocno.unosString("Unesi naziv organizacije:"));
        o.setBrojZaposlenika(Pomocno.unosInteger("Unesi broj zaposlenika unutar organizacije:"));
        return o;
    }

    private void ispisZaposlenikaPlace() {
        float min, max;
        min = max = zaposlenici.get(0).getPlaca();
        for (Zaposlenik z : zaposlenici) {
            if (z.getPlaca() > max) {
                max = z.getPlaca();
            } else {
                min = z.getPlaca();
            }
        }
        System.out.println("Iznos najmanje plaće je " + min);
        System.out.println("Iznos najveće plaće je " + max);
    }

    private void ispisOrganizacijaNajmanjeZaposlenika() {
        float min;
        min = zaposlenici.get(0).getOrganizacija().getBrojZaposlenika();
        String nazivOrg = null;
        for (Zaposlenik z : zaposlenici) {
            if (z.getOrganizacija().getBrojZaposlenika() < min) {
                nazivOrg = z.getOrganizacija().getNaziv();
            }
        }
        System.out.println("Najmanje zaposlenika ima: " + nazivOrg);
    }

    private void ispisUneseniZaposlenici() {
        int i = 0;
        for (Zaposlenik z : zaposlenici) {
            i++;

        }
        System.out.println("Ukupan broj unesenih zaposlenika je " + i);
    }

    public static void main(String[] args) {
        new Start();
    }



}
