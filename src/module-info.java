module fx1 {
	requires javafx.controls;
	requires java.sql;
	requires javafx.graphics;
	requires java.desktop;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.web;
	
	
	opens application to javafx.graphics, javafx.fxml;
	exports application;
}