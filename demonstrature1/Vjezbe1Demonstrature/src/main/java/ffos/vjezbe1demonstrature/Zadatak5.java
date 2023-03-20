/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezbe1demonstrature;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Marija
 */
public class Zadatak5 {
    //5.	Deklarirati niz od tri elementa 
    //i od korisnika unijeti tri decimalne vrijednosti u deklarirani niz.
    
    public static void main(String[] args) {
        
        
        double[] niz = new double[3];
        
        niz[0] = Double.parseDouble(JOptionPane.showInputDialog("Unesi prvi decimalni broj u niz"));
        niz[1] = Double.parseDouble(JOptionPane.showInputDialog("Unesi drugi decimalni broj u niz"));
        niz[2] = Double.parseDouble(JOptionPane.showInputDialog("Unesi treći decimalni broj u niz"));
        
        System.out.println(Arrays.toString(niz));
        
        
        
    }
    
}
