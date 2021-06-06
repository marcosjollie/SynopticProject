package sample;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LobitosMap_WasteBins extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("SMART MAP - Lobitos Map");
        // Create the AmpStart Page grid pane
        GridPane lobitosWasteBinsGridPane = createLobitosWasteBinsGridPane();
        lobitosWasteBinsGridPane.setMaxSize( 800, 550);
        lobitosWasteBinsGridPane.setBackground(new Background( LobitosMap.createImage("LobitosMap.png")));
        // Add UI controls to the AmpStart form grid pane
        addUIControlsLobitosWasteBins(lobitosWasteBinsGridPane, primaryStage);
        // Set the scene in AmpStart
        Scene LobitosWastBinsScene = new Scene(lobitosWasteBinsGridPane, 800, 550);
        // Display stage
        primaryStage.setScene(LobitosWastBinsScene);
        primaryStage.show();
    }



    public static void main(String[] args) { launch(args); }



    public static GridPane createLobitosWasteBinsGridPane() {
        // Set new Grid Pane for LoginPage
        GridPane lobitosWastBinsGridPane = new GridPane();
        lobitosWastBinsGridPane.setAlignment(Pos.CENTER);
        lobitosWastBinsGridPane.setPadding(new Insets(0, 0, 0, 0));
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return loginGridPane
        lobitosWastBinsGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return lobitosWastBinsGridPane;
    }



    public static void addUIControlsLobitosWasteBins(GridPane lobitosWasteBinsGridPane, Stage primaryStage) {

        Background WCImage = new Background(LobitosMap.createImage("WC.png"));
        Background RecyclingImage = new Background(LobitosMap.createImage("Recycling.png"));
        Background BinImage = new Background(LobitosMap.createImage("Bin.png"));

        // Add WC Button
        Button wcButton = new Button();
        wcButton.setBackground(WCImage);
        wcButton.setScaleX(0.8);
        wcButton.setScaleY(0.8);
        wcButton.setPrefSize(25,25);
        wcButton.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton, 0, 0);
        lobitosWasteBinsGridPane.setMargin(wcButton, new Insets(20, 35,0,-35));

        // Add Toilets Label
        Label toiletsLabel = new Label("Public toilets");
        toiletsLabel.setFont(Font.font("Arial", 14));
        lobitosWasteBinsGridPane.add(toiletsLabel, 1,0);
        lobitosWasteBinsGridPane.setMargin(toiletsLabel, new Insets(20, 35,0,-30));


        // Add Recycling Button
        Button recyclingButton = new Button();
        recyclingButton.setBackground(RecyclingImage);
        recyclingButton.setScaleX(0.8);
        recyclingButton.setScaleY(0.8);
        recyclingButton.setPrefSize(25,25);
        recyclingButton.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(recyclingButton, 0, 1);
        lobitosWasteBinsGridPane.setMargin(recyclingButton, new Insets(0, 35,0,-35));

        // Add Recycling Label
        Label recyclingLabel = new Label("Recycling Points");
        recyclingLabel.setFont(Font.font("Arial", 14));
        lobitosWasteBinsGridPane.add(recyclingLabel, 1,1);
        lobitosWasteBinsGridPane.setMargin(recyclingLabel, new Insets(0, 35,0,-30));


        // Add Waste Bins Button
        Button wasteBinsButton = new Button();
        wasteBinsButton.setBackground(BinImage);
        wasteBinsButton.setScaleX(0.8);
        wasteBinsButton.setScaleY(0.8);
        wasteBinsButton.setPrefSize(25,25);
        wasteBinsButton.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton, 0, 2);
        lobitosWasteBinsGridPane.setMargin(wasteBinsButton, new Insets(0, 35,300,-35));

        // Add Waste Bins Label
        Label wasteBinsLabel = new Label("Waste bins");
        wasteBinsLabel.setFont(Font.font("Arial", 14));
        lobitosWasteBinsGridPane.add(wasteBinsLabel, 1,2);
        lobitosWasteBinsGridPane.setMargin(wasteBinsLabel, new Insets(0, 35,300,-30));


        // Add Back Button
        Button backButton = new Button("Back");
        backButton.setFont(Font.font("Arial", 12));
        backButton.setPrefSize(70,20);
        backButton.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(backButton, 0, 10, 1, 1);
        lobitosWasteBinsGridPane.setHalignment(backButton, HPos.LEFT);
        lobitosWasteBinsGridPane.setMargin(backButton, new Insets(0, -5,-95,5));


        //////////////////////////////////////////////////

        // Add WC Button
        Button wcButton1 = new Button();
        wcButton1.setBackground(WCImage);
        wcButton1.setScaleX(0.4);
        wcButton1.setScaleY(0.4);
        wcButton1.setPrefSize(25,25);
        wcButton1.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton1, 0, 4);
        lobitosWasteBinsGridPane.setMargin(wcButton1, new Insets(-115, -100,115,100));

        Button wcButton2 = new Button();
        wcButton2.setBackground(WCImage);
        wcButton2.setScaleX(0.4);
        wcButton2.setScaleY(0.4);
        wcButton2.setPrefSize(25,25);
        wcButton2.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton2, 1, 4);
        lobitosWasteBinsGridPane.setMargin(wcButton2, new Insets(-20, -160,20,160));

        Button wcButton3 = new Button();
        wcButton3.setBackground(WCImage);
        wcButton3.setScaleX(0.4);
        wcButton3.setScaleY(0.4);
        wcButton3.setPrefSize(25,25);
        wcButton3.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton3, 2, 4);
        lobitosWasteBinsGridPane.setMargin(wcButton3, new Insets(5, 400,-5,-400));

        Button wcButton4 = new Button();
        wcButton4.setBackground(WCImage);
        wcButton4.setScaleX(0.4);
        wcButton4.setScaleY(0.4);
        wcButton4.setPrefSize(25,25);
        wcButton4.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton4, 3, 4);
        lobitosWasteBinsGridPane.setMargin(wcButton4, new Insets(-45, 410,45,-410));

        Button wcButton5 = new Button();
        wcButton5.setBackground(WCImage);
        wcButton5.setScaleX(0.4);
        wcButton5.setScaleY(0.4);
        wcButton5.setPrefSize(25,25);
        wcButton5.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton5, 4, 4);
        lobitosWasteBinsGridPane.setMargin(wcButton5, new Insets(-115, 350,115,-350));

        Button wcButton6 = new Button();
        wcButton6.setBackground(WCImage);
        wcButton6.setScaleX(0.4);
        wcButton6.setScaleY(0.4);
        wcButton6.setPrefSize(25,25);
        wcButton6.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton6, 5, 4);
        lobitosWasteBinsGridPane.setMargin(wcButton6, new Insets(-190, 310,190,-310));


        Button wcButton7 = new Button();
        wcButton7.setBackground(WCImage);
        wcButton7.setScaleX(0.4);
        wcButton7.setScaleY(0.4);
        wcButton7.setPrefSize(25,25);
        wcButton7.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton7, 5, 4);
        lobitosWasteBinsGridPane.setMargin(wcButton7, new Insets(-20, 285,20,-285));



        //////////////////////////////////////////////////

        wcButton.setOnAction(event -> {
            primaryStage.setTitle("SMART MAP - Lobitos Map");
            GridPane lobitosWCGridPane = LobitosMap_WC.createLobitosWCGridPane();
            lobitosWCGridPane.setMaxSize( 800, 550);
            lobitosWCGridPane.setBackground(new Background(LobitosMap.createImage("LobitosMap.png")));
            LobitosMap_WC.addUIControlsLobitosWC(lobitosWCGridPane, primaryStage);
            Scene LobitosWCScene = new Scene(lobitosWCGridPane, 800, 550);
            primaryStage.setScene(LobitosWCScene);
            primaryStage.show();
        });

        recyclingButton.setOnAction(event -> {
            primaryStage.setTitle("SMART MAP - Lobitos Map");
            // Create the AmpStart Page grid pane
            GridPane lobitosRecycleGridPane = LobitosMap_Recylcing.createLobitosRecycleGridPane();
            lobitosRecycleGridPane.setMaxSize( 800, 550);
            lobitosRecycleGridPane.setBackground(new Background( LobitosMap.createImage("LobitosMap.png")));
            // Add UI controls to the AmpStart form grid pane
            LobitosMap_Recylcing.addUIControlsLobitosRecycle(lobitosRecycleGridPane, primaryStage);
            // Set the scene in AmpStart
            Scene LobitosRecycleScene = new Scene(lobitosRecycleGridPane, 800, 550);
            // Display stage
            primaryStage.setScene(LobitosRecycleScene);
            primaryStage.show();
        });

        wasteBinsButton.setOnAction(event -> {
            primaryStage.setTitle("SMART MAP - Lobitos Map");
            GridPane lobitosMapGridPane = LobitosMap.createLobitosMapGridPane();
            lobitosMapGridPane.setMaxSize( 800, 550);
            lobitosMapGridPane.setBackground(new Background(LobitosMap.createImage("LobitosMap.png")));
            LobitosMap.addUIControlsLobitosMap(lobitosMapGridPane, primaryStage);
            Scene LobitosMapScene = new Scene(lobitosMapGridPane, 800, 550);
            primaryStage.setScene(LobitosMapScene);
            primaryStage.show();
        });

        backButton.setOnAction(event -> {
            primaryStage.setTitle("SMART MAP - Lobitos Map");
            GridPane lobitosMapGridPane = LobitosMap.createLobitosMapGridPane();
            lobitosMapGridPane.setMaxSize( 800, 550);
            lobitosMapGridPane.setBackground(new Background(LobitosMap.createImage("LobitosMap.png")));
            LobitosMap.addUIControlsLobitosMap(lobitosMapGridPane, primaryStage);
            Scene LobitosMapScene = new Scene(lobitosMapGridPane, 800, 550);
            primaryStage.setScene(LobitosMapScene);
            primaryStage.show();
        });

    }


}


