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

public abstract class LobitosMap_Recylcing_Spanish /*extends Application*/ {
    // Start function for quick display
    /*@Override
    public void start(Stage primaryStage) {
        // Set stage title
        primaryStage.setTitle("SMART MAP - Mapa de Lobitos");
        // Create the Spanish LobitosMap_Recylcing Page grid pane
        GridPane lobitosRecycleGridPane = createLobitosRecycleGridPane();
        lobitosRecycleGridPane.setMaxSize( 800, 550);
        // Set background Image
        lobitosRecycleGridPane.setBackground(new Background(HomePage.createImage("LobitosMap.png")));
        // Add UI controls to the Spanish LobitosMap_Recylcing form grid pane
        addUIControlsLobitosRecycle(lobitosRecycleGridPane, primaryStage);
        // Set the scene in Spanish LobitosMap_Recylcing
        Scene LobitosRecycleScene = new Scene(lobitosRecycleGridPane, 800, 550);
        // Display Spanish LobitosMap_Recylcing stage
        primaryStage.setScene(LobitosRecycleScene);
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }*/


    // Create Grid Pane for Spanish LobitosMap_Recylcing
    public static GridPane createLobitosRecycleGridPane() {
        // Set new Grid Pane for Spanish LobitosMap_Recylcing
        GridPane lobitosRecycleGridPane = new GridPane();
        lobitosRecycleGridPane.setAlignment(Pos.CENTER);
        lobitosRecycleGridPane.setPadding(new Insets(0, 0, 0, 0));
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return Spanish LobitosMap_Recylcing
        lobitosRecycleGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return lobitosRecycleGridPane;
    }


