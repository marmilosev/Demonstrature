/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
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
    
   public static int ucitajInt(String poruka){
       int i=0;
       while(true){
           System.out.println(poruka);
           try {
               i=Integer.parseInt(Pomocno.ulaz.nextLine());
               if(i<0){
                   System.out.println("Broj mora biti pozitivan");
               }else{
                   break;
               }
           } catch (Exception e) {
               System.out.println("Greška - molim broj");
           }
           
       }
       return i;
       
   } 
   
   public static Date ucitajDatum(String poruka){
       SimpleDateFormat sdf = 
                new SimpleDateFormat(
                        "dd.MM.yyyy.",
                        new Locale("hr","HR")
                );
       for(;;){
           try {
               System.out.println(poruka);
               return sdf.parse(Pomocno.ulaz.nextLine());
           } catch (Exception e) {
               System.out.println("Unosa datuma obavezno u formatu dd.MM.yyyy.");
           }
       }
   }
   
   public static float ucitajFloat(String poruka) {
        while (true) {
            System.out.println(poruka);
            try {
                return Float.parseFloat(Pomocno.ulaz.nextLine());
            } catch (Exception e) {
                System.out.println("Decimalni broj s točkom");
            }
        }
    }
   
    
}
