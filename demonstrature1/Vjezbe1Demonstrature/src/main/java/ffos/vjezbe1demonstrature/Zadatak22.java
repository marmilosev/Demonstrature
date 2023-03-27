/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezbe1demonstrature;

/**
 *
 * @author Marija
 */
public class Zadatak22 {
    //22. Napravi tablicu množenja 10x10 te ih poravnaj tako da jedinice budu ispod
//jedinica, desetice ispod desetica, stotice ispod stotica.
    
    public static void main(String[] args) {
        
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print(String.format("%4d", i*j));
            }
            System.out.println("");
        }
        
        
    }
    
}
