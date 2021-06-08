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

public class PiedritasMap_Recycling extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("SMART MAP - Piedritas Map");
        // Create the AmpStart Page grid pane
        GridPane piedritasRecyclingGridPane = createPiedritasRecyclingGridPane();
        piedritasRecyclingGridPane.setMaxSize( 950, 550);
        piedritasRecyclingGridPane.setBackground(new Background(LobitosMap.createImage("PiedritasMap.png")));
        // Add UI controls to the AmpStart form grid pane
        addUIControlsPiedritasRecyclingGridPane(piedritasRecyclingGridPane, primaryStage);
        // Set the scene in AmpStart
        Scene PiedritasRecyclingScene = new Scene(piedritasRecyclingGridPane, 950, 550);
        // Display stage
        primaryStage.setScene(PiedritasRecyclingScene);
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }



    public static GridPane createPiedritasRecyclingGridPane() {
        // Set new Grid Pane for LoginPage
        GridPane piedritasRecyclingGridPane = new GridPane();
        piedritasRecyclingGridPane.setAlignment(Pos.CENTER);
        piedritasRecyclingGridPane.setPadding(new Insets(25,25,25,25));
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return loginGridPane
        piedritasRecyclingGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return piedritasRecyclingGridPane;
    }


    public static void addUIControlsPiedritasRecyclingGridPane(GridPane piedritasRecyclingGridPane, Stage primaryStage) {
        Background WCImage = new Background( PiedritasMap.createImage("WC.png"));
        Background RecyclingImage = new Background( PiedritasMap.createImage("Recycling.png"));
        Background BinImage = new Background( PiedritasMap.createImage("Bin.png"));

        // Add WC Button
        Button wcButton = new Button();
        wcButton.setBackground(WCImage);
        wcButton.setScaleX(0.8);
        wcButton.setScaleY(0.8);
        wcButton.setPrefSize(25,25);
        wcButton.setDefaultButton(true);
        piedritasRecyclingGridPane.add(wcButton, 0, 0);
        piedritasRecyclingGridPane.setMargin(wcButton, new Insets(0, 60,0,-60));

        // Add Toilets Label
        Label toiletsLabel = new Label("Public toilets");
        toiletsLabel.setFont(Font.font("Arial", 14));
        piedritasRecyclingGridPane.add(toiletsLabel, 1,0);
        piedritasRecyclingGridPane.setMargin(toiletsLabel, new Insets(0, 60,0,-55));


        // Add Recycling Button
        Button recyclingButton = new Button();
        recyclingButton.setScaleX(0.8);
        recyclingButton.setScaleY(0.8);
        recyclingButton.setBackground(RecyclingImage);
        recyclingButton.setPrefSize(25,25);
        recyclingButton.setDefaultButton(true);
        piedritasRecyclingGridPane.add(recyclingButton, 0, 1);
        piedritasRecyclingGridPane.setMargin(recyclingButton, new Insets(0, 60,0,-60));

        // Add Recycling Label
        Label recyclingLabel = new Label("Recycling Points");
        recyclingLabel.setFont(Font.font("Arial", 14));
        piedritasRecyclingGridPane.add(recyclingLabel, 1,1);
        piedritasRecyclingGridPane.setMargin(recyclingLabel, new Insets(0, 60,0,-55));


        // Add Waste Bins Button
        Button wasteBinsButton = new Button();
        wasteBinsButton.setScaleX(0.8);
        wasteBinsButton.setScaleY(0.8);
        wasteBinsButton.setBackground(BinImage);
        wasteBinsButton.setPrefSize(25,25);
        wasteBinsButton.setDefaultButton(true);
        piedritasRecyclingGridPane.add(wasteBinsButton, 0, 2);
        piedritasRecyclingGridPane.setMargin(wasteBinsButton, new Insets(0, 60,280,-60));

        // Add Waste Bins Label
        Label wasteBinsLabel = new Label("Waste bins");
        wasteBinsLabel.setFont(Font.font("Arial", 14));
        piedritasRecyclingGridPane.add(wasteBinsLabel, 1,2);
        piedritasRecyclingGridPane.setMargin(wasteBinsLabel, new Insets(0, 60,280,-55));


        // Add Back Button
        Button backButton = new Button("Back");
        backButton.setFont(Font.font("Arial", 12));
        backButton.setPrefSize(70,20);
        backButton.setDefaultButton(true);
        piedritasRecyclingGridPane.add(backButton, 0, 10, 1, 1);
        piedritasRecyclingGridPane.setHalignment(backButton, HPos.LEFT);
        piedritasRecyclingGridPane.setMargin(backButton, new Insets(0, 20,-135,-20));


        // Add Report Issue Button
        Button reportIssueButton = new Button("Report Issue");
        reportIssueButton.setFont(Font.font("Arial", 12));
        reportIssueButton.setPrefSize(100,20);
        reportIssueButton.setDefaultButton(true);
        piedritasRecyclingGridPane.add(reportIssueButton, 1, 10, 1, 1);
        piedritasRecyclingGridPane.setHalignment(reportIssueButton, HPos.RIGHT);
        piedritasRecyclingGridPane.setMargin(reportIssueButton, new Insets(0, -20,-135, 20));


        ////////////////////////////////////////////////////////////////////////////

        // Add WC Button
        Button wcButton1 = new Button();
        wcButton1.setBackground(RecyclingImage);
        wcButton1.setScaleX(0.4);
        wcButton1.setScaleY(0.4);
        wcButton1.setPrefSize(25,25);
        wcButton1.setDefaultButton(true);
        piedritasRecyclingGridPane.add(wcButton1, 0, 4);
        piedritasRecyclingGridPane.setMargin(wcButton1, new Insets(-60, -200,60,200));

        Button wcButton2 = new Button();
        wcButton2.setBackground(RecyclingImage);
        wcButton2.setScaleX(0.4);
        wcButton2.setScaleY(0.4);
        wcButton2.setPrefSize(25,25);
        wcButton2.setDefaultButton(true);
        piedritasRecyclingGridPane.add(wcButton2, 1, 4);
        piedritasRecyclingGridPane.setMargin(wcButton2, new Insets(-80, -765,80,765));

//        Button wcButton3 = new Button();
//        wcButton3.setBackground(RecyclingImage);
//        wcButton3.setScaleX(0.4);
//        wcButton3.setScaleY(0.4);
//        wcButton3.setPrefSize(25,25);
//        wcButton3.setDefaultButton(true);
//        piedritasRecyclingGridPane.add(wcButton3, 2, 4);
//        piedritasRecyclingGridPane.setMargin(wcButton3, new Insets(5, 400,-5,-400));

        //////////////////////////////////////////////////////////////////////////////


        wcButton.setOnAction(event -> {
            primaryStage.setTitle("SMART MAP - Piedritas Map");
            GridPane piedritasWCGridPane = PiedritasMap_WC.createPiedritasWCGridPane();
            piedritasWCGridPane.setMaxSize( 950, 550);
            piedritasWCGridPane.setBackground(new Background(LobitosMap.createImage("PiedritasMap.png")));
            PiedritasMap_WC.addUIControlsPiedritasWCGridPane(piedritasWCGridPane, primaryStage);
            Scene PiedritasWCScene = new Scene(piedritasWCGridPane, 950, 550);
            primaryStage.setScene(PiedritasWCScene);
            primaryStage.show();
        });

        recyclingButton.setOnAction(event -> {
            primaryStage.setTitle("SMART MAP - Piedritas Map");
            GridPane piedritasMapGridPane = PiedritasMap.createPiedritasMapGridPane();
            piedritasMapGridPane.setMaxSize( 950, 550);
            piedritasMapGridPane.setBackground(new Background( LobitosMap.createImage("PiedritasMap.png")));
            PiedritasMap.addUIControlsPiedritasMap(piedritasMapGridPane, primaryStage);
            Scene PiedritasMapScene = new Scene(piedritasMapGridPane, 950, 550);
            primaryStage.setScene(PiedritasMapScene);
            primaryStage.show();
        });


        wasteBinsButton.setOnAction(event -> {
            primaryStage.setTitle("SMART MAP - Piedritas Map");
            GridPane piedritasWasteBinsGridPane = PiedritasMap_WasteBins.createPiedritasWasteBinsGridPane();
            piedritasWasteBinsGridPane.setMaxSize( 950, 550);
            piedritasWasteBinsGridPane.setBackground(new Background(LobitosMap.createImage("PiedritasMap.png")));
            PiedritasMap_WasteBins.addUIControlsPiedritasWasteBinsGridPane(piedritasWasteBinsGridPane, primaryStage);
            Scene PiedritasWasteBinsScene = new Scene(piedritasWasteBinsGridPane, 950, 550);
            primaryStage.setScene(PiedritasWasteBinsScene);
            primaryStage.show();
        });


        backButton.setOnAction(event -> {
            primaryStage.setTitle("SMART MAP - Piedritas Map");
            GridPane piedritasMapGridPane = PiedritasMap.createPiedritasMapGridPane();
            piedritasMapGridPane.setMaxSize( 950, 550);
            piedritasMapGridPane.setBackground(new Background( LobitosMap.createImage("PiedritasMap.png")));
            PiedritasMap.addUIControlsPiedritasMap(piedritasMapGridPane, primaryStage);
            Scene PiedritasMapScene = new Scene(piedritasMapGridPane, 950, 550);
            primaryStage.setScene(PiedritasMapScene);
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




