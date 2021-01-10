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
public class CollegePrincipleFXMLController implements Initializable {

    @FXML
    private BorderPane principleBorderpane;
    @FXML
    private Label userCollegePrincipleLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void currentAmountButtonOnclick(ActionEvent event) throws IOException {
       Parent sceneCurrentAmount = FXMLLoader.load(getClass().getResource("FundCurrentMoney.fxml"));
        principleBorderpane.setCenter(sceneCurrentAmount);
    }

    @FXML
    private void previousRecordButtonOnclick(ActionEvent event) throws IOException {
         Parent sceneRecord = FXMLLoader.load(getClass().getResource("FundPreviousRecord.fxml"));
        principleBorderpane.setCenter(sceneRecord);
    }

    @FXML
    private void teacherAttendanceButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneTeacherRecord = FXMLLoader.load(getClass().getResource("TeacherAttendance.fxml"));
        principleBorderpane.setCenter(sceneTeacherRecord);
    }

    @FXML
    private void officerAttendanceButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneOfficerRecord = FXMLLoader.load(getClass().getResource("OfficerAttendance.fxml"));
        principleBorderpane.setCenter(sceneOfficerRecord);
    }

    @FXML
    private void indivitualStudentButtonOnclick(ActionEvent event) {
    }

    @FXML
    private void courseWiseResultButtonOnclick(ActionEvent event) throws IOException {
       Parent sceneCourse = FXMLLoader.load(getClass().getResource("CourseResult.fxml"));
        principleBorderpane.setCenter(sceneCourse);
    }


    @FXML
    private void giveNoticeButtonOnclick(ActionEvent event) throws IOException {
        Parent noticeScene = FXMLLoader.load(getClass().getResource("GiveNotice.fxml"));
        principleBorderpane.setCenter(noticeScene);
    }

    @FXML
    private void salaryButtonOnclick(ActionEvent event) throws IOException {
          Parent sceneNotice = FXMLLoader.load(getClass().getResource("Notice.fxml"));
        principleBorderpane.setCenter(sceneNotice);
    }

    @FXML
    private void changePasswordButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneCourseRecord = FXMLLoader.load(getClass().getResource("ChangePassword.fxml"));
        principleBorderpane.setCenter(sceneCourseRecord);
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
    private void homeButtonOnCLick(ActionEvent event) throws IOException {
        Parent homeScene = FXMLLoader.load(getClass().getResource("CollegePrincipleFXML.fxml"));
        Scene scene2 = new Scene(homeScene);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void reportButtonOnClick(ActionEvent event) throws IOException {
        Parent sceneNotice = FXMLLoader.load(getClass().getResource("ModifiedReport.fxml"));
        principleBorderpane.setCenter(sceneNotice);
        
        
    }
    
}
