/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezbe1demonstrature;

import javax.swing.JOptionPane;

/**
 *
 * @author Marija
 */
public class Zadatak7 {
    //7. Napravi program koji za dva unesena cijela broja ispisuje zbroj svih parnih brojeva između ta dva unesena broja. 
    //Na primjer unesemo 8 i 12
    //program ispisuje 30 jer je 8 + 10 + 12 = 30 ili 
    //unesemo 13 i 5
    //program ispisuje 36 jer je 6 + 8 + 10 + 12 = 36.
    
    public static void main(String[] args) {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
        
//        int min = a;
//        int max = b;
//        if(a > b) {
//            min = b;
//            max = a;
//        }
        
        int min = a < b ? a : b;
        int max = a > b ? a : b;
        
        int suma = 0;
        for(int i = min; i <= max; i++){
            if(i % 2 == 0){
                suma += i;
                
            }
            
        }
        System.out.println(suma);
        
        
    }
    
}
