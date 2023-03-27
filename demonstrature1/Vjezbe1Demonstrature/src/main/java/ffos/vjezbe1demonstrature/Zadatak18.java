/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.vjezbe1demonstrature;

/**
 *
 * @author Marija
 */
public class Zadatak18 {
    //18.  Program koji koristi WHILE petlju za prebrojavanje neparnih brojeva od 1909 do 1966. 
    public static void main(String[] args) {
        
        int i = 1909;
        int j = 1966;
        int prebrojavanje = 0;
        while(i < j){
            if(i % 2 != 0){
                prebrojavanje++;
                
            }
            i++;
        }
        System.out.println(prebrojavanje);
        
        
        
    }
}
