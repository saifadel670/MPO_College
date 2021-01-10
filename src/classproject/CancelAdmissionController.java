/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject;

import java.io.BufferedWriter;
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
import java.util.Scanner;
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
public class CancelAdmissionController implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private TextField sessionTextField;
    @FXML
    private TextField reasonTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private Label statuslabel;
    String content = new String();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void submitButtonOnclick(ActionEvent event) {
        try {
            FileInputStream check = new FileInputStream("userInformation.bin");       
        DataInputStream read = new DataInputStream(check);
        String str1 = read.readUTF();
        String[] userArray;
        userArray = str1.split(",");
        String newContent =new String();
        for(int i=0; i<= (userArray.length-3); i=i+3){
           if(idTextField.getText().equals(userArray[i])){
            statuslabel.setText("Admission Has Cancelled");
            //newContent = newContent +(userArray[i]+","+passwordField.getText()+","+userArray[i+2]+",");
        }
           else{
           newContent = newContent + (userArray[i]+","+userArray[i+1]+","+userArray[i+2]+",");
           }
           }
        FileOutputStream write = new FileOutputStream("userInformation.bin");
            DataOutputStream dw = new DataOutputStream(write);
            dw.writeUTF(newContent);
            dw.close();
            //----------------------------------
            
        File f = new File("StudentList.txt");
        Scanner sc =new  Scanner(f);
       
        while (sc.hasNextLine()){
        String line =sc.nextLine();
        String[] data = line.split(",");
        if(Integer.parseInt(idTextField.getText()) == Integer.parseInt(data[1])){
            System.out.println("file writing");
            statuslabel.setText("Admission Has Cancelled v2");
        }
        else {
            content += line;
                
               
            }
        
        
        }
        
        File fw = new File("StudentList.txt");
        FileWriter writ = new FileWriter(fw);
        BufferedWriter bufferedWriter = new BufferedWriter(writ);
        //
        bufferedWriter.write(content);
        
        bufferedWriter.close();     
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CancelAdmissionController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CancelAdmissionController.class.getName()).log(Level.SEVERE, null, ex);
       
        
    }
    
}}
