module TicTacToe {
	requires javafx.controls;
	requires javafx.fxml;

	opens main.java.ticTacToe to javafx.fxml;

	exports main.java.ticTacToe;
	exports main.java.demo;
	opens main.java.demo to javafx.fxml;
}