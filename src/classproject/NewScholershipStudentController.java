/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
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
public class NewScholershipStudentController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField idTextField;
    @FXML
    private TextField sessionTextField;
    @FXML
    private TextField scholershipParcentageTextField;
     
    @FXML
    private Label statuslabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitButtonOnclick(ActionEvent event) throws FileNotFoundException, IOException {
          String content = new String ();  
        File f = new File("StudentList.txt");
        Scanner sc =new  Scanner(f);
       
        while (sc.hasNextLine()){
        String line =sc.nextLine();
        String[] data = line.split(",");
        if(Integer.parseInt(idTextField.getText()) == Integer.parseInt(data[1])){
            System.out.println("file writing");
            content +=data[0]+","+data[1]+","+data[2]+","+data[3]+","+Integer.parseInt(scholershipParcentageTextField.getText())+"% Scholarship"+"\r\n";
                        //name, id, gender, ...% scholarship
        }
        else {
            content += line+"\r\n";
        }       
        }
         File fw = new File("StudentList.txt");
        FileWriter writ = new FileWriter(fw);
        BufferedWriter bufferedWriter = new BufferedWriter(writ);
        bufferedWriter.write(content);
        
        bufferedWriter.close(); 
        
        statuslabel.setText(" DONE ");
    }
    
}
