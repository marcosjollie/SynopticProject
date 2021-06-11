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

public class PiedritasMap_WasteBins extends Application {

    // Start function for quick display
    @Override
    public void start(Stage primaryStage) {
        // Set stage title
        primaryStage.setTitle("SMART MAP - Piedritas Map");
        // Create the PiedritasMap_WasteBins Page grid pane
        GridPane piedritasWasteBinsGridPane = createPiedritasWasteBinsGridPane();
        piedritasWasteBinsGridPane.setMaxSize( 950, 550);
        // Set background Image
        piedritasWasteBinsGridPane.setBackground(new Background(HomePage.createImage("PiedritasMap.png")));
        // Add UI controls to the PiedritasMap_WasteBins form grid pane
        addUIControlsPiedritasWasteBinsGridPane(piedritasWasteBinsGridPane, primaryStage);
        // Set the scene in PiedritasMap_WasteBins
        Scene PiedritasWasteBinsScene = new Scene(piedritasWasteBinsGridPane, 950, 550);
        // Display PiedritasMap_WasteBins stage
        primaryStage.setScene(PiedritasWasteBinsScene);
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }


    // Create Grid Pane for PiedritasWasteBins
    public static GridPane createPiedritasWasteBinsGridPane() {
        // Set new Grid Pane for PiedritasWasteBins
        GridPane piedritasWasteBinsGridPane = new GridPane();
        piedritasWasteBinsGridPane.setAlignment(Pos.CENTER);
        piedritasWasteBinsGridPane.setPadding(new Insets(25,25,25,25));
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return PiedritasWasteBinsGridPane
        piedritasWasteBinsGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return piedritasWasteBinsGridPane;
    }

