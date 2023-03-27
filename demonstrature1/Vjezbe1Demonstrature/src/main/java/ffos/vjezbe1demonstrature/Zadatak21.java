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
public class Zadatak21 {
    //21.  Učitati dva cijela broja i izračunati im zbroj, razliku, umnožak i količnik. 
    
    public static void main(String[] args) {
        
        int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
        int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
        
        
        int zbroj = prviBroj + drugiBroj;
        int razlika = prviBroj - drugiBroj;
        int umnozak = prviBroj * drugiBroj;
        double kolicnik = (double) prviBroj / (double) drugiBroj;
        
        System.out.println(zbroj);
        System.out.println(razlika);
        System.out.println(umnozak);
        System.out.println(kolicnik);
        
//        System.out.println(zbroj + "\n" + razlika + "\t" + umnozak);
        
    }
    
}
