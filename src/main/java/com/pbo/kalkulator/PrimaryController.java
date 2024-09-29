package com.pbo.kalkulator;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

				@FXML
				private Button ac;

				@FXML
				private Button div;

				@FXML
				private Button dot;

				@FXML
				private Button eight;

				@FXML
				private Button equal;

				@FXML
				private Button five;

				@FXML
				private Button four;

				@FXML
				private Button minus;

				@FXML
				private Button multiply;

				@FXML
				private Button nine;

				@FXML
				private Button one;

				@FXML
				private Button plus;

				@FXML
				private TextField resultdisplay;

				@FXML
				private Button seven;

				@FXML
				private Button six;

				@FXML
				private Button three;

				@FXML
				private Button two;

				@FXML
				private Button zero;

				double result = 0;
				double input1;
				double input2;
				int ps;
				int point;

				@FXML
				void Calculation(ActionEvent event) {

								if (event.getSource() == one) {
												resultdisplay.appendText("1");
								} else if (event.getSource() == two) {
												resultdisplay.appendText("2");
								} else if (event.getSource() == three) {
												resultdisplay.appendText("3");
								} else if (event.getSource() == four) {
												resultdisplay.appendText("4");
								} else if (event.getSource() == five) {
												resultdisplay.appendText("5");
								} else if (event.getSource() == six) {
												resultdisplay.appendText("6");
								} else if (event.getSource() == seven) {
												resultdisplay.appendText("7");
								} else if (event.getSource() == eight) {
												resultdisplay.appendText("8");
								} else if (event.getSource() == nine) {
												resultdisplay.appendText("9");
								} else if (event.getSource() == zero) {
												resultdisplay.appendText("0");
								} else if (event.getSource() == dot && point == 0) {
												resultdisplay.appendText(".");

												point = 1;
								} else if (event.getSource() == ac) {
												resultdisplay.setText("");
												input1 = 0;
												input2 = 0;
												ps = 0;
												point = 0;
								} else if (event.getSource() == plus) {
												input1 = Double.parseDouble(resultdisplay.getText());
												resultdisplay.setText("");
												ps = 1;
												point = 0;
								} else if (event.getSource() == minus) {
												input1 = Double.parseDouble(resultdisplay.getText());
												resultdisplay.setText("");
												ps = 2;
												point = 0;
								} else if (event.getSource() == multiply) {
												input1 = Double.parseDouble(resultdisplay.getText());
												resultdisplay.setText("");
												ps = 3;
												point = 0;
								} else if (event.getSource() == div) {
												input1 = Double.parseDouble(resultdisplay.getText());
												resultdisplay.setText("");
												ps = 4;
												point = 0;
								} else if (event.getSource() == equal && ps > 0) {
												input2 = Double.parseDouble(resultdisplay.getText());
												DecimalFormat td = new DecimalFormat("#.00");
												switch (ps) {
																case 1:
																				result = input1 + input2;
																				resultdisplay.setText(String.valueOf(td.format(result)));
																				break;
																case 2:
																				result = input1 - input2;
																				resultdisplay.setText(String.valueOf(td.format(result)));
																				break;
																case 3:
																				result = input1 * input2;
																				resultdisplay.setText(String.valueOf(td.format(result)));
																				break;
																case 4:
																				result = input1 / input2;
																				resultdisplay.setText(String.valueOf(td.format(result)));
																				break;
												}
												ps= 0;
								}

				}

				public void initialize(URL url, ResourceBundle rb) {
								//TODO
				}
}
