/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author User
 */
public class TeacherFXMLstudentAttandanceController implements Initializable {

    @FXML
    private ComboBox courseComboBox;
    @FXML
    private TableView<Student> studentAttendsTable;
    @FXML
    private TableColumn<Student, String> nameColumn;
    @FXML
    private TableColumn<Student, Integer> idColumn;
    ObservableList<Student> studentList = FXCollections.observableArrayList();
    @FXML
    private DatePicker datePicker;
    ObservableList<Student> attendList;
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       BufferedReader out;
        try {
            out = new BufferedReader(new FileReader("CourseName.bin"));
       
              String[] rr = out.readLine().split(",");
              for(String d: rr){
                   courseComboBox.getItems().add(d);
                    }
       
         
             
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TeacherFXMLstudentAttandanceController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TeacherFXMLstudentAttandanceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            idColumn.setCellValueFactory(new PropertyValueFactory<Student,Integer>("id"));
            nameColumn.setCellValueFactory(new PropertyValueFactory<Student,String>("name"));
            
            
       
      
       studentAttendsTable.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }   

    @FXML
    private void takingAttandance(MouseEvent event) {
        
            
            Student personSelected = studentAttendsTable.getSelectionModel().getSelectedItem();
            attendList.add(personSelected);
    }

    @FXML
    private void loadButtonOnClick(ActionEvent event) throws FileNotFoundException {
        
        String c = courseComboBox.getValue().toString();
        File f1 = new File("CourseList.txt"); 
           Scanner sc;         
            sc = new Scanner(f1);         
            while(sc.hasNextLine()){
                String line=new String();
                 line = sc.nextLine();
                String[] dataField;
                dataField = line.split(",");
                 if(dataField[2].equals(c)){
                    
                      File f = new File("StudentList.txt"); 
           Scanner scn;         
            scn = new Scanner(f);         
            while(scn.hasNextLine()){
                String line2=new String();
                 line2 = scn.nextLine();
                String[] data;
                data = line2.split(",");
                    if(dataField[1].equals(data[1])){
                    studentList.add(new Student(data[0],Integer.parseInt(data[1])));
                    }
                 }
            break;
              }
            }
            studentAttendsTable.setItems(studentList);  
        
    }

    @FXML
    private void submitButtonOnClick(ActionEvent event)throws IOException  {
        
         FileOutputStream write = new FileOutputStream(datePicker.getValue()+"_"+courseComboBox.getValue().toString()+".bin");
            DataOutputStream dw = new DataOutputStream(write);
        for(Student s:attendList ){
            dw.writeUTF(s.getName()+","+s.getId()+"\r\n");
            
            dw.close(); 
    }}
}
