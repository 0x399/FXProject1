package com.example.fx;

import Menu.Menu;
import SQL.SQL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.ParseException;

public class Main extends Application {
    @Override
    public void start(Stage PrimaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main_menu.fxml"));
        Scene s1 = new Scene(root, Color.BISQUE);
        PrimaryStage.setResizable(false);
        PrimaryStage.setTitle("Flower Shoppe");
        PrimaryStage.setResizable(false);
        PrimaryStage.setScene(s1);
        PrimaryStage.show();
    }

    public static void main(String[] args) throws ParseException {
        Menu menu = new Menu();
        SQL.execute();
        launch(args);
    }
}