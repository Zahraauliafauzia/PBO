package com.pboreg;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {

    public TextField txt_prodi;
    public TextField txt_nama;
    public TextField txt_nim;
    public TextField txt_ttgl;
    public TextField txt_jenisKel;
    public TextArea txt_alamat;
    public TextField txt_email;
    public TextField txt_notelp;


    private Koneksi koneksi = new Koneksi();

    public void InfAction(ActionEvent actionEvent) {
        txt_prodi.setText("Informatika");
    }

    public void sifAction(ActionEvent actionEvent) {
        txt_prodi.setText("Sistem Informasi");
    }

    public void dkvAction(ActionEvent actionEvent) {
        txt_prodi.setText("Desain Komunikasi Visual");
    }

    public void teksipAction(ActionEvent actionEvent) {
        txt_prodi.setText("Teknik Sipil");
    }

    public void arsiAction(ActionEvent actionEvent) {
        txt_prodi.setText("Arsitektur");
    }

    public void dpAction(ActionEvent actionEvent) {
        txt_prodi.setText("Desain Produk");
    }

    public void aktAction(ActionEvent actionEvent) {
        txt_prodi.setText("Akutansi");
    }

    public void meneAction(ActionEvent actionEvent) {
        txt_prodi.setText("Management");
    }

    public void psiAction(ActionEvent actionEvent) {
        txt_prodi.setText("Psikologi");
    }

    public void ilkomAction(ActionEvent actionEvent) {
        txt_prodi.setText("Ilmu Komunikasi");
    }
    

    public void submitActionKlik(ActionEvent actionEvent) {
        String nama = txt_nama.getText();
        String prodii = txt_prodi.getText();
        String nimm = txt_nim.getText();
        String ttgl_ = txt_ttgl.getText();
        String jnsKel = txt_jenisKel.getText();
        String alamat_ = txt_alamat.getText();
        String email_ = txt_email.getText();
        String notelp_ = txt_notelp.getText();

        String query = "INSERT INTO biodatamhs(nama,prodi,nim,tgl,jeniskel,alamat,email,notelp) VALUES('"+nama+"', " +
                "'"+prodii+"', '"+nimm+"', " + "'"+ttgl_+"', '"+jnsKel+"', '"+alamat_+"', '"+email_+"', '"+notelp_+"')";
        System.out.println(query);

        int hasil = koneksi.manipulasiData(query);
        if (hasil == 1){
            System.out.println("Data berhasil masuk ke database!");
        }


    }

    public void jeniskel_laki(ActionEvent event) {
        txt_jenisKel.setText("Laki-laki");
    }

    public void jeniskel_pr(ActionEvent event) {
        txt_jenisKel.setText("Perempuan");
    }
}
