/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mgaric_kol2.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import mgaric_kol2.controller.ObradaMjesto;
import mgaric_kol2.controller.ObradaSkola;
import mgaric_kol2.controller.ObradaUcenik;
import mgaric_kol2.model.Mjesto;
import mgaric_kol2.model.Skola;
import mgaric_kol2.model.Ucenik;

/**
 *
 * @author Korisnik
 */
public class ProzorUcenik extends javax.swing.JFrame {
    
    private ObradaUcenik obrada;
//    private ObradaMjesto obradaMjesto;
//    private ObradaSkola obradaSkola;

    /**
     * Creates new form ProzorUcenik
     */
    public ProzorUcenik() {
        initComponents();
        obrada = new ObradaUcenik();
        ucitaj();
        
        DefaultComboBoxModel<Mjesto> m = new DefaultComboBoxModel<>();
        m.addAll(new ObradaMjesto().read());
        cmbMjesto.setModel(m);
        cmbMjesto.repaint();
        
        DefaultComboBoxModel<Skola> s = new DefaultComboBoxModel<>();
        s.addAll(new ObradaSkola().read());
        cmbSkola.setModel(s);
        cmbSkola.repaint();
    }
    
    //da je jedno od toga dvoje povezano s ManyToMany onda pišete umjesto linija 42-45 ili 49-52: (jer bi onda bilo dodatna lista)
//    DefaultListModel<Kolegij> m = new DefaultListModel<>();
//        m.addAll(obradaKolegij.read());
//        lstKolegijiBaza.setModel(m);
//        lstKolegijiBaza.repaint();

    private void ucitaj() {
        DefaultListModel<Ucenik> o = new DefaultListModel<>();
        o.addAll(obrada.read());
        lstPodaci.setModel(o);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbMjesto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbSkola = new javax.swing.JComboBox<>();
        txtIme = new javax.swing.JTextField();
        txtPrezime = new javax.swing.JTextField();
        txtDatumRodj = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jLabel1.setText("Ime");

        jLabel2.setText("Prezime");

        jLabel3.setText("Datum rođenja");

        jLabel4.setText("Mjesto");

        jLabel5.setText("Skola");

        jButton1.setText("Dodaj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Promijeni");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Obriši");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIme)
                                    .addComponent(txtPrezime, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(txtDatumRodj, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(cmbMjesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbSkola, 0, 181, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel1)
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbMjesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbSkola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtDatumRodj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        // TODO add your handling code here:
        
        if (evt.getValueIsAdjusting() || lstPodaci.getSelectedValue() == null) {
            return;
        }

        Ucenik e = lstPodaci.getSelectedValue();

        txtIme.setText(e.getIme());
        txtPrezime.setText(e.getPrezime());
        txtDatumRodj.setText(e.getDatumRodenja().toString());
        cmbMjesto.setSelectedItem(e.getMjesto());
        cmbSkola.setSelectedItem(e.getSkola());
        
    }//GEN-LAST:event_lstPodaciValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //DODAVANJE
        Ucenik e = new Ucenik();
        e.setIme(txtIme.getText());
        e.setPrezime(txtPrezime.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("dd. MM. yyyy.");       
        try {
            e.setDatumRodenja(sdf.parse(txtDatumRodj.getText()));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
        }
        
        e.setMjesto((Mjesto) cmbMjesto.getSelectedItem());
        e.setSkola((Skola) cmbSkola.getSelectedItem());
        
        //ovo je za ManyToMany:
//        DefaultListModel<Kolegij> m = (DefaultListModel<Kolegij>) lstKolegijiOsoba.getModel();
//        List<Kolegij> l = new ArrayList<>();
//        for (int i = 0; i < m.getSize(); i++) {
//            l.add(m.getElementAt(i));
//        }
//        e.setKolegiji(l);

        try {
            obrada.setEntitet(e);
            obrada.create();
            ucitaj();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //PROMIJENI
        Ucenik e = lstPodaci.getSelectedValue();

        if (e == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite stavku");
            return;
        }

        e.setIme(txtIme.getText());
        e.setPrezime(txtPrezime.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");       
        try {
            e.setDatumRodenja(sdf.parse(txtDatumRodj.getText()));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
        }
         e.setMjesto((Mjesto) cmbMjesto.getSelectedItem());
        e.setSkola((Skola) cmbSkola.getSelectedItem());

//        DefaultListModel<Kolegij> m = (DefaultListModel<Kolegij>) lstKolegijiOsoba.getModel();
//        List<Kolegij> l = new ArrayList<>();
//        for (int i = 0; i < m.getSize(); i++) {
//            l.add(m.getElementAt(i));
//        }
//        e.setKolegiji(l);

        try {
            obrada.setEntitet(e);
            obrada.update();
            ucitaj();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //OBRIŠI
        Ucenik e = lstPodaci.getSelectedValue();

        if (e == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite stavku");
            return;
        }

        try {
            obrada.setEntitet(e);
            obrada.delete();
            ucitaj();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Mjesto> cmbMjesto;
    private javax.swing.JComboBox<Skola> cmbSkola;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Ucenik> lstPodaci;
    private javax.swing.JTextField txtDatumRodj;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtPrezime;
    // End of variables declaration//GEN-END:variables


}
