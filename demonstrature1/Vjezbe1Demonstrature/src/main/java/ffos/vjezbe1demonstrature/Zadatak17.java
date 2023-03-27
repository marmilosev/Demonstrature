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
public class Zadatak17 {
    // Napravi program koji učitava visinu i težinu osobe te računa njezin indeks tjelesne mase (BMI).
    // Formula:  BMI = (m / h²) 
    public static void main(String[] args) {
        
          double tezina = Double.parseDouble(JOptionPane.showInputDialog("Unesi težinu u kilogramima"));
          double visina = Double.parseDouble(JOptionPane.showInputDialog("Unesi visinu u centrimetrima"));
          double visinaMetri = visina/100;
          double BMI = tezina/ (visinaMetri * visinaMetri);
          //double BMI = tezina/(visina * visina);
          System.out.println(Math.round(BMI));
        
        
        
    }
}
