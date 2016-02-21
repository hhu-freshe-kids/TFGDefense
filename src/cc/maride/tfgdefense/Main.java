package cc.maride.tfgdefense;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    public int width = 800;
    public int height = 600;
    public int tps = 1;
    private Render render;

    @Override
    public void start(Stage theStage) {
        Pane rootPane = new Pane();
        Canvas gameCanvas = new Canvas();
        render = new Render(gameCanvas.getGraphicsContext2D(), tps);

        rootPane.getChildren().add(gameCanvas);
        theStage.setScene(new Scene(rootPane, width, height));
        theStage.setTitle("TFGDefense");
        theStage.show();
        render.startCycle();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
