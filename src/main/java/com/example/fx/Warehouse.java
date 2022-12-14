package com.example.fx;

import Flowers.Chrisanthemum;
import Flowers.Rose;
import Flowers.Tulip;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.ParseException;

public class Warehouse {
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    public Label l1 = new Label();
    public Label l2 = new Label();
    public Label l3 = new Label();

    @FXML
    protected void switchtomain(ActionEvent e) throws IOException, ParseException {
        Parent root = FXMLLoader.load(getClass().getResource("main_menu.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void setData() throws ParseException {
        Rose r1 = new Rose();
        Tulip r2 = new Tulip();
        Chrisanthemum r3 = new Chrisanthemum();
        l1.setText("Roses:" + "   " + r1.Quantity + "   " + "Delivered on: " + r1.ArrivalDate + "  " + r1.getPrice());
        l2.setText("Tulips:" + "   " + r2.Quantity + "   " + "Delivered on: " + r2.ArrivalDate + "  " + r2.getPrice());
        l3.setText("Chrisanthemums:" + "   " + r3.Quantity + "   " + "Delivered on: " + r3.ArrivalDate + "  " + r3.getPrice());
    }
}
