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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AccountOfficerFXMLController implements Initializable {

    @FXML
    private BorderPane accountOfficerBorder;
    @FXML
    private AnchorPane accountOfficerAnchorPane;
    @FXML
    private Label loginAccountOfficer;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void selfAttandanceOnclick(ActionEvent event) {
    }
    @FXML
    private void homeButtonOnClick(MouseEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("AccountOfficerFXML.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
        
    }

    @FXML
    private void currentAmountButtonOnClick(ActionEvent event) throws IOException {
         Parent sceneCurrentAmount = FXMLLoader.load(getClass().getResource("FundCurrentMoney.fxml"));
        accountOfficerBorder.setCenter(sceneCurrentAmount);
        
    }

    @FXML
    private void cashButtonOnClick(ActionEvent event) throws IOException {
        Parent sceneAddAmount = FXMLLoader.load(getClass().getResource("FundAddMoneyCash.fxml"));
        accountOfficerBorder.setCenter(sceneAddAmount);
        
    }

    @FXML
    private void dipositeButtonOnClick(ActionEvent event) throws IOException {
         Parent sceneAddMoney = FXMLLoader.load(getClass().getResource("FundAddMoneyDeposit.fxml"));
        accountOfficerBorder.setCenter(sceneAddMoney);
    }

    @FXML
    private void useMoneyButtonOnClick(ActionEvent event) throws IOException {
        Parent sceneUsemoney = FXMLLoader.load(getClass().getResource("FundUseMoney.fxml"));
        accountOfficerBorder.setCenter(sceneUsemoney);
    }

    @FXML
    private void previousRecordButtonOnClick(ActionEvent event) throws IOException {
        Parent sceneRecord = FXMLLoader.load(getClass().getResource("FundPreviousRecord.fxml"));
        accountOfficerBorder.setCenter(sceneRecord);
    }

    @FXML
    private void salaryButtonOnClick(ActionEvent event) throws IOException {
        Parent sceneSalary = FXMLLoader.load(getClass().getResource("Salary.fxml"));
        accountOfficerBorder.setCenter(sceneSalary);
    }

    @FXML
    private void noticebuttonOnClick(ActionEvent event) throws IOException {
        Parent sceneNotice = FXMLLoader.load(getClass().getResource("Notice.fxml"));
        accountOfficerBorder.setCenter(sceneNotice);
    }

    @FXML
    private void changePasswordButtonOnClick(ActionEvent event) throws IOException {
        Parent sceneCourseRecord = FXMLLoader.load(getClass().getResource("ChangePassword.fxml"));
        accountOfficerBorder.setCenter(sceneCourseRecord);
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
