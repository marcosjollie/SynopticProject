package sample;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public abstract class PiedritasMap_WC_Spanish /*extends Application */{

    // Start function for quick display
    /*@Override
    public void start(Stage primaryStage) {
        // Set stage title
        primaryStage.setTitle("SMART MAP - Mapa dePiedritas");
        // Create the Spanish PiedritasMap_WC Page grid pane
        GridPane piedritasWCGridPane = createPiedritasWCGridPane();
        piedritasWCGridPane.setMaxSize( 950, 550);
        // Set background Image
        piedritasWCGridPane.setBackground(new Background(HomePage.createImage("PiedritasMap.png")));
        // Add UI controls to the Spanish PiedritasMap_WC form grid pane
        addUIControlsPiedritasWCGridPane(piedritasWCGridPane, primaryStage);
        // Set the scene in Spanish PiedritasMap_WC
        Scene PiedritasWCScene = new Scene(piedritasWCGridPane, 950, 550);
        // Display Spanish PiedritasMap_WC stage
        primaryStage.setScene(PiedritasWCScene);
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }*/


    // Create Grid Pane for Spanish PiedritasWC
    public static GridPane createPiedritasWCGridPane() {
        // Set new Grid Pane for Spanish PiedritasWC
        GridPane piedritasWCGridPane = new GridPane();
        piedritasWCGridPane.setAlignment(Pos.CENTER);
        piedritasWCGridPane.setPadding(new Insets(25,25,25,25));
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return Spanish PiedritasWC GridPane
        piedritasWCGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return piedritasWCGridPane;
    }


    // Create UI controls for Spanish PiedritasWC Grid Pane
    public static void addUIControlsPiedritasWCGridPane(GridPane piedritasWCGridPane, Stage primaryStage) {
        // Add WC Button
        Button wcButton = new Button();
        wcButton.setBackground(HomePage.WCImage);
        wcButton.setScaleX(0.8);
        wcButton.setScaleY(0.8);
        wcButton.setPrefSize(25,25);
        wcButton.setDefaultButton(true);
        piedritasWCGridPane.add(wcButton, 0, 0);
        GridPane.setMargin(wcButton, new Insets(0, 60,0,-60));
        // Add Toilets Label
        Label toiletsLabel = new Label("Ba??os P??blicos");
        toiletsLabel.setFont(Font.font("Arial", 14));
        piedritasWCGridPane.add(toiletsLabel, 1,0);
        GridPane.setMargin(toiletsLabel, new Insets(0, 60,0,-55));

        // Add Recycling Button
        Button recyclingButton = new Button();
        recyclingButton.setScaleX(0.8);
        recyclingButton.setScaleY(0.8);
        recyclingButton.setBackground(HomePage.RecyclingImage);
        recyclingButton.setPrefSize(25,25);
        recyclingButton.setDefaultButton(true);
        piedritasWCGridPane.add(recyclingButton, 0, 1);
        GridPane.setMargin(recyclingButton, new Insets(0, 60,0,-60));
        // Add Recycling Label
        Label recyclingLabel = new Label("Puntos de Reciclaje");
        recyclingLabel.setFont(Font.font("Arial", 14));
        piedritasWCGridPane.add(recyclingLabel, 1,1);
        GridPane.setMargin(recyclingLabel, new Insets(0, 60,0,-55));

        // Add Waste Bins Button
        Button wasteBinsButton = new Button();
        wasteBinsButton.setScaleX(0.8);
        wasteBinsButton.setScaleY(0.8);
        wasteBinsButton.setBackground(HomePage.BinImage);
        wasteBinsButton.setPrefSize(25,25);
        wasteBinsButton.setDefaultButton(true);
        piedritasWCGridPane.add(wasteBinsButton, 0, 2);
        GridPane.setMargin(wasteBinsButton, new Insets(0, 60,280,-60));
        // Add Waste Bins Label
        Label wasteBinsLabel = new Label("Cubos de Basura");
        wasteBinsLabel.setFont(Font.font("Arial", 14));
        piedritasWCGridPane.add(wasteBinsLabel, 1,2);
        GridPane.setMargin(wasteBinsLabel, new Insets(0, 60,280,-55));

        // Add Back Button
        Button backButton = new Button("Atras");
        backButton.setFont(Font.font("Arial", 12));
        backButton.setPrefSize(70,20);
        backButton.setDefaultButton(true);
        piedritasWCGridPane.add(backButton, 0, 10, 1, 1);
        GridPane.setHalignment(backButton, HPos.LEFT);
        GridPane.setMargin(backButton, new Insets(0, 20,-135,-20));

        // Add Report Issue Button
        Button reportIssueButton = new Button("Reportar Problema");
        reportIssueButton.setFont(Font.font("Arial", 12));
        reportIssueButton.setPrefSize(100,20);
        reportIssueButton.setDefaultButton(true);
        piedritasWCGridPane.add(reportIssueButton, 1, 10, 1, 1);
        GridPane.setHalignment(reportIssueButton, HPos.RIGHT);
        GridPane.setMargin(reportIssueButton, new Insets(0, -20,-135, 20));


        // Add WC Point Buttons
        Button wcButton1 = new Button();
        wcButton1.setBackground(HomePage.WCImage);
        wcButton1.setScaleX(0.4);
        wcButton1.setScaleY(0.4);
        wcButton1.setPrefSize(25,25);
        wcButton1.setDefaultButton(true);
        piedritasWCGridPane.add(wcButton1, 0, 4);
        GridPane.setMargin(wcButton1, new Insets(-25, -328,25,328));

        Button wcButton2 = new Button();
        wcButton2.setBackground(HomePage.WCImage);
        wcButton2.setScaleX(0.4);
        wcButton2.setScaleY(0.4);
        wcButton2.setPrefSize(25,25);
        wcButton2.setDefaultButton(true);
        piedritasWCGridPane.add(wcButton2, 1, 4);
        GridPane.setMargin(wcButton2, new Insets(-260, -730,260,730));


        // Set pop-up information for each point
        wcButton1.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                piedritasWCGridPane.getScene().getWindow(), "Ba??os P??blicos", "Ubicaci??n: \nPanamericana Norte 18, Talara 20810, Peru");
        });
        wcButton2.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                piedritasWCGridPane.getScene().getWindow(), "Ba??os P??blicos", "Ubicaci??n:  \nPari??as, 20810, Peru");
        });


        // Set action for pressed buttons
        wcButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Mapa de Piedritas");
            // Create the Spanish PiedritasMap Page grid pane
            GridPane piedritasMapGridPane = PiedritasMap_Spanish.createPiedritasMapGridPane();
            piedritasMapGridPane.setMaxSize( 950, 550);
            // Set background Image
            piedritasMapGridPane.setBackground(new Background( HomePage.createImage("PiedritasMap.png")));
            // Add UI controls to the Spanish PiedritasMap form grid pane
            PiedritasMap_Spanish.addUIControlsPiedritasMap(piedritasMapGridPane, primaryStage);
            // Set the scene in Spanish PiedritasMap
            Scene PiedritasMapScene = new Scene(piedritasMapGridPane, 950, 550);
            // Display Spanish PiedritasMap stage
            primaryStage.setScene(PiedritasMapScene);
            primaryStage.show();        });

        recyclingButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Mapa de Piedritas");
            // Create the Spanish PiedritasMap_Recycling Page grid pane
            GridPane piedritasRecycleGridPane = PiedritasMap_Recycling_Spanish.createPiedritasRecyclingGridPane();
            piedritasRecycleGridPane.setMaxSize( 950, 550);
            // Set background Image
            piedritasRecycleGridPane.setBackground(new Background(HomePage.createImage("PiedritasMap.png")));
            // Add UI controls to the Spanish PiedritasMap_Recycling form grid pane
            PiedritasMap_Recycling_Spanish.addUIControlsPiedritasRecyclingGridPane(piedritasRecycleGridPane, primaryStage);
            // Set the scene in Spanish PiedritasMap_Recycling
            Scene PiedritasRecyclingScene = new Scene(piedritasRecycleGridPane, 950, 550);
            // Display Spanish PiedritasMap_Recycling stage
            primaryStage.setScene(PiedritasRecyclingScene);
            primaryStage.show();
        });

        wasteBinsButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Mapa de Piedritas");
            // Create the Spanish PiedritasMap_WasteBins Page grid pane
            GridPane piedritasWasteBinsGridPane = PiedritasMap_WasteBins_Spanish.createPiedritasWasteBinsGridPane();
            piedritasWasteBinsGridPane.setMaxSize( 950, 550);
            // Set background Image
            piedritasWasteBinsGridPane.setBackground(new Background(HomePage.createImage("PiedritasMap.png")));
            // Add UI controls to the Spanish PiedritasMap_WasteBins form grid pane
            PiedritasMap_WasteBins_Spanish.addUIControlsPiedritasWasteBinsGridPane(piedritasWasteBinsGridPane, primaryStage);
            // Set the scene in Spanish PiedritasMap_WasteBins
            Scene PiedritasWasteBinsScene = new Scene(piedritasWasteBinsGridPane, 950, 550);
            // Display Spanish PiedritasMap_WasteBins stage
            primaryStage.setScene(PiedritasWasteBinsScene);
            primaryStage.show();
        });

        backButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Mapa de Piedritas");
            // Create the Spanish PiedritasMap Page grid pane
            GridPane piedritasMapGridPane = PiedritasMap_Spanish.createPiedritasMapGridPane();
            piedritasMapGridPane.setMaxSize( 950, 550);
            // Set background Image
            piedritasMapGridPane.setBackground(new Background( HomePage.createImage("PiedritasMap.png")));
            // Add UI controls to the Spanish PiedritasMap form grid pane
            PiedritasMap_Spanish.addUIControlsPiedritasMap(piedritasMapGridPane, primaryStage);
            // Set the scene in Spanish PiedritasMap
            Scene PiedritasMapScene = new Scene(piedritasMapGridPane, 950, 550);
            // Display Spanish PiedritasMap stage
            primaryStage.setScene(PiedritasMapScene);
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
