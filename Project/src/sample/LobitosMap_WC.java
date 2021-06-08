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

public class LobitosMap_WC extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("SMART MAP - Lobitos Map");
        // Create the AmpStart Page grid pane
        GridPane lobitosWCGridPane = createLobitosWCGridPane();
        lobitosWCGridPane.setMaxSize( 800, 550);
        lobitosWCGridPane.setBackground(new Background(LobitosMap.createImage("LobitosMap.png")));
        // Add UI controls to the AmpStart form grid pane
        addUIControlsLobitosWC(lobitosWCGridPane, primaryStage);
        // Set the scene in AmpStart
        Scene LobitosWCScene = new Scene(lobitosWCGridPane, 800, 550);
        // Display stage
        primaryStage.setScene(LobitosWCScene);
        primaryStage.show();
    }



    public static void main(String[] args) { launch(args); }



    public static GridPane createLobitosWCGridPane() {
        // Set new Grid Pane for LoginPage
        GridPane lobitosWCGridPane = new GridPane();
        lobitosWCGridPane.setAlignment(Pos.CENTER);
        lobitosWCGridPane.setPadding(new Insets(0, 0, 0, 0));
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return loginGridPane
        lobitosWCGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return lobitosWCGridPane;
    }



    public static void addUIControlsLobitosWC(GridPane lobitosWCGridPane, Stage primaryStage) {

        Background WCImage = new Background( LobitosMap.createImage("WC.png"));
        Background RecyclingImage = new Background( LobitosMap.createImage("Recycling.png"));
        Background BinImage = new Background( LobitosMap.createImage("Bin.png"));

        // Add WC Button
        Button wcButton = new Button();
        wcButton.setBackground(WCImage);
        wcButton.setScaleX(0.8);
        wcButton.setScaleY(0.8);
        wcButton.setPrefSize(25,25);
        wcButton.setDefaultButton(true);
        lobitosWCGridPane.add(wcButton, 0, 0);
        lobitosWCGridPane.setMargin(wcButton, new Insets(20, 35,0,-35));

        // Add Toilets Label
        Label toiletsLabel = new Label("Public toilets");
        toiletsLabel.setFont(Font.font("Arial", 14));
        lobitosWCGridPane.add(toiletsLabel, 1,0);
        lobitosWCGridPane.setMargin(toiletsLabel, new Insets(20, 35,0,-30));


        // Add Recycling Button
        Button recyclingButton = new Button();
        recyclingButton.setBackground(RecyclingImage);
        recyclingButton.setScaleX(0.8);
        recyclingButton.setScaleY(0.8);
        recyclingButton.setPrefSize(25,25);
        recyclingButton.setDefaultButton(true);
        lobitosWCGridPane.add(recyclingButton, 0, 1);
        lobitosWCGridPane.setMargin(recyclingButton, new Insets(0, 35,0,-35));

        // Add Recycling Label
        Label recyclingLabel = new Label("Recycling Points");
        recyclingLabel.setFont(Font.font("Arial", 14));
        lobitosWCGridPane.add(recyclingLabel, 1,1);
        lobitosWCGridPane.setMargin(recyclingLabel, new Insets(0, 35,0,-30));


        // Add Waste Bins Button
        Button wasteBinsButton = new Button();
        wasteBinsButton.setBackground(BinImage);
        wasteBinsButton.setScaleX(0.8);
        wasteBinsButton.setScaleY(0.8);
        wasteBinsButton.setPrefSize(25,25);
        wasteBinsButton.setDefaultButton(true);
        lobitosWCGridPane.add(wasteBinsButton, 0, 2);
        lobitosWCGridPane.setMargin(wasteBinsButton, new Insets(0, 35,300,-35));

        // Add Waste Bins Label
        Label wasteBinsLabel = new Label("Waste bins");
        wasteBinsLabel.setFont(Font.font("Arial", 14));
        lobitosWCGridPane.add(wasteBinsLabel, 1,2);
        lobitosWCGridPane.setMargin(wasteBinsLabel, new Insets(0, 35,300,-30));


        // Add Back Button
        Button backButton = new Button("Back");
        backButton.setFont(Font.font("Arial", 12));
        backButton.setPrefSize(70,20);
        backButton.setDefaultButton(true);
        lobitosWCGridPane.add(backButton, 0, 10, 1, 1);
        lobitosWCGridPane.setHalignment(backButton, HPos.LEFT);
        lobitosWCGridPane.setMargin(backButton, new Insets(0, -5,-95,5));


        // Add Report Issue Button
        Button reportIssueButton = new Button("Report Issue");
        reportIssueButton.setFont(Font.font("Arial", 12));
        reportIssueButton.setPrefSize(100,20);
        reportIssueButton.setDefaultButton(true);
        lobitosWCGridPane.add(reportIssueButton, 1, 10, 1, 1);
        lobitosWCGridPane.setHalignment(reportIssueButton, HPos.RIGHT);
        lobitosWCGridPane.setMargin(reportIssueButton, new Insets(0, -95,-95, 95));


        //////////////////////////////////////////////////

        // Add WC Button
        Button wcButton1 = new Button();
        wcButton1.setBackground(WCImage);
        wcButton1.setScaleX(0.4);
        wcButton1.setScaleY(0.4);
        wcButton1.setPrefSize(25,25);
        wcButton1.setDefaultButton(true);
        lobitosWCGridPane.add(wcButton1, 0, 4);
        lobitosWCGridPane.setMargin(wcButton1, new Insets(-115, -100,115,100));

        Button wcButton2 = new Button();
        wcButton2.setBackground(WCImage);
        wcButton2.setScaleX(0.4);
        wcButton2.setScaleY(0.4);
        wcButton2.setPrefSize(25,25);
        wcButton2.setDefaultButton(true);
        lobitosWCGridPane.add(wcButton2, 1, 4);
        lobitosWCGridPane.setMargin(wcButton2, new Insets(-20, -160,20,160));

        Button wcButton3 = new Button();
        wcButton3.setBackground(WCImage);
        wcButton3.setScaleX(0.4);
        wcButton3.setScaleY(0.4);
        wcButton3.setPrefSize(25,25);
        wcButton3.setDefaultButton(true);
        lobitosWCGridPane.add(wcButton3, 2, 4);
        lobitosWCGridPane.setMargin(wcButton3, new Insets(5, 400,-5,-400));

        Button wcButton4 = new Button();
        wcButton4.setBackground(WCImage);
        wcButton4.setScaleX(0.4);
        wcButton4.setScaleY(0.4);
        wcButton4.setPrefSize(25,25);
        wcButton4.setDefaultButton(true);
        lobitosWCGridPane.add(wcButton4, 3, 4);
        lobitosWCGridPane.setMargin(wcButton4, new Insets(-45, 410,45,-410));

        Button wcButton5 = new Button();
        wcButton5.setBackground(WCImage);
        wcButton5.setScaleX(0.4);
        wcButton5.setScaleY(0.4);
        wcButton5.setPrefSize(25,25);
        wcButton5.setDefaultButton(true);
        lobitosWCGridPane.add(wcButton5, 4, 4);
        lobitosWCGridPane.setMargin(wcButton5, new Insets(-115, 350,115,-350));

        Button wcButton6 = new Button();
        wcButton6.setBackground(WCImage);
        wcButton6.setScaleX(0.4);
        wcButton6.setScaleY(0.4);
        wcButton6.setPrefSize(25,25);
        wcButton6.setDefaultButton(true);
        lobitosWCGridPane.add(wcButton6, 5, 4);
        lobitosWCGridPane.setMargin(wcButton6, new Insets(-190, 310,190,-310));


        Button wcButton7 = new Button();
        wcButton7.setBackground(WCImage);
        wcButton7.setScaleX(0.4);
        wcButton7.setScaleY(0.4);
        wcButton7.setPrefSize(25,25);
        wcButton7.setDefaultButton(true);
        lobitosWCGridPane.add(wcButton7, 5, 4);
        lobitosWCGridPane.setMargin(wcButton7, new Insets(-20, 285,20,-285));



        //////////////////////////////////////////////////

        wcButton1.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWCGridPane.getScene().getWindow(), "Public Toilet", "Location: ");
        });

        wcButton2.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWCGridPane.getScene().getWindow(), "Public Toilet", "Location: ");
        });

        wcButton3.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWCGridPane.getScene().getWindow(), "Public Toilet", "Location: ");
        });

        wcButton4.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWCGridPane.getScene().getWindow(), "Public Toilet", "Location: ");
        });

        wcButton5.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWCGridPane.getScene().getWindow(), "Public Toilet", "Location: ");
        });

        wcButton6.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWCGridPane.getScene().getWindow(), "Public Toilet", "Location: ");
        });

        wcButton7.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWCGridPane.getScene().getWindow(), "Public Toilet", "Location: ");
        });


        /////////////////////////////////////////////////////////////////////

        wcButton.setOnAction(event -> {
            primaryStage.setTitle("SMART MAP - Lobitos Map");
            GridPane lobitosMapGridPane = LobitosMap.createLobitosMapGridPane();
            lobitosMapGridPane.setMaxSize( 800, 550);
            lobitosMapGridPane.setBackground(new Background(LobitosMap.createImage("LobitosMap.png")));
            LobitosMap.addUIControlsLobitosMap(lobitosMapGridPane, primaryStage);
            Scene LobitosMapScene = new Scene(lobitosMapGridPane, 800, 550);
            primaryStage.setScene(LobitosMapScene);
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
            GridPane lobitosWasteBinsGridPane = LobitosMap_WasteBins.createLobitosWasteBinsGridPane();
            lobitosWasteBinsGridPane.setMaxSize( 800, 550);
            lobitosWasteBinsGridPane.setBackground(new Background( LobitosMap.createImage("LobitosMap.png")));
            LobitosMap_WasteBins.addUIControlsLobitosWasteBins(lobitosWasteBinsGridPane, primaryStage);
            Scene LobitosWasteBinsScene = new Scene(lobitosWasteBinsGridPane, 800, 550);
            primaryStage.setScene(LobitosWasteBinsScene);
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


