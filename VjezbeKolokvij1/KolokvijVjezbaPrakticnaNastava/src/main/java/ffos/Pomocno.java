/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos;

import java.util.Scanner;

/**
 *
 * @author marija
 */
public class Pomocno {
    
    public static Scanner ulaz;
    
    public static String ucitajString(String poruka) {
        String s=new String();
        while(true){
            System.out.println(poruka);
            s = Pomocno.ulaz.nextLine();
            if(!s.trim().isBlank()){
                return s;
            }
            System.out.println("Obavezan unos");
        }
    }
    
     public static String ucitajMjesto(String poruka) {
        String s=new String();
        while(true){
            System.out.println(poruka);
            s = Pomocno.ulaz.nextLine();
            if(!s.trim().isBlank()){
                return s;
            }
            System.out.println("Mjesto izvođenja obavezno");
        }
    }
    
     public static float ucitajFloat(String poruka) {
        while (true) {
            System.out.println(poruka);
            try {
                return Float.parseFloat(Pomocno.ulaz.nextLine());
            } catch (Exception e) {
                System.out.println("Unijeti decimalni broj s točkom");
            }
        }
    } 
    
}
