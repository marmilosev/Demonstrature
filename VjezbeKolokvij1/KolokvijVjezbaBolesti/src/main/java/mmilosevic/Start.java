/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mmilosevic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author marija
 */
public class Start {
    
    private List<Dijete> djeca;

    public Start() throws ParseException {
        djeca = new ArrayList<>();
        Pomocno.ulaz = new Scanner(System.in);
        
        ucitajDjecu();
        ispisStarostiDjece();
        ispisIzbivanja();
        
        Pomocno.ulaz.close();
    }
   
    

    public static void main(String[] args) throws ParseException {
        new Start();
    }

    private void ucitajDjecu() {
        do{
           ucitajDijete();
        }while(!Pomocno.ucitajString("Unesi k za prekid unosa djece").equalsIgnoreCase("k"));
    }

    private void ucitajDijete() {
        System.out.println("Unos djeteta");
        Dijete d = new Dijete();
        d.setIme(Pomocno.ucitajString("Unesi ime djeteta"));
        d.setPrezime(Pomocno.ucitajString("Unesi prezime djeteta"));
        d.setDatumRodenja(Pomocno.ucitajDatum("Unesi datum rođenja djeteta"));
        d.setBolesti(ucitajBolesti());
        djeca.add(d);
    }

    private List<Bolest> ucitajBolesti() {
        List<Bolest> bolesti = new ArrayList<>();
        do{
          bolesti.add(ucitajBolest());
        }while(!Pomocno.ucitajString("Unesi k za prekid unosa djece").equalsIgnoreCase("k"));
        return bolesti;
    }

    private Bolest ucitajBolest() {
        System.out.println("Unos bolesti");
        Bolest b = new Bolest();
        b.setNaziv(Pomocno.ucitajNazivBolesti("Unesi naziv bolesti"));
        b.setSimptomi(Pomocno.ucitajString("Unesi simptome bolesti"));
        b.setIzbivanje(Pomocno.ucitajInt("Unesi broj dana izbivanja zbog bolesti " + b.getNaziv()));
        return b;
    }

    private void ispisStarostiDjece() throws ParseException {
//        int suma = 0;
        GregorianCalendar trenutnoVrijeme = new GregorianCalendar();
        for(Dijete d : djeca){
            GregorianCalendar danRodenja = new GregorianCalendar();
            danRodenja.setTime(d.getDatumRodenja());
            int godine = trenutnoVrijeme.get(Calendar.YEAR) - danRodenja.get(Calendar.YEAR);
            int dani = trenutnoVrijeme.get(Calendar.DAY_OF_YEAR) - danRodenja.get(Calendar.DAY_OF_YEAR);
//            suma += godine * 365 + dani;
            int prijestupniDan = 0;
            for(int i = danRodenja.get(Calendar.YEAR); i <= trenutnoVrijeme.get(Calendar.YEAR); i++){
                Date datum = new SimpleDateFormat("yyyy").parse(Integer.toString(i));
                GregorianCalendar kalendar = new GregorianCalendar();
                kalendar.setTime(datum);
                if(kalendar.isLeapYear(i)){
                    prijestupniDan++;
                }
            }
            int starostDjeteta = godine * 365 + prijestupniDan + dani;
            System.out.println(d.getIme() + " " + d.getPrezime() + " je star ukupno u danima: " + starostDjeteta);
        }
//        System.out.println("Ukupna s..." + suma);
    }

    private void ispisIzbivanja() {
        int suma = 0;
        for(Dijete d : djeca){
            for(Bolest b : d.getBolesti()){
                suma += b.getIzbivanje();
                System.out.println(d.getIme() + " " + d.getPrezime() + " je izbivao iz vrtića " + suma + " dana.");
            }

        }
//        System.out.println("Ukupan broj dana izbivanja iz vrtića: " + suma);
    }
    
    
    
    
    
}
