/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ChangePasswordController implements Initializable {

    @FXML
    private TextField passwordField;
    @FXML
    private Label statusLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveButtonOnClick(ActionEvent event) {
         try {
             FileInputStream c = new FileInputStream("InformationPass.bin");
            DataInputStream rcv = new DataInputStream(c);
            String str = rcv.readUTF();
           String[] data; 
           data = str.split(",");
          
        FileInputStream check = new FileInputStream("userInformation.bin");       
        DataInputStream read = new DataInputStream(check);
        String str1 = read.readUTF();
        String[] userArray;
        userArray = str1.split(",");
        String newContent =new String();
        for(int i=0; i<= (userArray.length-3); i=i+3){
           if(data[0].equals(userArray[i])){
            
            newContent = newContent +(userArray[i]+","+passwordField.getText()+","+userArray[i+2]+",");
        }
           else{
           newContent = newContent + (userArray[i]+","+userArray[i+1]+","+userArray[i+2]+",");
           }
           }
        FileOutputStream write = new FileOutputStream("userInformation.bin");
            DataOutputStream dw = new DataOutputStream(write);
            dw.writeUTF(newContent);
            dw.close();
            statusLabel.setText("password has changed");
        
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(ChangePasswordController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ChangePasswordController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
}
