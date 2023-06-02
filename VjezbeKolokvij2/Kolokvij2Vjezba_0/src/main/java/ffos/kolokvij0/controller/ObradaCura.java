/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.kolokvij0.controller;

import ffos.kolokvij0.model.Cura;
import java.util.List;

/**
 *
 * @author marija
 */
public class ObradaCura extends Obrada<Cura>{

    @Override
    public List<Cura> read() {
        return session.createQuery("from Cura", Cura.class).list();
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
