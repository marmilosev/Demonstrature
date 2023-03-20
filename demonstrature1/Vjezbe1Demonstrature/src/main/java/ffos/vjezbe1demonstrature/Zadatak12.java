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
public class Zadatak12 {
    
    //12.	Prethodni program preoblikuj tako da ukoliko se unese riječima „Nedovoljan“ program ispiše „Pad“, a ukoliko se unese ocjena 2, 3, 4 ili 5 tada program ispisuje „Prolaz“.
    
    public static void main(String[] args) {
        
        String ocjena = JOptionPane.showInputDialog("Unesi ocjenu riječima");
        
        switch(ocjena){
            case "Nedovoljan":
                System.out.println("Pad");
                break;
            case "Dovoljan":
            case "Dobar":
            case "Vrlo dobar":
            case "Odličan":
                System.out.println("Prolaz");
                break;
            default:
                System.out.println("Niste unijeli valjanu vrijednost");
        }
        
        
        
        
    }
}
