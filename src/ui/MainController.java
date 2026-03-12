package ui;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

import logic.*;

public class MainController
{
    @FXML private TextField yearField;
    @FXML private TextArea monthLengthOutput;

    @FXML private TextField monthField;
    @FXML private TextArea mondaysOutput;

    @FXML private DatePicker datePicker;
    @FXML private Label fridayOutput;

    @FXML
    private void handleMonthLength()
    {
        int year = Integer.parseInt(yearField.getText());
        monthLengthOutput.setText(
                MonthLengthReport.returnReport(year).toString()
        );
    }

    @FXML
    private void handleMondays()
    {
        mondaysOutput.setText(
                MondaysInMonthReport.returnReport(monthField.getText()).toString()
        );
    }

    @FXML
    private void handleFriday13()
    {
        LocalDate date = datePicker.getValue();
        fridayOutput.setText(
                FridayThe13thCheck.check(date).toString()
        );
    }
}
