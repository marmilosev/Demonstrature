/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezbe1demonstrature;

import java.util.Arrays;

/**
 *
 * @author Marija
 */
public class Zadatak9 {
    //9. Deklarirajte niz od 3 elementa i postavite svakom od ta tri elementa vrijednost „Programiranje 2“.
 
    public static void main(String[] args) {
        
        String[] niz = new String[3];
        
        //niz[0] = "Programiranje2";
//        niz[1] = "Programiranje2";
//        niz[2] = "Programiranje2";
        
        for(int i = 0; i < niz.length; i++){
            niz[i] = "Programiranje 2";
        }
        System.out.println(Arrays.toString(niz));
        
        
        
    }
    
}
