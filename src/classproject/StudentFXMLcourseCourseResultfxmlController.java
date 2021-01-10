/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author User
 */
public class StudentFXMLcourseCourseResultfxmlController implements Initializable {

    @FXML
    private TableView<Course> courseTableView;
    @FXML
    private TableColumn<Course, String>  courseColumn;
    @FXML
    private TableColumn<Course, String>  gpaColumn;
    @FXML
    private TextField yearTextField;
    ObservableList<Course> courseList = FXCollections.observableArrayList();
    int credit = 0;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       courseColumn.setCellValueFactory(new PropertyValueFactory<Course,String>("coursName"));
       gpaColumn.setCellValueFactory(new PropertyValueFactory<Course,String>("grade"));
    }    

    @FXML
    private void getResultButtonOnClick(ActionEvent event) {
        try{
           FileInputStream c = new FileInputStream("InformationPass.bin");
            DataInputStream rcv = new DataInputStream(c);
            String str = rcv.readUTF();
           String[] data;
           data = str.split(",");
           
           File f = new File("CourseList.txt"); 
           Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String line=new String();
                 line = sc.nextLine();
                 String[] dataField;
                dataField = line.split(",");
                if(dataField[1].equals(data[0])){
                    credit +=Integer.parseInt(dataField[3]);
                    courseList.add(new Course(dataField[2],Integer.parseInt(dataField[3]),dataField[4])); 
                }
          
            }
            
            courseTableView.setItems(courseList);
         
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentFXMLcourseCourseResultfxmlController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentFXMLcourseCourseResultfxmlController.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    
}
