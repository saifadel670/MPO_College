/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject;

import java.io.BufferedReader;
import java.io.File;
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
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ModifiedReportController implements Initializable {

    @FXML
    private AnchorPane idTextField;
    @FXML
    private ComboBox studentComboBox;
    @FXML
    private TableView<Course> tableView;
    @FXML
    private TableColumn<Course, String> gradeColumn;
    @FXML
    private TableColumn<Course, Integer> noOfCourseColumn;
    @FXML
    private RadioButton courseChartRadioButton;
    @FXML
    private RadioButton studentChartRadioButton;
    @FXML
    private PieChart pieChart;
    
int a2=0,b2=0,c2=0,d2=0,f2=0;
    @FXML
    private ComboBox courseComboBox;
    @FXML
    private Label statusLabel;
     private ToggleGroup tg; 
    /*nitializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         tg = new ToggleGroup();
        courseChartRadioButton.setToggleGroup(tg);
        studentChartRadioButton.setToggleGroup(tg);
        try {
        File f = new File("StudentList.txt");
        Scanner sc = new Scanner (f);
         
         while(sc.hasNextLine()){
             String line = new String();
             line = sc.nextLine();
             String[] data = line.split(",");
             studentComboBox.getItems().add(data[1]);
         }
            
          BufferedReader out = new BufferedReader(new FileReader("CourseName.bin"));
            String[] rr = out.readLine().split(",");
              for(String d: rr){
                   courseComboBox.getItems().add(d);
              }
         
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ModifiedReportController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ModifiedReportController.class.getName()).log(Level.SEVERE, null, ex);
        }
         noOfCourseColumn.setCellValueFactory(new PropertyValueFactory<Course,Integer>("extra"));
       gradeColumn.setCellValueFactory(new PropertyValueFactory<Course,String>("grade"));
    }

    @FXML
    private void showChartButtonOnClick(ActionEvent event) throws FileNotFoundException {
        
        if(studentChartRadioButton.isSelected()){ 
        ObservableList <PieChart.Data> listPie = FXCollections.observableArrayList(
            new PieChart.Data("A",a2),
            new PieChart.Data("B",b2),
            new PieChart.Data("C",c2),
            new PieChart.Data("D",d2),
            new PieChart.Data("F",f2));
        pieChart.setData(listPie);
        for(PieChart.Data data: pieChart.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    statusLabel.setText(String.valueOf(data.getPieValue()));
                    
                }
            }
            );
        }
       }
       if(courseChartRadioButton.isSelected()){
           int p=0,q=0,r=0,s=0,t=0;
        
        String con = courseComboBox.getValue().toString();
        File f1 = new File("CourseList.txt"); 
           Scanner sc;         
            sc = new Scanner(f1);         
            while(sc.hasNextLine()){
                String line=new String();
                 line = sc.nextLine();
                String[] dataField;
                dataField = line.split(",");
                 if(dataField[2].equals(con)){
                     if(dataField[4].equalsIgnoreCase("A")){
                      p++;   
                     }
                     else if(dataField[4].equalsIgnoreCase("B")) q++;
                     else if(dataField[4].equalsIgnoreCase("c")) r++;
                     else if(dataField[4].equalsIgnoreCase("D")) s++;
                     else if(dataField[4].equalsIgnoreCase("F")) t++;
                 } }        
            
             ObservableList <PieChart.Data> listCourse = FXCollections.observableArrayList(
            new PieChart.Data("A",p),
            new PieChart.Data("B",q),
            new PieChart.Data("C",r),
            new PieChart.Data("D",s),
            new PieChart.Data("F",t)
        );
        pieChart.setData(listCourse);
        
        for(PieChart.Data data: pieChart.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    statusLabel.setText(String.valueOf(data.getPieValue()));
                    
                }
            }
            );
        }
           
           
       }
    }

    @FXML
    private void loadTableWithGradeButtonOnClick(ActionEvent event) {
        ObservableList<Course> list = FXCollections.observableArrayList();
        
 int a1=0,b1=0,c1=0,d1=0,f1=0;
        try {
            
            File f = new File("CourseList.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String line=new String();
                line = sc.nextLine();
                String[] dataField;
                dataField = line.split(",");
                int a = Integer.parseInt(dataField[1]);
                int b =Integer.parseInt( studentComboBox.getValue().toString());
               if (a==b){
                   if(dataField[4].equalsIgnoreCase("A")){
                      a1++;   
                     }
                     else if(dataField[4].equalsIgnoreCase("B")) b1++;
                     else if(dataField[4].equalsIgnoreCase("c")) c1++;
                     else if(dataField[4].equalsIgnoreCase("D")) d1++;
                     else if(dataField[4].equalsIgnoreCase("F")) f1++;
                   
                   //courseList.add(new Course(dataField[2], dataField[4]));
                    
                }}
               a2=a1;b2=b1;c2=c1;d2=d1;f2=f1;
               list.add(new Course("A", a1,true));
               list.add(new Course("B", b1,true));
               list.add(new Course("C", c1,true));
               list.add(new Course("D", d1,true));
               list.add(new Course("F", f1,true));
                   tableView.setItems(list);
                    
                      } catch (FileNotFoundException ex) {
            Logger.getLogger(ModifiedReportController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
