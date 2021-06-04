package sample;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/*import javax.swing.text.html.ImageView;
import java.awt.*;*/

public class LobitosMap extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("SMART MAP - Lobitos Map");

//        //add background image
//        Image image=new Image("file: a.jpg");
//        ImageView mv=new ImageView(image);

        // Create the AmpStart Page grid pane
        GridPane lobitosMapGridPane = createLobitosMapGridPane();
//        lobitosMapGridPane.setStyle("-fx-background-color: #4aa4ef");
        lobitosMapGridPane.setBackground(new Background( createImage("LobitosMap.png")));
//        lobitosMapGridPane.setStyle("-fx-background-image: " + "url(LobitosMap.png)\n" + "-fx-background-position: center center;");

        // Add UI controls to the AmpStart form grid pane
        addUIControlsLobitosMap(lobitosMapGridPane, primaryStage);
        // Set the scene in AmpStart
        Scene LobitosMapScene = new Scene(lobitosMapGridPane, 800, 500);
        // Display stage
        primaryStage.setScene(LobitosMapScene);
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }

    private static BackgroundImage createImage(String url) {
        return new BackgroundImage(
                new Image(url),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,
                new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true),
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true));
    }

    public static GridPane createLobitosMapGridPane() {
        // Set new Grid Pane for LoginPage
        GridPane lobitosMapGridPane = new GridPane();
        lobitosMapGridPane.setAlignment(Pos.CENTER);
        lobitosMapGridPane.setHgap(10);
        lobitosMapGridPane.setVgap(10);
        lobitosMapGridPane.setPadding(new Insets(25,25,25,25));
//        loginGridPane.setPadding(new Insets(40, 40, 40, 40));
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return loginGridPane
        lobitosMapGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return lobitosMapGridPane;
    }



    public static void addUIControlsLobitosMap(GridPane lobitosMapGridPane, Stage primaryStage) {
    }


}

