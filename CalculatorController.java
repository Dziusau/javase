package calculator.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private TextField display;

    SimpleStringProperty calculatorDisplay = new SimpleStringProperty();

    @FXML
    public void initialize() {
        display.textProperty().bind(calculatorDisplay);
    }

    public void button0Clicked (javafx.event.ActionEvent actionEvent){
        System.out.println("button 0 is clicked");
        calculatorDisplay.set("0");
    }

    public void button1Clicked (javafx.event.ActionEvent actionEvent){
        System.out.println("button 1 is clicked");
        calculatorDisplay.set("1");
    }

    public void button2Clicked (javafx.event.ActionEvent actionEvent){
        System.out.println("button 2 is clicked");
        calculatorDisplay.set("2");
    }

    public void button3Clicked (javafx.event.ActionEvent actionEvent){
        System.out.println("button 3 is clicked");
        calculatorDisplay.set("3");
    }

    public void button4Clicked (javafx.event.ActionEvent actionEvent){
        System.out.println("button 4 is clicked");
        calculatorDisplay.set("4");
    }

    public void button5Clicked (javafx.event.ActionEvent actionEvent){
        System.out.println("button 5 is clicked");
        calculatorDisplay.set("5");
    }

    public void button6Clicked (javafx.event.ActionEvent actionEvent){
        System.out.println("button 6 is clicked");
        calculatorDisplay.set("6");
    }

    public void button7Clicked (javafx.event.ActionEvent actionEvent){
        System.out.println("button 7 is clicked");
        calculatorDisplay.set("7");
    }

    public void button8Clicked (javafx.event.ActionEvent actionEvent){
        System.out.println("button 8 is clicked");
        calculatorDisplay.set("8");
    }

    public void button9Clicked (javafx.event.ActionEvent actionEvent){
        System.out.println("button 9 is clicked");
        calculatorDisplay.set("9");
    }

    public void buttonCleanClicked (javafx.event.ActionEvent actionEvent){
        System.out.println("button Clean is clicked");
        calculatorDisplay.set("");
    }

    public void buttonDelClicked (javafx.event.ActionEvent actionEvent){
        System.out.println("button Delete is clicked");
        calculatorDisplay.set("");
    }

    public void buttonSumClicked (javafx.event.ActionEvent actionEvent){
        System.out.println("button + is clicked");
        calculatorDisplay.set("+");
    }

    public void buttonDifClicked (javafx.event.ActionEvent actionEvent){
        System.out.println("button - is clicked");
        calculatorDisplay.set("-");
    }

    public void buttonOpClicked (javafx.event.ActionEvent actionEvent){
        System.out.println("button * is clicked");
        calculatorDisplay.set("*");
    }

    public void buttonDivClicked (javafx.event.ActionEvent actionEvent){
        System.out.println("button / is clicked");
        calculatorDisplay.set("/");
    }

    public void buttonBktClicked (javafx.event.ActionEvent actionEvent){
        System.out.println("button () is clicked");
        calculatorDisplay.set("()");
    }

    public void buttonPctClicked (ActionEvent actionEvent){
        System.out.println("button % is clicked");
        calculatorDisplay.set("%");
    }

    public void buttonPtClicked (javafx.event.ActionEvent actionEvent){
        System.out.println("button . is clicked");
        calculatorDisplay.set(".");
    }

    public void buttonParClicked (javafx.event.ActionEvent actionEvent){
        System.out.println("button = is clicked");
    }
}
