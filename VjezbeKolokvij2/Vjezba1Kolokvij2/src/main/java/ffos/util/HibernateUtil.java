/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author dell
 */

// https://www.geeksforgeeks.org/singleton-class-java/

// ostalo čitati na https://sourcemaking.com/design_patterns
//Singleton

//klasa HibernateUtil koja se koristi za upravljanje Hibernate sesijama u Java aplikacijama
public class HibernateUtil {
    //public --> dostupna izvan ove klase
    
    private static Session session=null;
    //atribut session koji predstavlja Hibernate sesiju
    
    protected HibernateUtil(){
        //Konstruktor HibernateUtil je označen s protected pristupom, što znači da se ne može direktno instancirati izvan klase.
        
    }
    
    public static Session getSession(){
        //Metoda getSession je deklarirana kao public i statička, što znači da se može pozvati izvan klase bez stvaranja instance klase.
        if(session==null){
            //U metodi getSession, provjerava se je li session jednak null. Ako je, to znači da sesija još nije inicijalizirana, pa se konstruira nova sesija.
            //konstruirati ga
            session = new Configuration().configure().buildSessionFactory().openSession();
            // Configarion i buildSessionFactory - objekt i metode koje se koriste za sesiju
            //Nakon konstrukcije nove sesije, ona se otvara pomoću openSession metode.
        }
        return session;
        //metoda getSession vraća session
    }
    
}
