package com.example.fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.ParseException;

public class MainComtroller {
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    protected void switchtowarehouse(ActionEvent e) throws IOException, ParseException {
        Parent root = FXMLLoader.load(getClass().getResource("warehouse.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        Warehouse wh1 = new Warehouse();
        stage.show();
    }

    @FXML
    protected void switchtobq(ActionEvent e) throws IOException, ParseException {
        Parent root = FXMLLoader.load(getClass().getResource("bqcreate.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void logout(ActionEvent e){
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.close();
    }

}