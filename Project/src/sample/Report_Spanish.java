package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Report_Spanish extends Application {

    // Start function for quick display
    @Override
    public void start(Stage primaryStage) {
        // Set stage title
        primaryStage.setTitle("SMART MAP - Formulario de Problema");
        // Create the Spanish Report Page grid pane
        GridPane reportPaneGridPane = createReportGridPane();
        // Set background colour
        reportPaneGridPane.setStyle("-fx-background-color: #4aa4ef");
        // Add UI controls to the Spanish Report form grid pane
        addUIControlsReport(reportPaneGridPane, primaryStage);
        // Set the scene in Spanish Report
        Scene reportScene = new Scene(reportPaneGridPane, 800, 500);
        // Display Spanish Report stage
        primaryStage.setScene(reportScene);
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }


    // Create Grid Pane for Spanish Report
    public static GridPane createReportGridPane() {
        // Set new Grid Pane for SpanishReport
        GridPane reportGridPane = new GridPane();
        reportGridPane.setAlignment(Pos.CENTER);
        reportGridPane.setPadding(new Insets(80,220,80,160));
        reportGridPane.setHgap(0);
        reportGridPane.setVgap(10);
        // Add Column Constraints
        ColumnConstraints columnOneConstraints = new ColumnConstraints(150, 150, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.CENTER);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(100,100, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        // Return Spanish reportGridPane
        reportGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return reportGridPane;
    }


    // Create UI controls forSpanishReport Grid Pane
    public static void addUIControlsReport(GridPane reportGridPane, Stage primaryStage) {
        // Add Header
        Label headerLabel = new Label("Formulario de Problema");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        reportGridPane.add(headerLabel, 0,0,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

        // Add Issue Type Label
        Label issueTypeLabel = new Label("Tipo de Problema: ");
        issueTypeLabel.setFont(Font.font("Arial", 14));
        reportGridPane.add(issueTypeLabel, 0,1);
        GridPane.setHalignment(issueTypeLabel, HPos.LEFT);
        GridPane.setMargin(issueTypeLabel, new Insets(0, 0,0,0));
        // Add Issue Type Choice Box
        ChoiceBox issueTypeBox = new ChoiceBox();
        issueTypeBox.setMaxSize(200,30);
        issueTypeBox.setValue("Selecciona tipo de problema");
        issueTypeBox.getItems().add("Fuga de aguas residuales");
        issueTypeBox.getItems().add("Exceso de basura");
        issueTypeBox.getItems().add("Otro");
        reportGridPane.add(issueTypeBox,1,1);
        GridPane.setMargin(issueTypeBox, new Insets(0, 0,0,-15));

        // Add Location Label
        Label locationLabel = new Label("Ubicación: ");
        locationLabel.setFont(Font.font("Arial", 14));
        reportGridPane.add(locationLabel, 0,2);
        GridPane.setHalignment(locationLabel, HPos.LEFT);
        GridPane.setMargin(locationLabel, new Insets(0, 0,0,0));
        // Add Location Field
        TextField locationField = new TextField();
        locationField.setPromptText("Escriba la ubicación");
        locationField.setMaxSize(200,30);
        reportGridPane.add(locationField, 1,2);
        GridPane.setMargin(locationField, new Insets(0, 0,0,-15));

        // Add Date Label
        Label dateLabel = new Label("Fecha: ");
        dateLabel.setFont(Font.font("Arial", 14));
        reportGridPane.add(dateLabel, 0,3);
        GridPane.setHalignment(dateLabel, HPos.LEFT);
        GridPane.setMargin(dateLabel, new Insets(0, 0,0,0));
        // Add Date Field
        TextField dateField = new TextField();
        dateField.setPromptText("dd/mm/aaaa");
        dateField.setMaxSize(200,30);
        reportGridPane.add(dateField, 1,3);
        GridPane.setMargin(dateField, new Insets(0, 0,0,-15));

        // Add Description Label
        Label descriptionLabel = new Label("Descripción: ");
        descriptionLabel.setFont(Font.font("Arial", 14));
        reportGridPane.add(descriptionLabel, 0,4);
        GridPane.setHalignment(descriptionLabel, HPos.LEFT);
        GridPane.setMargin(descriptionLabel, new Insets(0, 0,0,0));
        // Add Surname Field
        TextField descriptionField = new TextField();
        descriptionField.setPromptText("Escriba la descripción");
        descriptionField.setMaxSize(200,30);
        reportGridPane.add(descriptionField, 1,4);
        GridPane.setMargin(descriptionField, new Insets(0, 0,0,-15));

        // Add Email Label
        Label emailLabel = new Label("Correo electronico (opcional): ");
        emailLabel.setFont(Font.font("Arial", 14));
        reportGridPane.add(emailLabel, 0, 5);
        GridPane.setHalignment(emailLabel, HPos.LEFT);
        GridPane.setMargin(emailLabel, new Insets(0, 0,0,0));
        // Add Email Text Field
        TextField emailField = new TextField();
        emailField.setPromptText("Correo electronico (opcional)");
        emailField.setMaxSize(200,30);
        reportGridPane.add(emailField, 1, 5);
        GridPane.setMargin(emailField, new Insets(0, 0,0,-15));


        // Add Submit Button
        Button submitButton = new Button("Enviar");
        submitButton.setPrefHeight(40);
        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(100);
        reportGridPane.add(submitButton, 0, 6, 2, 1);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        GridPane.setMargin(submitButton, new Insets(20, 0,20,0));
        // Add Back Button
        Button backButton = new Button("Atras");
        backButton.setPrefHeight(25);
        backButton.setDefaultButton(true);
        backButton.setPrefWidth(100);
        reportGridPane.add(backButton, 0, 7, 1, 1);
        GridPane.setHalignment(backButton, HPos.LEFT);
        GridPane.setMargin(backButton, new Insets(20, 0,20,0));


        // Set action for pressed buttons
        submitButton.setOnAction(event -> {
            // Add Empty Field Alerts
            if ((issueTypeBox.getValue()!="Fuga de aguas residuales" && issueTypeBox.getValue()!="Exceso de basura")){
                HomePage.showAlert(Alert.AlertType.ERROR, reportGridPane.getScene().getWindow(), "Error de Formulario!", "Porfavor, elige el tipo de problema"); }
            else if (descriptionField.getText().isEmpty()) { HomePage.showAlert(Alert.AlertType.ERROR, reportGridPane.getScene().getWindow(),
                    "Error de Formulario!", "Porfavor, escriba una descripción."); }
            else if (locationField.getText().isEmpty()) { HomePage.showAlert(Alert.AlertType.ERROR, reportGridPane.getScene().getWindow(),
                    "Error de Formulario!", "Porfavor, escriba la ubicación."); }
            else if (dateField.getText().isEmpty()) { HomePage.showAlert(Alert.AlertType.ERROR, reportGridPane.getScene().getWindow(),
                    "Error de Formulario!", "Porfavor, escriba la fecha."); }

            else if (emailField.getText().isEmpty()) { HomePage.showAlert(Alert.AlertType.ERROR, reportGridPane.getScene().getWindow(),
                    "Error de Formulario!", "Porfavor, escriba correao electronico."); }


            else{
                String issueType_value = (String) issueTypeBox.getValue();
                String location_value = locationField.getText();
                String date_value = dateField.getText();
                String description_value = descriptionField.getText();
                String email_value = emailField.getText();
//                    String activeLevel_value = null;



                HomePage.showAlert(Alert.AlertType.CONFIRMATION, reportGridPane.getScene().getWindow(),
                        "Formulario enviado !", "Formulario a sido enviado.");




            }
        });


        backButton.setOnAction(event -> {
            // Set stage title
            primaryStage.setTitle("SMART MAP - Página Principal");
            // Create the HomePage Page grid pane
            GridPane homePageGridPane = HomePage_Spanish.createHomePageGridPane();
            // Set background colour
            homePageGridPane.setStyle("-fx-background-color: #4aa4ef");
            // Add UI controls to the HomePage form grid pane
            HomePage_Spanish.addUIControlsHomePage(homePageGridPane, primaryStage);
            // Set the scene in HomePage
            Scene HomePageScene = new Scene(homePageGridPane, 800, 500);
            primaryStage.setScene(HomePageScene);
            primaryStage.show();
        });



    }
}

