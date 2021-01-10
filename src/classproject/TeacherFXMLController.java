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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class TeacherFXMLController implements Initializable {

    @FXML
    private BorderPane borderPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void homeButtonOnClick(ActionEvent event) throws IOException {
       
        
          Parent homeScene = FXMLLoader.load(getClass().getResource("TeacherFXML.fxml"));
        Scene scene2 = new Scene(homeScene);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void studySupplementButtonOnClick(ActionEvent event) throws IOException {
        
                Parent sceneSupplement = FXMLLoader.load(getClass().getResource("TeacherFXMLcourseStudySuppliment.fxml"));
        borderPane.setCenter(sceneSupplement);
    }

    @FXML
    private void sendNoticeButtonOnClick(ActionEvent event) throws IOException {
         
                Parent sceneNoticeSend = FXMLLoader.load(getClass().getResource("GiveNotice.fxml"));
        borderPane.setCenter(sceneNoticeSend);
    }

    @FXML
    private void resultSubmissionButtonOnClick(ActionEvent event) throws IOException {
        
 Parent sceneResultSend =
         FXMLLoader.load(getClass().getResource("TeacherFXMLcourseResultSubmission.fxml"));
        borderPane.setCenter(sceneResultSend);
    }

    @FXML
    private void viewNoticeButtonOnClick(ActionEvent event) throws IOException {
               Parent sceneNotice = FXMLLoader.load(getClass().getResource("Notice.fxml"));
        borderPane.setCenter(sceneNotice);
    }
    

    @FXML
    private void selfAttandOnButtonClick(ActionEvent event) {

    }

    @FXML
    private void studentAttandOnButtonClick(ActionEvent event) throws IOException {
                  Parent sceneNotice = FXMLLoader.load(getClass().getResource("TeacherFXMLstudentAttandance.fxml"));
        borderPane.setCenter(sceneNotice);
    }

    @FXML
    private void changePasswordButtonOnClick(ActionEvent event) throws IOException {
         Parent sceneCourseRecord = FXMLLoader.load(getClass().getResource("ChangePassword.fxml"));
        borderPane.setCenter(sceneCourseRecord);
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
