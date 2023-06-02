/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.kolokvij0.controller;

import ffos.kolokvij0.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author marija
 */
public abstract class Obrada<T> {
    
    protected T entitet;
    protected Session session;
    
    public abstract List<T> read();
    protected abstract void kontrolaCreate() throws Exception;
    protected abstract void kontrolaUpdate() throws Exception;
    protected abstract void kontrolaDelete() throws Exception;

    public Obrada() {
        this.session=HibernateUtil.getSession();
    }
    
    
    public void create() throws Exception{
        kontrolaCreate();
        persist();
    }
    
    public void update() throws Exception{
        kontrolaUpdate();
        persist();
    }
    
    private void persist(){
        session.beginTransaction();
        session.persist(this.entitet);
        session.getTransaction().commit();
    }
    
    public void delete() throws Exception{
        kontrolaDelete();
        session.beginTransaction();
        session.remove(this.entitet);
        session.getTransaction().commit();
    }  

    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }
    
}