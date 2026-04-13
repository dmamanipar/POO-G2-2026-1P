module pe.edu.upeu {

    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
    requires static lombok;

    opens pe.edu.upeu.controller to javafx.fxml;
    exports pe.edu.upeu;
}