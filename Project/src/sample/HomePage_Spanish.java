package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.Window;

public abstract class HomePage_Spanish extends Application {

    /*@Override
    public void start(Stage primaryStage) {
        // Set stage title
        primaryStage.setTitle("SMART MAP - Página Principal");
        // Create the HomePage Page grid pane
        GridPane homePageGridPaneSpanish = createhomePageGridPaneSpanish();
        // Set background colour
        homePageGridPaneSpanish.setStyle("-fx-background-color: #4aa4ef");
        // Add UI controls to the HomePage form grid pane
        addUIControlsHomePageSpanish(homePageGridPaneSpanish, primaryStage);
        // Set the scene in HomePage
        Scene homePageGridPaneSpanishScene = new Scene(homePageGridPaneSpanish, 800, 500);
        primaryStage.setScene(homePageGridPaneSpanishScene);
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }*/



    // Create Grid Pane for Spanish HomePage
    public static GridPane createhomePageGridPaneSpanish() {
        // Set new Grid Pane for Spanish HomePage
        GridPane homePageGridPaneSpanish = new GridPane();
        homePageGridPaneSpanish.setAlignment(Pos.CENTER);
        homePageGridPaneSpanish.setHgap(10);
        homePageGridPaneSpanish.setVgap(10);
        homePageGridPaneSpanish.setPadding(new Insets(25,25,25,25));
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return Spanish HomePage
        homePageGridPaneSpanish.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return homePageGridPaneSpanish;
    }

