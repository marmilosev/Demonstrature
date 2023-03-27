/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezbe1demonstrature;

/**
 *
 * @author Marija
 */
public class Zadatak14 {
    //14.	Ispiši prirodne brojeve od 1 do 17 koji nisu djeljivi s tri.
    
    public static void main(String[] args) {
        
        for(int i = 1; i <= 17; i++){
            if(i % 3 != 0) {
                System.out.println(i);
            }
        }
        
        
    }
    
}
