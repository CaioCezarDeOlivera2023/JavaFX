package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {// aqui é classe responssavel por controlar a tela

	@FXML
	private TextField txtNumber1;

	@FXML
	private TextField txtNumber2;

	@FXML
	private Label labelResult;

	@FXML
	private Button btSum;
	
	@FXML
	private Button btMult;

	@FXML
	public void onBtSumAction() {

		try {
			Locale.setDefault(Locale.US);
			double number1 = Double.parseDouble(txtNumber1.getText());
			double number2 = Double.parseDouble(txtNumber2.getText());

				
			double sum = number1 + number2;
			double mult = number1 * number2;
			
			labelResult.setText(String.format("%.2f", sum));
			labelResult.setText(String.format("%.2f", mult));

		} catch (NumberFormatException e) {
			Alerts.showAlert("Error", "parse error", e.getMessage(), AlertType.ERROR);
		}

	}
}
