/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package demos;

/**
 *
 * @author marija
 */
public class Start {

    public static void main(String[] args) {
        
        Pas mojPas = new Pas();
        mojPas.setIme("Rex");
        mojPas.setBoja("crna");
//        mojPas.ime = "Rex";
//        mojPas.boja = "crna";
        
        Pas tvojPas = new Pas();
        tvojPas.setIme("Max");
        tvojPas.setBoja("bijel");
//        tvojPas.ime = "Max";
//        tvojPas.boja = "bijel";
        
        System.out.println(mojPas.getIme());
        System.out.println(mojPas.getBoja());
        System.out.println(tvojPas.getIme());
        System.out.println(tvojPas.getBoja());
        
       
        
        Macka mojaMacka = new Macka();
        mojaMacka.setIme("Tom");
        mojaMacka.setBoja("žuta");
//        mojaMacka.praviZvuk();
//        
//        
//        tvojPas.praviZvuk();
        
        tvojPas.jede();
        mojaMacka.jede();
        
//        System.out.println(mojaMacka.praviZvuk());
        String zvuk = mojaMacka.praviZvuk();
        System.out.println(zvuk);
        
        System.out.println(mojPas.praviZvuk());
        
        System.out.println(mojPas.getIme() + " kaže " + mojPas.praviZvuk());
//        System.out.println(mojaMacka.getIme() + " jede" + mojaMacka.jede()); --> NE MOŽE

        System.out.println(mojaMacka.getIme() + " je " + mojaMacka.getBoja() + " mačka koja se voli igrati s " + mojPas.getIme()
        + "om kojemu je dlaka " + mojPas.getBoja() + ".");
        
        //System.out.println("Moja mačka je ulovila " + mojaMacka.ulovilaMisa(6) + " miša/eva.");
        System.out.println(mojaMacka.ulovilaMisa(6));
        
        
        double mlijeko = mojaMacka.popilaMlijeka(280);
        System.out.println("Moja mačka je popila " + mlijeko + " litre/ara mlijeka.");
        
        
//        Zivotinja zivotinja = new Zivotinja();
    }
}
