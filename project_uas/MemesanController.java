package com.project_uas;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import com.sun.javafx.charts.Legend;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.net.URL;
import java.util.ResourceBundle;


public class MemesanController {

    public JFXTextField txt_lokasiAntar;
    public JFXTextField txt_lokasiJemput;
    public TextArea txtArea_totalPembelian;
    public TextField txt_urutanPesanan;
    public ListView<String> historyPemesanan;


    @FXML
    private Button cancelButton2;
    @FXML
    private Button bookButton;


    public void cancelButtonAction2(ActionEvent event) {
        Stage stage = (Stage) cancelButton2.getScene().getWindow();
        stage.close();
    }

    //Alamat Jemput
    public void tamanManguAction(ActionEvent event) {
        txt_lokasiJemput.setText("Taman Mangu Indah");
    }

    public void oscar2Action(ActionEvent event) {
        txt_lokasiJemput.setText("Jalan Oscar 2");
    }

    public void upjAction(ActionEvent event) {
        txt_lokasiJemput.setText("Universitas Pembangunan Jaya");
    }

    public void ariaPutraAction(ActionEvent event) {
        txt_lokasiJemput.setText("Jalan Aria Putra");
    }

    public void kedaungRindangAction(ActionEvent event) {
        txt_lokasiJemput.setText("Kedaung Rindang");
    }

    public void pondokJayaAction(ActionEvent event) {
        txt_lokasiJemput.setText("Jalan Pondok Jaya");
    }

    public void pamulangPermai1Action(ActionEvent event) {
        txt_lokasiJemput.setText("Jalan Pamulang Permai I");
    }

    public void cegerRayaAction(ActionEvent event) {
        txt_lokasiJemput.setText("Jalan Ceger Raya");
    }

    public void pondokArenAction(ActionEvent event) {
        txt_lokasiJemput.setText("Jalan Raya Pondok Aren");
    }

    public void cinikiRayaaAction(ActionEvent event) {
        txt_lokasiJemput.setText("Jalan Cikini Raya");
    }

    public void anggrek1Action(ActionEvent event) {
        txt_lokasiJemput.setText("Jalan Anggrek I");
    }

    public void anggrek2Action(ActionEvent event) {
        txt_lokasiJemput.setText("Jalan Anggrek II");
    }

    public void anggrek3Action(ActionEvent event) {
        txt_lokasiJemput.setText("Jalan Anggrek III");
    }

    //Alamat Antar
    public void antr_anggrek1Action(ActionEvent event) {
        txt_lokasiAntar.setText("Jalan Angrrek I");
    }

    public void antr_anggrek2Action(ActionEvent event) {
        txt_lokasiAntar.setText("Jalan Aggrek II");
    }

    public void antr_anggrek3Action(ActionEvent event) {
        txt_lokasiAntar.setText("Jalan Anggrek III");
    }

    public void antr_oscar2Action(ActionEvent event) {
        txt_lokasiAntar.setText("Jalan Oscar II");
    }

    public void antr_ariaPutraAction(ActionEvent event) {
        txt_lokasiAntar.setText("Jalan Aria Putra");
    }

    public void antr_xchangeAction(ActionEvent event) {
        txt_lokasiAntar.setText("Bintaro Jaya Xchange Mall");
    }

    public void antr_warnoengAction(ActionEvent event) {
        txt_lokasiAntar.setText("Warnoeng Jalan Ciputat I");
    }

    public void antr_upnormalAction(ActionEvent event) {
        txt_lokasiAntar.setText("Upnormal, Bintaro Sektor 7");
    }

    public void antr_pamulangPermai1Action(ActionEvent event) {
        txt_lokasiAntar.setText("Jalan Pamulang Permai I");
    }

    public void antr_upjAction(ActionEvent event) {
        txt_lokasiAntar.setText("Universitas Pembangunan Jaya Lobby");
    }



    private KoneksiDatabase koneksidatabase = new KoneksiDatabase();

    public void bookButtonAction(ActionEvent event) {

       //HistoryController historyController = new HistoryController();

        String almt_jemput = txt_lokasiJemput.getText();
        String almt_antar = txt_lokasiAntar.getText();

        String query = "INSERT INTO takson(alamatjemput, alamatantar) VALUES ('" + almt_jemput + "', " +
                "'" + almt_antar + "')";

        System.out.println(query);

        int hasil = koneksidatabase.manipulasiDataa(query);
        if (hasil == 1) {
            System.out.println("Data berhasil masuk ke database!");
        }

        Stage stage = (Stage) bookButton.getScene().getWindow();
        stage.close();

    }

      @FXML
      void nextBFuttonPemesanan_Action(ActionEvent event) {

        txtArea_totalPembelian.setText("\nHarga            : Rp 40.000 \n" +
                "Pembayaran  : Cash \nDiscon 0% \n\n" +
                "Have a nice day.");
    }
}
