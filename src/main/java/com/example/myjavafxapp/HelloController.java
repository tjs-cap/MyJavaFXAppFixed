package com.example.myjavafxapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button btnDont;

    @FXML
    private Circle circle;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("You have pressed the button!");
    }

    @FXML
    protected void onDontButtonClick() {
        if (btnDont.getText().equals("Don't Press Me")) {
            btnDont.setText("You pressed me... ouch!");
            circle.setFill(Paint.valueOf("red"));
        } else {
            btnDont.setText("Don't Press Me");
            circle.setFill(Paint.valueOf("blue"));
        }
    }

}