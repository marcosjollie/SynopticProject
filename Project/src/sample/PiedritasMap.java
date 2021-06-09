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

public class PiedritasMap extends Application {

    // Start function for quick display
    @Override
    public void start(Stage primaryStage) {
        // Set stage title
        primaryStage.setTitle("SMART MAP - Piedritas Map");
        // Create the PiedritasMap Page grid pane
        GridPane piedritasMapGridPane = createPiedritasMapGridPane();
        piedritasMapGridPane.setMaxSize( 950, 550);
        // Set background Image
        piedritasMapGridPane.setBackground(new Background( LobitosMap.createImage("PiedritasMap.png")));
        // Add UI controls to the PiedritasMap form grid pane
        addUIControlsPiedritasMap(piedritasMapGridPane, primaryStage);
        // Set the scene in PiedritasMap
        Scene PiedritasMapScene = new Scene(piedritasMapGridPane, 950, 550);
        // Display PiedritasMap stage
        primaryStage.setScene(PiedritasMapScene);
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }

    static BackgroundImage createImage(String url) {
        return new BackgroundImage(
                new Image(url),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,
                new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true),
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true));
    }

    public static GridPane createPiedritasMapGridPane() {
        // Set new Grid Pane for LoginPage
        GridPane piedritasMapGridPane = new GridPane();
        piedritasMapGridPane.setAlignment(Pos.CENTER);
        piedritasMapGridPane.setPadding(new Insets(25,25,25,25));
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return loginGridPane
        piedritasMapGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return piedritasMapGridPane;
    }


    public static void addUIControlsPiedritasMap(GridPane piedritasMapGridPane, Stage primaryStage) {
        Background WCImage = new Background( createImage("WC.png"));
        Background RecyclingImage = new Background( createImage("Recycling.png"));
        Background BinImage = new Background( createImage("Bin.png"));

        // Add WC Button
        Button wcButton = new Button();
        wcButton.setBackground(WCImage);
        wcButton.setScaleX(0.8);
        wcButton.setScaleY(0.8);
        wcButton.setPrefSize(25,25);
        wcButton.setDefaultButton(true);
        piedritasMapGridPane.add(wcButton, 0, 0);
        piedritasMapGridPane.setMargin(wcButton, new Insets(0, 60,0,-60));

        // Add Toilets Label
        Label toiletsLabel = new Label("Public toilets");
        toiletsLabel.setFont(Font.font("Arial", 14));
        piedritasMapGridPane.add(toiletsLabel, 1,0);
        piedritasMapGridPane.setMargin(toiletsLabel, new Insets(0, 60,0,-55));


        // Add Recycling Button
        Button recyclingButton = new Button();
        recyclingButton.setScaleX(0.8);
        recyclingButton.setScaleY(0.8);
        recyclingButton.setBackground(RecyclingImage);
        recyclingButton.setPrefSize(25,25);
        recyclingButton.setDefaultButton(true);
        piedritasMapGridPane.add(recyclingButton, 0, 1);
        piedritasMapGridPane.setMargin(recyclingButton, new Insets(0, 60,0,-60));

        // Add Recycling Label
        Label recyclingLabel = new Label("Recycling Points");
        recyclingLabel.setFont(Font.font("Arial", 14));
        piedritasMapGridPane.add(recyclingLabel, 1,1);
        piedritasMapGridPane.setMargin(recyclingLabel, new Insets(0, 60,0,-55));


        // Add Waste Bins Button
        Button wasteBinsButton = new Button();
        wasteBinsButton.setScaleX(0.8);
        wasteBinsButton.setScaleY(0.8);
        wasteBinsButton.setBackground(BinImage);
        wasteBinsButton.setPrefSize(25,25);
        wasteBinsButton.setDefaultButton(true);
        piedritasMapGridPane.add(wasteBinsButton, 0, 2);
        piedritasMapGridPane.setMargin(wasteBinsButton, new Insets(0, 60,305,-60));

        // Add Waste Bins Label
        Label wasteBinsLabel = new Label("Waste bins");
        wasteBinsLabel.setFont(Font.font("Arial", 14));
        piedritasMapGridPane.add(wasteBinsLabel, 1,2);
        piedritasMapGridPane.setMargin(wasteBinsLabel, new Insets(0, 60,305,-55));


        // Add Back Button
        Button backButton = new Button("Back");
        backButton.setFont(Font.font("Arial", 12));
        backButton.setPrefSize(70,20);
        backButton.setDefaultButton(true);
        piedritasMapGridPane.add(backButton, 0, 10, 1, 1);
        piedritasMapGridPane.setHalignment(backButton, HPos.LEFT);
        piedritasMapGridPane.setMargin(backButton, new Insets(0, 20,-135,-20));


        // Add Report Issue Button
        Button reportIssueButton = new Button("Report Issue");
        reportIssueButton.setFont(Font.font("Arial", 12));
        reportIssueButton.setPrefSize(100,20);
        reportIssueButton.setDefaultButton(true);
        piedritasMapGridPane.add(reportIssueButton, 1, 10, 1, 1);
        piedritasMapGridPane.setHalignment(reportIssueButton, HPos.RIGHT);
        piedritasMapGridPane.setMargin(reportIssueButton, new Insets(0, -20,-135, 20));


        wcButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Piedritas Map");
            // Create the PiedritasMap_WC Page grid pane
            GridPane piedritasWCGridPane = PiedritasMap_WC.createPiedritasWCGridPane();
            piedritasWCGridPane.setMaxSize( 950, 550);
            // Set background Image
            piedritasWCGridPane.setBackground(new Background(LobitosMap.createImage("PiedritasMap.png")));
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
            piedritasRecycleGridPane.setBackground(new Background(LobitosMap.createImage("PiedritasMap.png")));
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
            // Create the PiedritasMap_WasteBins Page grid pane
            GridPane piedritasWasteBinsGridPane = PiedritasMap_WasteBins.createPiedritasWasteBinsGridPane();
            piedritasWasteBinsGridPane.setMaxSize( 950, 550);
            // Set background Image
            piedritasWasteBinsGridPane.setBackground(new Background(LobitosMap.createImage("PiedritasMap.png")));
            // Add UI controls to the PiedritasMap_WasteBins form grid pane
            PiedritasMap_WasteBins.addUIControlsPiedritasWasteBinsGridPane(piedritasWasteBinsGridPane, primaryStage);
            // Set the scene in PiedritasMap_WasteBins
            Scene PiedritasWasteBinsScene = new Scene(piedritasWasteBinsGridPane, 950, 550);
            // Display PiedritasMap_WasteBins stage
            primaryStage.setScene(PiedritasWasteBinsScene);
            primaryStage.show();
        });


        backButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Lobitos Map");
            // Create the LobitosMap Page grid pane
            GridPane lobitosMapGridPane = LobitosMap.createLobitosMapGridPane();
            lobitosMapGridPane.setMaxSize( 800, 550);
            // Set background Image
            lobitosMapGridPane.setBackground(new Background( LobitosMap.createImage("LobitosMap.png")));
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


