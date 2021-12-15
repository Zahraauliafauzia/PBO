package com.project_uas;

import com.jfoenix.controls.JFXTextField;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;


public class ProfilController implements Initializable {

    public JFXTextField txt_username;
    public JFXTextField txt_kontakk;
    public ListView <String>list_username;
    public ListView <String>list_kontak;

    @FXML
    private Button cancelButtonProfil;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.tampilData();
        this.tampilData2();
    }

    public void cancelButtonProfilAction(ActionEvent event) {
        Stage stage = (Stage) cancelButtonProfil.getScene().getWindow();
        stage.close();
    }

    private KoneksiDatabase koneksidatabase= new KoneksiDatabase();

    public void button_editProf1Action(ActionEvent event) {
        String teksuserName = txt_username.getText();

        if (teksuserName.isEmpty()){
            String query = "UPDATE takson SET username='"+ teksuserName +"' " ;
            int hasil = koneksidatabase.manipulasiDataa(query);
            if (hasil == 1){
                System.out.println("Data berhasil diedit!");
                this.tampilData();
            }
        }else {
            String queryy = "UPDATE takson SET username='"+ teksuserName +"' " ;
            int hasil = koneksidatabase.manipulasiDataa(queryy);
            if (hasil == 1){
                System.out.println("Data berhasil diedit!");
                this.tampilData();
            }
        }
    }

    public void button_editProf2Action(ActionEvent event) {
        String tekskontakk = txt_kontakk.getText();

        if (tekskontakk.isEmpty()){
            String query = "UPDATE takson SET kontak='"+ tekskontakk +"' " ;
            int hasil = koneksidatabase.manipulasiDataa(query);
            if (hasil == 1){
                System.out.println("Data berhasil diedit!");
                this.tampilData2();
            }
        }else {
            String queryy = "UPDATE takson SET kontak='"+ tekskontakk +"' " ;
            int hasil = koneksidatabase.manipulasiDataa(queryy);
            if (hasil == 1){
                System.out.println("Data berhasil diedit!");
                this.tampilData2();
            }
        }
    }


    public void tampilData(){
        try {
            String query = "SELECT * FROM takson";
            ResultSet hasil = koneksidatabase.getDt(query);
            ObservableList<String> items = FXCollections.observableArrayList();
            list_username.setItems(items);

            while(hasil.next()){
                items.add(hasil.getString(1));
            }


        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void tampilData2(){
        try {
            String query = "SELECT * FROM takson";
            ResultSet hasil = koneksidatabase.getDt(query);
            ObservableList<String> items = FXCollections.observableArrayList();
            list_kontak.setItems(items);

            while(hasil.next()){
                items.add(hasil.getString(2));
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
