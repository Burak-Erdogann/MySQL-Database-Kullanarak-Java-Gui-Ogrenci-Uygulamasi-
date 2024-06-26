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
public class Ogrenci_ekrani extends javax.swing.JFrame {

    /**
     * Creates new form Ogrenci_ekrani
     */
    Kullanici ögrenci;
    // bu kısımda sadece frameler arası geçişler yapılmaktadır
    public Ogrenci_ekrani() {
        initComponents();
    }

    public Ogrenci_ekrani(Kullanici ögrenci) {
        this.ögrenci = ögrenci;
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
        lbl_öğrenci = new javax.swing.JLabel();
        lbl_ögrenci_islemleri = new javax.swing.JLabel();
        btn_bilgilerimi_göster = new javax.swing.JButton();
        btn_ders_ekle_bırak = new javax.swing.JButton();
        btn_ders_programi = new javax.swing.JButton();
        btn_guvenli_cikis = new javax.swing.JButton();
        btn_giris_ekranina_dön = new javax.swing.JButton();
        menu_bar = new javax.swing.JMenuBar();
        menü_menü = new javax.swing.JMenu();
        menu_güvenli_cikis = new javax.swing.JMenuItem();
        menü_giris_ekrana_don = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lbl_öğrenci.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        lbl_ögrenci_islemleri.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lbl_ögrenci_islemleri.setText("Öğrenci İşlemleri :");

        btn_bilgilerimi_göster.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_bilgilerimi_göster.setText("Bilgilerimi Göster");
        btn_bilgilerimi_göster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bilgilerimi_gösterActionPerformed(evt);
            }
        });

        btn_ders_ekle_bırak.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_ders_ekle_bırak.setText("Ders Ekle Bırak , Aldığım Dersleri Ve Notları Görüntüle");
        btn_ders_ekle_bırak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ders_ekle_bırakActionPerformed(evt);
            }
        });

        btn_ders_programi.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_ders_programi.setText("Ders Programımı Göster");
        btn_ders_programi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ders_programiActionPerformed(evt);
            }
        });

        btn_guvenli_cikis.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_guvenli_cikis.setText("Güvenli Çıkış Yap");
        btn_guvenli_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guvenli_cikisActionPerformed(evt);
            }
        });

        btn_giris_ekranina_dön.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_giris_ekranina_dön.setText("Giriş Ekranına Dön");
        btn_giris_ekranina_dön.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_giris_ekranina_dönActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_öğrenci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_ögrenci_islemleri)
                    .addComponent(btn_bilgilerimi_göster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ders_ekle_bırak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ders_programi, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                    .addComponent(btn_guvenli_cikis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_giris_ekranina_dön, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl_öğrenci, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(lbl_ögrenci_islemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_bilgilerimi_göster)
                .addGap(18, 18, 18)
                .addComponent(btn_ders_ekle_bırak)
                .addGap(18, 18, 18)
                .addComponent(btn_ders_programi)
                .addGap(18, 18, 18)
                .addComponent(btn_giris_ekranina_dön)
                .addGap(18, 18, 18)
                .addComponent(btn_guvenli_cikis)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        menü_menü.setText("Menü İşlemleri");

        menu_güvenli_cikis.setText("Güvenli Çıkış Yap");
        menu_güvenli_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_güvenli_cikisActionPerformed(evt);
            }
        });
        menü_menü.add(menu_güvenli_cikis);

        menü_giris_ekrana_don.setText("Giriş Ekranına Dön");
        menü_giris_ekrana_don.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menü_giris_ekrana_donActionPerformed(evt);
            }
        });
        menü_menü.add(menü_giris_ekrana_don);

        menu_bar.add(menü_menü);

        setJMenuBar(menu_bar);

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

    private void btn_bilgilerimi_gösterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bilgilerimi_gösterActionPerformed
        // TODO add your handling code here:
        Öğrenci_bilgileri ö = new Öğrenci_bilgileri(ögrenci);
        ö.öğrenci_bilgileri();
        ö.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_bilgilerimi_gösterActionPerformed

    private void btn_ders_ekle_bırakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ders_ekle_bırakActionPerformed
        // TODO add your handling code here:

        Ogrenci_ders_ekle_bırak ö = new Ogrenci_ders_ekle_bırak(ögrenci);
        ö.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_btn_ders_ekle_bırakActionPerformed

    private void btn_guvenli_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guvenli_cikisActionPerformed
        // TODO add your handling code here:

        int soru = JOptionPane.showConfirmDialog(rootPane, "Cikis Yapmak Istediginize Emin misiniz? ", "Dikkat", JOptionPane.YES_NO_CANCEL_OPTION);

        if (soru == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "İyi Günler Dileriz " + ögrenci.ad_soyad, "İyi Günler", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else if (soru == JOptionPane.NO_OPTION) {

        } else {

        }


    }//GEN-LAST:event_btn_guvenli_cikisActionPerformed

    private void btn_ders_programiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ders_programiActionPerformed
        // TODO add your handling code here:
        ogrenci_ders_program ö = new ogrenci_ders_program(ögrenci);
        ö.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ders_programiActionPerformed

    private void btn_giris_ekranina_dönActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_giris_ekranina_dönActionPerformed
        // TODO add your handling code here:
        Ana_Giris a = new Ana_Giris();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_giris_ekranina_dönActionPerformed

    private void menu_güvenli_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_güvenli_cikisActionPerformed
        // TODO add your handling code here:
        int soru = JOptionPane.showConfirmDialog(rootPane, "Cikis Yapmak Istediginize Emin misiniz? ", "Dikkat", JOptionPane.YES_NO_CANCEL_OPTION);

        if (soru == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "İyi Günler Dileriz " + ögrenci.ad_soyad, "İyi Günler", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else if (soru == JOptionPane.NO_OPTION) {

        } else {

        }
    }//GEN-LAST:event_menu_güvenli_cikisActionPerformed

    private void menü_giris_ekrana_donActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menü_giris_ekrana_donActionPerformed
        // TODO add your handling code here:

        Ana_Giris a = new Ana_Giris();
        a.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_menü_giris_ekrana_donActionPerformed

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
            java.util.logging.Logger.getLogger(Ogrenci_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ogrenci_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ogrenci_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ogrenci_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ogrenci_ekrani().setVisible(true);
            }
        });
    }

    public void setlbl_öğrenci(String ism) {

        lbl_öğrenci.setText(ism + " Hoşgeldiniz Lütfen Duyuruları Takip Ediniz");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bilgilerimi_göster;
    private javax.swing.JButton btn_ders_ekle_bırak;
    private javax.swing.JButton btn_ders_programi;
    private javax.swing.JButton btn_giris_ekranina_dön;
    private javax.swing.JButton btn_guvenli_cikis;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_ögrenci_islemleri;
    private javax.swing.JLabel lbl_öğrenci;
    private javax.swing.JMenuBar menu_bar;
    private javax.swing.JMenuItem menu_güvenli_cikis;
    private javax.swing.JMenuItem menü_giris_ekrana_don;
    private javax.swing.JMenu menü_menü;
    // End of variables declaration//GEN-END:variables
}
