/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.burak_erdogan_bp2_proje2;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thebu
 */
public class Ogrenci_ders_ekle_bırak extends javax.swing.JFrame {

    /**
     * Creates new form Ogrenci_ders_ekle_bırak
     */
    //table modelleri oluşturulur
    Kullanici kullanici;
    DefaultTableModel tbl_kurslar_model;
    DefaultTableModel tbl_seçili_kurslar_model;

    public Ogrenci_ders_ekle_bırak() {
        initComponents();
        tbl_kurslar_model = new DefaultTableModel();
        tbl_kurslar.setModel(tbl_kurslar_model);
        tbl_kurslar_model.setColumnIdentifiers(new Object[]{"DERSİN ID", "DERSİN ADI", "DERSİN ÖĞRETMENİ", "DERSİN KREDİSİ"});

        tbl_seçili_kurslar_model = new DefaultTableModel();
        tbl_seçili_kurslar.setModel(tbl_seçili_kurslar_model);
        tbl_seçili_kurslar_model.setColumnIdentifiers(new Object[]{"DERSİN ID", "DERSİN ADI", "ALDIĞIM NOT"});

        set_course_table();
        // bu kısımda table ların görünüşü ve neler yer alacağı yapılır

    }

    public Ogrenci_ders_ekle_bırak(Kullanici kullanici) {
        this.kullanici = kullanici;
        initComponents();
        tbl_kurslar_model = new DefaultTableModel();
        tbl_kurslar.setModel(tbl_kurslar_model);
        tbl_kurslar_model.setColumnIdentifiers(new Object[]{"DERSİN ID", "DERSİN ADI", "DERSİN ÖĞRETMENİ", "DERSİN KREDİSİ"});

        tbl_seçili_kurslar_model = new DefaultTableModel();
        tbl_seçili_kurslar.setModel(tbl_seçili_kurslar_model);
        tbl_seçili_kurslar_model.setColumnIdentifiers(new Object[]{"DERSİN ID", "DERSİN ADI", "ALDIĞIM NOT"});

        set_course_table();
        // bu kısımda table ların görünüşü ve neler yer alacağı yapılır
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpn_ögrenci_ders_islemleri = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_kurslar = new javax.swing.JTable();
        btn_ders_ekle = new javax.swing.JButton();
        btn_ders_bırak = new javax.swing.JButton();
        btn_geri_dön = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_seçili_kurslar = new javax.swing.JTable();
        btn_geri_dön2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tpn_ögrenci_ders_islemleri.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tpn_ögrenci_ders_islemleriStateChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jScrollPane1.setViewportView(tbl_kurslar);

        btn_ders_ekle.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_ders_ekle.setText("Ders Ekle");
        btn_ders_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ders_ekleActionPerformed(evt);
            }
        });

        btn_ders_bırak.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_ders_bırak.setText("Ders Bırak");
        btn_ders_bırak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ders_bırakActionPerformed(evt);
            }
        });

        btn_geri_dön.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_geri_dön.setText("Geri Dön");
        btn_geri_dön.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geri_dönActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ders_bırak, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_ders_ekle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_geri_dön, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_ders_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ders_bırak, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_geri_dön, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );

        tpn_ögrenci_ders_islemleri.addTab("Ders Ekle Bırak", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jScrollPane2.setViewportView(tbl_seçili_kurslar);

        btn_geri_dön2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_geri_dön2.setText("Geri Dön");
        btn_geri_dön2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geri_dön2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_geri_dön2)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                    .addComponent(btn_geri_dön2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tpn_ögrenci_ders_islemleri.addTab("Aldığım Dersleri Ve Notları Göster", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpn_ögrenci_ders_islemleri)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpn_ögrenci_ders_islemleri)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ders_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ders_ekleActionPerformed
        // TODO add your handling code here:

        if (tbl_kurslar.getSelectedRow() < 0) {
            return;
        }

        int id_kurs = Integer.parseInt(tbl_kurslar.getValueAt(tbl_kurslar.getSelectedRow(), 0).toString());

        db_student_and_manager.Derse_id_e_göre_ögrenci_ekle(this.kullanici.id, id_kurs);
        //yukarıdaki fonskiyona göre öğrenciye ders eklenir
        JOptionPane.showMessageDialog(rootPane, "Derse Başarıyla Kayıt Olundu Sınava Girebilir Ve Sınav Sonucunuzu Görebilirsiniz", "Bilgi", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_btn_ders_ekleActionPerformed

    private void btn_geri_dönActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geri_dönActionPerformed
        // TODO add your handling code here:
        Ogrenci_ekrani o = new Ogrenci_ekrani(kullanici);
        o.setVisible(true);
        o.setlbl_öğrenci(kullanici.ad_soyad);
        this.dispose();
    }//GEN-LAST:event_btn_geri_dönActionPerformed

    private void btn_ders_bırakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ders_bırakActionPerformed
        // TODO add your handling code here:

        if (tbl_kurslar.getSelectedRow() < 0) {
            return;
        }

        int id_kurs = Integer.parseInt(tbl_kurslar.getValueAt(tbl_kurslar.getSelectedRow(), 0).toString());

        db_student_and_manager.Derse_id_e_göre_ögrenci_sil(this.kullanici.id, id_kurs);
        //yukarıdaki fonskiyona göre öğrenciden ders silinir
        JOptionPane.showMessageDialog(rootPane, "Derse Kayıdınız Başarıyla Silinmiştir", "Bilgi", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_btn_ders_bırakActionPerformed

    private void tpn_ögrenci_ders_islemleriStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tpn_ögrenci_ders_islemleriStateChanged
        // TODO add your handling code here:
        if (tpn_ögrenci_ders_islemleri.getSelectedIndex() == 1) {
            //yeni tap pane geçince alınn dersleri bize gösterir
            ArrayList<kurslar> kurslar = db_student_and_manager.Ogrencinin_secili_derslerini_getir(this.kullanici.id);

            tbl_seçili_kurslar_model.setRowCount(0);
            for (kurslar kurs : kurslar) {
                tbl_seçili_kurslar_model.addRow(new Object[]{kurs.id, kurs.name, kurs.alınan_not});
            }
        }


    }//GEN-LAST:event_tpn_ögrenci_ders_islemleriStateChanged

    private void btn_geri_dön2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geri_dön2ActionPerformed
        // TODO add your handling code here:
        Ogrenci_ekrani o = new Ogrenci_ekrani(kullanici);
        o.setVisible(true);
        o.setlbl_öğrenci(kullanici.ad_soyad);//  bu kısımda ise gelen öğrenci geri döndürülür
        this.dispose();

    }//GEN-LAST:event_btn_geri_dön2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ogrenci_ders_ekle_bırak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ogrenci_ders_ekle_bırak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ogrenci_ders_ekle_bırak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ogrenci_ders_ekle_bırak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ogrenci_ders_ekle_bırak().setVisible(true);
            }
        });
    }

    private void set_course_table() {
        ArrayList<kurslar> kurslarrr = db_student_and_manager.Kursları_getir();
        tbl_kurslar_model.setRowCount(0); //tüm kurslar bu table a gelir
        for (kurslar kurs : kurslarrr) {
            tbl_kurslar_model.addRow(new Object[]{kurs.id, kurs.name, kurs.dersin_hocası, kurs.ders_kredi});
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ders_bırak;
    private javax.swing.JButton btn_ders_ekle;
    private javax.swing.JButton btn_geri_dön;
    private javax.swing.JButton btn_geri_dön2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_kurslar;
    private javax.swing.JTable tbl_seçili_kurslar;
    private javax.swing.JTabbedPane tpn_ögrenci_ders_islemleri;
    // End of variables declaration//GEN-END:variables
}