    // Create UI controls for Spanish LobitosMap_Recylcing Grid Pane
    public static void addUIControlsLobitosRecycle(GridPane lobitosRecycleGridPane, Stage primaryStage) {

        // Add WC Button
        Button wcButton = new Button();
        wcButton.setBackground(HomePage.WCImage);
        wcButton.setScaleX(0.8);
        wcButton.setScaleY(0.8);
        wcButton.setPrefSize(25,25);
        wcButton.setDefaultButton(true);
        lobitosRecycleGridPane.add(wcButton, 0, 0);
        GridPane.setMargin(wcButton, new Insets(20, 35,0,-35));
        // Add WC Label
        Label toiletsLabel = new Label("Baños Públicos");
        toiletsLabel.setFont(Font.font("Arial", 14));
        lobitosRecycleGridPane.add(toiletsLabel, 1,0);
        GridPane.setMargin(toiletsLabel, new Insets(20, 35,0,-30));

        // Add Recycling Button
        Button recyclingButton = new Button();
        recyclingButton.setBackground(HomePage.RecyclingImage);
        recyclingButton.setScaleX(0.8);
        recyclingButton.setScaleY(0.8);
        recyclingButton.setPrefSize(25,25);
        recyclingButton.setDefaultButton(true);
        lobitosRecycleGridPane.add(recyclingButton, 0, 1);
        GridPane.setMargin(recyclingButton, new Insets(0, 35,0,-35));
        // Add Recycling Label
        Label recyclingLabel = new Label("Puntos de Reciclaje");
        recyclingLabel.setFont(Font.font("Arial", 14));
        lobitosRecycleGridPane.add(recyclingLabel, 1,1);
        GridPane.setMargin(recyclingLabel, new Insets(0, 35,0,-30));

        // Add Waste Bins Button
        Button wasteBinsButton = new Button();
        wasteBinsButton.setBackground(HomePage.BinImage);
        wasteBinsButton.setScaleX(0.8);
        wasteBinsButton.setScaleY(0.8);
        wasteBinsButton.setPrefSize(25,25);
        wasteBinsButton.setDefaultButton(true);
        lobitosRecycleGridPane.add(wasteBinsButton, 0, 2);
        GridPane.setMargin(wasteBinsButton, new Insets(0, 35,300,-35));
        // Add Waste Bins Label
        Label wasteBinsLabel = new Label("Cubos de Basura");
        wasteBinsLabel.setFont(Font.font("Arial", 14));
        lobitosRecycleGridPane.add(wasteBinsLabel, 1,2);
        GridPane.setMargin(wasteBinsLabel, new Insets(0, 35,300,-30));

        // Add Back Button
        Button backButton = new Button("Atras");
        backButton.setFont(Font.font("Arial", 12));
        backButton.setPrefSize(70,20);
        backButton.setDefaultButton(true);
        lobitosRecycleGridPane.add(backButton, 0, 10, 1, 1);
        GridPane.setHalignment(backButton, HPos.LEFT);
        GridPane.setMargin(backButton, new Insets(0, -5,-95,5));

        // Add Report Issue Button
        Button reportIssueButton = new Button("Reportar Problema");
        reportIssueButton.setFont(Font.font("Arial", 12));
        reportIssueButton.setPrefSize(100,20);
        reportIssueButton.setDefaultButton(true);
        lobitosRecycleGridPane.add(reportIssueButton, 1, 10, 1, 1);
        GridPane.setHalignment(reportIssueButton, HPos.RIGHT);
        GridPane.setMargin(reportIssueButton, new Insets(0, -20,-95, 20));



        // Add Recycle Point Buttons
        Button recyleButton1 = new Button();
        recyleButton1.setBackground(HomePage.RecyclingImage);
        recyleButton1.setScaleX(0.4);
        recyleButton1.setScaleY(0.4);
        recyleButton1.setPrefSize(25,25);
        recyleButton1.setDefaultButton(true);
        lobitosRecycleGridPane.add(recyleButton1, 0, 4);
        GridPane.setMargin(recyleButton1, new Insets(-65, -245,65,245));

        Button recyleButton2 = new Button();
        recyleButton2.setBackground(HomePage.RecyclingImage);
        recyleButton2.setScaleX(0.4);
        recyleButton2.setScaleY(0.4);
        recyleButton2.setPrefSize(25,25);
        recyleButton2.setDefaultButton(true);
        lobitosRecycleGridPane.add(recyleButton2, 1, 4);
        GridPane.setMargin(recyleButton2, new Insets(-52, -350,52,350));

        Button recyleButton3 = new Button();
        recyleButton3.setBackground(HomePage.RecyclingImage);
        recyleButton3.setScaleX(0.4);
        recyleButton3.setScaleY(0.4);
        recyleButton3.setPrefSize(25,25);
        recyleButton3.setDefaultButton(true);
        lobitosRecycleGridPane.add(recyleButton3, 2, 4);
        GridPane.setMargin(recyleButton3, new Insets(25, 90,-25,-90));



        // Set pop-up information for each point
        recyleButton1.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosRecycleGridPane.getScene().getWindow(), "Recycle Point", "Ubicación: \nPueb Lobitos, Lobitos District 20820, Peru");
        });

        recyleButton2.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosRecycleGridPane.getScene().getWindow(), "Recycle Point", "Ubicación: \nPueb Lobitos, Lobitos District 20820, Peru");
        });

        recyleButton3.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosRecycleGridPane.getScene().getWindow(), "Recycle Point", "Ubicación: \nLobitos, 20820, Peru");
        });


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
            // Create the Spanish LobitosMap Page grid pane
            GridPane lobitosMapGridPane = LobitosMap_Spanish.createLobitosMapGridPane();
            lobitosMapGridPane.setMaxSize( 800, 550);
            // Set background Image
            lobitosMapGridPane.setBackground(new Background( HomePage.createImage("LobitosMap.png")));
            // Add UI controls to the Spanish LobitosMap form grid pane
            LobitosMap_Spanish.addUIControlsLobitosMap(lobitosMapGridPane, primaryStage);
            // Set the scene in Spanish LobitosMap
            Scene LobitosMapScene = new Scene(lobitosMapGridPane, 800, 550);
            // Display stage
            primaryStage.setScene(LobitosMapScene);
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
            primaryStage.setTitle("SMART MAP - Mapa de Lobitos");
            // Create the Spanish LobitosMap Page grid pane
            GridPane lobitosMapGridPane = LobitosMap_Spanish.createLobitosMapGridPane();
            lobitosMapGridPane.setMaxSize( 800, 550);
            // Set background Image
            lobitosMapGridPane.setBackground(new Background( HomePage.createImage("LobitosMap.png")));
            // Add UI controls to the Spanish LobitosMap form grid pane
            LobitosMap_Spanish.addUIControlsLobitosMap(lobitosMapGridPane, primaryStage);
            // Set the scene in Spanish LobitosMap
            Scene LobitosMapScene = new Scene(lobitosMapGridPane, 800, 550);
            // Display stage
            primaryStage.setScene(LobitosMapScene);
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

