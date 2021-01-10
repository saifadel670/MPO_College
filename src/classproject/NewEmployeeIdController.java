/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author User
 */
public class NewEmployeeIdController implements Initializable {

    @FXML
    private TextField nameTextFIeld;
    @FXML
    private TextField idTextField;
   
    @FXML
    private RadioButton maleRadioButton;
    @FXML
    private RadioButton femaleRedioButton;
    @FXML
    private CheckBox mpoSelectBox;
    @FXML
    private TextField salaryTextField;
    @FXML
    private ComboBox designationComboBox;
    private ToggleGroup tg;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       designationComboBox.getItems().addAll("Teacher", "Department Head", "Account Officer","Admission Officer","Register Officer");
        tg = new ToggleGroup();
        maleRadioButton.setToggleGroup(tg);
        femaleRedioButton.setToggleGroup(tg);
    }    

    @FXML
    private void creatButtonOnClick(ActionEvent event) {
           try { 
               String gender, type;
         FileOutputStream check;       
    
            check = new FileOutputStream("userInformation.bin",true);
            ObjectOutputStream wr = new ObjectOutputStream(check);
            wr.writeUTF(String.valueOf(idTextField.getText())+",1234,"+designationComboBox.getItems().toString()+",");
            wr.close();
            if(mpoSelectBox.isSelected()) type = "MPO";
            else type = "General";
            if(maleRadioButton.isSelected()) gender = "Male";
            else gender = "Female";
            File f = new File("EmployeeList.bin");
            if(f.exists()){
           FileOutputStream insert = new FileOutputStream("EmployeeList.bin",true);
            ObjectOutputStream w = new ObjectOutputStream(insert);
            w.writeObject(new Officer(nameTextFIeld.getText(),Integer.parseInt(idTextField.getText()),
                   gender,Integer.parseInt(salaryTextField.getText()),designationComboBox.getValue().toString(), type  ));

                  w.close();
            }
            else{
                FileOutputStream insert = new FileOutputStream("EmployeeList.bin");
            ObjectOutputStream w = new ObjectOutputStream(insert);
            w.writeObject(new Officer(nameTextFIeld.getText(),Integer.parseInt(idTextField.getText()),
                   gender,Integer.parseInt(salaryTextField.getText()),designationComboBox.getValue().toString(), type  ));

                  w.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewEmployeeIdController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewEmployeeIdController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
