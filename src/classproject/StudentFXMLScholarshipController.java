/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author User
 */
public class StudentFXMLScholarshipController implements Initializable {

    @FXML
    private Label scholarshipRate;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         try {
             FileInputStream c = new FileInputStream("InformationPass.bin");
            DataInputStream rcv = new DataInputStream(c);
            String str = rcv.readUTF();
           String[] data, dataField;
           data = str.split(",");
            File f1 = new File("StudentList.txt"); 
           Scanner sc = new Scanner(f1);
           while(sc.hasNextLine()){
                String line=null;
                 line = sc.nextLine();
                dataField=null;
                dataField = line.split(",");
                if(dataField[1].equals(data[0])){
                  scholarshipRate.setText("You are enjoying "+dataField[4]);
                }
           
           } 
     }  catch (FileNotFoundException ex) {    
            Logger.getLogger(StudentFXMLScholarshipController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentFXMLScholarshipController.class.getName()).log(Level.SEVERE, null, ex);
        }    
    
}
}
       