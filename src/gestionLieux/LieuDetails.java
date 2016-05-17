package gestionLieux;

import nezdames.serialisation.NezDamesSerialisation;
import classesMetier.Lieu;
import javax.swing.JFrame;

/**
 *
 * @author gaellecastel
 */
public class LieuDetails extends javax.swing.JFrame {

    LieuDetails(int laLigneSelectionnee) {
        initComponents();

        //pour que toute l'application ne se ferme pas quand on clique sur la croix rouge
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //chargement des éléments de la fiche de ce lieu
        txtNom.setText(String.valueOf((((Lieu) NezDamesSerialisation.lesLieux.get(laLigneSelectionnee)).getNom())));
        txtRue.setText(String.valueOf((((Lieu) NezDamesSerialisation.lesLieux.get(laLigneSelectionnee)).getAdresseRue())));
        txtCodePostal.setText(String.valueOf((((Lieu) NezDamesSerialisation.lesLieux.get(laLigneSelectionnee)).getCodePostal())));
        txtVille.setText(String.valueOf((((Lieu) NezDamesSerialisation.lesLieux.get(laLigneSelectionnee)).getAdresseVille())));

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
        lblTitre2 = new javax.swing.JLabel();
        txtVille = new javax.swing.JTextField();
        btnFermer = new javax.swing.JButton();
        lblNom = new javax.swing.JLabel();
        lblVille = new javax.swing.JLabel();
        txtRue = new javax.swing.JTextField();
        lblRue = new javax.swing.JLabel();
        lblCodePostal = new javax.swing.JLabel();
        txtCodePostal = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        lblTitre1 = new javax.swing.JLabel();
        lblImageOlivier = new javax.swing.JLabel();
        lblImageManu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setForeground(new java.awt.Color(255, 153, 51));

        lblTitre2.setFont(new java.awt.Font("Hannotate SC", 1, 18)); // NOI18N
        lblTitre2.setForeground(new java.awt.Color(255, 153, 51));
        lblTitre2.setText("DE RÉPÉTITION OU DE REPRÉSENTATION");

        txtVille.setEditable(false);
        txtVille.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVilleActionPerformed(evt);
            }
        });

        btnFermer.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        btnFermer.setText("Fermer");
        btnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermerActionPerformed(evt);
            }
        });

        lblNom.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblNom.setForeground(new java.awt.Color(255, 153, 51));
        lblNom.setText("Nom du lieu");

        lblVille.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblVille.setForeground(new java.awt.Color(255, 153, 51));
        lblVille.setText("Adresse (Ville)");

        txtRue.setEditable(false);
        txtRue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRueActionPerformed(evt);
            }
        });

        lblRue.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblRue.setForeground(new java.awt.Color(255, 153, 51));
        lblRue.setText("Adresse (Numéro et rue)");

        lblCodePostal.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblCodePostal.setForeground(new java.awt.Color(255, 153, 51));
        lblCodePostal.setText("Adresse (Code postal)");

        txtCodePostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodePostalActionPerformed(evt);
            }
        });

        txtNom.setEditable(false);

        lblTitre1.setFont(new java.awt.Font("Hannotate SC", 1, 18)); // NOI18N
        lblTitre1.setForeground(new java.awt.Color(255, 153, 51));
        lblTitre1.setText("DÉTAILS D'UN LIEU ");

        lblImageOlivier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portraitOlivier.png"))); // NOI18N

        lblImageManu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portraitManu.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblImageManu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitre2)
                .addGap(638, 638, 638))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btnFermer))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblImageOlivier)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblRue)
                                .addComponent(lblCodePostal)
                                .addComponent(lblNom)
                                .addComponent(lblVille))
                            .addGap(28, 28, 28)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRue, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(223, 223, 223)
                    .addComponent(lblTitre1)
                    .addContainerGap(845, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImageOlivier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTitre2)
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNom)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblImageManu)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRue)
                    .addComponent(txtRue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodePostal)
                    .addComponent(txtCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVille)
                    .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btnFermer)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(lblTitre1)
                    .addContainerGap(384, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(638, 487));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodePostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodePostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodePostalActionPerformed

    private void txtRueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRueActionPerformed

    private void btnFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermerActionPerformed
        // fermeture de la fenêtre SaisieMenu
        this.dispose();
    }//GEN-LAST:event_btnFermerActionPerformed

    private void txtVilleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVilleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVilleActionPerformed

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
            java.util.logging.Logger.getLogger(LieuDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LieuDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LieuDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LieuDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel lblCodePostal;
    private javax.swing.JLabel lblImageManu;
    private javax.swing.JLabel lblImageOlivier;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblRue;
    private javax.swing.JLabel lblTitre1;
    private javax.swing.JLabel lblTitre2;
    private javax.swing.JLabel lblVille;
    private javax.swing.JTextField txtCodePostal;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtRue;
    private javax.swing.JTextField txtVille;
    // End of variables declaration//GEN-END:variables
}
