package com.h2s.kafka.kafkaclients;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField brokerId;

    @FXML
    private TextField groupId;

    @FXML
    private Button connect;

    public void onConnect(ActionEvent actionEvent) {

    }
}