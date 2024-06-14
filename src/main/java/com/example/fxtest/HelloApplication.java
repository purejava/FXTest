package com.example.fxtest;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage s) {
        // set title for the stage
        s.setTitle("creating ChoiceBox");

        // create a button
        Button b = new Button("show");

        // create a tile pane
        TilePane r = new TilePane();

        // create a label
        Label l = new Label("This is a choice box");

        // string array
        String st[] = {"Arnab", "Andrew", "Ankit", "None"};

        // create a choiceBox
        ChoiceBox c = new ChoiceBox(FXCollections.observableArrayList(st));

        // add ChoiceBox
        r.getChildren().add(l);
        r.getChildren().add(c);

        // create a scene
        Scene sc = new Scene(r, 200, 200);

        // set the scene
        s.setScene(sc);

        s.show();
    }

    public static void main(String[] args) {
        launch();
    }
}