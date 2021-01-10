/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

/**
 * FXML Controller class
 *
 * @author User
 */
public class TeacherFXMLcourseResultSubmissionController implements Initializable {

    @FXML
    private ComboBox courseComboBox;
    @FXML
    private TableView<Student> studentTableview;
    @FXML
    private TableColumn<Student, Integer> idColumn;
    @FXML
    private TableColumn<Student, String> gradeColumn;
    ObservableList<Student> informationeList = FXCollections.observableArrayList();
    
    @FXML
    private Label statusLabel;
    @FXML
    private TextField gradeField;
    int checkId=0;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       try {
//           String str1= new String();String str2= new String();
//        File f1 = new File("CourseList.txt"); 
//           Scanner sc;         
//            sc = new Scanner(f1);         
//            while(sc.hasNextLine()){
//                String line=new String();
//                 line = sc.nextLine();
//                String[] dataField;
//                dataField = line.split(",");
//                str1 +=dataField[2]+",";
//                       courseComboBox.getItems().add(dataField[2]);         
//              }
              BufferedReader out = new BufferedReader(new FileReader("CourseName.bin"));
              String[] rr = out.readLine().split(",");
              for(String d: rr){
                   courseComboBox.getItems().add(d);
              }
            } catch (FileNotFoundException ex) {
            Logger.getLogger(TeacherFXMLcourseResultSubmissionController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(TeacherFXMLcourseResultSubmissionController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            idColumn.setCellValueFactory(new PropertyValueFactory<Student,Integer>("id"));
            gradeColumn.setCellValueFactory(new PropertyValueFactory<Student,String>("extraField"));
            
       
      
       studentTableview.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }
    @FXML
    private void submitButtonOnlick(ActionEvent event) throws FileNotFoundException, IOException {
       String content = new String();       
         File f = new File("CourseList.txt");
        Scanner sc =new  Scanner(f);
       
        while (sc.hasNextLine()){
        String line =sc.nextLine();
        String[] data = line.split(",");
        Student personSelected = studentTableview.getSelectionModel().getSelectedItem();
  
           if(Integer.parseInt(personSelected.getId()) == Integer.parseInt(data[1]) &&
                   data[2].equals(courseComboBox.getValue().toString())){
            System.out.println("file writing"); 
            content += data[0]+","+data[1]+","+data[2]+","+data[3]+","+gradeField.getText()+"\r\n";
            checkId = Integer.parseInt(data[1]);
        }
           else {
            content += line+"\r\n";              
            }
               
    }
         File fw = new File("CourseList.txt");
        FileWriter writ = new FileWriter(fw);
        BufferedWriter bufferedWriter = new BufferedWriter(writ);
        bufferedWriter.write(content);   
        bufferedWriter.flush();
        bufferedWriter.close(); 
        statusLabel.setText("Done for"+checkId);
        //informationeList.clear();
        //studentTableview.setItems(informationeList);
    
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
                    
                    informationeList.add(new Student(Integer.parseInt(dataField[1]),dataField[4]));
                 }
              }
           
            studentTableview.setItems(informationeList);
       
    }
    
}
