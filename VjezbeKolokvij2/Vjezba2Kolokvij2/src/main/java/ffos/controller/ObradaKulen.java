/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.controller;

import ffos.model.Kulen;
import java.util.List;

/**
 *
 * @author marija
 */
public class ObradaKulen extends Obrada<Kulen>{

    @Override
    public List<Kulen> read() {
        return session.createQuery("from Kulen", Kulen.class).list();
    }

    @Override
    protected void kontrolaCreate() throws Exception {
        
    }

    @Override
    protected void kontrolaUpdate() throws Exception {
        
    }

    @Override
    protected void kontrolaDelete() throws Exception {
        
    }
    
}
