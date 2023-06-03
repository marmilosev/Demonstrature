/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.kolokvij0.controller;

import ffos.kolokvij0.model.Sestra;
import java.util.List;

/**
 *
 * @author marija
 */
public class ObradaSestra extends Obrada<Sestra>{

    @Override
    public List<Sestra> read() {
        return session.createQuery("from Sestra", Sestra.class).list();
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
