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

public class PiedritasMap_WC extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("SMART MAP - Piedritas Map");
        // Create the AmpStart Page grid pane
        GridPane piedritasWCGridPane = createPiedritasWCGridPane();
        piedritasWCGridPane.setMaxSize( 950, 550);
        piedritasWCGridPane.setBackground(new Background(LobitosMap.createImage("PiedritasMap.png")));
        // Add UI controls to the AmpStart form grid pane
        addUIControlsPiedritasWCGridPane(piedritasWCGridPane, primaryStage);
        // Set the scene in AmpStart
        Scene PiedritasWCScene = new Scene(piedritasWCGridPane, 950, 550);
        // Display stage
        primaryStage.setScene(PiedritasWCScene);
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }



    public static GridPane createPiedritasWCGridPane() {
        // Set new Grid Pane for LoginPage
        GridPane piedritasWCGridPane = new GridPane();
        piedritasWCGridPane.setAlignment(Pos.CENTER);
        piedritasWCGridPane.setPadding(new Insets(25,25,25,25));
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return loginGridPane
        piedritasWCGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return piedritasWCGridPane;
    }


    public static void addUIControlsPiedritasWCGridPane(GridPane piedritasWCGridPane, Stage primaryStage) {
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
        piedritasWCGridPane.add(wcButton, 0, 0);
        piedritasWCGridPane.setMargin(wcButton, new Insets(0, 60,0,-60));

        // Add Toilets Label
        Label toiletsLabel = new Label("Public toilets");
        toiletsLabel.setFont(Font.font("Arial", 14));
        piedritasWCGridPane.add(toiletsLabel, 1,0);
        piedritasWCGridPane.setMargin(toiletsLabel, new Insets(0, 60,0,-55));


        // Add Recycling Button
        Button recyclingButton = new Button();
        recyclingButton.setScaleX(0.8);
        recyclingButton.setScaleY(0.8);
        recyclingButton.setBackground(RecyclingImage);
        recyclingButton.setPrefSize(25,25);
        recyclingButton.setDefaultButton(true);
        piedritasWCGridPane.add(recyclingButton, 0, 1);
        piedritasWCGridPane.setMargin(recyclingButton, new Insets(0, 60,0,-60));

        // Add Recycling Label
        Label recyclingLabel = new Label("Recycling Points");
        recyclingLabel.setFont(Font.font("Arial", 14));
        piedritasWCGridPane.add(recyclingLabel, 1,1);
        piedritasWCGridPane.setMargin(recyclingLabel, new Insets(0, 60,0,-55));


        // Add Waste Bins Button
        Button wasteBinsButton = new Button();
        wasteBinsButton.setScaleX(0.8);
        wasteBinsButton.setScaleY(0.8);
        wasteBinsButton.setBackground(BinImage);
        wasteBinsButton.setPrefSize(25,25);
        wasteBinsButton.setDefaultButton(true);
        piedritasWCGridPane.add(wasteBinsButton, 0, 2);
        piedritasWCGridPane.setMargin(wasteBinsButton, new Insets(0, 60,280,-60));

        // Add Waste Bins Label
        Label wasteBinsLabel = new Label("Waste bins");
        wasteBinsLabel.setFont(Font.font("Arial", 14));
        piedritasWCGridPane.add(wasteBinsLabel, 1,2);
        piedritasWCGridPane.setMargin(wasteBinsLabel, new Insets(0, 60,280,-55));


        // Add Back Button
        Button backButton = new Button("Back");
        backButton.setFont(Font.font("Arial", 12));
        backButton.setPrefSize(70,20);
        backButton.setDefaultButton(true);
        piedritasWCGridPane.add(backButton, 0, 10, 1, 1);
        piedritasWCGridPane.setHalignment(backButton, HPos.LEFT);
        piedritasWCGridPane.setMargin(backButton, new Insets(0, 20,-135,-20));


        // Add Report Issue Button
        Button reportIssueButton = new Button("Report Issue");
        reportIssueButton.setFont(Font.font("Arial", 12));
        reportIssueButton.setPrefSize(100,20);
        reportIssueButton.setDefaultButton(true);
        piedritasWCGridPane.add(reportIssueButton, 1, 10, 1, 1);
        piedritasWCGridPane.setHalignment(reportIssueButton, HPos.RIGHT);
        piedritasWCGridPane.setMargin(reportIssueButton, new Insets(0, -20,-135, 20));


        ////////////////////////////////////////////////////////////////////////////

        // Add WC Button
        Button wcButton1 = new Button();
        wcButton1.setBackground(WCImage);
        wcButton1.setScaleX(0.4);
        wcButton1.setScaleY(0.4);
        wcButton1.setPrefSize(25,25);
        wcButton1.setDefaultButton(true);
        piedritasWCGridPane.add(wcButton1, 0, 4);
        piedritasWCGridPane.setMargin(wcButton1, new Insets(-25, -328,25,328));

        Button wcButton2 = new Button();
        wcButton2.setBackground(WCImage);
        wcButton2.setScaleX(0.4);
        wcButton2.setScaleY(0.4);
        wcButton2.setPrefSize(25,25);
        wcButton2.setDefaultButton(true);
        piedritasWCGridPane.add(wcButton2, 1, 4);
        piedritasWCGridPane.setMargin(wcButton2, new Insets(-260, -730,260,730));


        //////////////////////////////////////////////////////////////////////////////

        wcButton1.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                piedritasWCGridPane.getScene().getWindow(), "Public Toilet", "Location: ");
        });

        wcButton2.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                piedritasWCGridPane.getScene().getWindow(), "Public Toilet", "Location: ");
        });

        //////////////////////////////////////////////////////////////////////////////

        wcButton.setOnAction(event -> {
            primaryStage.setTitle("SMART MAP - Piedritas Map");
            GridPane piedritasMapGridPane = PiedritasMap.createPiedritasMapGridPane();
            piedritasMapGridPane.setMaxSize( 950, 550);
            piedritasMapGridPane.setBackground(new Background( LobitosMap.createImage("PiedritasMap.png")));
            PiedritasMap.addUIControlsPiedritasMap(piedritasMapGridPane, primaryStage);
            Scene PiedritasMapScene = new Scene(piedritasMapGridPane, 950, 550);
            primaryStage.setScene(PiedritasMapScene);
            primaryStage.show();
        });

        recyclingButton.setOnAction(event -> {
            primaryStage.setTitle("SMART MAP - Piedritas Map");
            GridPane piedritasRecyclingGridPane = PiedritasMap_Recycling.createPiedritasRecyclingGridPane();
            piedritasRecyclingGridPane.setMaxSize( 950, 550);
            piedritasRecyclingGridPane.setBackground(new Background(LobitosMap.createImage("PiedritasMap.png")));
            PiedritasMap_Recycling.addUIControlsPiedritasRecyclingGridPane(piedritasRecyclingGridPane, primaryStage);
            Scene PiedritasRecyclingScene = new Scene(piedritasRecyclingGridPane, 950, 550);
            primaryStage.setScene(PiedritasRecyclingScene);
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



