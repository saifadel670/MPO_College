/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class GiveNoticeController implements Initializable {

    @FXML
    private CheckBox studentCheckBox;
    @FXML
    private CheckBox departmentHeadCheckBox;
    @FXML
    private CheckBox teacherCheckBox;
    @FXML
    private CheckBox registerOfficerCheckBox;
    @FXML
    private CheckBox admissionOfficerCheckBox;
    @FXML
    private Label statusLabel;
    @FXML
    private TextField headerTextField;
    @FXML
    private TextArea noticeTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendButtonOnclick(ActionEvent event)  {
       try {
        String sender = "Teacher"; String head = headerTextField.getText();  
       String receiver = new String();
       if(studentCheckBox.isSelected()) receiver+="Student,";
       if(departmentHeadCheckBox.isSelected() && teacherCheckBox.isSelected() && registerOfficerCheckBox.isSelected()
       && admissionOfficerCheckBox.isSelected()        ) statusLabel.setText("Not Permited");   //receiver+="Department Head,";
     
       
        if( receiver != null){
         File    f= new File(head+".txt");
         FileWriter dw = new FileWriter(f);
        dw.write(sender+"\r\n"+head+"\r\n"+receiver+"\r\n"+noticeTextArea.getText());
        dw.close();
        statusLabel.setText("Sent Notification");
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GiveNoticeController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GiveNoticeController.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
    }
    
}
