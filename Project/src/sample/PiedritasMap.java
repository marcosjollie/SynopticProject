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

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("SMART MAP - Piedritas Map");
        // Create the AmpStart Page grid pane
        GridPane piedritasMapGridPane = createPiedritasMapGridPane();
        piedritasMapGridPane.setMaxSize( 950, 550);
        piedritasMapGridPane.setBackground(new Background( LobitosMap.createImage("PiedritasMap.png")));
        // Add UI controls to the AmpStart form grid pane
        addUIControlsPiedritasMap(piedritasMapGridPane, primaryStage);
        // Set the scene in AmpStart
        Scene PiedritasMapScene = new Scene(piedritasMapGridPane, 950, 550);
        // Display stage
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


