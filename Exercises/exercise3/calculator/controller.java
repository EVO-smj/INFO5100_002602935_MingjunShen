package calculator;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class controller {
    @FXML
    private TextField inputField1;

    @FXML
    private TextField inputField2;

    @FXML
    private TextField resultField;

    @FXML
    private ChoiceBox<String> operationChoice;

    @FXML
    public void initialize() {
        operationChoice.getItems().addAll("+", "-", "*", "/");
        operationChoice.setValue("+");
    }

    @FXML
    public void calculate() {
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
}
