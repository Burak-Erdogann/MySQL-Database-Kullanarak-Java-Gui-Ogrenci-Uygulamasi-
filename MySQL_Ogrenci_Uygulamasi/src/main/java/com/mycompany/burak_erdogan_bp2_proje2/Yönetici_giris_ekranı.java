/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.burak_erdogan_bp2_proje2;

import javax.swing.JOptionPane;

/**
 *
 * @author thebu
 */
public class Yönetici_giris_ekranı extends javax.swing.JFrame {

    /**
     * Creates new form Yönetici_giris
     */
    public Yönetici_giris_ekranı() {
        initComponents();
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
        lbl_yönetici_mail = new javax.swing.JLabel();
        lbl_yönetici_password = new javax.swing.JLabel();
        btn_vazgec = new javax.swing.JButton();
        btn_giris_yap = new javax.swing.JButton();
        txt_yönetici_mail = new javax.swing.JTextField();
        psw_yönetici_psw = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lbl_yönetici_mail.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lbl_yönetici_mail.setText("Yönetici Mail : ");

        lbl_yönetici_password.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lbl_yönetici_password.setText("Yönetici Parolası :");

        btn_vazgec.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btn_vazgec.setText("Vazgeç");
        btn_vazgec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vazgecActionPerformed(evt);
            }
        });

        btn_giris_yap.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btn_giris_yap.setText("Giriş Yap");
        btn_giris_yap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_giris_yapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_yönetici_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_yönetici_mail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_vazgec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_yönetici_mail)
                    .addComponent(psw_yönetici_psw, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(btn_giris_yap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_yönetici_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_yönetici_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_yönetici_password, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(psw_yönetici_psw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_vazgec)
                    .addComponent(btn_giris_yap))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_vazgecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vazgecActionPerformed
        // TODO add your handling code here:
        Ana_Giris a = new Ana_Giris();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_vazgecActionPerformed

    private void btn_giris_yapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_giris_yapActionPerformed
        // TODO add your handling code here:

        String kullaniciAD = this.txt_yönetici_mail.getText();
        String sifre = this.psw_yönetici_psw.getText();
        //boşluk kontrolü
        if (this.txt_yönetici_mail.getText().isEmpty() || this.psw_yönetici_psw.getText().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "Lutfen Tüm Bosluklari Doldurunuz", "Dikkat", JOptionPane.ERROR_MESSAGE);

        } else {

            Kullanici giris_yapan_kullanici = db_student_and_manager.login_islemi(kullaniciAD, sifre);

            if (giris_yapan_kullanici != null) {

                if (giris_yapan_kullanici.kullanıcı_tip.compareTo("Yönetici") == 0) {//kullanıcının tipi kontrolü sağlanır

                    JOptionPane.showMessageDialog(rootPane, "Basariyla Giris Yapilmistir", "Merhabalar Yönetici", JOptionPane.INFORMATION_MESSAGE);
                    Yönetici_Ekrani y = new Yönetici_Ekrani(giris_yapan_kullanici);
                    y.setlbl_öğrenci(y.yönetici.ad_soyad);
                    y.setVisible(true);
                    this.dispose();

                } else {

                    JOptionPane.showMessageDialog(rootPane, "Öğrenciler Lütfen Öğrenci Giriş Sayfasindan Giris Yapiniz", "Dikkat!!", JOptionPane.INFORMATION_MESSAGE);
                    Ana_Giris a = new Ana_Giris();
                    a.setVisible(true);
                    this.dispose();

                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Böyle Bir Yönetici Bulunamamaktadir!!", "Dikkat", JOptionPane.ERROR_MESSAGE);
                this.txt_yönetici_mail.setText("");
                this.psw_yönetici_psw.setText("");
            }

        }


    }//GEN-LAST:event_btn_giris_yapActionPerformed

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
            java.util.logging.Logger.getLogger(Yönetici_giris_ekranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Yönetici_giris_ekranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Yönetici_giris_ekranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Yönetici_giris_ekranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Yönetici_giris_ekranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_giris_yap;
    private javax.swing.JButton btn_vazgec;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_yönetici_mail;
    private javax.swing.JLabel lbl_yönetici_password;
    private javax.swing.JPasswordField psw_yönetici_psw;
    private javax.swing.JTextField txt_yönetici_mail;
    // End of variables declaration//GEN-END:variables
}
