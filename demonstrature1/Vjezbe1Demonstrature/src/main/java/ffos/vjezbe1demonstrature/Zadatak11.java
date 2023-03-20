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
public class Zadatak11 {
    
    //11. Napravi program koji će na temelju brojčane ocjene koju smo unijeli ispisati njezin ekvivalent riječima.
    
    public static void main(String[] args) {
        
        int ocjena = Integer.parseInt(JOptionPane.showInputDialog("Unesi brojčanu ocjenu"));
        
        switch(ocjena){
            case 1:
                System.out.println("Nedovoljan");
                break;
            case 2:
                System.out.println("Dovoljan");
                break;
            case 3:
                System.out.println("Dobar");
                break;
            case 4:
                System.out.println("Vrlo dobar"); 
                break;
            case 5: 
                System.out.println("Odličan");
                break;
            default:
                System.out.println("Niste unijeli broj od 1 do 5");
                     
        }
        
        
        
    }
    
}
