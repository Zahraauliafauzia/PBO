package com.project_uas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HelpController {

    @FXML
    private Button cancelButtonHelp;

    public void cancelButtonHelpAction(ActionEvent event) {
        Stage stage = (Stage) cancelButtonHelp.getScene().getWindow();
        stage.close();
    }
}
