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
public class RegisterOfficeFXMLController implements Initializable {

    @FXML
    private BorderPane registerOfficeBorderPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    

    @FXML
    
    private void homeButttonOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("RegisterOfficeFXML.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void promotedButttonOnClick(ActionEvent event) throws IOException {
        Parent scenePromotedButtton = FXMLLoader.load(getClass().getResource("StudentPromoted.fxml"));
        registerOfficeBorderPane.setCenter(scenePromotedButtton);
    }

    @FXML
    private void failedButttonOnClick(ActionEvent event) throws IOException {
        Parent sceneFailedButtton = FXMLLoader.load(getClass().getResource("StudentFailled.fxml"));
        registerOfficeBorderPane.setCenter(sceneFailedButtton);
    }

    @FXML
    private void newScholarshipButttonOnClick(ActionEvent event) throws IOException {
        Parent sceneNewScholarship = FXMLLoader.load(getClass().getResource("NewScholershipStudent.fxml"));
        registerOfficeBorderPane.setCenter(sceneNewScholarship);
    }

    @FXML
    private void listOfscholarshipButttonOnClick(ActionEvent event) throws IOException {
        Parent sceneListOfscholarship = FXMLLoader.load(getClass().getResource("ScholershipList.fxml"));
        registerOfficeBorderPane.setCenter(sceneListOfscholarship);
    }

    @FXML
    private void salaryButttonOnClick(ActionEvent event) throws IOException {
        Parent sceneSalary = FXMLLoader.load(getClass().getResource("Salary.fxml"));
        registerOfficeBorderPane.setCenter(sceneSalary);
    }

    @FXML
    private void noticeButttonOnClick(ActionEvent event) throws IOException {
        Parent sceneNotice = FXMLLoader.load(getClass().getResource("Notice.fxml"));
        registerOfficeBorderPane.setCenter(sceneNotice);
    }

    @FXML
    private void teacherCourseButttonOnClick(ActionEvent event) throws IOException {
        Parent sceneTeacherCourse = FXMLLoader.load(getClass().getResource("TeacherCourses.fxml"));
        registerOfficeBorderPane.setCenter(sceneTeacherCourse);
    }


    @FXML
    private void changePasswordOnButtonClick(ActionEvent event) throws IOException {
        Parent sceneCourseRecord = FXMLLoader.load(getClass().getResource("ChangePassword.fxml"));
        registerOfficeBorderPane.setCenter(sceneCourseRecord);
    }

    @FXML
    private void logOutOnButtonClick(ActionEvent event) throws IOException {
        Parent logout = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene2 = new Scene(logout);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void creatEmployeeIdBUttonOnClick(ActionEvent event) throws IOException {
        Parent sceneNotice = FXMLLoader.load(getClass().getResource("NewEmployeeId.fxml"));
        registerOfficeBorderPane.setCenter(sceneNotice);
        
        
    }
    
}
