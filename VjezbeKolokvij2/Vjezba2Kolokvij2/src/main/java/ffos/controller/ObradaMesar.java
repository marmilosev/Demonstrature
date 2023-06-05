/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.controller;

import ffos.model.Mesar;
import java.util.List;

/**
 *
 * @author marija
 */
public class ObradaMesar extends Obrada<Mesar>{

    @Override
    public List<Mesar> read() {
        return session.createQuery("from Mesar", Mesar.class).list();
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
