package gestionPersonneStructure;

import classesMetier.PersonneStructure;
import nezdames.serialisation.NezDamesSerialisation;
import javax.swing.JFrame;

/**
 *
 * @author boulom
 */
public class PersonneStructureDetails extends javax.swing.JFrame {

    PersonneStructureDetails(int laLigneSelectionnee) {
        initComponents();

        //pour que toute l'application ne se ferme pas quand on clique sur la croix rouge
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //chargement des éléments de la fiche de cette structure
        txtNumLicence.setText(String.valueOf((((PersonneStructure) NezDamesSerialisation.lesPersonnesStructures.get(laLigneSelectionnee)).getNumeroLicence())));
        txtNom.setText(String.valueOf((((PersonneStructure) NezDamesSerialisation.lesPersonnesStructures.get(laLigneSelectionnee)).getNomPersonne())));
        txtPrenom.setText(String.valueOf((((PersonneStructure) NezDamesSerialisation.lesPersonnesStructures.get(laLigneSelectionnee)).getPrenomPersonne())));
        txtQualite.setText(String.valueOf((((PersonneStructure) NezDamesSerialisation.lesPersonnesStructures.get(laLigneSelectionnee)).getQualitePersonne())));
        txtTel.setText(String.valueOf((((PersonneStructure) NezDamesSerialisation.lesPersonnesStructures.get(laLigneSelectionnee)).getTelPersonne())));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnFermer = new javax.swing.JButton();
        lblTitre1 = new javax.swing.JLabel();
        lblImageOlivier = new javax.swing.JLabel();
        lblImageManu = new javax.swing.JLabel();
        lblNumLicence = new javax.swing.JLabel();
        lblNom = new javax.swing.JLabel();
        lblPrenom = new javax.swing.JLabel();
        lblQualite = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        txtNumLicence = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtPrenom = new javax.swing.JTextField();
        txtQualite = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setForeground(new java.awt.Color(255, 153, 51));

        btnFermer.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        btnFermer.setText("Fermer");
        btnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermerActionPerformed(evt);
            }
        });

        lblTitre1.setFont(new java.awt.Font("Hannotate SC", 1, 18)); // NOI18N
        lblTitre1.setForeground(new java.awt.Color(255, 153, 51));
        lblTitre1.setText("DÉTAILS D'UNE PERSONNE ");

        lblImageOlivier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portraitOlivier.png"))); // NOI18N

        lblImageManu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portraitManu.png"))); // NOI18N

        lblNumLicence.setForeground(new java.awt.Color(255, 153, 51));
        lblNumLicence.setText("Numéro licence");

        lblNom.setForeground(new java.awt.Color(255, 153, 51));
        lblNom.setText("Nom");

        lblPrenom.setForeground(new java.awt.Color(255, 153, 51));
        lblPrenom.setText("Prénom");

        lblQualite.setForeground(new java.awt.Color(255, 153, 51));
        lblQualite.setText("Qualité");

        lblTel.setForeground(new java.awt.Color(255, 153, 51));
        lblTel.setText("Téléphone");

        txtNumLicence.setEditable(false);
        txtNumLicence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumLicenceActionPerformed(evt);
            }
        });

        txtNom.setEditable(false);
        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });

        txtPrenom.setEditable(false);
        txtPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrenomActionPerformed(evt);
            }
        });

        txtQualite.setEditable(false);
        txtQualite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQualiteActionPerformed(evt);
            }
        });

        txtTel.setEditable(false);
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblImageManu)
                        .addGap(64, 64, 64)
                        .addComponent(lblTitre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImageOlivier))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNumLicence)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNumLicence, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNom)
                                    .addComponent(lblPrenom)
                                    .addComponent(lblQualite)
                                    .addComponent(lblTel))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTel)
                                    .addComponent(txtPrenom)
                                    .addComponent(txtNom)
                                    .addComponent(txtQualite))))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(btnFermer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImageManu)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblTitre1))
                    .addComponent(lblImageOlivier, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumLicence)
                    .addComponent(txtNumLicence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNom)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrenom)
                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQualite)
                    .addComponent(txtQualite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnFermer)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(662, 496));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermerActionPerformed
        // fermeture de la fenêtre SaisieMenu
        this.dispose();
    }//GEN-LAST:event_btnFermerActionPerformed

    private void txtNumLicenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumLicenceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumLicenceActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void txtPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrenomActionPerformed

    private void txtQualiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQualiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQualiteActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersonneStructureDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonneStructureDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonneStructureDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonneStructureDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new LieuDetails().setVisible(true);
         }
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>

         /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new LieuDetails().setVisible(true);
         }
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>

         /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new LieuDetails().setVisible(true);
         }
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>

         /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new LieuDetails().setVisible(true);
         }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new LieuDetails().setVisible(true);
         }
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>

         /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new LieuDetails().setVisible(true);
         }
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>

         /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new LieuDetails().setVisible(true);
         }
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>

         /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new LieuDetails().setVisible(true);
         }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new LieuDetails().setVisible(true);
         }
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>

         /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new LieuDetails().setVisible(true);
         }
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>

         /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new LieuDetails().setVisible(true);
         }
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>

         /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new LieuDetails().setVisible(true);
         }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new LieuDetails().setVisible(true);
         }
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>

         /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new LieuDetails().setVisible(true);
         }
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>

         /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new LieuDetails().setVisible(true);
         }
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>

         /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new LieuDetails().setVisible(true);
         }
         });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFermer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImageManu;
    private javax.swing.JLabel lblImageOlivier;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblNumLicence;
    private javax.swing.JLabel lblPrenom;
    private javax.swing.JLabel lblQualite;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblTitre1;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNumLicence;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtQualite;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
