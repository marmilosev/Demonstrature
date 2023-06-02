/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ffos.kolokvij0.view;

import com.github.javafaker.Faker;
import ffos.kolokvij0.controller.ObradaCura;
import ffos.kolokvij0.controller.ObradaZarucnica;
import ffos.kolokvij0.model.Cura;
import ffos.kolokvij0.model.Zarucnica;
import javax.swing.JOptionPane;

/**
 *
 * @author marija
 */
public class Izbornik extends javax.swing.JFrame {
    private Faker faker;

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        initComponents();
        faker = new Faker();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUnosCura = new javax.swing.JButton();
        btnUnosZarucnica = new javax.swing.JButton();
        btnCrudCura = new javax.swing.JButton();
        btnCrudZarucnica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnUnosCura.setText("3.1.");
        btnUnosCura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnosCuraActionPerformed(evt);
            }
        });

        btnUnosZarucnica.setText("3.2.");
        btnUnosZarucnica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnosZarucnicaActionPerformed(evt);
            }
        });

        btnCrudCura.setText("3.5.");
        btnCrudCura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrudCuraActionPerformed(evt);
            }
        });

        btnCrudZarucnica.setText("3.6.");
        btnCrudZarucnica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrudZarucnicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUnosCura)
                    .addComponent(btnUnosZarucnica))
                .addGap(245, 245, 245)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrudZarucnica)
                    .addComponent(btnCrudCura))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUnosCura)
                    .addComponent(btnCrudCura))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUnosZarucnica)
                    .addComponent(btnCrudZarucnica))
                .addContainerGap(231, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnosCuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnosCuraActionPerformed
        // TODO add your handling code here:
        ObradaCura oc = new ObradaCura();
        Cura c; 
        for(int i = 0; i<1818; i++){
            c = new Cura();
            c.setMaraka(faker.number().randomDouble(NORMAL, i, i));
            c.setVesta(faker.animal().name());
            c.setKuna(faker.number().randomDouble(NORMAL, i, i));
            c.setDukserica(faker.book().title());
            oc.setEntitet(c);
            
            try {
                oc.create();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
            }
           
        }
    }//GEN-LAST:event_btnUnosCuraActionPerformed

    private void btnUnosZarucnicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnosZarucnicaActionPerformed
        // TODO add your handling code here:
        ObradaZarucnica oz = new ObradaZarucnica();
        ObradaCura oc = new ObradaCura();
        Zarucnica z; 
        for(int i = 0; i<2899; i++){
            z = new Zarucnica();
            z.setBojaKose(faker.color().name());
            z.setHlace(faker.cat().name());
            z.setJmbag(faker.business().creditCardNumber());
            z.setModelNaocala(faker.ancient().hero());
            z.setNarukvica(faker.random().nextDouble());
            z.setOgrlica(faker.random().nextDouble());
//            z.setCura(oc.read().get(0));
            z.setCura(oc.read().get(faker.random().nextInt(1, 1818)));
            oz.setEntitet(z);
            
            try {
                oz.create();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
            }
           
        }
    }//GEN-LAST:event_btnUnosZarucnicaActionPerformed

    private void btnCrudCuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrudCuraActionPerformed
        // TODO add your handling code here:
        new ProzorCura().setVisible(true);
    }//GEN-LAST:event_btnCrudCuraActionPerformed

    private void btnCrudZarucnicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrudZarucnicaActionPerformed
        // TODO add your handling code here:
        new ProzorZarucnica().setVisible(true);
    }//GEN-LAST:event_btnCrudZarucnicaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrudCura;
    private javax.swing.JButton btnCrudZarucnica;
    private javax.swing.JButton btnUnosCura;
    private javax.swing.JButton btnUnosZarucnica;
    // End of variables declaration//GEN-END:variables
}