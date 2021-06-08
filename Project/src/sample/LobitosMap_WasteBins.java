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
        Button wasteBinsButton1 = new Button();
        wasteBinsButton1.setBackground(BinImage);
        wasteBinsButton1.setScaleX(0.4);
        wasteBinsButton1.setScaleY(0.4);
        wasteBinsButton1.setPrefSize(25,25);
        wasteBinsButton1.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton1, 0, 4);
        lobitosWasteBinsGridPane.setMargin(wasteBinsButton1, new Insets(35, 68,-35,-68));

        Button wasteBinsButton2 = new Button();
        wasteBinsButton2.setBackground(BinImage);
        wasteBinsButton2.setScaleX(0.4);
        wasteBinsButton2.setScaleY(0.4);
        wasteBinsButton2.setPrefSize(25,25);
        wasteBinsButton2.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton2, 1, 4);
        lobitosWasteBinsGridPane.setMargin(wasteBinsButton2, new Insets(-5, 50,5,-50));

        Button wasteBinsButton3 = new Button();
        wasteBinsButton3.setBackground(BinImage);
        wasteBinsButton3.setScaleX(0.4);
        wasteBinsButton3.setScaleY(0.4);
        wasteBinsButton3.setPrefSize(25,25);
        wasteBinsButton3.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton3, 2, 4);
        lobitosWasteBinsGridPane.setMargin(wasteBinsButton3, new Insets(-70, 520,70,-520));

        Button wasteBinsButton4 = new Button();
        wasteBinsButton4.setBackground(BinImage);
        wasteBinsButton4.setScaleX(0.4);
        wasteBinsButton4.setScaleY(0.4);
        wasteBinsButton4.setPrefSize(25,25);
        wasteBinsButton4.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton4, 3, 4);
        lobitosWasteBinsGridPane.setMargin(wasteBinsButton4, new Insets(-60, 450,60,-450));

        Button wasteBinsButton5 = new Button();
        wasteBinsButton5.setBackground(BinImage);
        wasteBinsButton5.setScaleX(0.4);
        wasteBinsButton5.setScaleY(0.4);
        wasteBinsButton5.setPrefSize(25,25);
        wasteBinsButton5.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton5, 4, 4);
        lobitosWasteBinsGridPane.setMargin(wasteBinsButton5, new Insets(25, 455,-25,-455));

        Button wasteBinsButton6 = new Button();
        wasteBinsButton6.setBackground(BinImage);
        wasteBinsButton6.setScaleX(0.4);
        wasteBinsButton6.setScaleY(0.4);
        wasteBinsButton6.setPrefSize(25,25);
        wasteBinsButton6.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton6, 5, 4);
        lobitosWasteBinsGridPane.setMargin(wasteBinsButton6, new Insets(-65, 370,65,-370));


        Button wasteBinsButton7 = new Button();
        wasteBinsButton7.setBackground(BinImage);
        wasteBinsButton7.setScaleX(0.4);
        wasteBinsButton7.setScaleY(0.4);
        wasteBinsButton7.setPrefSize(25,25);
        wasteBinsButton7.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton7, 5, 4);
        lobitosWasteBinsGridPane.setMargin(wasteBinsButton7, new Insets(-18, 275,18,-275));


        Button wasteBinsButton8 = new Button();
        wasteBinsButton8.setBackground(BinImage);
        wasteBinsButton8.setScaleX(0.4);
        wasteBinsButton8.setScaleY(0.4);
        wasteBinsButton8.setPrefSize(25,25);
        wasteBinsButton8.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton8, 5, 4);
        lobitosWasteBinsGridPane.setMargin(wasteBinsButton8, new Insets(-200, 300,200,-300));


        Button wasteBinsButton9 = new Button();
        wasteBinsButton9.setBackground(BinImage);
        wasteBinsButton9.setScaleX(0.4);
        wasteBinsButton9.setScaleY(0.4);
        wasteBinsButton9.setPrefSize(25,25);
        wasteBinsButton9.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton9, 5, 4);
        lobitosWasteBinsGridPane.setMargin(wasteBinsButton9, new Insets(-160, 295,160,-295));


        Button wasteBinsButton10 = new Button();
        wasteBinsButton10.setBackground(BinImage);
        wasteBinsButton10.setScaleX(0.4);
        wasteBinsButton10.setScaleY(0.4);
        wasteBinsButton10.setPrefSize(25,25);
        wasteBinsButton10.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton10, 5, 4);
        lobitosWasteBinsGridPane.setMargin(wasteBinsButton10, new Insets(-145, 240,145,-240));


        Button wasteBinsButton11 = new Button();
        wasteBinsButton11.setBackground(BinImage);
        wasteBinsButton11.setScaleX(0.4);
        wasteBinsButton11.setScaleY(0.4);
        wasteBinsButton11.setPrefSize(25,25);
        wasteBinsButton11.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton11, 5, 4);
        lobitosWasteBinsGridPane.setMargin(wasteBinsButton11, new Insets(-25, 100,25,-100));

        Button wasteBinsButton12 = new Button();
        wasteBinsButton12.setBackground(BinImage);
        wasteBinsButton12.setScaleX(0.4);
        wasteBinsButton12.setScaleY(0.4);
        wasteBinsButton12.setPrefSize(25,25);
        wasteBinsButton12.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton12, 5, 4);
        lobitosWasteBinsGridPane.setMargin(wasteBinsButton12, new Insets(30, 100,-30,-100));

        Button wasteBinsButton13 = new Button();
        wasteBinsButton13.setBackground(BinImage);
        wasteBinsButton13.setScaleX(0.4);
        wasteBinsButton13.setScaleY(0.4);
        wasteBinsButton13.setPrefSize(25,25);
        wasteBinsButton13.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton13, 5, 4);
        lobitosWasteBinsGridPane.setMargin(wasteBinsButton13, new Insets(-370, 155,370,-155));

        Button wasteBinsButton14 = new Button();
        wasteBinsButton14.setBackground(BinImage);
        wasteBinsButton14.setScaleX(0.4);
        wasteBinsButton14.setScaleY(0.4);
        wasteBinsButton14.setPrefSize(25,25);
        wasteBinsButton14.setDefaultButton(true);
        lobitosWasteBinsGridPane.add(wasteBinsButton14, 5, 4);
        lobitosWasteBinsGridPane.setMargin(wasteBinsButton14, new Insets(-320, 95,320,-95));


        //////////////////////////////////////////////////

        wasteBinsButton1.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: ");
        });

        wasteBinsButton2.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: ");
        });

        wasteBinsButton3.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: ");
        });

        wasteBinsButton4.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: ");
        });

        wasteBinsButton5.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: ");
        });

        wasteBinsButton6.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: ");
        });

        wasteBinsButton7.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: ");
        });

        wasteBinsButton8.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: ");
        });

        wasteBinsButton9.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: ");
        });

        wasteBinsButton10.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: ");
        });

        wasteBinsButton11.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: ");
        });

        wasteBinsButton12.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: ");
        });

        wasteBinsButton13.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: ");
        });

        wasteBinsButton14.setOnAction(event -> { HomePage.showAlert(Alert.AlertType.INFORMATION,
                lobitosWasteBinsGridPane.getScene().getWindow(), "Waste Bin", "Location: ");
        });

        /////////////////////////////////////////////////////


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


