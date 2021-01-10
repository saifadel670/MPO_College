package classproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class NationalCollegeAdminFXMLController {

    @FXML
    private Label userTextLabel;
    @FXML
    private BorderPane nationalCollegeBorderPane;


    

    @FXML
    private void correctingInformationButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneCorrectingInformation = FXMLLoader.load(getClass().getResource("CorrectingInformation.fxml"));
        nationalCollegeBorderPane.setCenter(sceneCorrectingInformation);
    }

    @FXML
    private void transfarStudentButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneStudentTransfar = FXMLLoader.load(getClass().getResource("StudentTransfar.fxml"));
        nationalCollegeBorderPane.setCenter(sceneStudentTransfar);
    }

    @FXML
    private void transfarTeacherButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneTransfarTeacher = FXMLLoader.load(getClass().getResource("TeacherTransfar.fxml"));
        nationalCollegeBorderPane.setCenter(sceneTransfarTeacher);
    }

    @FXML
    private void degreeCandidateButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneDegreeCandidate = FXMLLoader.load(getClass().getResource("DegreeCandidate.fxml"));
        nationalCollegeBorderPane.setCenter(sceneDegreeCandidate);
    }

    @FXML
    private void studentResultButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneStudentResult = FXMLLoader.load(getClass().getResource("CourseResultChart.fxml"));
        nationalCollegeBorderPane.setCenter(sceneStudentResult);
    }

    @FXML
    private void teacherDetailsButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneTeacherDetails = FXMLLoader.load(getClass().getResource("TeacherDetails.fxml"));
        nationalCollegeBorderPane.setCenter(sceneTeacherDetails);
    }

    @FXML
    private void changePasswordButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneCourseRecord = FXMLLoader.load(getClass().getResource("ChangePassword.fxml"));
        nationalCollegeBorderPane.setCenter(sceneCourseRecord);
    }

    @FXML
    private void logoutButtonOnclick(ActionEvent event) throws IOException {
        Parent logout = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene2 = new Scene(logout);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
        
    }

    @FXML
    private void homeButtonOnclick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("NationalCollegeAdminFXML.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
}
