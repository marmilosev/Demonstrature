/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demos;

/**
 *
 * @author marija
 */
public abstract class Zivotinja {
    
    private String ime;
    private String boja;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }
    
    public void jede(){
        System.out.println("Sve životinje jedu");
    }
    
    public String praviZvuk(){
        return "Grrr";
    }
    
}
