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

public class HomePage_Spanish extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("SMART MAP - Página Principal");
        GridPane homePageGridPane = createHomePageGridPane();
        homePageGridPane.setStyle("-fx-background-color: #4aa4ef");
        addUIControlsHomePage(homePageGridPane, primaryStage);
        Scene HomePageScene = new Scene(homePageGridPane, 800, 500);
        primaryStage.setScene(HomePageScene);
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }





    public static GridPane createHomePageGridPane() {
        // Set new Grid Pane for LoginPage
        GridPane homePageGridPane = new GridPane();
        homePageGridPane.setAlignment(Pos.CENTER);
        homePageGridPane.setHgap(10);
        homePageGridPane.setVgap(10);
        homePageGridPane.setPadding(new Insets(25,25,25,25));
//        loginGridPane.setPadding(new Insets(40, 40, 40, 40));
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return loginGridPane
        homePageGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return homePageGridPane;
    }

    public static void addUIControlsHomePage(GridPane homePageGridPane, Stage primaryStage) {
        // Add Title
        Label FxAppHeader = new Label("SmartMap");
        FxAppHeader.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        homePageGridPane.add(FxAppHeader, 0, 0, 2, 1);
        homePageGridPane.setHalignment(FxAppHeader, HPos.CENTER);
        homePageGridPane.setMargin(FxAppHeader, new Insets(20, 0, 20, 0));

        // Add Welcome label
        Label welcomeLabel = new Label("Bienvenido");
        welcomeLabel.setFont(Font.font("Arial", 24));
        homePageGridPane.add(welcomeLabel, 0, 1, 2, 1);
        homePageGridPane.setHalignment(welcomeLabel, HPos.CENTER);
        homePageGridPane.setMargin(welcomeLabel, new Insets(20, 0, 20, 0));


        // Add Lobitos map Button
        Button lobitosMapButton = new Button("Mapa de Lobitos");
        lobitosMapButton.setFont(Font.font("Arial", /*FontWeight.BOLD,*/12));
        lobitosMapButton.setPrefHeight(30);
        lobitosMapButton.setPrefWidth(150);
        lobitosMapButton.setDefaultButton(true);
        homePageGridPane.add(lobitosMapButton, 0, 2, 2, 1);
        homePageGridPane.setHalignment(lobitosMapButton, HPos.CENTER);
        homePageGridPane.setMargin(lobitosMapButton, new Insets(0, 0, 0, 0));

        // Add Piedritas map Button
        Button piedritasMapButton = new Button("Mapa de Piedritas");
        piedritasMapButton.setFont(Font.font("Arial",12));
        piedritasMapButton.setPrefHeight(30);
        piedritasMapButton.setPrefWidth(150);
        piedritasMapButton.setDefaultButton(true);
        homePageGridPane.add(piedritasMapButton, 0, 3, 2, 1);
        homePageGridPane.setHalignment(piedritasMapButton, HPos.CENTER);
        homePageGridPane.setMargin(piedritasMapButton, new Insets(0, 0, 0, 0));


        // Add Language Label
        Label languageLabel = new Label("Idioma: ");
        languageLabel.setFont(Font.font("Arial", 14));
        homePageGridPane.add(languageLabel, 0,6);
        homePageGridPane.setHalignment(languageLabel, HPos.LEFT);
        homePageGridPane.setMargin(languageLabel, new Insets(0, 0,-190,0));

        // Add Laguage Box
        ChoiceBox languageBox = new ChoiceBox();
        languageBox.setMaxSize(100,30);
        languageBox.setValue("Español");
        languageBox.getItems().add("Ingles");
        languageBox.getItems().add("Español");
        homePageGridPane.add(languageBox, 1, 6, 2, 1);
        homePageGridPane.setMargin(languageBox, new Insets(0, 0,-190,-15));

        lobitosMapButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(languageBox.getSelectionModel().getSelectedItem() == "Ingles"){
                    primaryStage.setTitle("SMART MAP - Lobitos Map");
                    GridPane lobitosMapGridPane = LobitosMap.createLobitosMapGridPane();
                    lobitosMapGridPane.setMaxSize( 800, 550);
                    lobitosMapGridPane.setBackground(new Background(LobitosMap.createImage("LobitosMap.png")));
                    LobitosMap.addUIControlsLobitosMap(lobitosMapGridPane, primaryStage);
                    Scene LobitosMapScene = new Scene(lobitosMapGridPane, 800, 550);
                    primaryStage.setScene(LobitosMapScene);
                    primaryStage.show();
                }else{
                    primaryStage.setTitle("SMART MAP - Mapa de Lobitos");

                }
            }
        });



        piedritasMapButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(languageBox.getSelectionModel().getSelectedItem() == "Ingles"){
                    primaryStage.setTitle("SMART MAP - Piedritas Map");
                    GridPane piedritasMapGridPane = PiedritasMap.createPiedritasMapGridPane();
                    piedritasMapGridPane.setMaxSize( 950, 550);
                    piedritasMapGridPane.setBackground(new Background( LobitosMap.createImage("PiedritasMap.png")));
                    PiedritasMap.addUIControlsPiedritasMap(piedritasMapGridPane, primaryStage);
                    Scene PiedritasMapScene = new Scene(piedritasMapGridPane, 950, 550);
                    primaryStage.setScene(PiedritasMapScene);
                    primaryStage.show();
                }else{
                    primaryStage.setTitle("SMART MAP - Mapa de Piedritas");

                }

            }
        });
    }

}


