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

public class LobitosMap_Recylcing extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("SMART MAP - Lobitos Map");
        // Create the AmpStart Page grid pane
        GridPane lobitosRecycleGridPane = createLobitosRecycleGridPane();
        lobitosRecycleGridPane.setMaxSize( 800, 550);
        lobitosRecycleGridPane.setBackground(new Background(LobitosMap.createImage("LobitosMap.png")));
        // Add UI controls to the AmpStart form grid pane
        addUIControlsLobitosRecycle(lobitosRecycleGridPane, primaryStage);
        // Set the scene in AmpStart
        Scene LobitosRecycleScene = new Scene(lobitosRecycleGridPane, 800, 550);
        // Display stage
        primaryStage.setScene(LobitosRecycleScene);
        primaryStage.show();
    }



    public static void main(String[] args) { launch(args); }

    public static GridPane createLobitosRecycleGridPane() {
        // Set new Grid Pane for LoginPage
        GridPane lobitosRecycleGridPane = new GridPane();
        lobitosRecycleGridPane.setAlignment(Pos.CENTER);
        lobitosRecycleGridPane.setPadding(new Insets(0, 0, 0, 0));
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return loginGridPane
        lobitosRecycleGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return lobitosRecycleGridPane;
    }



    public static void addUIControlsLobitosRecycle(GridPane lobitosRecycleGridPane, Stage primaryStage) {

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
        lobitosRecycleGridPane.add(wcButton, 0, 0);
        lobitosRecycleGridPane.setMargin(wcButton, new Insets(20, 35,0,-35));

        // Add Toilets Label
        Label toiletsLabel = new Label("Public toilets");
        toiletsLabel.setFont(Font.font("Arial", 14));
        lobitosRecycleGridPane.add(toiletsLabel, 1,0);
        lobitosRecycleGridPane.setMargin(toiletsLabel, new Insets(20, 35,0,-30));


        // Add Recycling Button
        Button recyclingButton = new Button();
        recyclingButton.setBackground(RecyclingImage);
        recyclingButton.setScaleX(0.8);
        recyclingButton.setScaleY(0.8);
        recyclingButton.setPrefSize(25,25);
        recyclingButton.setDefaultButton(true);
        lobitosRecycleGridPane.add(recyclingButton, 0, 1);
        lobitosRecycleGridPane.setMargin(recyclingButton, new Insets(0, 35,0,-35));

        // Add Recycling Label
        Label recyclingLabel = new Label("Recycling Points");
        recyclingLabel.setFont(Font.font("Arial", 14));
        lobitosRecycleGridPane.add(recyclingLabel, 1,1);
        lobitosRecycleGridPane.setMargin(recyclingLabel, new Insets(0, 35,0,-30));


        // Add Waste Bins Button
        Button wasteBinsButton = new Button();
        wasteBinsButton.setBackground(BinImage);
        wasteBinsButton.setScaleX(0.8);
        wasteBinsButton.setScaleY(0.8);
        wasteBinsButton.setPrefSize(25,25);
        wasteBinsButton.setDefaultButton(true);
        lobitosRecycleGridPane.add(wasteBinsButton, 0, 2);
        lobitosRecycleGridPane.setMargin(wasteBinsButton, new Insets(0, 35,300,-35));

        // Add Waste Bins Label
        Label wasteBinsLabel = new Label("Waste bins");
        wasteBinsLabel.setFont(Font.font("Arial", 14));
        lobitosRecycleGridPane.add(wasteBinsLabel, 1,2);
        lobitosRecycleGridPane.setMargin(wasteBinsLabel, new Insets(0, 35,300,-30));


        // Add Back Button
        Button backButton = new Button("Back");
        backButton.setFont(Font.font("Arial", 12));
        backButton.setPrefSize(70,20);
        backButton.setDefaultButton(true);
        lobitosRecycleGridPane.add(backButton, 0, 10, 1, 1);
        lobitosRecycleGridPane.setHalignment(backButton, HPos.LEFT);
        lobitosRecycleGridPane.setMargin(backButton, new Insets(0, -5,-95,5));


        // Add Report Issue Button
        Button reportIssueButton = new Button("Report Issue");
        reportIssueButton.setFont(Font.font("Arial", 12));
        reportIssueButton.setPrefSize(100,20);
        reportIssueButton.setDefaultButton(true);
        lobitosRecycleGridPane.add(reportIssueButton, 1, 10, 1, 1);
        lobitosRecycleGridPane.setHalignment(reportIssueButton, HPos.RIGHT);
        lobitosRecycleGridPane.setMargin(reportIssueButton, new Insets(0, -20,-95, 20));


        //////////////////////////////////////////////////

        // Add Recycle Buttons
        Button wcButton1 = new Button();
        wcButton1.setBackground(RecyclingImage);
        wcButton1.setScaleX(0.4);
        wcButton1.setScaleY(0.4);
        wcButton1.setPrefSize(25,25);
        wcButton1.setDefaultButton(true);
        lobitosRecycleGridPane.add(wcButton1, 0, 4);
        lobitosRecycleGridPane.setMargin(wcButton1, new Insets(-65, -245,65,245));

        Button wcButton2 = new Button();
        wcButton2.setBackground(RecyclingImage);
        wcButton2.setScaleX(0.4);
        wcButton2.setScaleY(0.4);
        wcButton2.setPrefSize(25,25);
        wcButton2.setDefaultButton(true);
        lobitosRecycleGridPane.add(wcButton2, 1, 4);
        lobitosRecycleGridPane.setMargin(wcButton2, new Insets(-52, -350,52,350));

        Button wcButton3 = new Button();
        wcButton3.setBackground(RecyclingImage);
        wcButton3.setScaleX(0.4);
        wcButton3.setScaleY(0.4);
        wcButton3.setPrefSize(25,25);
        wcButton3.setDefaultButton(true);
        lobitosRecycleGridPane.add(wcButton3, 2, 4);
        lobitosRecycleGridPane.setMargin(wcButton3, new Insets(25, 90,-25,-90));


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
            GridPane lobitosMapGridPane = LobitosMap.createLobitosMapGridPane();
            lobitosMapGridPane.setMaxSize( 800, 550);
            lobitosMapGridPane.setBackground(new Background(LobitosMap.createImage("LobitosMap.png")));
            LobitosMap.addUIControlsLobitosMap(lobitosMapGridPane, primaryStage);
            Scene LobitosMapScene = new Scene(lobitosMapGridPane, 800, 550);
            primaryStage.setScene(LobitosMapScene);
            primaryStage.show();
        });

        wasteBinsButton.setOnAction(event -> {
            primaryStage.setTitle("SMART MAP - Lobitos Map");
            GridPane lobitosWasteBinsGridPane = LobitosMap_WasteBins.createLobitosWasteBinsGridPane();
            lobitosWasteBinsGridPane.setMaxSize( 800, 550);
            lobitosWasteBinsGridPane.setBackground(new Background( LobitosMap.createImage("LobitosMap.png")));
            LobitosMap_WasteBins.addUIControlsLobitosWasteBins(lobitosWasteBinsGridPane, primaryStage);
            Scene LobitosWasteBinsScene = new Scene(lobitosWasteBinsGridPane, 800, 550);
            primaryStage.setScene(LobitosWasteBinsScene);
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

        reportIssueButton.setOnAction(event -> {
            primaryStage.setTitle("SMART MAP - Report Issue");
            GridPane reportPaneGridPane = Report.createReportGridPane();
            reportPaneGridPane.setStyle("-fx-background-color: #4aa4ef");
            Report.addUIControlsReport(reportPaneGridPane, primaryStage);
            Scene reportScene = new Scene(reportPaneGridPane, 800, 500);
            primaryStage.setScene(reportScene);
            primaryStage.show();
        });

    }


}

