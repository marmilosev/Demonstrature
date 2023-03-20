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
public class Zadatak2 {
    
    //2. Za unesena dva cijela broja ispišite njihov zbroj.
    public static void main(String[] args) {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
        
//        System.out.println(a + b);

        int suma = a + b;
        //suma = a + b;
        
        System.out.println(suma);
                
        
        
        
        
    }
    
}
