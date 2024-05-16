/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.burak_erdogan_bp2_proje2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thebu
 */
public class db_student_and_manager {

    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    private static final String connectionString = "kendi mysql bağlantınız olmalı örnek(jdbc:mysql://.....:..../ögrenci?user=.....&password=....)";

    private static Connection cnc;

    public static boolean Add_kullanici(Kullanici p) {

        try {

            cnc = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = cnc.createStatement();
            //kullanıcının bütün ozelliklerini tek tek alarak ögrenci_takip_db.kullanici tablomuza ekler
            String query = "INSERT INTO (kendi şemanız.kullanıcı table nız yazmalı) " //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                    + " (name_surname, mail, password, kullanici_tipi,bölüm)"
                    + "VALUES ('" + p.ad_soyad + "','" + p.mail + "','"
                    + p.parola + "','" + p.kullanıcı_tip + "','" + p.bölüm + "');";

            stmt.execute(query);
            cnc.close();
            return true;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;

        }

    }

    public static Kullanici login_islemi(String email, String sifre) {
        Kullanici k = null;
        try {
            // bu kısımda ise kullanıcının kullanıcının mailini ve sifresini alıp database kontrolünü yaptıktan sonra girişini sağlar
            cnc = DriverManager.getConnection(connectionString);
            java.sql.Statement st = cnc.createStatement();
           
            //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            String query1 = "SELECT * FROM (kendi şemanız.kullanıcı table nız yazmalı) WHERE mail='" + email + "' AND password='" + sifre + "';";
            ResultSet rs = st.executeQuery(query1);

            //table da değişkenleriniz buradaki gibi yazınız (id,name_surname ... alttakilere bakınız)
            if (rs.next()) {
                k = new Kullanici();
                k.id = rs.getInt("id");
                k.ad_soyad = rs.getString("name_surname");
                k.mail = rs.getString("mail");
                k.parola = rs.getString("password");
                k.kullanıcı_tip = rs.getString("kullanıcı_tipi");
                k.bölüm = rs.getString("bölüm");

            }

            cnc.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return k;
    }

    public static Kullanici id_e_göre_arama(int id) {
        Kullanici personel = null;
        try {
            // bu kısımda kullanıcının pk denilen kişiye özel id sine göre kullanıcıları arar
            cnc = DriverManager.getConnection(connectionString);
            java.sql.Statement st = cnc.createStatement();
            //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            String query1 = "SELECT * FROM (kendi şemanız.kullanıcı table nız yazmalı) WHERE id=" + id + ";";
            ResultSet rs = st.executeQuery(query1);

            if (rs.next()) {
                personel = new Kullanici();
                personel.id = rs.getInt("id");
                personel.ad_soyad = rs.getString("name_surname");
                personel.mail = rs.getString("mail");
                personel.parola = rs.getString("password");
                personel.kullanıcı_tip = rs.getString("kullanici_tipi");
                personel.bölüm = rs.getString("bölüm");

            }

            cnc.close();

        } catch (SQLException ex) {
            System.out.println("hata");
        }

        return personel;
    }

    public static boolean kullanıcıGüncelle(Kullanici p) {

        try {
            // bu kısımda ise update fonksiyonu sayesinde kullanıcının fonks günceller
            cnc = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = cnc.createStatement();
            //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            String q = "UPDATE (kendi şemanız.kullanıcı table nız yazmalı) SET "
                    + "name_surname='" + p.ad_soyad
                    + "',mail='" + p.mail
                    + "',password='" + p.parola
                    + "',kullanici_tipi='" + "Öğrenci"
                    + "',bölüm='" + p.bölüm
                    + "'WHERE id=" + p.id + ";";

            stmt.executeUpdate(q);
            cnc.close();
            return true;

        } catch (SQLException ex) {

            System.out.println("hataaaaa");
            return false;

        }

    }

    public static ArrayList<kurslar> Kursları_getir() {
        ArrayList<kurslar> kurs_listesi = null;
        try {
            // bu kısımda ise var olan bütün kursları select from ile getirir
            cnc = DriverManager.getConnection(connectionString);
            java.sql.Statement st = cnc.createStatement();
            //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            String query1 = "SELECT * FROM (kendi şemanız.kurslar table nız yazmalı);";
            //kurslar table degerleri asagidaki gibi yazilmali(id,name,dersin_öğretmeni,dersi_kredisi gibi)
            
            ResultSet rs = st.executeQuery(query1);
            kurs_listesi = new ArrayList<>();
            while (rs.next()) {
                kurslar kurss = new kurslar();
                kurss.id = rs.getInt("id");
                kurss.name = rs.getString("name");
                kurss.dersin_hocası = rs.getString("dersin_öğretmeni");
                kurss.ders_kredi = rs.getInt("dersin_kredisi");
                kurs_listesi.add(kurss);

            }

            cnc.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return kurs_listesi;
    }

    public static boolean Derse_id_e_göre_ögrenci_ekle(int id_student, int id_course) {

        try {
            // bu kısımda ise kullanıcının id si ve ders in id sini alarak buna göre dersi ekler
            cnc = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = cnc.createStatement();
            int alinan_not = (int) (Math.random() * 100);
            
            //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            String query = "INSERT INTO (kendi şemanız.kullanıcılar_ve_kurslar table nız yazmalı)"
                    //kullanıcı_ve_kurslar table degerleri bu sekilde olmalı(id,kullanici_id,ders_id,alınan_not)
                    + " (kullanici_id, ders_id,alınan_not)"
                    + "VALUES (" + id_student + "," + id_course + "," + alinan_not + ");";

            stmt.execute(query);
            cnc.close();
            return true;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;

        }

    }

    public static boolean Derse_id_e_göre_ögrenci_sil(int id_student, int id_course) {

        try {

            cnc = DriverManager.getConnection(connectionString);
            java.sql.Statement stmt = cnc.createStatement();
            // bu kısımda ise kullanıcının id si ve ders in id sini alarak buna göre dersi siler
            //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            String query = "DELETE FROM (kendi şemanız.kullanıcılar_ve_kurslar table nız yazmalı) where kullanici_id=" + id_student + " AND ders_id=" + id_course + ";";

            stmt.execute(query);
            cnc.close();
            return true;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;

        }

    }

    public static ArrayList<kurslar> Ogrencinin_secili_derslerini_getir(int id) {
        ArrayList<kurslar> kurslar = new ArrayList<>();
        try {
            // bu kısım en önemli koddur iki ayrı tablodan kullanıcı id sine göre verileri çekerek eşler ve kullanıcının aldığı derslerini görmemizi sağlar
            cnc = DriverManager.getConnection(connectionString);
            java.sql.Statement st = cnc.createStatement();
            //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            String query1 = "SELECT * FROM (kendi şemanız.kullanıcılar_ve_kurslar table nız yazmalı) AS kvk "
                    + "INNER JOIN (kendi şemanız.kurslar table nız yazmalı) AS kurs"
                    + " ON kvk.ders_id=kurs.id WHERE kvk.kullanici_id=" + id + ";";
            ResultSet rs = st.executeQuery(query1);

            while (rs.next()) {
                kurslar k = new kurslar();
                k.id = rs.getInt("ders_id");
                k.name = rs.getString("name");
                k.alınan_not = rs.getInt("alınan_not");
                kurslar.add(k);

            }

            cnc.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return kurslar;
    }

    public static ArrayList<Kullanici> Kayitlardan_yazilana_göre_arama(String search) {

        ArrayList<Kullanici> KullaniciListesi = new ArrayList<>();

        try {
            // burada ise girilen inputta ki kelimeye göre kişinin adını kotnrol eden eşleşen kişiyi ise getirir
            cnc = DriverManager.getConnection(connectionString);
            java.sql.Statement st = cnc.createStatement();
            //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            String query1 = "SELECT * FROM (kendi şemanız.kullanıcı table nız yazmalı) WHERE name_surname LIKE '%" + search + "%'";
            ResultSet rs = st.executeQuery(query1);

            while (rs.next()) {
                Kullanici p = new Kullanici();

                p.id = rs.getInt("id");
                p.ad_soyad = rs.getString("name_surname");
                p.mail = rs.getString("mail");
                p.parola = rs.getString("password");
                p.bölüm = rs.getString("bölüm");
                p.kullanıcı_tip = rs.getString("kullanici_tipi");
                if (p.kullanıcı_tip.compareTo("Öğrenci") == 0) {
                    KullaniciListesi.add(p);
                }

            }

            cnc.close();

        } catch (SQLException ex) {
            System.out.println("hata");
        }

        return KullaniciListesi;
    }

    public static ArrayList<Kullanici> tüm_ögrencileri_arama() {

        ArrayList<Kullanici> KullaniciListesi = new ArrayList<>();

        try {
            // bu kısımda ise tüm kullanıcıları getirir
            cnc = DriverManager.getConnection(connectionString);
            java.sql.Statement st = cnc.createStatement();
            //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            String query1 = "SELECT * FROM (kendi şemanız.kullanıcı table nız yazmalı) ";
            ResultSet rs = st.executeQuery(query1);

            while (rs.next()) {
                Kullanici p = new Kullanici();

                p.id = rs.getInt("id");
                p.ad_soyad = rs.getString("name_surname");
                p.mail = rs.getString("mail");
                p.parola = rs.getString("password");
                p.bölüm = rs.getString("bölüm");
                p.kullanıcı_tip = rs.getString("kullanici_tipi");
                // bu kısımda kullanıcı tipine bakar
                if (p.kullanıcı_tip.compareTo("Öğrenci") == 0) {
                    KullaniciListesi.add(p);
                }

            }

            cnc.close();

        } catch (SQLException ex) {
            System.out.println("hata");
        }

        return KullaniciListesi;
    }

}
