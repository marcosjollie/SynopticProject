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
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class LobitosMap extends Application {

    // Start function for quick display
    @Override
    public void start(Stage primaryStage) {
        // Set stage title
        primaryStage.setTitle("SMART MAP - Lobitos Map");
        // Create the LobitosMap Page grid pane
        GridPane lobitosMapGridPane = createLobitosMapGridPane();
        lobitosMapGridPane.setMaxSize( 800, 550);
        // Set background Image
        lobitosMapGridPane.setBackground(new Background( HomePage.createImage("LobitosMap.png")));
        // Add UI controls to the LobitosMap form grid pane
        addUIControlsLobitosMap(lobitosMapGridPane, primaryStage);
        // Set the scene in LobitosMap
        Scene LobitosMapScene = new Scene(lobitosMapGridPane, 800, 550);
        // Display stage
        primaryStage.setScene(LobitosMapScene);
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }





    // Create Grid Pane for LobitosMap
    public static GridPane createLobitosMapGridPane() {
        // Set new Grid Pane for LobitosMap
        GridPane lobitosMapGridPane = new GridPane();
        lobitosMapGridPane.setAlignment(Pos.CENTER);
        lobitosMapGridPane.setPadding(new Insets(0, 0, 0, 0));
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return LobitosMap
        lobitosMapGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return lobitosMapGridPane;
    }


    // Create UI controls for LobitosMap Grid Pane
    public static void addUIControlsLobitosMap(GridPane lobitosMapGridPane, Stage primaryStage) {

        // Add WC Button
        Button wcButton = new Button();
        wcButton.setBackground(HomePage.WCImage);
        wcButton.setScaleX(0.8);
        wcButton.setScaleY(0.8);
        wcButton.setPrefSize(25,25);
        wcButton.setDefaultButton(true);
        lobitosMapGridPane.add(wcButton, 0, 0);
        GridPane.setMargin(wcButton, new Insets(0, 35,0,-35));
        // Add Toilets Label
        Label toiletsLabel = new Label("Public toilets");
        toiletsLabel.setFont(Font.font("Arial", 14));
        lobitosMapGridPane.add(toiletsLabel, 1,0);
        GridPane.setMargin(toiletsLabel, new Insets(0, 35,0,-30));

        // Add Recycling Button
        Button recyclingButton = new Button();
        recyclingButton.setScaleX(0.8);
        recyclingButton.setScaleY(0.8);
        recyclingButton.setBackground(HomePage.RecyclingImage);
        recyclingButton.setPrefSize(25,25);
        recyclingButton.setDefaultButton(true);
        lobitosMapGridPane.add(recyclingButton, 0, 1);
        GridPane.setMargin(recyclingButton, new Insets(0, 35,0,-35));
        // Add Recycling Label
        Label recyclingLabel = new Label("Recycling Points");
        recyclingLabel.setFont(Font.font("Arial", 14));
        lobitosMapGridPane.add(recyclingLabel, 1,1);
        GridPane.setMargin(recyclingLabel, new Insets(0, 35,0,-30));

        // Add Waste Bins Button
        Button wasteBinsButton = new Button();
        wasteBinsButton.setScaleX(0.8);
        wasteBinsButton.setScaleY(0.8);
        wasteBinsButton.setBackground(HomePage.BinImage);
        wasteBinsButton.setPrefSize(25,25);
        wasteBinsButton.setDefaultButton(true);
        lobitosMapGridPane.add(wasteBinsButton, 0, 2);
        GridPane.setMargin(wasteBinsButton, new Insets(0, 35,305,-35));
        // Add Waste Bins Label
        Label wasteBinsLabel = new Label("Waste bins");
        wasteBinsLabel.setFont(Font.font("Arial", 14));
        lobitosMapGridPane.add(wasteBinsLabel, 1,2);
        GridPane.setMargin(wasteBinsLabel, new Insets(0, 35,305,-30));


        // Add Back Button
        Button backButton = new Button("Back");
        backButton.setFont(Font.font("Arial", 12));
        backButton.setPrefSize(70,20);
        backButton.setDefaultButton(true);
        lobitosMapGridPane.add(backButton, 0, 10, 1, 1);
        GridPane.setHalignment(backButton, HPos.LEFT);
        GridPane.setMargin(backButton, new Insets(0, -5,-135,5));

        // Add Report Issue Button
        Button reportIssueButton = new Button("Report Issue");
        reportIssueButton.setFont(Font.font("Arial", 12));
        reportIssueButton.setPrefSize(100,20);
        reportIssueButton.setDefaultButton(true);
        lobitosMapGridPane.add(reportIssueButton, 1, 10, 1, 1);
        GridPane.setHalignment(reportIssueButton, HPos.RIGHT);
        GridPane.setMargin(reportIssueButton, new Insets(0, 5,-135, -5));


        // Set action for pressed buttons
        wcButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Lobitos Map");
            // Create the LobitosMap_WC Page grid pane
            GridPane lobitosWCGridPane = LobitosMap_WC.createLobitosWCGridPane();
            lobitosWCGridPane.setMaxSize( 800, 550);
            // Set background Image
            lobitosWCGridPane.setBackground(new Background(HomePage.createImage("LobitosMap.png")));
            // Add UI controls to the LobitosMap_WC form grid pane
            LobitosMap_WC.addUIControlsLobitosWC(lobitosWCGridPane, primaryStage);
            // Set the scene in LobitosMap_WC
            Scene LobitosWCScene = new Scene(lobitosWCGridPane, 800, 550);
            // Display LobitosMap_WC stage
            primaryStage.setScene(LobitosWCScene);
            primaryStage.show();
        });

        recyclingButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Lobitos Map");
            // Create the LobitosMap_Recylcing Page grid pane
            GridPane lobitosRecycleGridPane = LobitosMap_Recylcing.createLobitosRecycleGridPane();
            lobitosRecycleGridPane.setMaxSize( 800, 550);
            // Set background Image
            lobitosRecycleGridPane.setBackground(new Background(HomePage.createImage("LobitosMap.png")));
            // Add UI controls to the LobitosMap_Recylcing form grid pane
            LobitosMap_Recylcing.addUIControlsLobitosRecycle(lobitosRecycleGridPane, primaryStage);
            // Set the scene in LobitosMap_Recylcing
            Scene LobitosRecycleScene = new Scene(lobitosRecycleGridPane, 800, 550);
            // Display stage
            primaryStage.setScene(LobitosRecycleScene);
            primaryStage.show();
        });

        wasteBinsButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Lobitos Map");
            // Create the LobitosMap_WasteBins Page grid pane
            GridPane lobitosWasteBinsGridPane = LobitosMap_WasteBins.createLobitosWasteBinsGridPane();
            lobitosWasteBinsGridPane.setMaxSize( 800, 550);
            // Set background Image
            lobitosWasteBinsGridPane.setBackground(new Background( HomePage.createImage("LobitosMap.png")));
            // Add UI controls to the LobitosMap_WasteBins form grid pane
            LobitosMap_WasteBins.addUIControlsLobitosWasteBins(lobitosWasteBinsGridPane, primaryStage);
            // Set the scene in LobitosMap_WasteBins
            Scene LobitosWastBinsScene = new Scene(lobitosWasteBinsGridPane, 800, 550);
            // Display LobitosMap_WasteBins stage
            primaryStage.setScene(LobitosWastBinsScene);
            primaryStage.show();
        });

        backButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Home Page");
            // Create the HomePage Page grid pane
            GridPane homePageGridPane = HomePage.createHomePageGridPane();
            // Set background colour
            homePageGridPane.setStyle("-fx-background-color: #4aa4ef");
            // Add UI controls to the HomePage form grid pane
            HomePage.addUIControlsHomePage(homePageGridPane, primaryStage);
            // Set the scene in HomePage
            Scene HomePageScene = new Scene(homePageGridPane, 800, 500);
            // Display HomePage stage
            primaryStage.setScene(HomePageScene);
            primaryStage.show();
        });

        reportIssueButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Report Issue");
            // Create the Report Page grid pane
            GridPane reportPaneGridPane = Report.createReportGridPane();
            // Set background colour
            reportPaneGridPane.setStyle("-fx-background-color: #4aa4ef");
            // Add UI controls to the Report form grid pane
            Report.addUIControlsReport(reportPaneGridPane, primaryStage);
            // Set the scene in Report
            Scene reportScene = new Scene(reportPaneGridPane, 800, 500);
            // Display Report stage
            primaryStage.setScene(reportScene);
            primaryStage.show();
        });

    }


}

