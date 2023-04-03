/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demos;

/**
 *
 * @author marija
 */
public class Macka extends Zivotinja{

    @Override
    public String praviZvuk() {
        //System.out.println("Mjau");
        return "Mjau";
    }

    @Override
    public void jede() {
        System.out.println("miševe");
    }
    
//    public int ulovilaMisa(int i){
//          return i;
//    }
    
    public String ulovilaMisa(int i){
         String ulovljeno = "Mačka je ulovila " + i + " miša/eva.";
         return ulovljeno;
    }
    
    public double popilaMlijeka(double j){
        j /= 1000;
        return j;
    }
    
    
    
    
}
