/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ffos.view;

import ffos.controller.ObradaMjesto;
import ffos.model.Mjesto;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author marija
 */
//klasa predstavlja formu (prozor) za unos, prikaz, ažuriranje i brisanje podataka o mjestu
public class FormaMjesto extends javax.swing.JFrame implements ViewAktivnosti{
    //deklarira privatni atribut obrada tipa ObradaMjesto. 
    //Ova instanca klase ObradaMjesto će se koristiti za 
    //obradu podataka o mjestima.
    private ObradaMjesto obrada;

    /**
     * Creates new form FormaMjesto
     */
    //konstruktor klase FormaMjesto. Konstruktor se poziva prilikom stvaranja
    //instance ove klase. 
    //U konstruktoru se inicijaliziraju komponente korisničkog sučelja (GUI),
    //stvara se objekt ObradaMjesto i 
    //poziva se metoda ucitajPodatke() za prikaz početnih podataka.
    public FormaMjesto() {
        initComponents();
        obrada = new ObradaMjesto();
        ucitajPodatke();
    }
    
    //metoda implementira metodu ucitajPodatke() iz sučelja ViewAktivnosti. 
    //Ovdje se dohvaćaju podaci o mjestima pomoću metode read() iz objekta 
    //obrada, 
    //a zatim se ti podaci prikazuju u JList komponenti (lstEntiteti).
     @Override
    public void ucitajPodatke() {
        //metoda implementira metodu ucitajPodatke() iz sučelja ViewAktivnosti. 
    //Ovdje se dohvaćaju podaci o sportovima pomoću metode read() iz objekta 
    //obrada, 
    //a zatim se ti podaci prikazuju u JList komponenti (lstEntiteti).
        DefaultListModel<Mjesto> m = new DefaultListModel<>();
        m.addAll(obrada.read());
        lstEntiteti.setModel(m);
        lstEntiteti.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        jLabel1.setText("Naziv");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate)
                    .addComponent(jLabel1)
                    .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate)
                    .addComponent(btnDelete))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(btnCreate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)))
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        //metoda se poziva kada korisnik pritisne gumb "Delete". 
        //Ako nije odabrana nikakva vrijednost 
        //(lstEntiteti.getSelectedValue() == null), metoda se prekida. 
        //Inače, odabrani entitet se postavlja u obrada, a zatim se entitet 
        //briše iz baze podataka pomoću metode delete()
        if(lstEntiteti.getSelectedValue() == null){
            return;
        }
        obrada.setEntitet(lstEntiteti.getSelectedValue());
        try {
            obrada.delete();
            ucitajPodatke();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         //metoda se poziva kada korisnik pritisne gumb "Update". 
        //Metoda postavlja podatke o mjestu pomoću metode setPodaci() 
        //iz objekta obrada, koristeći podatke 
        //unesene u tekstualnim poljima (txtNaziv). 
        //Zatim se ažurira odabrani entitet u bazi podataka pomoću metode 
        //update() iz objekta obrada, 
        //a zatim se ponovno učitavaju podaci pomoću metode ucitajPodatke().
        obrada.setPodaci(txtNaziv.getText());
        try {
            obrada.update();
            ucitajPodatke();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        // TODO add your handling code here:
         // Ova metoda se poziva kada se promijeni selekcija u JList 
         //komponenti (lstEntiteti). 
        //Ako se događaj ne odnosi na završetak mijenjanja selekcije 
        //(getValueIsAdjusting()) ili nije odabrana 
        //nikakva vrijednost (getSelectedValue() == null), metoda se prekida. 
        //Inače, postavlja se odabrani entitet u obrada, a zatim se prikazuju 
        //podaci o tom entitetu u 
        //tekstualnim poljima (txtNaziv).
        if(evt.getValueIsAdjusting() || lstEntiteti.getSelectedValue() == null){
            return;
        }

        obrada.setEntitet(lstEntiteti.getSelectedValue());
        txtNaziv.setText(lstEntiteti.getSelectedValue().getNaziv());
    }//GEN-LAST:event_lstEntitetiValueChanged

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        //Ova metoda se poziva kada korisnik pritisne gumb "Create". 
        //Metoda stvara novi entitet mjesta pomoću metoda setNew() i setPodaci()
        //iz objekta obrada, koristeći 
        //podatke unesene u tekstualnim poljima (txtNaziv). 
        //Zatim se novi entitet sprema u bazu podataka pomoću metode create() 
        //iz objekta obrada, 
        //a zatim se ponovno učitavaju podaci pomoću metode ucitajPodatke().
        obrada.setNew();
        obrada.setPodaci(txtNaziv.getText());

        try {
            obrada.create();
            ucitajPodatke();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Mjesto> lstEntiteti;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables

   
}
