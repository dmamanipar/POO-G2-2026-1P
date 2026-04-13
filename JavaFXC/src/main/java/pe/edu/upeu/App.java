package pe.edu.upeu;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.beans.beancontext.BeanContext;


/**
 * Hello world!
 *
 */
public class App extends Application {

    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label lbn = new Label("numero 1");
        Label lbn2 = new Label("numero 2");

        TextField txtNum1 = new TextField();
        TextField txtNum2 = new TextField();

        Button btnSuma = new Button("Suma");
        Button btnResta = new Button("Resta");
        Button btnMultiplicacion = new Button("Multiplicacion");
        Button btnDivision = new Button("Division");

        Label result = new Label("Resultado");
        Label valorResult = new Label("0");

        btnSuma.getStyleClass().addAll("btn", "btn-warning");
        btnResta.getStyleClass().addAll("btn", "btn-success");
        btnMultiplicacion.getStyleClass().addAll("btn", "btn-success");
        btnDivision.getStyleClass().addAll("btn", "btn-warning");

        btnSuma.setOnAction(e -> {
            double result1 = Double.parseDouble(txtNum1.getText()) + Double.parseDouble(txtNum2.getText());
            valorResult.setText(String.valueOf(result1));

        });
        btnResta.setOnAction(e -> {
            double result1 = Double.parseDouble(txtNum1.getText()) - Double.parseDouble(txtNum2.getText());
            valorResult.setText(String.valueOf(result1));

        });
        btnMultiplicacion.setOnAction(e -> {
            double result1 = Double.parseDouble(txtNum1.getText()) * Double.parseDouble(txtNum2.getText());
            valorResult.setText(String.valueOf(result1));
        });
        btnDivision.setOnAction(e -> {
            double result1 = Double.parseDouble(txtNum1.getText()) / Double.parseDouble(txtNum2.getText());
            valorResult.setText(String.valueOf(result1));

        });

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(15));
        grid.add(lbn, 0, 0);
        grid.add(lbn2, 1, 0);
        grid.add(txtNum1, 0, 1);
        grid.add(txtNum2, 1, 1);
        grid.add(btnSuma, 0, 2);
        grid.add(btnResta, 1, 2);
        grid.add(btnMultiplicacion, 0, 3);
        grid.add(btnDivision, 1, 3);
        grid.add(result, 0, 4);
        grid.add(valorResult, 0, 5);
        Scene scene = new Scene(grid, 300, 200);


        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        primaryStage.setTitle("---tu ayuda acaba de llegar---");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
