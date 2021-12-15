package com.project_uas;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class HistoryController implements Initializable {

    public TextField txt_jumlahpesanan;
    public TextField txt_alamat_jemput;
    public TextField txt_alamat_antar;


    @FXML
    private Button cancelButtonHistory;

    public TableView<dataModel> tabelData;
    public TableColumn<dataModel, SimpleIntegerProperty> colPesanan;
    public TableColumn<dataModel, SimpleStringProperty> colAlamatJemput;
    public TableColumn<dataModel, SimpleStringProperty> colAlamatAntar;


    private KoneksiDatabase koneksidatabase= new KoneksiDatabase();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.tampilDataTabelView();
    }


    private void tampilDataTabelView() {
        colPesanan.setCellValueFactory(new PropertyValueFactory<>("JumlahPesanan"));
        colAlamatJemput.setCellValueFactory(new PropertyValueFactory<>("AlamatJemput"));
        colAlamatAntar.setCellValueFactory(new PropertyValueFactory<>("AlamatAntar"));
        try {
            String query = "SELECT * FROM takson";
            ResultSet hasil = koneksidatabase.getDt(query);
            ObservableList<dataModel> dataModels = FXCollections.observableArrayList();
            tabelData.setItems(dataModels);

            while (hasil.next()){
                int jmlpesanan = hasil.getInt(3);
                String almtjemput = hasil.getString(4);
                String almtantar = hasil.getString(5);
                dataModels.add(new dataModel(jmlpesanan, almtjemput, almtantar));
            }

        }catch (Exception e){
            System.out.println("Error : " + e);
        }

        tabelData.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue ) -> showDetail(newValue));
    }

    private void showDetail(dataModel takson) {
        if (takson != null){
            txt_jumlahpesanan.setText(takson.jumlahPesananProperty().getValue().toString());
            txt_alamat_jemput.setText(takson.getAlamatJemput());
            txt_alamat_antar.setText(takson.getAlamatAntar());
        }else{
            txt_jumlahpesanan.setText("");
            txt_alamat_jemput.setText("");
            txt_alamat_antar.setText("");
        }
    }



    public void cancelButtonActionHistory(ActionEvent event) {
        Stage stage = (Stage) cancelButtonHistory.getScene().getWindow();
        stage.close();
    }


    public void buttonEditAction(ActionEvent event) {
        String teksJumlahPesanan = txt_jumlahpesanan.getText();
        String teks_alamatJemput = txt_alamat_jemput.getText();
        String teks_alamatAntar = txt_alamat_antar.getText();

        if (!teks_alamatJemput.isEmpty() && !teks_alamatAntar.isEmpty()) {

            String query = "UPDATE takson SET alamatjemput= '" +teks_alamatJemput+"', alamatantar='"+teks_alamatAntar+"' WHERE jumlahpemesanan=" + Integer.parseInt(teksJumlahPesanan);
            int hasil = koneksidatabase.manipulasiDataa(query);
            if (hasil == 1) {
                System.out.println("Data berhasil diedit");
                this.tampilDataTabelView();
            }
        }
    }

    public void buttonDeleteAction(ActionEvent event) {
        String teksJumlahPemesanan = txt_jumlahpesanan.getText();

        if (!teksJumlahPemesanan.isEmpty()){
            String query = "DELETE FROM takson WHERE jumlahpemesanan=" + Integer.parseInt(teksJumlahPemesanan);
            int hasil = koneksidatabase.manipulasiDataa(query);
            if(hasil == 1){
                System.out.println("Data sudah terhapus !");
                this.tampilDataTabelView();
            }
        }

    }

}