    // Create UI controls for Spanish HomePage Grid Pane
    public static void addUIControlsHomePageSpanish(GridPane homePageGridPaneSpanish, Stage primaryStage) {
        // Add Title
        Label FxAppHeader = new Label("SmartMap");
        FxAppHeader.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        homePageGridPaneSpanish.add(FxAppHeader, 0, 0, 2, 1);
        GridPane.setHalignment(FxAppHeader, HPos.CENTER);
        GridPane.setMargin(FxAppHeader, new Insets(20, 0, 20, 0));

        // Add Welcome label
        Label welcomeLabel = new Label("Bienvenido");
        welcomeLabel.setFont(Font.font("Arial", 24));
        homePageGridPaneSpanish.add(welcomeLabel, 0, 1, 2, 1);
        GridPane.setHalignment(welcomeLabel, HPos.CENTER);
        GridPane.setMargin(welcomeLabel, new Insets(20, 0, 20, 0));


        // Add Lobitos map Button
        Button lobitosMapButton = new Button("Mapa de Lobitos");
        lobitosMapButton.setFont(Font.font("Arial", /*FontWeight.BOLD,*/12));
        lobitosMapButton.setPrefHeight(30);
        lobitosMapButton.setPrefWidth(150);
        lobitosMapButton.setDefaultButton(true);
        homePageGridPaneSpanish.add(lobitosMapButton, 0, 2, 2, 1);
        GridPane.setHalignment(lobitosMapButton, HPos.CENTER);
        GridPane.setMargin(lobitosMapButton, new Insets(0, 0, 0, 0));

        // Add Piedritas map Button
        Button piedritasMapButton = new Button("Mapa de Piedritas");
        piedritasMapButton.setFont(Font.font("Arial",12));
        piedritasMapButton.setPrefHeight(30);
        piedritasMapButton.setPrefWidth(150);
        piedritasMapButton.setDefaultButton(true);
        homePageGridPaneSpanish.add(piedritasMapButton, 0, 3, 2, 1);
        GridPane.setHalignment(piedritasMapButton, HPos.CENTER);
        GridPane.setMargin(piedritasMapButton, new Insets(0, 0, 0, 0));


        // Add Language Label
        Label languageLabel = new Label("Idioma: ");
        languageLabel.setFont(Font.font("Arial", 14));
        homePageGridPaneSpanish.add(languageLabel, 0,6);
        GridPane.setHalignment(languageLabel, HPos.LEFT);
        GridPane.setMargin(languageLabel, new Insets(0, 0,-190,0));

        // Add Laguage Box
        ChoiceBox languageBox = new ChoiceBox();
        languageBox.setMaxSize(100,30);
        languageBox.setValue("Español");
        languageBox.getItems().add("Inglés");
        languageBox.getItems().add("Español");
        homePageGridPaneSpanish.add(languageBox, 1, 6, 2, 1);
        GridPane.setMargin(languageBox, new Insets(0, 0,-190,-15));


        // Add Set Language Button
        Button setLanguageButton = new Button("Cambiar Idioma");
        setLanguageButton.setFont(Font.font("Arial",10));
        setLanguageButton.setPrefHeight(23);
        setLanguageButton.setPrefWidth(85);
        setLanguageButton.setDefaultButton(true);
        homePageGridPaneSpanish.add(setLanguageButton, 2, 6, 2, 1);
        GridPane.setMargin(setLanguageButton, new Insets(0, 0, -195, -525));




        // Set action for pressed buttons
        setLanguageButton.setOnAction(event -> {
            if(languageBox.getSelectionModel().getSelectedItem() == "Inglés"){
                // Set stage title
                primaryStage.setTitle("SMART MAP - Home Page");
                // Create the HomePage Page grid pane
                GridPane homePageGridPane = HomePage.createHomePageGridPane();
                // Set background colour
                homePageGridPane.setStyle("-fx-background-color: #4aa4ef");
                // Add UI controls to the HomePage form grid pane
                HomePage.addUIControlsHomePage(homePageGridPane, primaryStage);
                // Set the scene in HomePage
                Scene HomePageScene = new Scene(homePageGridPane, 800, 500);
                // Display HomePage stage
                primaryStage.setScene(HomePageScene);
                primaryStage.show();
            }
        });


        lobitosMapButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(languageBox.getSelectionModel().getSelectedItem() == "Inglés"){
                    // Set stage title
                    primaryStage.setTitle("SMART MAP - Lobitos Map");
                    // Create the LobitosMap Page grid pane
                    GridPane lobitosMapGridPane = LobitosMap.createLobitosMapGridPane();
                    lobitosMapGridPane.setMaxSize( 800, 550);
                    // Set background Image
                    lobitosMapGridPane.setBackground(new Background( HomePage.createImage("LobitosMap.png")));
                    // Add UI controls to the LobitosMap form grid pane
                    LobitosMap.addUIControlsLobitosMap(lobitosMapGridPane, primaryStage);
                    // Set the scene in LobitosMap
                    Scene LobitosMapScene = new Scene(lobitosMapGridPane, 800, 550);
                    // Display stage
                    primaryStage.setScene(LobitosMapScene);
                    primaryStage.show();
                }else{
                    // Set stage title
                    primaryStage.setTitle("SMART MAP - Mapa de Lobitos");
                    // Create the Spanish LobitosMap Page grid pane
                    GridPane lobitosMapGridPane = LobitosMap_Spanish.createLobitosMapGridPane();
                    lobitosMapGridPane.setMaxSize( 800, 550);
                    // Set background Image
                    lobitosMapGridPane.setBackground(new Background( HomePage.createImage("LobitosMap.png")));
                    // Add UI controls to the Spanish LobitosMap form grid pane
                    LobitosMap_Spanish.addUIControlsLobitosMap(lobitosMapGridPane, primaryStage);
                    // Set the scene in Spanish LobitosMap
                    Scene LobitosMapScene = new Scene(lobitosMapGridPane, 800, 550);
                    // Display stage
                    primaryStage.setScene(LobitosMapScene);
                    primaryStage.show();
                }
            }
        });

        piedritasMapButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(languageBox.getSelectionModel().getSelectedItem() == "Inglés"){
                    // Set stage title
                    primaryStage.setTitle("SMART MAP - Piedritas Map");
                    // Create the PiedritasMap Page grid pane
                    GridPane piedritasMapGridPane = PiedritasMap.createPiedritasMapGridPane();
                    piedritasMapGridPane.setMaxSize( 950, 550);
                    // Set background Image
                    piedritasMapGridPane.setBackground(new Background( HomePage.createImage("PiedritasMap.png")));
                    // Add UI controls to the PiedritasMap form grid pane
                    PiedritasMap.addUIControlsPiedritasMap(piedritasMapGridPane, primaryStage);
                    // Set the scene in PiedritasMap
                    Scene PiedritasMapScene = new Scene(piedritasMapGridPane, 950, 550);
                    // Display PiedritasMap stage
                    primaryStage.setScene(PiedritasMapScene);
                    primaryStage.show();
                }else{
                    // Set stage title
                    primaryStage.setTitle("SMART MAP - Mapa de Piedritas");
                    // Create the Spanish PiedritasMap Page grid pane
                    GridPane piedritasMapGridPane = PiedritasMap_Spanish.createPiedritasMapGridPane();
                    piedritasMapGridPane.setMaxSize( 950, 550);
                    // Set background Image
                    piedritasMapGridPane.setBackground(new Background( HomePage.createImage("PiedritasMap.png")));
                    // Add UI controls to the Spanish PiedritasMap form grid pane
                    PiedritasMap_Spanish.addUIControlsPiedritasMap(piedritasMapGridPane, primaryStage);
                    // Set the scene in Spanish PiedritasMap
                    Scene PiedritasMapScene = new Scene(piedritasMapGridPane, 950, 550);
                    // Display Spanish PiedritasMap stage
                    primaryStage.setScene(PiedritasMapScene);
                    primaryStage.show();
                }

            }
        });
    }

}


