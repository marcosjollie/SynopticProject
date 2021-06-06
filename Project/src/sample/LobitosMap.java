package sample;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/*import javax.swing.text.html.ImageView;
import java.awt.*;*/

public class LobitosMap extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("SMART MAP - Lobitos Map");

        // Create the AmpStart Page grid pane
        GridPane lobitosMapGridPane = createLobitosMapGridPane();
        lobitosMapGridPane.setMaxSize( 800, 550);
        lobitosMapGridPane.setBackground(new Background( createImage("LobitosMap.png")));
        // Add UI controls to the AmpStart form grid pane
        addUIControlsLobitosMap(lobitosMapGridPane, primaryStage);
        // Set the scene in AmpStart
        Scene LobitosMapScene = new Scene(lobitosMapGridPane, 800, 550);
        // Display stage
        primaryStage.setScene(LobitosMapScene);
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

    public static GridPane createLobitosMapGridPane() {
        // Set new Grid Pane for LoginPage
        GridPane lobitosMapGridPane = new GridPane();
        lobitosMapGridPane.setAlignment(Pos.CENTER);
        lobitosMapGridPane.setPadding(new Insets(0, 0, 0, 0));
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return loginGridPane
        lobitosMapGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return lobitosMapGridPane;
    }



    public static void addUIControlsLobitosMap(GridPane lobitosMapGridPane, Stage primaryStage) {



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
        lobitosMapGridPane.add(wcButton, 0, 0);
        lobitosMapGridPane.setMargin(wcButton, new Insets(0, 35,0,-35));

        // Add Toilets Label
        Label toiletsLabel = new Label("Public toilets");
        toiletsLabel.setFont(Font.font("Arial", 14));
        lobitosMapGridPane.add(toiletsLabel, 1,0);
        lobitosMapGridPane.setMargin(toiletsLabel, new Insets(0, 35,0,-30));


        // Add Recycling Button
        Button recyclingButton = new Button();
        recyclingButton.setScaleX(0.8);
        recyclingButton.setScaleY(0.8);
        recyclingButton.setBackground(RecyclingImage);
        recyclingButton.setPrefSize(25,25);
        recyclingButton.setDefaultButton(true);
        lobitosMapGridPane.add(recyclingButton, 0, 1);
        lobitosMapGridPane.setMargin(recyclingButton, new Insets(0, 35,0,-35));

        // Add Recycling Label
        Label recyclingLabel = new Label("Recycling Points");
        recyclingLabel.setFont(Font.font("Arial", 14));
        lobitosMapGridPane.add(recyclingLabel, 1,1);
        lobitosMapGridPane.setMargin(recyclingLabel, new Insets(0, 35,0,-30));


        // Add Waste Bins Button
        Button wasteBinsButton = new Button();
        wasteBinsButton.setScaleX(0.8);
        wasteBinsButton.setScaleY(0.8);
        wasteBinsButton.setBackground(BinImage);
        wasteBinsButton.setPrefSize(25,25);
        wasteBinsButton.setDefaultButton(true);
        lobitosMapGridPane.add(wasteBinsButton, 0, 2);
        lobitosMapGridPane.setMargin(wasteBinsButton, new Insets(0, 35,305,-35));

        // Add Waste Bins Label
        Label wasteBinsLabel = new Label("Waste bins");
        wasteBinsLabel.setFont(Font.font("Arial", 14));
        lobitosMapGridPane.add(wasteBinsLabel, 1,2);
        lobitosMapGridPane.setMargin(wasteBinsLabel, new Insets(0, 35,305,-30));


        // Add Back Button
        Button backButton = new Button("Back");
        backButton.setFont(Font.font("Arial", 12));
        backButton.setPrefSize(70,20);
        backButton.setDefaultButton(true);
        lobitosMapGridPane.add(backButton, 0, 10, 1, 1);
        lobitosMapGridPane.setHalignment(backButton, HPos.LEFT);
        lobitosMapGridPane.setMargin(backButton, new Insets(0, -5,-135,5));


        // Add Report Issue Button
        Button reportIssueButton = new Button("Report Issue");
        reportIssueButton.setFont(Font.font("Arial", 12));
        reportIssueButton.setPrefSize(100,20);
        reportIssueButton.setDefaultButton(true);
        lobitosMapGridPane.add(reportIssueButton, 1, 10, 1, 1);
        lobitosMapGridPane.setHalignment(reportIssueButton, HPos.RIGHT);
        lobitosMapGridPane.setMargin(reportIssueButton, new Insets(0, 5,-135, -5));


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
            GridPane lobitosRecycleGridPane = LobitosMap_Recylcing.createLobitosRecycleGridPane();
            lobitosRecycleGridPane.setMaxSize( 800, 550);
            lobitosRecycleGridPane.setBackground(new Background( createImage("LobitosMap.png")));
            LobitosMap_Recylcing.addUIControlsLobitosRecycle(lobitosRecycleGridPane, primaryStage);
            Scene LobitosRecycleScene = new Scene(lobitosRecycleGridPane, 800, 550);
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

