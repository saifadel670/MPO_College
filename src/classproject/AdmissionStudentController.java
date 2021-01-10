/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
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
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AdmissionStudentController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField idTextField;
    @FXML
    private TextField sessionTextField;
    @FXML
    private RadioButton maleRadioButton;
    @FXML
    private RadioButton femaleRadioButton;
    private ToggleGroup tg; String gender;
    @FXML
    private Label statusLabel;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      tg = new ToggleGroup();
        maleRadioButton.setToggleGroup(tg);
        femaleRadioButton.setToggleGroup(tg);
    }    

    @FXML
    private void submitButtonOnclick(ActionEvent event) {
         if(maleRadioButton.isSelected()) gender ="MALE"; else gender = "Female";
         String str =  nameTextField.getText()+","+idTextField.getText()+","+
                 sessionTextField.getText()+","+gender+",0% Scholarship"+"\r\n";
         String str1 = idTextField.getText()+",1234,Student,";
                 
        try {
//            FileOutputStream writeInfo = new FileOutputStream("userInformation.bin",true);
//             DataOutputStream dwInfo = new DataOutputStream(writeInfo);
//            dwInfo.writeUTF(str1); dwInfo.close();
//----------------------------------------------------------------
FileInputStream check = new FileInputStream("userInformation.bin");       
        DataInputStream read = new DataInputStream(check);
        String str2 = read.readUTF();
FileOutputStream write = new FileOutputStream("userInformation.bin");
            DataOutputStream dw = new DataOutputStream(write);
               dw.writeUTF(str2+str1);
               //id,pass,type,
//            dw.writeUTF("1111,1234,Student,1112,12345,Teacher,1113,1235,Department Head,1114,1345,Principle,"
//                    + "1115,9999,Account Officer,1116,1235,Admission Officer,1116,12345,Register Officer,1117,"
//                    + "1235,National University,1117,1345,Educational Officer,"+str1);
            dw.close();
//-------------------------------------------------------------------------

            File f = new File("StudentList.txt");
            if(f.exists()){
            FileWriter writ = new FileWriter(f,true);
            writ.write(str);
            writ.close();
            }
            else{
                FileWriter writ = new FileWriter(f);
                writ.write(str);
                 writ.close();
            }
            
            statusLabel.setText("Admission has Done");
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdmissionStudentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdmissionStudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
    }
    
}
