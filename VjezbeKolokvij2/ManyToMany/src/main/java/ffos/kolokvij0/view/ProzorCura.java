/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ffos.kolokvij0.view;

import ffos.kolokvij0.controller.ObradaCura;
import ffos.kolokvij0.model.Cura;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author marija
 */
public class ProzorCura extends javax.swing.JFrame {
    
    private ObradaCura obrada;

    /**
     * Creates new form ProzorCura
     */
    public ProzorCura() {
        initComponents();
        obrada = new ObradaCura();
        ucitaj();
    }
    
    private void ucitaj() {
        DefaultListModel<Cura> m = new DefaultListModel<>();
        m.addAll(obrada.read());
        lstPodaci.setModel(m);
        lstPodaci.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        txtMaraka = new javax.swing.JTextField();
        txtVesta = new javax.swing.JTextField();
        txtKuna = new javax.swing.JTextField();
        txtDukserica = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromijeni = new javax.swing.JButton();
        btnObriši = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Maraka");

        jLabel2.setText("Vesta");

        jLabel3.setText("Kuna");

        jLabel4.setText("Dukserica");

        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromijeni.setText("Promijeni");
        btnPromijeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromijeniActionPerformed(evt);
            }
        });

        btnObriši.setText("Obriši");
        btnObriši.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrišiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtDukserica, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(txtKuna)
                    .addComponent(txtVesta)
                    .addComponent(txtMaraka))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDodaj)
                    .addComponent(btnPromijeni)
                    .addComponent(btnObriši))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMaraka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btnDodaj)))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(txtVesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnPromijeni)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btnObriši))
                        .addGap(21, 21, 21)
                        .addComponent(txtKuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDukserica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        // TODO add your handling code here:
        if(evt.getValueIsAdjusting() || lstPodaci.getSelectedValue() == null){
            return;
        }
        
        Cura e = lstPodaci.getSelectedValue();
        txtDukserica.setText(e.getDukserica());
        txtKuna.setText(Double.toString(e.getKuna()));
        txtMaraka.setText(Double.toString(e.getMaraka()));
        txtVesta.setText(e.getVesta());
    }//GEN-LAST:event_lstPodaciValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        // TODO add your handling code here:
        Cura c = new Cura();
        c.setDukserica(txtDukserica.getText());
        c.setVesta(txtVesta.getText());
        c.setKuna(Double.parseDouble(txtKuna.getText()));
        c.setMaraka(Double.parseDouble(txtMaraka.getText()));
        
        try {
            obrada.setEntitet(c);
            obrada.create();
            ucitaj();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromijeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromijeniActionPerformed
        // TODO add your handling code here:
        if(lstPodaci.getSelectedValue() == null){
            JOptionPane.showMessageDialog(rootPane, "Odaberi stavku iz liste");
            return;
        }
        Cura c = lstPodaci.getSelectedValue();
        c.setDukserica(txtDukserica.getText());
        c.setVesta(txtVesta.getText());
        c.setKuna(Double.parseDouble(txtKuna.getText()));
        c.setMaraka(Double.parseDouble(txtMaraka.getText()));
        
        try {
            obrada.setEntitet(c);
            obrada.update();
            ucitaj();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnPromijeniActionPerformed

    private void btnObrišiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrišiActionPerformed
        // TODO add your handling code here:
        if(lstPodaci.getSelectedValue() == null){
            JOptionPane.showMessageDialog(rootPane, "Odaberi stavku iz liste");
            return;
        }
        Cura c = lstPodaci.getSelectedValue();
        
        try {
            obrada.setEntitet(c);
            obrada.delete();
            ucitaj();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnObrišiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObriši;
    private javax.swing.JButton btnPromijeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Cura> lstPodaci;
    private javax.swing.JTextField txtDukserica;
    private javax.swing.JTextField txtKuna;
    private javax.swing.JTextField txtMaraka;
    private javax.swing.JTextField txtVesta;
    // End of variables declaration//GEN-END:variables


}
