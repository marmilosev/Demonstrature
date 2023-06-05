/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ffos.kolokvij0.view;

import ffos.kolokvij0.controller.ObradaMuskarac;
import ffos.kolokvij0.controller.ObradaSestra;
import ffos.kolokvij0.model.Muskarac;
import ffos.kolokvij0.model.Sestra;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author marija
 */
public class ProzorSestra extends javax.swing.JFrame {
    
    private ObradaSestra obrada;
    private ObradaMuskarac obradaMuskarac;

    /**
     * Creates new form ProzorSestra
     */
    public ProzorSestra() {
        initComponents();
        obrada = new ObradaSestra();
        obradaMuskarac = new ObradaMuskarac();
        lstMuskarciSestra.setModel(new DefaultListModel<>());
        ucitajMuskarce();
        ucitaj();
    }

    
    private void ucitajMuskarce() {
        DefaultListModel<Muskarac> m = new DefaultListModel<>();
        m.addAll(obradaMuskarac.read());
        lstMuskarciBaza.setModel(m);
        lstMuskarciBaza.repaint();
    }

    private void ucitaj() {
        DefaultListModel<Sestra> m = new DefaultListModel<>();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNausnica = new javax.swing.JTextField();
        txtSuknja = new javax.swing.JTextField();
        btnDodajMuskarca = new javax.swing.JButton();
        btnUkloniMuskarca = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstMuskarciBaza = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        btnPromijeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstMuskarciSestra = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jLabel1.setText("Naušnica");

        jLabel2.setText("Suknja");

        btnDodajMuskarca.setText("<<<");
        btnDodajMuskarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajMuskarcaActionPerformed(evt);
            }
        });

        btnUkloniMuskarca.setText(">>>");
        btnUkloniMuskarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUkloniMuskarcaActionPerformed(evt);
            }
        });

        jLabel4.setText("Muškarci sestre");

        lstMuskarciBaza.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstMuskarciBaza);

        jLabel5.setText("Muškarci u bazi");

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

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(lstMuskarciSestra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(txtNausnica)
                            .addComponent(txtSuknja, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDodajMuskarca, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnUkloniMuskarca, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(46, 46, 46)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(58, 58, 58))))
            .addGroup(layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(btnDodaj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPromijeni)
                .addGap(18, 18, 18)
                .addComponent(btnObrisi)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnDodajMuskarca)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUkloniMuskarca)
                                        .addGap(35, 35, 35))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(16, 16, 16)
                                .addComponent(txtNausnica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtSuknja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(btnPromijeni)
                    .addComponent(btnObrisi))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajMuskarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajMuskarcaActionPerformed
        Muskarac k = lstMuskarciBaza.getSelectedValue();
        if (k == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite kolegij iz baze");
        }
        DefaultListModel<Muskarac> m = (DefaultListModel<Muskarac>) lstMuskarciSestra.getModel();
        m.addElement(k);
        lstMuskarciSestra.repaint();
    }//GEN-LAST:event_btnDodajMuskarcaActionPerformed

    private void btnUkloniMuskarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUkloniMuskarcaActionPerformed
        Muskarac k = lstMuskarciSestra.getSelectedValue();
        if (k == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite kolegij osobe");
        }
        DefaultListModel<Muskarac> m = (DefaultListModel<Muskarac>) lstMuskarciSestra.getModel();
        m.removeElement(k);
        lstMuskarciSestra.repaint();
    }//GEN-LAST:event_btnUkloniMuskarcaActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        Sestra e = new Sestra();
        e.setSuknja(txtSuknja.getText());

        DefaultListModel<Muskarac> m = (DefaultListModel<Muskarac>) lstMuskarciSestra.getModel();
        List<Muskarac> l = new ArrayList<>();
        for (int i = 0; i < m.getSize(); i++) {
            l.add(m.getElementAt(i));
        }
        e.setMuskarci(l);

        try {
            obrada.setEntitet(e);
            obrada.create();
            ucitaj();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
        }

    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromijeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromijeniActionPerformed
        Sestra e = lstPodaci.getSelectedValue();

        if (e == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite stavku");
            return;
        }

        e.setSuknja(txtSuknja.getText());

        DefaultListModel<Muskarac> m = (DefaultListModel<Muskarac>) lstMuskarciSestra.getModel();
        List<Muskarac> l = new ArrayList<>();
        for (int i = 0; i < m.getSize(); i++) {
            l.add(m.getElementAt(i));
        }
        e.setMuskarci(l);

        try {
            obrada.setEntitet(e);
            obrada.update();
            ucitaj();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
        }
    }//GEN-LAST:event_btnPromijeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        Sestra e = lstPodaci.getSelectedValue();

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
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        // TODO add your handling code here:
        if (evt.getValueIsAdjusting() || lstPodaci.getSelectedValue() == null) {
            return;
        }

        Sestra e = lstPodaci.getSelectedValue();

        txtSuknja.setText(e.getSuknja());
        txtNausnica.setText(Integer.toString(e.getNausnica()));

        DefaultListModel<Muskarac> m = new DefaultListModel<>();
        m.addAll(e.getMuskarci());
        lstMuskarciSestra.setModel(m);
        lstMuskarciSestra.repaint();
    }//GEN-LAST:event_lstPodaciValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnDodajMuskarca;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromijeni;
    private javax.swing.JButton btnUkloniMuskarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<Muskarac> lstMuskarciBaza;
    private javax.swing.JList<Muskarac> lstMuskarciSestra;
    private javax.swing.JList<Sestra> lstPodaci;
    private javax.swing.JTextField txtNausnica;
    private javax.swing.JTextField txtSuknja;
    // End of variables declaration//GEN-END:variables


}