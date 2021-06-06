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

public class LobitosMap_WasteBins extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("SMART MAP - Lobitos Map");
        // Create the AmpStart Page grid pane
        GridPane lobitosWasteBinsGridPane = createLobitosWasteBinsGridPane();
        lobitosWasteBinsGridPane.setMaxSize( 800, 550);
        lobitosWasteBinsGridPane.setBackground(new Background( LobitosMap.createImage("LobitosMap.png")));
        // Add UI controls to the AmpStart form grid pane
        addUIControlsLobitosWasteBins(lobitosWasteBinsGridPane, primaryStage);
        // Set the scene in AmpStart
        Scene LobitosWastBinsScene = new Scene(lobitosWasteBinsGridPane, 800, 550);
        // Display stage
        primaryStage.setScene(LobitosWastBinsScene);
        primaryStage.show();
    }



    public static void main(String[] args) { launch(args); }



    public static GridPane createLobitosWasteBinsGridPane() {
        // Set new Grid Pane for LoginPage
        GridPane lobitosWastBinsGridPane = new GridPane();
        lobitosWastBinsGridPane.setAlignment(Pos.CENTER);
        lobitosWastBinsGridPane.setPadding(new Insets(0, 0, 0, 0));
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return loginGridPane
        lobitosWastBinsGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return lobitosWastBinsGridPane;
    }



    public static void addUIControlsLobitosWasteBins(GridPane lobitosWasteBinsGridPane, Stage primaryStage) {

        Background WCImage = new Background(LobitosMap.createImage("WC.png"));
        Background RecyclingImage = new Background(LobitosMap.createImage("Recycling.png"));
        Background BinImage = new Background(LobitosMap.createImage("Bin.png"));

        // Add WC Button
        Button wcButton = new Button();
        wcButton.setBackground(WCImage);
        wcButton.setScaleX(0.8);
        wcButton.setScaleY(0.8);
        wcButton.setPrefSize(25,25);
        wcButton.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton, 0, 0);
        lobitosWasteBinsGridPane.setMargin(wcButton, new Insets(20, 35,0,-35));

        // Add Toilets Label
        Label toiletsLabel = new Label("Public toilets");
        toiletsLabel.setFont(Font.font("Arial", 14));
        lobitosWasteBinsGridPane.add(toiletsLabel, 1,0);
        lobitosWasteBinsGridPane.setMargin(toiletsLabel, new Insets(20, 35,0,-30));


        // Add Recycling Button
        Button recyclingButton = new Button();
        recyclingButton.setBackground(RecyclingImage);
        recyclingButton.setScaleX(0.8);
        recyclingButton.setScaleY(0.8);
        recyclingButton.setPrefSize(25,25);
        recyclingButton.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(recyclingButton, 0, 1);
        lobitosWasteBinsGridPane.setMargin(recyclingButton, new Insets(0, 35,0,-35));

        // Add Recycling Label
        Label recyclingLabel = new Label("Recycling Points");
        recyclingLabel.setFont(Font.font("Arial", 14));
        lobitosWasteBinsGridPane.add(recyclingLabel, 1,1);
        lobitosWasteBinsGridPane.setMargin(recyclingLabel, new Insets(0, 35,0,-30));


        // Add Waste Bins Button
        Button wasteBinsButton = new Button();
        wasteBinsButton.setBackground(BinImage);
        wasteBinsButton.setScaleX(0.8);
        wasteBinsButton.setScaleY(0.8);
        wasteBinsButton.setPrefSize(25,25);
        wasteBinsButton.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton, 0, 2);
        lobitosWasteBinsGridPane.setMargin(wasteBinsButton, new Insets(0, 35,300,-35));

        // Add Waste Bins Label
        Label wasteBinsLabel = new Label("Waste bins");
        wasteBinsLabel.setFont(Font.font("Arial", 14));
        lobitosWasteBinsGridPane.add(wasteBinsLabel, 1,2);
        lobitosWasteBinsGridPane.setMargin(wasteBinsLabel, new Insets(0, 35,300,-30));


        // Add Back Button
        Button backButton = new Button("Back");
        backButton.setFont(Font.font("Arial", 12));
        backButton.setPrefSize(70,20);
        backButton.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(backButton, 0, 10, 1, 1);
        lobitosWasteBinsGridPane.setHalignment(backButton, HPos.LEFT);
        lobitosWasteBinsGridPane.setMargin(backButton, new Insets(0, -5,-95,5));


        // Add Report Issue Button
        Button reportIssueButton = new Button("Report Issue");
        reportIssueButton.setFont(Font.font("Arial", 12));
        reportIssueButton.setPrefSize(100,20);
        reportIssueButton.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(reportIssueButton, 1, 10, 1, 1);
        lobitosWasteBinsGridPane.setHalignment(reportIssueButton, HPos.RIGHT);
        lobitosWasteBinsGridPane.setMargin(reportIssueButton, new Insets(0, -95,-95, 95));


        //////////////////////////////////////////////////

        // Add Waste Bin Button
        Button wcButton1 = new Button();
        wcButton1.setBackground(BinImage);
        wcButton1.setScaleX(0.4);
        wcButton1.setScaleY(0.4);
        wcButton1.setPrefSize(25,25);
        wcButton1.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton1, 0, 4);
        lobitosWasteBinsGridPane.setMargin(wcButton1, new Insets(35, 68,-35,-68));

        Button wcButton2 = new Button();
        wcButton2.setBackground(BinImage);
        wcButton2.setScaleX(0.4);
        wcButton2.setScaleY(0.4);
        wcButton2.setPrefSize(25,25);
        wcButton2.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton2, 1, 4);
        lobitosWasteBinsGridPane.setMargin(wcButton2, new Insets(-5, 50,5,-50));

        Button wcButton3 = new Button();
        wcButton3.setBackground(BinImage);
        wcButton3.setScaleX(0.4);
        wcButton3.setScaleY(0.4);
        wcButton3.setPrefSize(25,25);
        wcButton3.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton3, 2, 4);
        lobitosWasteBinsGridPane.setMargin(wcButton3, new Insets(-70, 520,70,-520));

        Button wcButton4 = new Button();
        wcButton4.setBackground(BinImage);
        wcButton4.setScaleX(0.4);
        wcButton4.setScaleY(0.4);
        wcButton4.setPrefSize(25,25);
        wcButton4.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton4, 3, 4);
        lobitosWasteBinsGridPane.setMargin(wcButton4, new Insets(-60, 450,60,-450));

        Button wcButton5 = new Button();
        wcButton5.setBackground(BinImage);
        wcButton5.setScaleX(0.4);
        wcButton5.setScaleY(0.4);
        wcButton5.setPrefSize(25,25);
        wcButton5.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton5, 4, 4);
        lobitosWasteBinsGridPane.setMargin(wcButton5, new Insets(25, 455,-25,-455));

        Button wcButton6 = new Button();
        wcButton6.setBackground(BinImage);
        wcButton6.setScaleX(0.4);
        wcButton6.setScaleY(0.4);
        wcButton6.setPrefSize(25,25);
        wcButton6.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton6, 5, 4);
        lobitosWasteBinsGridPane.setMargin(wcButton6, new Insets(-65, 370,65,-370));


        Button wcButton7 = new Button();
        wcButton7.setBackground(BinImage);
        wcButton7.setScaleX(0.4);
        wcButton7.setScaleY(0.4);
        wcButton7.setPrefSize(25,25);
        wcButton7.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton7, 5, 4);
        lobitosWasteBinsGridPane.setMargin(wcButton7, new Insets(-18, 275,18,-275));


        Button wcButton8 = new Button();
        wcButton8.setBackground(BinImage);
        wcButton8.setScaleX(0.4);
        wcButton8.setScaleY(0.4);
        wcButton8.setPrefSize(25,25);
        wcButton8.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton8, 5, 4);
        lobitosWasteBinsGridPane.setMargin(wcButton8, new Insets(-200, 300,200,-300));


        Button wcButton9 = new Button();
        wcButton9.setBackground(BinImage);
        wcButton9.setScaleX(0.4);
        wcButton9.setScaleY(0.4);
        wcButton9.setPrefSize(25,25);
        wcButton9.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton9, 5, 4);
        lobitosWasteBinsGridPane.setMargin(wcButton9, new Insets(-160, 295,160,-295));


        Button wcButton10 = new Button();
        wcButton10.setBackground(BinImage);
        wcButton10.setScaleX(0.4);
        wcButton10.setScaleY(0.4);
        wcButton10.setPrefSize(25,25);
        wcButton10.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton10, 5, 4);
        lobitosWasteBinsGridPane.setMargin(wcButton10, new Insets(-145, 240,145,-240));


        Button wcButton11 = new Button();
        wcButton11.setBackground(BinImage);
        wcButton11.setScaleX(0.4);
        wcButton11.setScaleY(0.4);
        wcButton11.setPrefSize(25,25);
        wcButton11.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton11, 5, 4);
        lobitosWasteBinsGridPane.setMargin(wcButton11, new Insets(-25, 100,25,-100));

        Button wcButton12 = new Button();
        wcButton12.setBackground(BinImage);
        wcButton12.setScaleX(0.4);
        wcButton12.setScaleY(0.4);
        wcButton12.setPrefSize(25,25);
        wcButton12.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton12, 5, 4);
        lobitosWasteBinsGridPane.setMargin(wcButton12, new Insets(30, 100,-30,-100));

        Button wcButton13 = new Button();
        wcButton13.setBackground(BinImage);
        wcButton13.setScaleX(0.4);
        wcButton13.setScaleY(0.4);
        wcButton13.setPrefSize(25,25);
        wcButton13.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton13, 5, 4);
        lobitosWasteBinsGridPane.setMargin(wcButton13, new Insets(-370, 155,370,-155));

        Button wcButton14 = new Button();
        wcButton14.setBackground(BinImage);
        wcButton14.setScaleX(0.4);
        wcButton14.setScaleY(0.4);
        wcButton14.setPrefSize(25,25);
        wcButton14.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wcButton14, 5, 4);
        lobitosWasteBinsGridPane.setMargin(wcButton14, new Insets(-320, 95,320,-95));


        //////////////////////////////////////////////////

        wcButton.setOnAction(event -> {
            primaryStage.setTitle("SMART MAP - Lobitos Map");
            GridPane lobitosWCGridPane = LobitosMap_WC.createLobitosWCGridPane();
            lobitosWCGridPane.setMaxSize( 800, 550);
            lobitosWCGridPane.setBackground(new Background(LobitosMap.createImage("LobitosMap.png")));
            LobitosMap_WC.addUIControlsLobitosWC(lobitosWCGridPane, primaryStage);
            Scene LobitosWCScene = new Scene(lobitosWCGridPane, 800, 550);
            primaryStage.setScene(LobitosWCScene);
            primaryStage.show();
        });

        recyclingButton.setOnAction(event -> {
            primaryStage.setTitle("SMART MAP - Lobitos Map");
            // Create the AmpStart Page grid pane
            GridPane lobitosRecycleGridPane = LobitosMap_Recylcing.createLobitosRecycleGridPane();
            lobitosRecycleGridPane.setMaxSize( 800, 550);
            lobitosRecycleGridPane.setBackground(new Background( LobitosMap.createImage("LobitosMap.png")));
            // Add UI controls to the AmpStart form grid pane
            LobitosMap_Recylcing.addUIControlsLobitosRecycle(lobitosRecycleGridPane, primaryStage);
            // Set the scene in AmpStart
            Scene LobitosRecycleScene = new Scene(lobitosRecycleGridPane, 800, 550);
            // Display stage
            primaryStage.setScene(LobitosRecycleScene);
            primaryStage.show();
        });

        wasteBinsButton.setOnAction(event -> {
            primaryStage.setTitle("SMART MAP - Lobitos Map");
            GridPane lobitosMapGridPane = LobitosMap.createLobitosMapGridPane();
            lobitosMapGridPane.setMaxSize( 800, 550);
            lobitosMapGridPane.setBackground(new Background(LobitosMap.createImage("LobitosMap.png")));
            LobitosMap.addUIControlsLobitosMap(lobitosMapGridPane, primaryStage);
            Scene LobitosMapScene = new Scene(lobitosMapGridPane, 800, 550);
            primaryStage.setScene(LobitosMapScene);
            primaryStage.show();
        });

        backButton.setOnAction(event -> {
            primaryStage.setTitle("SMART MAP - Lobitos Map");
            GridPane lobitosMapGridPane = LobitosMap.createLobitosMapGridPane();
            lobitosMapGridPane.setMaxSize( 800, 550);
            lobitosMapGridPane.setBackground(new Background(LobitosMap.createImage("LobitosMap.png")));
            LobitosMap.addUIControlsLobitosMap(lobitosMapGridPane, primaryStage);
            Scene LobitosMapScene = new Scene(lobitosMapGridPane, 800, 550);
            primaryStage.setScene(LobitosMapScene);
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


