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
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public abstract class LobitosMap_WasteBins /*extends Application*/ {

    // Start function for quick display
    /*@Override
    public void start(Stage primaryStage) {
        // Set stage title
        primaryStage.setTitle("SMART MAP - Lobitos Map");
        // Create the LobitosMap_WasteBins Page grid pane
        GridPane lobitosWasteBinsGridPane = createLobitosWasteBinsGridPane();
        lobitosWasteBinsGridPane.setMaxSize( 800, 550);
        // Set background Image
        lobitosWasteBinsGridPane.setBackground(new Background(HomePage.createImage("LobitosMap.png")));
        // Add UI controls to the LobitosMap_WasteBins form grid pane
        addUIControlsLobitosWasteBins(lobitosWasteBinsGridPane, primaryStage);
        // Set the scene in LobitosMap_WasteBins
        Scene LobitosWastBinsScene = new Scene(lobitosWasteBinsGridPane, 800, 550);
        // Display LobitosMap_WasteBins stage
        primaryStage.setScene(LobitosWastBinsScene);
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }*/


    // Create Grid Pane for LobitosWasteBins
    public static GridPane createLobitosWasteBinsGridPane() {
        // Set new Grid Pane for LobitosWasteBins
        GridPane lobitosWastBinsGridPane = new GridPane();
        lobitosWastBinsGridPane.setAlignment(Pos.CENTER);
        lobitosWastBinsGridPane.setPadding(new Insets(0, 0, 0, 0));
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return LobitosWasteBins
        lobitosWastBinsGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return lobitosWastBinsGridPane;
    }


    // Create UI controls for LobitosWasteBins Grid Pane
    public static void addUIControlsLobitosWasteBins(GridPane lobitosWasteBinsGridPane, Stage primaryStage) {

        // Add WC Button
        Button wcButton = new Button();
        wcButton.setBackground(HomePage.WCImage);
        wcButton.setScaleX(0.8);
        wcButton.setScaleY(0.8);
        wcButton.setPrefSize(25,25);
        wcButton.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton, 0, 0);
        GridPane.setMargin(wcButton, new Insets(20, 35,0,-35));
        // Add WC Label
        Label toiletsLabel = new Label("Public toilets");
        toiletsLabel.setFont(Font.font("Arial", 14));
        lobitosWasteBinsGridPane.add(toiletsLabel, 1,0);
        GridPane.setMargin(toiletsLabel, new Insets(20, 35,0,-30));

        // Add Recycling Button
        Button recyclingButton = new Button();
        recyclingButton.setBackground(HomePage.RecyclingImage);
        recyclingButton.setScaleX(0.8);
        recyclingButton.setScaleY(0.8);
        recyclingButton.setPrefSize(25,25);
        recyclingButton.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(recyclingButton, 0, 1);
        GridPane.setMargin(recyclingButton, new Insets(0, 35,0,-35));
        // Add Recycling Label
        Label recyclingLabel = new Label("Recycling Points");
        recyclingLabel.setFont(Font.font("Arial", 14));
        lobitosWasteBinsGridPane.add(recyclingLabel, 1,1);
        GridPane.setMargin(recyclingLabel, new Insets(0, 35,0,-30));

        // Add Waste Bins Button
        Button wasteBinsButton = new Button();
        wasteBinsButton.setBackground(HomePage.BinImage);
        wasteBinsButton.setScaleX(0.8);
        wasteBinsButton.setScaleY(0.8);
        wasteBinsButton.setPrefSize(25,25);
        wasteBinsButton.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton, 0, 2);
        GridPane.setMargin(wasteBinsButton, new Insets(0, 35,300,-35));
        // Add Waste Bins Label
        Label wasteBinsLabel = new Label("Waste bins");
        wasteBinsLabel.setFont(Font.font("Arial", 14));
        lobitosWasteBinsGridPane.add(wasteBinsLabel, 1,2);
        GridPane.setMargin(wasteBinsLabel, new Insets(0, 35,300,-30));

        // Add Back Button
        Button backButton = new Button("Back");
        backButton.setFont(Font.font("Arial", 12));
        backButton.setPrefSize(70,20);
        backButton.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(backButton, 0, 10, 1, 1);
        GridPane.setHalignment(backButton, HPos.LEFT);
        GridPane.setMargin(backButton, new Insets(0, -5,-95,5));

        // Add Report Issue Button
        Button reportIssueButton = new Button("Report Issue");
        reportIssueButton.setFont(Font.font("Arial", 12));
        reportIssueButton.setPrefSize(100,20);
        reportIssueButton.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(reportIssueButton, 1, 10, 1, 1);
        GridPane.setHalignment(reportIssueButton, HPos.RIGHT);
        GridPane.setMargin(reportIssueButton, new Insets(0, -95,-95, 95));


        // Add Waste Bins Point Buttons
        Button wasteBinsButton1 = new Button();
        wasteBinsButton1.setBackground(HomePage.BinImage);
        wasteBinsButton1.setScaleX(0.4);
        wasteBinsButton1.setScaleY(0.4);
        wasteBinsButton1.setPrefSize(25,25);
        wasteBinsButton1.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton1, 0, 4);
        GridPane.setMargin(wasteBinsButton1, new Insets(35, 68,-35,-68));

        Button wasteBinsButton2 = new Button();
        wasteBinsButton2.setBackground(HomePage.BinImage);
        wasteBinsButton2.setScaleX(0.4);
        wasteBinsButton2.setScaleY(0.4);
        wasteBinsButton2.setPrefSize(25,25);
        wasteBinsButton2.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton2, 1, 4);
        GridPane.setMargin(wasteBinsButton2, new Insets(-5, 50,5,-50));

        Button wasteBinsButton3 = new Button();
        wasteBinsButton3.setBackground(HomePage.BinImage);
        wasteBinsButton3.setScaleX(0.4);
        wasteBinsButton3.setScaleY(0.4);
        wasteBinsButton3.setPrefSize(25,25);
        wasteBinsButton3.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton3, 2, 4);
        GridPane.setMargin(wasteBinsButton3, new Insets(-70, 520,70,-520));

        Button wasteBinsButton4 = new Button();
        wasteBinsButton4.setBackground(HomePage.BinImage);
        wasteBinsButton4.setScaleX(0.4);
        wasteBinsButton4.setScaleY(0.4);
        wasteBinsButton4.setPrefSize(25,25);
        wasteBinsButton4.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton4, 3, 4);
        GridPane.setMargin(wasteBinsButton4, new Insets(-60, 450,60,-450));

        Button wasteBinsButton5 = new Button();
        wasteBinsButton5.setBackground(HomePage.BinImage);
        wasteBinsButton5.setScaleX(0.4);
        wasteBinsButton5.setScaleY(0.4);
        wasteBinsButton5.setPrefSize(25,25);
        wasteBinsButton5.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton5, 4, 4);
        GridPane.setMargin(wasteBinsButton5, new Insets(25, 455,-25,-455));

        Button wasteBinsButton6 = new Button();
        wasteBinsButton6.setBackground(HomePage.BinImage);
        wasteBinsButton6.setScaleX(0.4);
        wasteBinsButton6.setScaleY(0.4);
        wasteBinsButton6.setPrefSize(25,25);
        wasteBinsButton6.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton6, 5, 4);
        GridPane.setMargin(wasteBinsButton6, new Insets(-65, 370,65,-370));

        Button wasteBinsButton7 = new Button();
        wasteBinsButton7.setBackground(HomePage.BinImage);
        wasteBinsButton7.setScaleX(0.4);
        wasteBinsButton7.setScaleY(0.4);
        wasteBinsButton7.setPrefSize(25,25);
        wasteBinsButton7.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton7, 5, 4);
        GridPane.setMargin(wasteBinsButton7, new Insets(-18, 275,18,-275));

        Button wasteBinsButton8 = new Button();
        wasteBinsButton8.setBackground(HomePage.BinImage);
        wasteBinsButton8.setScaleX(0.4);
        wasteBinsButton8.setScaleY(0.4);
        wasteBinsButton8.setPrefSize(25,25);
        wasteBinsButton8.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton8, 5, 4);
        GridPane.setMargin(wasteBinsButton8, new Insets(-200, 300,200,-300));

        Button wasteBinsButton9 = new Button();
        wasteBinsButton9.setBackground(HomePage.BinImage);
        wasteBinsButton9.setScaleX(0.4);
        wasteBinsButton9.setScaleY(0.4);
        wasteBinsButton9.setPrefSize(25,25);
        wasteBinsButton9.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton9, 5, 4);
        GridPane.setMargin(wasteBinsButton9, new Insets(-160, 295,160,-295));

        Button wasteBinsButton10 = new Button();
        wasteBinsButton10.setBackground(HomePage.BinImage);
        wasteBinsButton10.setScaleX(0.4);
        wasteBinsButton10.setScaleY(0.4);
        wasteBinsButton10.setPrefSize(25,25);
        wasteBinsButton10.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton10, 5, 4);
        GridPane.setMargin(wasteBinsButton10, new Insets(-145, 240,145,-240));

        Button wasteBinsButton11 = new Button();
        wasteBinsButton11.setBackground(HomePage.BinImage);
        wasteBinsButton11.setScaleX(0.4);
        wasteBinsButton11.setScaleY(0.4);
        wasteBinsButton11.setPrefSize(25,25);
        wasteBinsButton11.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton11, 5, 4);
        GridPane.setMargin(wasteBinsButton11, new Insets(-25, 100,25,-100));

        Button wasteBinsButton12 = new Button();
        wasteBinsButton12.setBackground(HomePage.BinImage);
        wasteBinsButton12.setScaleX(0.4);
        wasteBinsButton12.setScaleY(0.4);
        wasteBinsButton12.setPrefSize(25,25);
        wasteBinsButton12.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton12, 5, 4);
        GridPane.setMargin(wasteBinsButton12, new Insets(30, 100,-30,-100));

        Button wasteBinsButton13 = new Button();
        wasteBinsButton13.setBackground(HomePage.BinImage);
        wasteBinsButton13.setScaleX(0.4);
        wasteBinsButton13.setScaleY(0.4);
        wasteBinsButton13.setPrefSize(25,25);
        wasteBinsButton13.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton13, 5, 4);
        GridPane.setMargin(wasteBinsButton13, new Insets(-370, 155,370,-155));

        Button wasteBinsButton14 = new Button();
        wasteBinsButton14.setBackground(HomePage.BinImage);
        wasteBinsButton14.setScaleX(0.4);
        wasteBinsButton14.setScaleY(0.4);
        wasteBinsButton14.setPrefSize(25,25);
        wasteBinsButton14.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton14, 5, 4);
        GridPane.setMargin(wasteBinsButton14, new Insets(-320, 95,320,-95));



        // Set pop-up information for each point
        wasteBinsButton1.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nLobitos District, Peru");
        });

        wasteBinsButton2.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nBaterias #5, Av, Lobitos, Peru");
        });

        wasteBinsButton3.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nLobitos, 20820, Peru");
        });

        wasteBinsButton4.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nLobitos District, 20820, Peru");
        });

        wasteBinsButton5.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nPueb Lobitos, Lobitos District 20820, Peru");
        });

        wasteBinsButton6.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nPueb Lobitos, Lobitos District 20820, Peru");
        });

        wasteBinsButton7.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nPueb Lobitos, Lobitos District, Peru");
        });

        wasteBinsButton8.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nLobitos, 20820, Peru");
        });

        wasteBinsButton9.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nPueb Lobitos, Lobitos District 20820, Peru");
        });

        wasteBinsButton10.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nLobitos, 20820, Peru");
        });

        wasteBinsButton11.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nPueb Lobitos, 20820, Peru");
        });

        wasteBinsButton12.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nPueb Lobitos, 20820, Peru");
        });

        wasteBinsButton13.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nLobitos, 20820, Peru");
        });

        wasteBinsButton14.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: \nLobitos, 20820, Peru");
        });



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


