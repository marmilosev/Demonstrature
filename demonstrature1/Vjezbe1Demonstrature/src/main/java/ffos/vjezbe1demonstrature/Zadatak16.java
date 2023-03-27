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
public class Zadatak16 {
    ///16.  Zbroj prvih n prirodnih brojeva (n korisnik upisuje). 
    public static void main(String[] args) {
        
       int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
       
       int suma = 0;
       int i = 1;
       
       while(i <= n){
           suma += i;
           i++;
       }
       
        System.out.println(suma);
       
        
        
        
    }
    
}
