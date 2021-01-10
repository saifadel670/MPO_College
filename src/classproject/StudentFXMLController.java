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
public class StudentFXMLController implements Initializable {

    @FXML
    private BorderPane studentBorderPane;
    @FXML
    private Label userNameLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void homeButtonOnClick(ActionEvent event) throws IOException {
      Parent pr = FXMLLoader.load(getClass().getResource("EmptyAncorPane.fxml"));
      studentBorderPane.setCenter(pr);
//        Scene mainScene = new Scene(pr);
//        Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
//       
//        s.setScene(mainScene);
//        s.show();
    }

    @FXML
    private void courseResultButtonOnClick(ActionEvent event) throws IOException {
        
     Parent sceneCourseRecord = FXMLLoader.load(getClass().getResource("StudentFXMLcourseCourseResultfxml.fxml"));
        studentBorderPane.setCenter(sceneCourseRecord);
    }

    @FXML
    private void courseSupplementButtonOnClick(ActionEvent event) throws IOException {
                Parent sceneCourseRecord = FXMLLoader.load(getClass().getResource("StudentFXMLcourseTeacherSuppliment.fxml"));
        studentBorderPane.setCenter(sceneCourseRecord);
    }

    @FXML
    private void noticeButtonOnClick(ActionEvent event) throws IOException {
         Parent sceneNotice = FXMLLoader.load(getClass().getResource("Notice.fxml"));
        studentBorderPane.setCenter(sceneNotice);
    }

    @FXML
    private void transcriptButtonOnClick(ActionEvent event) throws IOException {
         Parent sceneTranscript = FXMLLoader.load(getClass().getResource("StudentFXMLTranscript.fxml"));
        studentBorderPane.setCenter(sceneTranscript);
    }

    @FXML
    private void scholarshipButtonOnClick(ActionEvent event) throws IOException {
         Parent sceneScholar = FXMLLoader.load(getClass().getResource("StudentFXMLScholarship.fxml"));
        studentBorderPane.setCenter(sceneScholar);
    }

    @FXML
    private void changepasswordButtonOnClick(ActionEvent event) throws IOException {
        
        Parent sceneCourseRecord = FXMLLoader.load(getClass().getResource("ChangePassword.fxml"));
        studentBorderPane.setCenter(sceneCourseRecord);
    }

    
    @FXML
    private void logoutButtonOnClick(ActionEvent event) throws IOException {
         Parent logout = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene2 = new Scene(logout);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
        
    }
    
}
