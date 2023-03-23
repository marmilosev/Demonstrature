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
public class Zadatak4 {
    //4. Za unesena tri cijela broja program ispisuje najveći.
    
    public static void main(String[] args) {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Unesi treći broj"));
        
        if(a >= b & a >= c) {
            System.out.println(a);
        } else if (b >= c & b >= a){
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
        
        
        
        
        
    }
}
