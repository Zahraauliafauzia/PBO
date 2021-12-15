package com.project_uas;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.stage.StageStyle;

import java.io.File;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import java.net.URL;


public class HomeController implements Initializable {

    @FXML
    private Button cancelButton;
    @FXML
    private Label labelMemesanMessage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

    }


    public void memesanButtonAction(ActionEvent event){
        labelMemesanMessage.setText("Kamu akan memesan Taxi Online.");
        createPesananForm();
    }

    public void cancelButtonAction(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void profilButtonAction(ActionEvent event) {

        createProfilForm();
    }

    public void buttonHistoryAction(ActionEvent event) {

        createHistoryForm();
    }

    public void bantuanButtonAction(ActionEvent event) {

        createHelpForm();
    }




    public void createPesananForm(){
        try{

            Parent root = FXMLLoader.load(getClass().getResource("memesan.fxml"));
            Stage stageMemesan = new Stage();
            stageMemesan.initStyle(StageStyle.UNDECORATED);
            stageMemesan.setScene(new Scene(root));
            stageMemesan.show();

        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }

    public void createProfilForm(){
        try{

            Parent root = FXMLLoader.load(getClass().getResource("profil.fxml"));
            Stage stageProfil = new Stage();
            stageProfil.initStyle(StageStyle.UNDECORATED);
            stageProfil.setScene(new Scene(root));
            stageProfil.show();

        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }

    public void createHistoryForm(){
        try{

            Parent root = FXMLLoader.load(getClass().getResource("history.fxml"));
            Stage stageHistory = new Stage();
            stageHistory.initStyle(StageStyle.UNDECORATED);
            stageHistory.setScene(new Scene(root));
            stageHistory.show();

        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }

    public void createHelpForm(){
        try{

            Parent root = FXMLLoader.load(getClass().getResource("help.fxml"));
            Stage stageHelp = new Stage();
            stageHelp.initStyle(StageStyle.UNDECORATED);
            stageHelp.setScene(new Scene(root));
            stageHelp.show();

        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }

}
