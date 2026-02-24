package com.example.testsjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label msgText;

    @FXML
    protected void actionButtonClick() {
        msgText.setText("I love Neymar Jr!");
    }
}
