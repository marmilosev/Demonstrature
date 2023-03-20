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
public class Zadatak3 {
    //3.	Program unosi godine osobe te ispisuje je li osoba punoljetna.
    
    public static void main(String[] args) {
        
        int godina = Integer.parseInt(JOptionPane.showInputDialog("Unesi svoje godine"));
        
//        if(godina < 18) {
//            System.out.println("Maloljetan/na si.");
//        }else {
//            System.out.println("Punoljetan/na si.");
//        }

          //2. način
          if(godina >= 18){
              System.out.println("Punoljetan/na si.");
          }else{
              System.out.println("Maloljetan/na si.");
          }
        
        
        
    }
    
}
