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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AdmissionOfficerFXMLController {

    @FXML
    private BorderPane AdmissonOfficerBorder;

    @FXML
    private AnchorPane AdmissonOfficerAnchorPane;
    @FXML
    private Label loginField;
    @FXML
    private Label userField;

    void initialize() {

    }


    @FXML
    private void changePasswordOnclick(ActionEvent event) throws IOException {
        Parent sceneCourseRecord = FXMLLoader.load(getClass().getResource("ChangePassword.fxml"));
        AdmissonOfficerBorder.setCenter(sceneCourseRecord);
    }

    @FXML
    private void logoutOnclick(ActionEvent event) throws IOException {
        Parent logout = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene2 = new Scene(logout);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void admissonStudentButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneAdmissionStudent = FXMLLoader.load(getClass().getResource("AdmissionStudent.fxml"));
        AdmissonOfficerBorder.setCenter(sceneAdmissionStudent);
    }

    @FXML
    private void cancelStudentAdmissonButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneCancelStudentAdmission = FXMLLoader.load(getClass().getResource("CancelAdmission.fxml"));
        AdmissonOfficerBorder.setCenter(sceneCancelStudentAdmission);
    }

    @FXML
    private void selfAttandanceButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneSelfAttandance = FXMLLoader.load(getClass().getResource("SelfAttandance.fxml"));
        AdmissonOfficerBorder.setCenter(sceneSelfAttandance);
    }

    @FXML
    private void salaryButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneSalary = FXMLLoader.load(getClass().getResource("Salary.fxml"));
        AdmissonOfficerBorder.setCenter(sceneSalary);
    }

    @FXML
    private void noticeButtonOnclick(ActionEvent event) throws IOException {
        Parent sceneNotice = FXMLLoader.load(getClass().getResource("Notice.fxml"));
        AdmissonOfficerBorder.setCenter(sceneNotice);
    }
}
