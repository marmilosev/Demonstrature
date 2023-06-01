/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.controller;

import ffos.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author marija
 */
//apstraktnu generičku klasu Obrada<T> koja služi za obradu entiteta u kontekstu Hibernate ORM-a
//public abstract što znači da je dostupna izvan ove klase i da se ne može direktno instancirati jer je apstraktna.
public abstract class Obrada<T> {
    //Klasa ima dva atributa: entitet koji predstavlja obradu entiteta i session koji predstavlja Hibernate sesiju.
    protected T entitet;
    protected Session session;
    //Klasa deklarira nekoliko apstraktnih metoda (kontrolaCreate, kontrolaUpdate, kontrolaDelete, read, setNew) koje nasljeđuju klase koje proširuju ovu klasu. 
    public abstract void kontrolaCreate() throws Exception;
    public abstract void kontrolaUpdate() throws Exception;
    public abstract void kontrolaDelete() throws Exception;
    
    //Ova metoda nema implementaciju u samoj klasi Obrada<T>, već se očekuje da ju implementiraju klase koje nasljeđuju Obrada<T>. 
    //Deklaracija List<T> označava da će metoda vratiti listu objekata tipa T. 
    //Metoda read() se obično koristi za dohvaćanje i vraćanje podataka iz baze podataka.
    public abstract List<T> read();
    
    //Ova metoda također nema implementaciju u klasi Obrada<T> i očekuje se da ju implementiraju nasljeđujuće klase. 
    //Metoda setNew() služi za postavljanje novog stanja objekta prije stvaranja ili ažuriranja u bazi podataka. 
    public abstract void setNew();

    //Konstruktor klase Obrada inicijalizira session atribut pozivajući HibernateUtil.getSession() kako bi dobio trenutnu sesiju. 
    //HibernateUtil je posebna klasa koja upravlja Hibernate sesijama. ---> ona je u paketu ffos.util
    public Obrada() {
        session = HibernateUtil.getSession();
    }
    
    //Metoda create služi za stvaranje novog entiteta. Prije nego što se entitet stvori, poziva se kontrolaCreate metoda koja provjerava valjanost podataka. 
    //Zatim se započinje Hibernate transakcija, entitet se pohranjuje u bazu podataka pomoću session.persist(entitet) i 
    //transakcija se potvrđuje pozivom session.getTransaction().commit().
    public void create() throws Exception{
        kontrolaCreate();
        session.beginTransaction();
        session.persist(entitet);
        session.getTransaction().commit();
    }
    
    //Metoda update služi za ažuriranje postojećeg entiteta. Slično kao i create, provjerava se valjanost podataka pozivom kontrolaUpdate, 
    //započinje se transakcija, ažurira se entitet i potvrđuje transakcija.
    public void update() throws Exception{
        kontrolaUpdate();
        session.beginTransaction();
        session.persist(entitet);
        session.getTransaction().commit();
    }
    
    //Metoda delete služi za brisanje entiteta. Provjerava se valjanost podataka pozivom kontrolaDelete, započinje se transakcija,
    //entitet se uklanja iz baze podataka pomoću session.remove(entitet) i transakcija se potvrđuje.
    public void delete() throws Exception{
        kontrolaDelete();
        session.beginTransaction();
        session.remove(entitet);
        session.getTransaction().commit();
    }
    
    //Metoda setEntitet postavlja trenutni entitet koji će biti obrađivan.
    public void setEntitet(T entitet){
        this.entitet = entitet;
    }
    
    
}
