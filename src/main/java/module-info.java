module com.example.chessjavafxgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chessjavafxgame to javafx.fxml;
    exports com.example.chessjavafxgame;
}