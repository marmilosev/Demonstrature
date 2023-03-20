/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ffos.vjezbe1demonstrature;

import javax.swing.JOptionPane;

/**
 *
 * @author Marija
 */
public class Zadatak1 {

    public static void main(String[] args) {
        // 1. Program unosi jedan decimalni i jedan cijeli broj te ispisuje unesene brojeve jedan ispod drugoga.
        
        double a = Double.parseDouble(JOptionPane.showInputDialog("Unesi decimalni broj"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
        
        System.out.println(a + "\n" + b);
        
        
        
    }
}
