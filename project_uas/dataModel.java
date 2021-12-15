package com.project_uas;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.net.HttpCookie;

public class dataModel {
    private IntegerProperty jumlahPesanan;
    private StringProperty alamatJemput;
    private StringProperty alamatAntar;
    private StringProperty userName;
    private IntegerProperty kontakk;


    public int getJumlahPesanan() {

        return jumlahPesanan.get();
    }
    public IntegerProperty jumlahPesananProperty(){

        return jumlahPesanan;
    }
    public void setJumlahPesanan(int jumlahPesan) {

        this.jumlahPesanan.set(jumlahPesan);
    }


    public String getAlamatJemput() {
        return alamatJemput.get();
    }
    public StringProperty alamatJemputProperty() {
        return alamatJemput;
    }
    public void setAlamatJemput(String alamatJemput) {
        this.alamatJemput.set(alamatJemput);
    }


    public String getAlamatAntar() {
        return alamatAntar.get();
    }
    public StringProperty alamatAntarProperty() {
        return alamatAntar;
    }
    public void setAlamatAntar(String alamatAntar) {
        this.alamatAntar.set(alamatAntar);
    }




    public String getUserName() {
        return userName.get();
    }

    public StringProperty userNameProperty() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName.set(userName);
    }


    public int getKontakk() {
        return kontakk.get();
    }

    public IntegerProperty kontakkProperty() {
        return kontakk;
    }

    public void setKontakk(int kontakk) {
        this.kontakk.set(kontakk);
    }




    public dataModel(int jumlahPesanan, String alamatJemput, String alamatAntar){
        this.jumlahPesanan = new SimpleIntegerProperty(jumlahPesanan);
        this.alamatJemput = new SimpleStringProperty(alamatJemput);
        this.alamatAntar = new SimpleStringProperty(alamatAntar);
    }



}
