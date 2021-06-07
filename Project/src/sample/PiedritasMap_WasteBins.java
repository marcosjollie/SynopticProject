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

public class PiedritasMap_WasteBins extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("SMART MAP - Piedritas Map");
        // Create the AmpStart Page grid pane
        GridPane piedritasWasteBinsGridPane = createPiedritasWasteBinsGridPane();
        piedritasWasteBinsGridPane.setMaxSize( 950, 550);
        piedritasWasteBinsGridPane.setBackground(new Background(LobitosMap.createImage("PiedritasMap.png")));
        // Add UI controls to the AmpStart form grid pane
        addUIControlsPiedritasWasteBinsGridPane(piedritasWasteBinsGridPane, primaryStage);
        // Set the scene in AmpStart
        Scene PiedritasWasteBinsScene = new Scene(piedritasWasteBinsGridPane, 950, 550);
        // Display stage
        primaryStage.setScene(PiedritasWasteBinsScene);
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }



    public static GridPane createPiedritasWasteBinsGridPane() {
        // Set new Grid Pane for LoginPage
        GridPane piedritasWasteBinsGridPane = new GridPane();
        piedritasWasteBinsGridPane.setAlignment(Pos.CENTER);
        piedritasWasteBinsGridPane.setPadding(new Insets(25,25,25,25));
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return loginGridPane
        piedritasWasteBinsGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return piedritasWasteBinsGridPane;
    }


    public static void addUIControlsPiedritasWasteBinsGridPane(GridPane piedritasWasteBinsGridPane, Stage primaryStage) {
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
        piedritasWasteBinsGridPane.add(wcButton, 0, 0);
        piedritasWasteBinsGridPane.setMargin(wcButton, new Insets(0, 60,0,-60));

        // Add Toilets Label
        Label toiletsLabel = new Label("Public toilets");
        toiletsLabel.setFont(Font.font("Arial", 14));
        piedritasWasteBinsGridPane.add(toiletsLabel, 1,0);
        piedritasWasteBinsGridPane.setMargin(toiletsLabel, new Insets(0, 60,0,-55));


        // Add Recycling Button
        Button recyclingButton = new Button();
        recyclingButton.setScaleX(0.8);
        recyclingButton.setScaleY(0.8);
        recyclingButton.setBackground(RecyclingImage);
        recyclingButton.setPrefSize(25,25);
        recyclingButton.setDefaultButton(true);
        piedritasWasteBinsGridPane.add(recyclingButton, 0, 1);
        piedritasWasteBinsGridPane.setMargin(recyclingButton, new Insets(0, 60,0,-60));

        // Add Recycling Label
        Label recyclingLabel = new Label("Recycling Points");
        recyclingLabel.setFont(Font.font("Arial", 14));
        piedritasWasteBinsGridPane.add(recyclingLabel, 1,1);
        piedritasWasteBinsGridPane.setMargin(recyclingLabel, new Insets(0, 60,0,-55));


        // Add Waste Bins Button
        Button wasteBinsButton = new Button();
        wasteBinsButton.setScaleX(0.8);
        wasteBinsButton.setScaleY(0.8);
        wasteBinsButton.setBackground(BinImage);
        wasteBinsButton.setPrefSize(25,25);
        wasteBinsButton.setDefaultButton(true);
        piedritasWasteBinsGridPane.add(wasteBinsButton, 0, 2);
        piedritasWasteBinsGridPane.setMargin(wasteBinsButton, new Insets(0, 60,305,-60));

        // Add Waste Bins Label
        Label wasteBinsLabel = new Label("Waste bins");
        wasteBinsLabel.setFont(Font.font("Arial", 14));
        piedritasWasteBinsGridPane.add(wasteBinsLabel, 1,2);
        piedritasWasteBinsGridPane.setMargin(wasteBinsLabel, new Insets(0, 60,305,-55));


        // Add Back Button
        Button backButton = new Button("Back");
        backButton.setFont(Font.font("Arial", 12));
        backButton.setPrefSize(70,20);
        backButton.setDefaultButton(true);
        piedritasWasteBinsGridPane.add(backButton, 0, 10, 1, 1);
        piedritasWasteBinsGridPane.setHalignment(backButton, HPos.LEFT);
        piedritasWasteBinsGridPane.setMargin(backButton, new Insets(0, 20,-135,-20));


        // Add Report Issue Button
        Button reportIssueButton = new Button("Report Issue");
        reportIssueButton.setFont(Font.font("Arial", 12));
        reportIssueButton.setPrefSize(100,20);
        reportIssueButton.setDefaultButton(true);
        piedritasWasteBinsGridPane.add(reportIssueButton, 1, 10, 1, 1);
        piedritasWasteBinsGridPane.setHalignment(reportIssueButton, HPos.RIGHT);
        piedritasWasteBinsGridPane.setMargin(reportIssueButton, new Insets(0, -20,-135, 20));


        wcButton.setOnAction(event -> {

        });

        recyclingButton.setOnAction(event -> {

        });


        wasteBinsButton.setOnAction(event -> {

        });


        backButton.setOnAction(event -> {
            primaryStage.setTitle("SMART MAP - Home Page");
            GridPane homePageGridPane = HomePage.createHomePageGridPane();
            homePageGridPane.setStyle("-fx-background-color: #4aa4ef");
            HomePage.addUIControlsHomePage(homePageGridPane, primaryStage);
            Scene HomePageScene = new Scene(homePageGridPane, 800, 500);
            primaryStage.setScene(HomePageScene);
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



