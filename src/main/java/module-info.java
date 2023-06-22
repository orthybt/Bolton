module com.example.bolton {
	requires javafx.controls;
	requires javafx.fxml;


	opens com.example.bolton to javafx.fxml;
	exports com.example.bolton;
}
