package sample;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.Window;



public class HomePage extends Application {

    // Start function initializes the application
    @Override
    public void start(Stage primaryStage) {
        // Set stage title
        primaryStage.setTitle("SMART MAP - Home Page");
        // Create the HomePage Page grid pane
        GridPane homePageGridPane = createHomePageGridPane();
        // Set background colour
        homePageGridPane.setStyle("-fx-background-color: #4aa4ef");
        // Add UI controls to the HomePage form grid pane
        addUIControlsHomePage(homePageGridPane, primaryStage);
        // Set the scene in HomePage
        Scene HomePageScene = new Scene(homePageGridPane, 800, 500);
        // Display HomePage stage
        primaryStage.setScene(HomePageScene);
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }


    public static GridPane createHomePageGridPane() {
        // Set new Grid Pane for HomePage
        GridPane homePageGridPane = new GridPane();
        homePageGridPane.setAlignment(Pos.CENTER);
        homePageGridPane.setHgap(10);
        homePageGridPane.setVgap(10);
        homePageGridPane.setPadding(new Insets(25,25,25,25));
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return homePageGridPane
        homePageGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return homePageGridPane;
    }


    // Create UI controls for HomePage Grid Pane
    public static void addUIControlsHomePage(GridPane homePageGridPane, Stage primaryStage) {
        // Add Title
        Label FxAppHeader = new Label("SmartMap");
        FxAppHeader.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        homePageGridPane.add(FxAppHeader, 0, 0, 2, 1);
        homePageGridPane.setHalignment(FxAppHeader, HPos.CENTER);
        homePageGridPane.setMargin(FxAppHeader, new Insets(20, 0, 20, 0));

        // Add Welcome label
        Label welcomeLabel = new Label("Welcome");
        welcomeLabel.setFont(Font.font("Arial", 24));
        homePageGridPane.add(welcomeLabel, 0, 1, 2, 1);
        homePageGridPane.setHalignment(welcomeLabel, HPos.CENTER);
        homePageGridPane.setMargin(welcomeLabel, new Insets(20, 0, 20, 0));

        // Add Lobitos map Button
        Button lobitosMapButton = new Button("Lobitos map");
        lobitosMapButton.setFont(Font.font("Arial", /*FontWeight.BOLD,*/12));
        lobitosMapButton.setPrefHeight(30);
        lobitosMapButton.setPrefWidth(150);
        lobitosMapButton.setDefaultButton(true);
        homePageGridPane.add(lobitosMapButton, 0, 2, 2, 1);
        homePageGridPane.setHalignment(lobitosMapButton, HPos.CENTER);
        homePageGridPane.setMargin(lobitosMapButton, new Insets(0, 0, 0, 0));

        // Add Piedritas map Button
        Button piedritasMapButton = new Button("Piedritas map");
        piedritasMapButton.setFont(Font.font("Arial",12));
        piedritasMapButton.setPrefHeight(30);
        piedritasMapButton.setPrefWidth(150);
        piedritasMapButton.setDefaultButton(true);
        homePageGridPane.add(piedritasMapButton, 0, 3, 2, 1);
        homePageGridPane.setHalignment(piedritasMapButton, HPos.CENTER);
        homePageGridPane.setMargin(piedritasMapButton, new Insets(0, 0, 0, 0));

        // Add Language Label
        Label languageLabel = new Label("Language: ");
        languageLabel.setFont(Font.font("Arial", 14));
        homePageGridPane.add(languageLabel, 0,6);
        homePageGridPane.setHalignment(languageLabel, HPos.LEFT);
        homePageGridPane.setMargin(languageLabel, new Insets(0, 0,-190,0));
        // Add Laguage Box
        ChoiceBox languageBox = new ChoiceBox();
        languageBox.setMaxSize(100,30);
        languageBox.setValue("English");
        languageBox.getItems().add("English");
        languageBox.getItems().add("Spanish");
        homePageGridPane.add(languageBox, 1, 6, 2, 1);
        homePageGridPane.setMargin(languageBox, new Insets(0, 0,-190,-15));


        // Set action for pressed buttons
        lobitosMapButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(languageBox.getValue() == "English"){
                    // Set stage title
                    primaryStage.setTitle("SMART MAP - Lobitos Map");
                    // Create the LobitosMap Page grid pane
                    GridPane lobitosMapGridPane = LobitosMap.createLobitosMapGridPane();
                    lobitosMapGridPane.setMaxSize( 800, 550);
                    // Set background Image
                    lobitosMapGridPane.setBackground(new Background( HomePage.createImage("LobitosMap.png")));
                    // Add UI controls to the LobitosMap form grid pane
                    LobitosMap.addUIControlsLobitosMap(lobitosMapGridPane, primaryStage);
                    // Set the scene in AmpStart
                    Scene LobitosMapScene = new Scene(lobitosMapGridPane, 800, 550);
                    // Display stage
                    primaryStage.setScene(LobitosMapScene);
                    primaryStage.show();
                }else{}
            }
        });

        piedritasMapButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(languageBox.getValue() == "English"){
                    // Set stage title
                    primaryStage.setTitle("SMART MAP - Piedritas Map");
                    // Create the PiedritasMap Page grid pane
                    GridPane piedritasMapGridPane = PiedritasMap.createPiedritasMapGridPane();
                    piedritasMapGridPane.setMaxSize( 950, 550);
                    // Set background Image
                    piedritasMapGridPane.setBackground(new Background( createImage("PiedritasMap.png")));
                    // Add UI controls to the PiedritasMap form grid pane
                    PiedritasMap.addUIControlsPiedritasMap(piedritasMapGridPane, primaryStage);
                    // Set the scene in PiedritasMap
                    Scene PiedritasMapScene = new Scene(piedritasMapGridPane, 950, 550);
                    // Display PiedritasMap stage
                    primaryStage.setScene(PiedritasMapScene);
                    primaryStage.show();
                }else{}
            }
        });
    }


    // Create function to set background image for the map pages
    static BackgroundImage createImage(String url) {
        return new BackgroundImage(
                new Image(url),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,
                new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true),
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true));
    }

    // Set button images
    static Background WCImage = new Background( createImage("WC.png"));
    static Background RecyclingImage = new Background( createImage("Recycling.png"));
    static Background BinImage = new Background( createImage("Bin.png"));

    // Set function for alerts and popups
    public static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }

}

