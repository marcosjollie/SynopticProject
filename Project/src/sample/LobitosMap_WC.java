package sample;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public abstract class LobitosMap_WC /*extends Application*/ {

    // Start function for quick display
    /*@Override
    public void start(Stage primaryStage) {
        // Set stage title
        primaryStage.setTitle("SMART MAP - Lobitos Map");
        // Create the LobitosMap_WC Page grid pane
        GridPane lobitosWCGridPane = createLobitosWCGridPane();
        lobitosWCGridPane.setMaxSize( 800, 550);
        // Set background Image
        lobitosWCGridPane.setBackground(new Background(HomePage.createImage("LobitosMap.png")));
        // Add UI controls to the LobitosMap_WC form grid pane
        addUIControlsLobitosWC(lobitosWCGridPane, primaryStage);
        // Set the scene in LobitosMap_WC
        Scene LobitosWCScene = new Scene(lobitosWCGridPane, 800, 550);
        // Display LobitosMap_WC stage
        primaryStage.setScene(LobitosWCScene);
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }*/


    // Create Grid Pane for LobitosWC
    public static GridPane createLobitosWCGridPane() {
        // Set new Grid Pane for LobitosWC
        GridPane lobitosWCGridPane = new GridPane();
        lobitosWCGridPane.setAlignment(Pos.CENTER);
        lobitosWCGridPane.setPadding(new Insets(0, 0, 0, 0));
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return LobitosWC
        lobitosWCGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return lobitosWCGridPane;
    }


    // Create UI controls for LobitosWC Grid Pane
    public static void addUIControlsLobitosWC(GridPane lobitosWCGridPane, Stage primaryStage) {

        // Add WC Button
        Button wcButton = new Button();
        wcButton.setBackground(HomePage.WCImage);
        wcButton.setScaleX(0.8);
        wcButton.setScaleY(0.8);
        wcButton.setPrefSize(25,25);
        wcButton.setDefaultButton(true);
        lobitosWCGridPane.add(wcButton, 0, 0);
        GridPane.setMargin(wcButton, new Insets(20, 35,0,-35));
        // Add WC Label
        Label toiletsLabel = new Label("Public toilets");
        toiletsLabel.setFont(Font.font("Arial", 14));
        lobitosWCGridPane.add(toiletsLabel, 1,0);
        GridPane.setMargin(toiletsLabel, new Insets(20, 35,0,-30));

        // Add Recycling Button
        Button recyclingButton = new Button();
        recyclingButton.setBackground(HomePage.RecyclingImage);
        recyclingButton.setScaleX(0.8);
        recyclingButton.setScaleY(0.8);
        recyclingButton.setPrefSize(25,25);
        recyclingButton.setDefaultButton(true);
        lobitosWCGridPane.add(recyclingButton, 0, 1);
        GridPane.setMargin(recyclingButton, new Insets(0, 35,0,-35));
        // Add Recycling Label
        Label recyclingLabel = new Label("Recycling Points");
        recyclingLabel.setFont(Font.font("Arial", 14));
        lobitosWCGridPane.add(recyclingLabel, 1,1);
        GridPane.setMargin(recyclingLabel, new Insets(0, 35,0,-30));

        // Add Waste Bins Button
        Button wasteBinsButton = new Button();
        wasteBinsButton.setBackground(HomePage.BinImage);
        wasteBinsButton.setScaleX(0.8);
        wasteBinsButton.setScaleY(0.8);
        wasteBinsButton.setPrefSize(25,25);
        wasteBinsButton.setDefaultButton(true);
        lobitosWCGridPane.add(wasteBinsButton, 0, 2);
        GridPane.setMargin(wasteBinsButton, new Insets(0, 35,300,-35));
        // Add Waste Bins Label
        Label wasteBinsLabel = new Label("Waste bins");
        wasteBinsLabel.setFont(Font.font("Arial", 14));
        lobitosWCGridPane.add(wasteBinsLabel, 1,2);
        GridPane.setMargin(wasteBinsLabel, new Insets(0, 35,300,-30));

        // Add Back Button
        Button backButton = new Button("Back");
        backButton.setFont(Font.font("Arial", 12));
        backButton.setPrefSize(70,20);
        backButton.setDefaultButton(true);
        lobitosWCGridPane.add(backButton, 0, 10, 1, 1);
        GridPane.setHalignment(backButton, HPos.LEFT);
        GridPane.setMargin(backButton, new Insets(0, -5,-95,5));

        // Add Report Issue Button
        Button reportIssueButton = new Button("Report Issue");
        reportIssueButton.setFont(Font.font("Arial", 12));
        reportIssueButton.setPrefSize(100,20);
        reportIssueButton.setDefaultButton(true);
        lobitosWCGridPane.add(reportIssueButton, 1, 10, 1, 1);
        GridPane.setHalignment(reportIssueButton, HPos.RIGHT);
        GridPane.setMargin(reportIssueButton, new Insets(0, -95,-95, 95));



        // Add WC Point Buttons
        Button wcButton1 = new Button();
        wcButton1.setBackground(HomePage.WCImage);
        wcButton1.setScaleX(0.4);
        wcButton1.setScaleY(0.4);
        wcButton1.setPrefSize(25,25);
        wcButton1.setDefaultButton(true);
        lobitosWCGridPane.add(wcButton1, 0, 4);
        GridPane.setMargin(wcButton1, new Insets(-115, -100,115,100));

        Button wcButton2 = new Button();
        wcButton2.setBackground(HomePage.WCImage);
        wcButton2.setScaleX(0.4);
        wcButton2.setScaleY(0.4);
        wcButton2.setPrefSize(25,25);
        wcButton2.setDefaultButton(true);
        lobitosWCGridPane.add(wcButton2, 1, 4);
        GridPane.setMargin(wcButton2, new Insets(-20, -160,20,160));

        Button wcButton3 = new Button();
        wcButton3.setBackground(HomePage.WCImage);
        wcButton3.setScaleX(0.4);
        wcButton3.setScaleY(0.4);
        wcButton3.setPrefSize(25,25);
        wcButton3.setDefaultButton(true);
        lobitosWCGridPane.add(wcButton3, 2, 4);
        GridPane.setMargin(wcButton3, new Insets(5, 400,-5,-400));

        Button wcButton4 = new Button();
        wcButton4.setBackground(HomePage.WCImage);
        wcButton4.setScaleX(0.4);
        wcButton4.setScaleY(0.4);
        wcButton4.setPrefSize(25,25);
        wcButton4.setDefaultButton(true);
        lobitosWCGridPane.add(wcButton4, 3, 4);
        GridPane.setMargin(wcButton4, new Insets(-45, 410,45,-410));

        Button wcButton5 = new Button();
        wcButton5.setBackground(HomePage.WCImage);
        wcButton5.setScaleX(0.4);
        wcButton5.setScaleY(0.4);
        wcButton5.setPrefSize(25,25);
        wcButton5.setDefaultButton(true);
        lobitosWCGridPane.add(wcButton5, 4, 4);
        GridPane.setMargin(wcButton5, new Insets(-115, 350,115,-350));

        Button wcButton6 = new Button();
        wcButton6.setBackground(HomePage.WCImage);
        wcButton6.setScaleX(0.4);
        wcButton6.setScaleY(0.4);
        wcButton6.setPrefSize(25,25);
        wcButton6.setDefaultButton(true);
        lobitosWCGridPane.add(wcButton6, 5, 4);
        GridPane.setMargin(wcButton6, new Insets(-190, 310,190,-310));

        Button wcButton7 = new Button();
        wcButton7.setBackground(HomePage.WCImage);
        wcButton7.setScaleX(0.4);
        wcButton7.setScaleY(0.4);
        wcButton7.setPrefSize(25,25);
        wcButton7.setDefaultButton(true);
        lobitosWCGridPane.add(wcButton7, 5, 4);
        GridPane.setMargin(wcButton7, new Insets(-20, 285,20,-285));



        // Set pop-up information for each point
        wcButton1.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWCGridPane.getScene().getWindow(), "Public Toilet", "Location: \nCalle La Punta, Lobitos, 20820, Peru");
        });

        wcButton2.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWCGridPane.getScene().getWindow(), "Public Toilet", "Location: \nUnnamed Road, Lobitos 20820, Peru");
        });

        wcButton3.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWCGridPane.getScene().getWindow(), "Public Toilet", "Location: \nPueb Lobitos, Lobitos District 20820, Peru");
        });

        wcButton4.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWCGridPane.getScene().getWindow(), "Public Toilet", "Location: \nPueb Lobitos, Lobitos District 20820, Peru");
        });

        wcButton5.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWCGridPane.getScene().getWindow(), "Public Toilet", "Location: \nPueb Lobitos, Lobitos District, Peru");
        });

        wcButton6.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWCGridPane.getScene().getWindow(), "Public Toilet", "Location: \nPueb Lobitos, Lobitos District, Peru");
        });

        wcButton7.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWCGridPane.getScene().getWindow(), "Public Toilet", "Location: \nLobitos District, 20820, Peru");
        });



        // Set action for pressed buttons
        wcButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Lobitos Map");
            // Create the LobitosMap Page grid pane
            GridPane lobitosMapGridPane = LobitosMap.createLobitosMapGridPane();
            lobitosMapGridPane.setMaxSize( 800, 550);
            // Set background Image
            lobitosMapGridPane.setBackground(new Background(HomePage.createImage("LobitosMap.png")));
            // Add UI controls to the LobitosMap form grid pane
            LobitosMap.addUIControlsLobitosMap(lobitosMapGridPane, primaryStage);
            // Set the scene in AmpStart
            Scene LobitosMapScene = new Scene(lobitosMapGridPane, 800, 550);
            // Display stage
            primaryStage.setScene(LobitosMapScene);
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
            primaryStage.setTitle("SMART MAP - Lobitos Map");
            // Create the LobitosMap Page grid pane
            GridPane lobitosMapGridPane = LobitosMap.createLobitosMapGridPane();
            lobitosMapGridPane.setMaxSize( 800, 550);
            // Set background Image
            lobitosMapGridPane.setBackground(new Background(HomePage.createImage("LobitosMap.png")));
            // Add UI controls to the LobitosMap form grid pane
            LobitosMap.addUIControlsLobitosMap(lobitosMapGridPane, primaryStage);
            // Set the scene in AmpStart
            Scene LobitosMapScene = new Scene(lobitosMapGridPane, 800, 550);
            // Display stage
            primaryStage.setScene(LobitosMapScene);
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