    // Create UI controls for PiedritasWasteBins Grid Pane
    public static void addUIControlsPiedritasWasteBinsGridPane(GridPane piedritasWasteBinsGridPane, Stage primaryStage) {

        // Add WC Button
        Button wcButton = new Button();
        wcButton.setBackground(HomePage.WCImage);
        wcButton.setScaleX(0.8);
        wcButton.setScaleY(0.8);
        wcButton.setPrefSize(25,25);
        wcButton.setDefaultButton(true);
        piedritasWasteBinsGridPane.add(wcButton, 0, 0);
        GridPane.setMargin(wcButton, new Insets(0, 60,0,-60));
        // Add WC Label
        Label toiletsLabel = new Label("Public toilets");
        toiletsLabel.setFont(Font.font("Arial", 14));
        piedritasWasteBinsGridPane.add(toiletsLabel, 1,0);
        GridPane.setMargin(toiletsLabel, new Insets(0, 60,0,-55));

        // Add Recycling Button
        Button recyclingButton = new Button();
        recyclingButton.setScaleX(0.8);
        recyclingButton.setScaleY(0.8);
        recyclingButton.setBackground(HomePage.RecyclingImage);
        recyclingButton.setPrefSize(25,25);
        recyclingButton.setDefaultButton(true);
        piedritasWasteBinsGridPane.add(recyclingButton, 0, 1);
        GridPane.setMargin(recyclingButton, new Insets(0, 60,0,-60));
        // Add Recycling Label
        Label recyclingLabel = new Label("Recycling Points");
        recyclingLabel.setFont(Font.font("Arial", 14));
        piedritasWasteBinsGridPane.add(recyclingLabel, 1,1);
        GridPane.setMargin(recyclingLabel, new Insets(0, 60,0,-55));

        // Add Waste Bins Button
        Button wasteBinsButton = new Button();
        wasteBinsButton.setScaleX(0.8);
        wasteBinsButton.setScaleY(0.8);
        wasteBinsButton.setBackground(HomePage.BinImage);
        wasteBinsButton.setPrefSize(25,25);
        wasteBinsButton.setDefaultButton(true);
        piedritasWasteBinsGridPane.add(wasteBinsButton, 0, 2);
        GridPane.setMargin(wasteBinsButton, new Insets(0, 60,280,-60));
        // Add Waste Bins Label
        Label wasteBinsLabel = new Label("Waste bins");
        wasteBinsLabel.setFont(Font.font("Arial", 14));
        piedritasWasteBinsGridPane.add(wasteBinsLabel, 1,2);
        GridPane.setMargin(wasteBinsLabel, new Insets(0, 60,280,-55));

        // Add Back Button
        Button backButton = new Button("Back");
        backButton.setFont(Font.font("Arial", 12));
        backButton.setPrefSize(70,20);
        backButton.setDefaultButton(true);
        piedritasWasteBinsGridPane.add(backButton, 0, 10, 1, 1);
        GridPane.setHalignment(backButton, HPos.LEFT);
        GridPane.setMargin(backButton, new Insets(0, 20,-135,-20));

        // Add Report Issue Button
        Button reportIssueButton = new Button("Report Issue");
        reportIssueButton.setFont(Font.font("Arial", 12));
        reportIssueButton.setPrefSize(100,20);
        reportIssueButton.setDefaultButton(true);
        piedritasWasteBinsGridPane.add(reportIssueButton, 1, 10, 1, 1);
        GridPane.setHalignment(reportIssueButton, HPos.RIGHT);
        GridPane.setMargin(reportIssueButton, new Insets(0, -45,-135, 45));



        // Add Waste Bins Point Buttons
        Button wasteBinsButton1 = new Button();
        wasteBinsButton1.setBackground(HomePage.BinImage);
        wasteBinsButton1.setScaleX(0.4);
        wasteBinsButton1.setScaleY(0.4);
        wasteBinsButton1.setPrefSize(25,25);
        wasteBinsButton1.setDefaultButton(true);
        piedritasWasteBinsGridPane.add(wasteBinsButton1, 0, 4);
        GridPane.setMargin(wasteBinsButton1, new Insets(-70, -90,70,90));

        Button wasteBinsButton2 = new Button();
        wasteBinsButton2.setBackground(HomePage.BinImage);
        wasteBinsButton2.setScaleX(0.4);
        wasteBinsButton2.setScaleY(0.4);
        wasteBinsButton2.setPrefSize(25,25);
        wasteBinsButton2.setDefaultButton(true);
        piedritasWasteBinsGridPane.add(wasteBinsButton2, 1, 4);
        GridPane.setMargin(wasteBinsButton2, new Insets(-34, -215,34,215));

        Button wasteBinsButton3 = new Button();
        wasteBinsButton3.setBackground(HomePage.BinImage);
        wasteBinsButton3.setScaleX(0.4);
        wasteBinsButton3.setScaleY(0.4);
        wasteBinsButton3.setPrefSize(25,25);
        wasteBinsButton3.setDefaultButton(true);
        piedritasWasteBinsGridPane.add(wasteBinsButton3, 2, 4);
        GridPane.setMargin(wasteBinsButton3, new Insets(-70, 525,70,-525));

        Button wasteBinsButton4 = new Button();
        wasteBinsButton4.setBackground(HomePage.BinImage);
        wasteBinsButton4.setScaleX(0.4);
        wasteBinsButton4.setScaleY(0.4);
        wasteBinsButton4.setPrefSize(25,25);
        wasteBinsButton4.setDefaultButton(true);
        piedritasWasteBinsGridPane.add(wasteBinsButton4, 2, 4);
        GridPane.setMargin(wasteBinsButton4, new Insets(-25, 473,25,-473));

        Button wasteBinsButton5 = new Button();
        wasteBinsButton5.setBackground(HomePage.BinImage);
        wasteBinsButton5.setScaleX(0.4);
        wasteBinsButton5.setScaleY(0.4);
        wasteBinsButton5.setPrefSize(25,25);
        wasteBinsButton5.setDefaultButton(true);
        piedritasWasteBinsGridPane.add(wasteBinsButton5, 2, 4);
        GridPane.setMargin(wasteBinsButton5, new Insets(-230, 345,230,-345));

        Button wasteBinsButton6 = new Button();
        wasteBinsButton6.setBackground(HomePage.BinImage);
        wasteBinsButton6.setScaleX(0.4);
        wasteBinsButton6.setScaleY(0.4);
        wasteBinsButton6.setPrefSize(25,25);
        wasteBinsButton6.setDefaultButton(true);
        piedritasWasteBinsGridPane.add(wasteBinsButton6, 2, 4);
        GridPane.setMargin(wasteBinsButton6, new Insets(-255, 35,255,-35));

        Button wasteBinsButton7 = new Button();
        wasteBinsButton7.setBackground(HomePage.BinImage);
        wasteBinsButton7.setScaleX(0.4);
        wasteBinsButton7.setScaleY(0.4);
        wasteBinsButton7.setPrefSize(25,25);
        wasteBinsButton7.setDefaultButton(true);
        piedritasWasteBinsGridPane.add(wasteBinsButton7, 2, 4);
        GridPane.setMargin(wasteBinsButton7, new Insets(-180, -10,180,10));

        Button wasteBinsButton8 = new Button();
        wasteBinsButton8.setBackground(HomePage.BinImage);
        wasteBinsButton8.setScaleX(0.4);
        wasteBinsButton8.setScaleY(0.4);
        wasteBinsButton8.setPrefSize(25,25);
        wasteBinsButton8.setDefaultButton(true);
        piedritasWasteBinsGridPane.add(wasteBinsButton8, 2, 4);
        GridPane.setMargin(wasteBinsButton8, new Insets(-100, 10,100,-10));



        // Set pop-up information for each point
        wasteBinsButton1.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                piedritasWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nPariñas, 20810, Peru");
        });

        wasteBinsButton2.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                piedritasWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nPariñas, 20810, Peru");
        });

        wasteBinsButton3.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                piedritasWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nPariñas, 20810, Peru");
        });

        wasteBinsButton4.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                piedritasWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nPanamericana Norte 18, Talara 20810, Peru");
        });

        wasteBinsButton5.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                piedritasWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nTalara, 20810, Peru");
        });

        wasteBinsButton6.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                piedritasWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nTalara, 20810, Peru");
        });

        wasteBinsButton7.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                piedritasWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nPariñas, 20810, Peru");
        });

        wasteBinsButton8.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                piedritasWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nPariñas, 20810, Peru");
        });




        // Set action for pressed buttons
        wcButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Piedritas Map");
            // Create the PiedritasMap_WC Page grid pane
            GridPane piedritasWCGridPane = PiedritasMap_WC.createPiedritasWCGridPane();
            piedritasWCGridPane.setMaxSize( 950, 550);
            // Set background Image
            piedritasWCGridPane.setBackground(new Background(HomePage.createImage("PiedritasMap.png")));
            // Add UI controls to the PiedritasMap_WC form grid pane
            PiedritasMap_WC.addUIControlsPiedritasWCGridPane(piedritasWCGridPane, primaryStage);
            // Set the scene in PiedritasMap_WC
            Scene PiedritasWCScene = new Scene(piedritasWCGridPane, 950, 550);
            // Display PiedritasMap_WC stage
            primaryStage.setScene(PiedritasWCScene);
            primaryStage.show();
        });

        recyclingButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Piedritas Map");
            // Create the PiedritasMap_Recycling Page grid pane
            GridPane piedritasRecycleGridPane = PiedritasMap_Recycling.createPiedritasRecyclingGridPane();
            piedritasRecycleGridPane.setMaxSize( 950, 550);
            // Set background Image
            piedritasRecycleGridPane.setBackground(new Background(HomePage.createImage("PiedritasMap.png")));
            // Add UI controls to the PiedritasMap_Recycling form grid pane
            PiedritasMap_Recycling.addUIControlsPiedritasRecyclingGridPane(piedritasRecycleGridPane, primaryStage);
            // Set the scene in PiedritasMap_Recycling
            Scene PiedritasRecyclingScene = new Scene(piedritasRecycleGridPane, 950, 550);
            // Display PiedritasMap_Recycling stage
            primaryStage.setScene(PiedritasRecyclingScene);
            primaryStage.show();
        });

        wasteBinsButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Piedritas Map");
            // Create the PiedritasMap Page grid pane
            GridPane piedritasMapGridPane = PiedritasMap.createPiedritasMapGridPane();
            piedritasMapGridPane.setMaxSize( 950, 550);
            // Set background Image
            piedritasMapGridPane.setBackground(new Background(HomePage.createImage("PiedritasMap.png")));
            // Add UI controls to the PiedritasMap form grid pane
            PiedritasMap.addUIControlsPiedritasMap(piedritasMapGridPane, primaryStage);
            // Set the scene in PiedritasMap
            Scene PiedritasMapScene = new Scene(piedritasMapGridPane, 950, 550);
            // Display PiedritasMap stage
            primaryStage.setScene(PiedritasMapScene);
            primaryStage.show();
        });

        backButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Piedritas Map");
            // Create the PiedritasMap Page grid pane
            GridPane piedritasMapGridPane = PiedritasMap.createPiedritasMapGridPane();
            piedritasMapGridPane.setMaxSize( 950, 550);
            // Set background Image
            piedritasMapGridPane.setBackground(new Background(HomePage.createImage("PiedritasMap.png")));
            // Add UI controls to the PiedritasMap form grid pane
            PiedritasMap.addUIControlsPiedritasMap(piedritasMapGridPane, primaryStage);
            // Set the scene in PiedritasMap
            Scene PiedritasMapScene = new Scene(piedritasMapGridPane, 950, 550);
            // Display PiedritasMap stage
            primaryStage.setScene(PiedritasMapScene);
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



