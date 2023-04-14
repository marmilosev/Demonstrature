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
    public static Scanner scanner;
    List<Prijava> prijave;

    public Start() {
        Start.scanner = new Scanner(System.in);
        prijave = new ArrayList<>();
        
        do{
            unosPrijave();
        }while(!Unos.unosString("Unos n za prekid unosa prijava").equals("n"));
        
        ispisPrijave();
        ispisProsjek();
    }

    private void unosPrijave() {
        System.out.println("Unos nove prijave");
        Prijava prijava = new Prijava();
        prijava.setSifra(Unos.unosInteger("Upiši šifru prijave"));
        prijava.setDatumPrijave(Unos.unosDate("Upiši datum prijave "));
        prijava.setStudent(unosStudent());
        
        prijave.add(prijava);
    }
    
    private Student unosStudent() {
        System.out.println("Unos studenta na prijavu");
        Student student = new Student();
        student.setJmbag(Unos.unosInteger("Unesi JMBAG"));
        student.setIme(Unos.unosString("Unesi ime"));
        student.setPrezime(Unos.unosString("Unesi prezime"));
        student.setProsjek(Unos.unosFloat("Unesi prosjek na dvije decimale "));
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
