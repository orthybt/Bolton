package com.example.bolton;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BoltonController {
	@FXML
	private Label header;
	@FXML
	private TextField sumMax;
	@FXML
	private TextField sumMand;
	@FXML
	private TextField myRatio;
	@FXML
	private TextField toothDeficiencyLocation;
	@FXML
	private TextField toothDeficiencyAmmount;




	@FXML
	protected void onCalculateButtonClick() {
		//Grab the values
		Double sumMaxTemp;
		Double sumMandTemp;
		Double baseRatioTemp = 0.913;
		Double baseRatioTempLowerLimit = 0.893;
		Double baseRatioTempUpperLimit = 0.932;

		sumMaxTemp = Double.valueOf(sumMax.getText());
		sumMandTemp = Double.valueOf(sumMand.getText());
		Double myRatioTemp = sumMandTemp/sumMaxTemp;
		myRatio.setText(String.format("%.2f",myRatioTemp));

		if (myRatioTemp >= baseRatioTempLowerLimit && myRatioTemp <= baseRatioTempUpperLimit) {
			toothDeficiencyLocation.setText("Tooth size discrepancy within " +
					"normal limits");
			Double value = Math.abs((myRatioTemp - baseRatioTemp)*100);
			toothDeficiencyAmmount.setText(value.toString());
		}
		if (myRatioTemp > baseRatioTempUpperLimit) {
			//if the value of sumMand increases so does the my ratio, the
			// rise of ratio is the rise of mandibular tooth material
			toothDeficiencyLocation.setText("Maxillary Deficiency");
			Double value = Math.abs((myRatioTemp - baseRatioTemp)*100);
			toothDeficiencyAmmount.setText(String.format("%.2f", value));
			System.out.println("HERE");

		}
		if (myRatioTemp < baseRatioTempLowerLimit) {
			toothDeficiencyLocation.setText("Mandibular Deficiency");
			Double value = Math.abs((myRatioTemp - baseRatioTemp)*100);

			toothDeficiencyAmmount.setText(String.format("%.2f", value));
		}
	}
}
