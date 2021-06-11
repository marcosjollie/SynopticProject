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
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public abstract class Report extends Application {

    // Start function for quick display
    /*@Override
    public void start(Stage primaryStage) {
        // Set stage title
        primaryStage.setTitle("SMART MAP - Report Issue");
        // Create the Report Page grid pane
        GridPane reportPaneGridPane = createReportGridPane();
        // Set background colour
        reportPaneGridPane.setStyle("-fx-background-color: #4aa4ef");
        // Add UI controls to the Report form grid pane
        addUIControlsReport(reportPaneGridPane, primaryStage);
        // Set the scene in Report
        Scene reportScene = new Scene(reportPaneGridPane, 800, 500);
        // Display Report stage
        primaryStage.setScene(reportScene);
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }*/


    // Create Grid Pane for Report
    public static GridPane createReportGridPane() {
        // Set new Grid Pane for Report
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
        // Return reportGridPane
        reportGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return reportGridPane;
    }


    // Create UI controls for Report Grid Pane
    public static void addUIControlsReport(GridPane reportGridPane, Stage primaryStage) {
        // Add Header
        Label headerLabel = new Label("Report Form");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        reportGridPane.add(headerLabel, 0,0,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

        // Add Issue Type Label
        Label issueTypeLabel = new Label("Issue Type: ");
        issueTypeLabel.setFont(Font.font("Arial", 14));
        reportGridPane.add(issueTypeLabel, 0,1);
        GridPane.setHalignment(issueTypeLabel, HPos.LEFT);
        GridPane.setMargin(issueTypeLabel, new Insets(0, 0,0,0));
        // Add Issue Type Choice Box
        ChoiceBox issueTypeBox = new ChoiceBox();
        issueTypeBox.setMaxSize(200,30);
        issueTypeBox.setValue("Select type of issue");
        issueTypeBox.getItems().add("Sewage leak");
        issueTypeBox.getItems().add("Area of excess waste");
        issueTypeBox.getItems().add("Other");
        reportGridPane.add(issueTypeBox,1,1);
        GridPane.setMargin(issueTypeBox, new Insets(0, 0,0,-15));

        // Add Location Label
        Label locationLabel = new Label("Location: ");
        locationLabel.setFont(Font.font("Arial", 14));
        reportGridPane.add(locationLabel, 0,2);
        GridPane.setHalignment(locationLabel, HPos.LEFT);
        GridPane.setMargin(locationLabel, new Insets(0, 0,0,0));
        // Add Location Field
        TextField locationField = new TextField();
        locationField.setPromptText("Enter location");
        locationField.setMaxSize(200,30);
        reportGridPane.add(locationField, 1,2);
        GridPane.setMargin(locationField, new Insets(0, 0,0,-15));

        // Add Date Label
        Label dateLabel = new Label("Date: ");
        dateLabel.setFont(Font.font("Arial", 14));
        reportGridPane.add(dateLabel, 0,3);
        GridPane.setHalignment(dateLabel, HPos.LEFT);
        GridPane.setMargin(dateLabel, new Insets(0, 0,0,0));
        // Add Date Field
        TextField dateField = new TextField();
        dateField.setPromptText("dd/mm/yyyy");
        dateField.setMaxSize(200,30);
        reportGridPane.add(dateField, 1,3);
        GridPane.setMargin(dateField, new Insets(0, 0,0,-15));

        // Add Description Label
        Label descriptionLabel = new Label("Description: ");
        descriptionLabel.setFont(Font.font("Arial", 14));
        reportGridPane.add(descriptionLabel, 0,4);
        GridPane.setHalignment(descriptionLabel, HPos.LEFT);
        GridPane.setMargin(descriptionLabel, new Insets(0, 0,0,0));
        // Add Surname Field
        TextField descriptionField = new TextField();
        descriptionField.setPromptText("Enter surname");
        descriptionField.setMaxSize(200,30);
        reportGridPane.add(descriptionField, 1,4);
        GridPane.setMargin(descriptionField, new Insets(0, 0,0,-15));

        // Add Email Label
        Label emailLabel = new Label("Email: ");
        emailLabel.setFont(Font.font("Arial", 14));
        reportGridPane.add(emailLabel, 0, 5);
        GridPane.setHalignment(emailLabel, HPos.LEFT);
        GridPane.setMargin(emailLabel, new Insets(0, 0,0,0));
        // Add Email Text Field
        TextField emailField = new TextField();
        emailField.setPromptText("Enter email");
        emailField.setMaxSize(200,30);
        reportGridPane.add(emailField, 1, 5);
        GridPane.setMargin(emailField, new Insets(0, 0,0,-15));


        // Add Submit Button
        Button submitButton = new Button("Submit");
        submitButton.setPrefHeight(40);
        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(100);
        reportGridPane.add(submitButton, 0, 6, 2, 1);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        GridPane.setMargin(submitButton, new Insets(20, 0,20,0));
        // Add Back Button
        Button backButton = new Button("Back");
        backButton.setPrefHeight(25);
        backButton.setDefaultButton(true);
        backButton.setPrefWidth(100);
        reportGridPane.add(backButton, 0, 7, 1, 1);
        GridPane.setHalignment(backButton, HPos.LEFT);
        GridPane.setMargin(backButton, new Insets(20, 0,20,0));


        // Set action for pressed buttons
        submitButton.setOnAction(event -> {
            // Add Empty Field Alerts
            if ((issueTypeBox.getValue()!="Sewage leak" && issueTypeBox.getValue()!="Area of excess waste"&& issueTypeBox.getValue()!="Area of excess waste" )){
                HomePage.showAlert(Alert.AlertType.ERROR, reportGridPane.getScene().getWindow(), "Form Error!", "Please select Issue type"); }
            else if (descriptionField.getText().isEmpty()) { HomePage.showAlert(Alert.AlertType.ERROR, reportGridPane.getScene().getWindow(),
                    "Form Error!", "Please enter description"); }
            else if (locationField.getText().isEmpty()) { HomePage.showAlert(Alert.AlertType.ERROR, reportGridPane.getScene().getWindow(),
                    "Form Error!", "Please enter location"); }
            else if (dateField.getText().isEmpty()) { HomePage.showAlert(Alert.AlertType.ERROR, reportGridPane.getScene().getWindow(),
                    "Form Error!", "Please enter date"); }

            else if (emailField.getText().isEmpty()) { HomePage.showAlert(Alert.AlertType.ERROR, reportGridPane.getScene().getWindow(),
                    "Form Error!", "Please enter email"); }


            else{
                String issueType_value = (String) issueTypeBox.getValue();
                String location_value = locationField.getText();
                String date_value = dateField.getText();
                String description_value = descriptionField.getText();
                String email_value = emailField.getText();
//                    String activeLevel_value = null;



                HomePage.showAlert(Alert.AlertType.CONFIRMATION, reportGridPane.getScene().getWindow(),
                        "Submission Successful!", "Issue report has been sent.");




            }
        });

        backButton.setOnAction(event -> {
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
        });



    }
}


