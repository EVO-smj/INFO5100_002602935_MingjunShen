package calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {

    private TextField inputField1;
    private TextField inputField2;
    private TextField resultField;
    private ChoiceBox<String> operationChoice;


    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        inputField1 = new TextField();
        inputField1.setPromptText("Enter first number");
        inputField2 = new TextField();
        inputField2.setPromptText("Enter second number");

        operationChoice = new ChoiceBox<>();
        operationChoice.getItems().addAll("+", "-", "*", "/");
        operationChoice.setValue("+");

        Button calculateButton = new Button("Calculate");
        calculateButton.setOnAction(event -> calculate());

        resultField = new TextField();

        gridPane.add(inputField1, 0, 0);
        gridPane.add(operationChoice, 1, 0);
        gridPane.add(inputField2, 2, 0);
        gridPane.add(calculateButton, 3, 0);
        gridPane.add(resultField, 4, 0);

        Scene scene = new Scene(gridPane, 1000, 500);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void calculate() {
        try {
            double num1 = Double.parseDouble(inputField1.getText());
            double num2 = Double.parseDouble(inputField2.getText());
            String operation = operationChoice.getValue();
            double result = 0;
            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            resultField.setText(Double.toString(result));
        } catch (NumberFormatException e) {
            resultField.setText("Error: Invalid input");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
