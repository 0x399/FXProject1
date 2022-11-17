package com.example.fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage PrimaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main_menu.fxml"));
        Scene s1 = new Scene(root, Color.BISQUE);
        PrimaryStage.setScene(s1);
        PrimaryStage.show();
    }

    public static void main(String[] args) {
        System.out.println("balls");
        launch(args);
    }
}