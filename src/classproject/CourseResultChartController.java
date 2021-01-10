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
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CourseResultChartController implements Initializable {

    @FXML
    private ComboBox courseComboBox;
    @FXML
    private PieChart pieChart;
    @FXML
    private Label statusLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
        try {
            BufferedReader out = new BufferedReader(new FileReader("CourseName.bin"));
            String[] rr = out.readLine().split(",");
              for(String d: rr){
                   courseComboBox.getItems().add(d);
              }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CourseResultChartController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CourseResultChartController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    @FXML
    private void loadButtonOnClick(ActionEvent event) throws FileNotFoundException {
       int a=0,b=0,c=0,d=0,f=0;
        
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
                      a++;   
                     }
                     else if(dataField[4].equalsIgnoreCase("B")) b++;
                     else if(dataField[4].equalsIgnoreCase("c")) c++;
                     else if(dataField[4].equalsIgnoreCase("D")) d++;
                     else if(dataField[4].equalsIgnoreCase("F")) f++;
                 } }        
            
             ObservableList <PieChart.Data> list = FXCollections.observableArrayList(
            new PieChart.Data("A",a),
            new PieChart.Data("B",b),
            new PieChart.Data("C",c),
            new PieChart.Data("D",d),
            new PieChart.Data("F",f)
        );
        pieChart.setData(list);
        
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
