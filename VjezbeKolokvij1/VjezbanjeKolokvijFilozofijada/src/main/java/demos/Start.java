/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author marija
 */
public class Start {
    List<Prijava> prijave;

    public Start() {
        Pomocno.ulaz = new Scanner(System.in);
        prijave = new ArrayList<>();
        
        unosPrijave();
        
        ispisPrijave();
        ispisProsjek();
        
        Pomocno.ulaz.close();
    }

    private void unosPrijave() {
        do{
            unosPrijava();
        }while(!Pomocno.unosString("Unos n za prekid unosa prijava").equals("n"));
        
    }
    
    private void unosPrijava() {
        System.out.println("Unos nove prijave");
        Prijava prijava = new Prijava();
        prijava.setSifra(Pomocno.unosInteger("Upiši šifru prijave"));
        prijava.setDatumPrijave(Pomocno.unosDate("Upiši datum prijave "));
        prijava.setStudent(unosStudent());
        
        prijave.add(prijava);
    }

    private Student unosStudent() {
        System.out.println("Unos studenta na prijavu");
        Student student = new Student();
        student.setJmbag(Pomocno.unosInteger("Unesi JMBAG"));
        student.setIme(Pomocno.unosString("Unesi ime"));
        student.setPrezime(Pomocno.unosString("Unesi prezime"));
        student.setProsjek(Pomocno.unosFloat("Unesi prosjek na dvije decimale "));
        return student;
    }

    private void ispisPrijave() {
        int i = 0;
        for(Prijava p : prijave){
            i++;
        }
        System.out.println("Ukupan broj prijava: " + i);
    }

    private void ispisProsjek() {
        float min, max;
        min = max = prijave.get(0).getStudent().getProsjek();
        //znači da se obje vrijednosti (min i max) inicijaliziraju na prosjek prvog studenta u popisu prijava
        
        for(Prijava p : prijave){
            if(p.getStudent().getProsjek() > max){
                max = p.getStudent().getProsjek();
            }else {
                min = p.getStudent().getProsjek();
            }
        }
        
        System.out.println("Najmanji prosjek: " + min);
        System.out.println("Najveći prosjek: " + max);
    }
    
    public static void main(String[] args) {
        new Start();
    }


    
    
}
