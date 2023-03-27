/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezbe1demonstrature;

/**
 *
 * @author Marija
 */
public class Zadatak20 {
    //20. Izračunati pomoću DO WHILE petlje aritmetičku sredinu prirodnih brojeva do 5.
    
    public static void main(String[] args) {
        
        int i = 1;
        int brojac = 0;
        int suma = 0;
        
        do{
          suma += i; 
          brojac++;
          i++;
        }while(i <= 5);
        
        
        double AS = suma/brojac; //int AS
        System.out.println(AS);
        
        
       
        
    }
    
}
