package com.example.bolton;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BoltonApplication extends Application {
	//names(thus locations) of fxml files
	private String BoltonViewName = "BoltonView";

	/**start is some superclass/interface method that must be implemented by
	 * you, its used in code modularity and code reuse. Its a contract that
	 * one needs and should follow, so maybe one day someone else would be
	 * able to use your code. It also introduces good ways of software design.
	 *
	 * @param stage the primary stage for this application, onto which
	 * the application scene can be set. A JFrame, the boundaries between
	 *                 Windows and javaFX. Its an accesor object between
	 *                 different plaforms, it grants access to Windows
	 *                 commands, to the JavaFX language.
	 * Applications may create other stages, if needed, but they will not be
	 * primary stages.
	 *              The origin of the object Stage, where and  how is
	 *              instantiated it should not concern us,the clients, it's a
	 *              low level absolutely not needed to know language, and the
	 *              guys behind fxml were kind to improve the java language,
	 *              big hooray and bravo , and also thank you very much. Love
	 *              <3 This is object encapsulation in a nutshell.
	 * @throws IOException
	 */
	@Override
	public void start(Stage stage) throws IOException {
		//this object is responsible for the interface between javaFX and a
		// fxml file, basically it translates BoltonView.fxml to java fx code
		FXMLLoader fxmlLoader =
				//.class returns the current location of Bolton.class
				new FXMLLoader(BoltonApplication.class.getResource(
						"BoltonView" +
						".fxml"));
		//JPanel , mainPanel
		Scene scene = new Scene(fxmlLoader.load());
		//gui.set the title, JFrame.setVisible(true)
		stage.setTitle("Hello!"); stage.setScene(scene); stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
