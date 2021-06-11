package sample;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public abstract class LobitosMap_Spanish extends Application {

    // Start function for quick display
    /*@Override
    public void start(Stage primaryStage) {
        // Set stage title
        primaryStage.setTitle("SMART MAP - Mapa de Lobitos");
        // Create the Spanish LobitosMap Page grid pane
        GridPane lobitosMapGridPane = createLobitosMapGridPane();
        lobitosMapGridPane.setMaxSize( 800, 550);
        // Set background Image
        lobitosMapGridPane.setBackground(new Background( HomePage.createImage("LobitosMap.png")));
        // Add UI controls to the Spanish LobitosMap form grid pane
        addUIControlsLobitosMap(lobitosMapGridPane, primaryStage);
        // Set the scene in Spanish LobitosMap
        Scene LobitosMapScene = new Scene(lobitosMapGridPane, 800, 550);
        // Display stage
        primaryStage.setScene(LobitosMapScene);
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }*/


    // Create Grid Pane for Spanish LobitosMap
    public static GridPane createLobitosMapGridPane() {
        // Set new Grid Pane for Spanish LobitosMap
        GridPane lobitosMapGridPane = new GridPane();
        lobitosMapGridPane.setAlignment(Pos.CENTER);
        lobitosMapGridPane.setPadding(new Insets(0, 0, 0, 0));
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return Spanish LobitosMap
        lobitosMapGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return lobitosMapGridPane;
    }


    // Create UI controls for Spanish LobitosMap Grid Pane
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
        Label toiletsLabel = new Label("Baños Públicos");
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
        Label recyclingLabel = new Label("Puntos de Reciclaje");
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
        Label wasteBinsLabel = new Label("Cubos de Basura");
        wasteBinsLabel.setFont(Font.font("Arial", 14));
        lobitosMapGridPane.add(wasteBinsLabel, 1,2);
        GridPane.setMargin(wasteBinsLabel, new Insets(0, 35,305,-30));

        // Add Back Button
        Button backButton = new Button("Atras");
        backButton.setFont(Font.font("Arial", 12));
        backButton.setPrefSize(70,20);
        backButton.setDefaultButton(true);
        lobitosMapGridPane.add(backButton, 0, 10, 1, 1);
        GridPane.setHalignment(backButton, HPos.LEFT);
        GridPane.setMargin(backButton, new Insets(0, -5,-135,5));

        // Add Report Issue Button
        Button reportIssueButton = new Button("Reportar Problema");
        reportIssueButton.setFont(Font.font("Arial", 12));
        reportIssueButton.setPrefSize(100,20);
        reportIssueButton.setDefaultButton(true);
        lobitosMapGridPane.add(reportIssueButton, 1, 10, 1, 1);
        GridPane.setHalignment(reportIssueButton, HPos.RIGHT);
        GridPane.setMargin(reportIssueButton, new Insets(0, 5,-135, -5));


        // Set action for pressed buttons
        wcButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Mapa de Lobitos");
            // Create the Spanish LobitosMap_WC Page grid pane
            GridPane lobitosWCGridPane = LobitosMap_WC_Spanish.createLobitosWCGridPane();
            lobitosWCGridPane.setMaxSize( 800, 550);
            // Set background Image
            lobitosWCGridPane.setBackground(new Background(HomePage.createImage("LobitosMap.png")));
            // Add UI controls to the Spanish LobitosMap_WC form grid pane
            LobitosMap_WC_Spanish.addUIControlsLobitosWC(lobitosWCGridPane, primaryStage);
            // Set the scene in Spanish LobitosMap_WC
            Scene LobitosWCScene = new Scene(lobitosWCGridPane, 800, 550);
            // Display Spanish LobitosMap_WC stage
            primaryStage.setScene(LobitosWCScene);
            primaryStage.show();
        });

        recyclingButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Mapa de Lobitos");
            // Create the Spanish LobitosMap_Recylcing Page grid pane
            GridPane lobitosRecycleGridPane = LobitosMap_Recylcing_Spanish.createLobitosRecycleGridPane();
            lobitosRecycleGridPane.setMaxSize( 800, 550);
            // Set background Image
            lobitosRecycleGridPane.setBackground(new Background(HomePage.createImage("LobitosMap.png")));
            // Add UI controls to the Spanish LobitosMap_Recylcing form grid pane
            LobitosMap_Recylcing_Spanish.addUIControlsLobitosRecycle(lobitosRecycleGridPane, primaryStage);
            // Set the scene in Spanish LobitosMap_Recylcing
            Scene LobitosRecycleScene = new Scene(lobitosRecycleGridPane, 800, 550);
            // Display Spanish LobitosMap_Recylcing stage
            primaryStage.setScene(LobitosRecycleScene);
            primaryStage.show();
        });

        wasteBinsButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Mapa de Lobitos");
            // Create the Spanish LobitosMap_WasteBins Page grid pane
            GridPane lobitosWasteBinsGridPane = LobitosMap_WasteBins_Spanish.createLobitosWasteBinsGridPane();
            lobitosWasteBinsGridPane.setMaxSize( 800, 550);
            // Set background Image
            lobitosWasteBinsGridPane.setBackground(new Background(HomePage.createImage("LobitosMap.png")));
            // Add UI controls to the Spanish LobitosMap_WasteBins form grid pane
            LobitosMap_WasteBins_Spanish.addUIControlsLobitosWasteBins(lobitosWasteBinsGridPane, primaryStage);
            // Set the scene in Spanish LobitosMap_WasteBins
            Scene LobitosWastBinsScene = new Scene(lobitosWasteBinsGridPane, 800, 550);
            // Display Spanish LobitosMap_WasteBins stage
            primaryStage.setScene(LobitosWastBinsScene);
            primaryStage.show();
        });

        backButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Página Principal");
            // Create the HomePage Page grid pane
            GridPane homePageGridPaneSpanish = HomePage_Spanish.createhomePageGridPaneSpanish();
            // Set background colour
            homePageGridPaneSpanish.setStyle("-fx-background-color: #4aa4ef");
            // Add UI controls to the HomePage form grid pane
            HomePage_Spanish.addUIControlsHomePageSpanish(homePageGridPaneSpanish, primaryStage);
            // Set the scene in HomePage
            Scene homePageGridPaneSpanishScene = new Scene(homePageGridPaneSpanish, 800, 500);
            primaryStage.setScene(homePageGridPaneSpanishScene);
            primaryStage.show();
        });

        reportIssueButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Formulario de Problema");
            // Create the Spanish Report Page grid pane
            GridPane reportPaneGridPane = Report_Spanish.createReportGridPane();
            // Set background colour
            reportPaneGridPane.setStyle("-fx-background-color: #4aa4ef");
            // Add UI controls to the Spanish Report form grid pane
            Report_Spanish.addUIControlsReport(reportPaneGridPane, primaryStage);
            // Set the scene in Spanish Report
            Scene reportScene = new Scene(reportPaneGridPane, 800, 500);
            // Display Spanish Report stage
            primaryStage.setScene(reportScene);
            primaryStage.show();
        });

    }

}


