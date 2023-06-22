package com.example.bolton;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BoltonController {
	@FXML
	private Label welcomeText;

	@FXML
	protected void onHelloButtonClick() {
		welcomeText.setText("Welcome to JavaFX Application!");
	}
}
