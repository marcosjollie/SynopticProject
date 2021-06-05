package sample;


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class PiedritasMap extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("SMART MAP - Piedritas Map");
        // Create the AmpStart Page grid pane
        GridPane piedritasMapGridPane = createPiedritasMapGridPane();
        piedritasMapGridPane.setMaxSize( 800, 550);
        piedritasMapGridPane.setBackground(new Background( LobitosMap.createImage("PiedritasMap.png")));


        // Add UI controls to the AmpStart form grid pane
        addUIControlsPiedritasMap(piedritasMapGridPane, primaryStage);
        // Set the scene in AmpStart
        Scene PiedritasMapScene = new Scene(piedritasMapGridPane, 800, 500);
        // Display stage
        primaryStage.setScene(PiedritasMapScene);
        primaryStage.show();



    }
    public static void main(String[] args) { launch(args); }

    public static GridPane createPiedritasMapGridPane() {
        // Set new Grid Pane for LoginPage
        GridPane piedritasMapGridPane = new GridPane();
        piedritasMapGridPane.setAlignment(Pos.CENTER);
        piedritasMapGridPane.setHgap(10);
        piedritasMapGridPane.setVgap(10);
        piedritasMapGridPane.setPadding(new Insets(25,25,25,25));
//        loginGridPane.setPadding(new Insets(40, 40, 40, 40));
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return loginGridPane
        piedritasMapGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return piedritasMapGridPane;
    }



    public static void addUIControlsPiedritasMap(GridPane piedritasMapGridPane, Stage primaryStage) {

    }



}

