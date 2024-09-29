package com.pbo.kalkulator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.image.Image;

/**
 * JavaFX App
 */
public class App extends Application {
				/**
				 *
				 * @param stage
				 * @throws IOException
				 */
				@Override
				public void start(Stage stage) throws IOException {
								Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));
								Scene scene = new Scene(root);
								scene.getStylesheets().add("/styles/styles.css");

								Image image = new Image("/img/logo.png");
								stage.getIcons().add(image);
								
								stage.setTitle("Kalkulator by Ofren dialsa");
								stage.setScene(scene);
								stage.show();
				}

				public static void main(String[] args) {
								launch();
				}

}
