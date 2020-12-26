package com.pboreg;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.sql.ResultSet;

public class PesanController {
    public TextField textPesan;
    public Label labelPesan;
    public ListView <String> listViewPesan;

    private Koneksi koneksi = new Koneksi();

    public void buttonPesanKlik(ActionEvent actionEvent) {
        String text = textPesan.getText();
        labelPesan.setText(text);

        //Input data ke tabel pesan pada database
        String query = "INSERT INTO pesan(isipesan) VALUES('" + text + "')";
        int hasil = koneksi.manipulasiData(query);
        if (hasil == 1){
            System.out.println("Data berhasil diinput de dalam tabel!");
            tampilData();
        }
    }

    public void tampilData(){
        try{
            //Untuk menampilkan data dari database = SELECT kolom 1, kolom 2, kolom4, FROM nama tabel
            //Tanda bintang itu berarti semua kolom akan tampil dari database
            String query = "SELECT * FROM pesan"; //pesan itu nama tabel dalam database
            ResultSet hasil = koneksi.getData(query);
            ObservableList<String> items = FXCollections.observableArrayList();
            listViewPesan.setItems(items);

            while (hasil.next()){
                items.add(hasil.getString(2));
            }
        }catch (Exception e){
            System.out.println("Error : " + e.getMessage());
        }
    }
}
