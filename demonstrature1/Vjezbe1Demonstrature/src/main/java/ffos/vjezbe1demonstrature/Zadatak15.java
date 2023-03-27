/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezbe1demonstrature;

/**
 *
 * @author Marija
 */
public class Zadatak15 {
    //15. Pronađi broj koji između brojeva 1786 i 1809 dijeljenjem s 5 daje rezultat 359.
    
    public static void main(String[] args) {
        
        for(int i = 1786; i <= 1809; i++){
            if( i / 5 == 359){
                System.out.println(i);
                break;
            }
        }
        
        
        
    }
    
}
