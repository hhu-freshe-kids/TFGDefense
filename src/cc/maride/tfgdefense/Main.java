package cc.maride.tfgdefense;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by maride on 20.02.16.
 */
public class Main extends Application {
    public int width = 800;
    public int height = 600;

    @Override
    public void start(Stage theStage) {
        Pane rootPane = new Pane();
        Canvas gameCanvas = new Canvas();

        rootPane.getChildren().add(gameCanvas);
        theStage.setScene(new Scene(rootPane, width, height));
        theStage.setTitle("TFGDefense");
        theStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
