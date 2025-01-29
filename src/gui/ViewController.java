package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {//aqui é classe responssavel por controlar a tela

	@FXML
	private Button btTest;
	
	@FXML
	public void onBtTestAction() {
		System.out.println("Click");
	}
	
}
