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
public class Zadatak13 {
    //13.	Napravi program koji će ispisati true ako je unesen broj između 7 i 20.
    public static void main(String[] args) {
        
        int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
        
        boolean txt = false;
        
        if(broj > 7 & broj < 20){ 
            txt = true;
            
        }
        
        System.out.println(txt);
        
        
        
        
    }
    
}
