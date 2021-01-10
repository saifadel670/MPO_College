/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class EducattionalOfficerFXMLController implements Initializable {

    @FXML
    private Label userNameLabel;
    @FXML
    private BorderPane educationalBordePane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void homeButtonOnCLick(ActionEvent event) throws IOException {
         Parent homeScene = FXMLLoader.load(getClass().getResource("CollegePrincipleFXML.fxml"));
        Scene scene2 = new Scene(homeScene);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
        
    }

    @FXML
    private void teacherAttandanceButtonOnCLick(ActionEvent event) throws IOException {
         Parent sceneTeacherRecord = FXMLLoader.load(getClass().getResource("TeacherAttendance.fxml"));
        educationalBordePane.setCenter(sceneTeacherRecord);
    }

    @FXML
    private void courseButtonOnCLick(ActionEvent event) throws IOException {
        Parent sceneCourse = FXMLLoader.load(getClass().getResource("CourseResult.fxml"));
        educationalBordePane.setCenter(sceneCourse);
    }

    @FXML
    private void salaryPermissionButtonOnCLick(ActionEvent event) throws IOException {
        
          Parent permissionScene = FXMLLoader.load(getClass().getResource("SelaryPermission.fxml"));
        educationalBordePane.setCenter(permissionScene);
    }

    @FXML
    private void teacherButtonOnCLick(ActionEvent event) throws IOException {
        
         Parent dataScene = FXMLLoader.load(getClass().getResource("BiodataEmployee.fxml"));
        educationalBordePane.setCenter(dataScene);
    }

    @FXML
    private void employeeButtonOnCLick(ActionEvent event) throws IOException {
        Parent dataScene = FXMLLoader.load(getClass().getResource("BiodataEmployee.fxml"));
        educationalBordePane.setCenter(dataScene);
    }

    @FXML
    private void changeButtonOnCLick(ActionEvent event) throws IOException {
         Parent sceneCourseRecord = FXMLLoader.load(getClass().getResource("ChangePassword.fxml"));
        educationalBordePane.setCenter(sceneCourseRecord);
        
    }

    @FXML
    private void logoutButtonOnCLick(ActionEvent event) throws IOException {
        Parent logout = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene2 = new Scene(logout);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    
}
