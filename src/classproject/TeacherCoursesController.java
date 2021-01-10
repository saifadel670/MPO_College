/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author User
 */
public class TeacherCoursesController implements Initializable {

    @FXML
    private TextField courseNameTextField;
    @FXML
    private TextField TimeTextField;
    @FXML
    private TextField dayField;
    @FXML
    private TableView teacherTableView;
    @FXML
    private TableColumn<Teacher, String> teachernameColumn;
    @FXML
    private TextArea studentIDTextArea;
    @FXML
    private Label statusLabel;
    
    @FXML
    private TextField creditField;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        teachernameColumn.setCellValueFactory(new PropertyValueFactory<Teacher,String>("name"));
        teacherTableView.setItems(getPeople());
        teacherTableView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }    
    public ObservableList<Teacher> getPeople(){
        ObservableList<Teacher> people = FXCollections.observableArrayList();
        people.add(new Teacher("Ahsan Habib",1112,"Male",30000,016,LocalDate.of(1998, Month.AUGUST,12),"MPO","Lecturer"));
        people.add(new Teacher("S.K.D",2112,"Male",30000,1371,LocalDate.of(2002, Month.AUGUST,02),"MPO","Senior Lecturer"));
        people.add(new Teacher("Sabrina Khanam",2112,"Female",20000,1371,LocalDate.of(2018, Month.AUGUST,22),"General","Senior Lecturer"));
        return people;
    } 
    
    @FXML
    private void submitButtonOnClick(ActionEvent event) throws FileNotFoundException, IOException {
        String content = new String();
        Teacher personSelected =  (Teacher) teacherTableView.getSelectionModel().getSelectedItem();
        String tname= personSelected.getName();
        String course = courseNameTextField.getText();
        String stuId = studentIDTextArea.getText();
        String[] dataId; 
       dataId =stuId.split(",");
       
      
            for(String s: dataId){
                content += tname+","+s+","+course+","+creditField.getText()+","+"R"+"\r\n";
            }
         File f = new File("CourseList.txt");
            if(f.exists()){
            FileWriter writ = new FileWriter(f,true);
            writ.write(content);
            writ.close();
            }
            else{
                FileWriter writ = new FileWriter(f);
                writ.write(content);
                 writ.close();
            }
            
            File fd = new File("CourseName.bin");
           if(f.exists()){
            BufferedWriter out = new BufferedWriter( 
                   new FileWriter(fd, true)); 
            out.write(course+","); 
            out.close(); 
            }
            else{
                BufferedWriter out = new BufferedWriter(new FileWriter(fd)); 
            out.write(course+","); 
            out.close(); 
            }
            statusLabel.setText("Course registration has done");
    }
    
}
