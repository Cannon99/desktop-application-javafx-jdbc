module workshopjava {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens model.entities to javafx.base;
	opens gui to javafx.fxml;
	opens application to javafx.graphics, javafx.fxml;
}
