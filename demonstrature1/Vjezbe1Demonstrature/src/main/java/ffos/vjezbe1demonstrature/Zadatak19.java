/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezbe1demonstrature;

/**
 *
 * @author Marija
 */
public class Zadatak19 {
    //19.  Pomnoži parne brojeve od 6 do 18 koristeći WHILE petlju. 
    public static void main(String[] args) {
        
        int i = 6;
        int umnozak = 1;
        
        while(i <= 18){
            if(i % 2 == 0){
                umnozak *= i;
            }
            i++;
        }
        System.out.println(umnozak);
        
        
        
    }
    
}
