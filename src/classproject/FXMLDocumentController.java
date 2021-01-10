
package classproject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private ComboBox loginComboBox;
    @FXML
    private Label statusLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loginComboBox.getItems().addAll("Student", "Teacher", "Department Head", "Principle", "Account Officer",
                "Admission Officer","Register Officer", "National University","Educational Officer");
    }    

    @FXML
    private void logInButtonOnclick(ActionEvent event) {
        try {
//            
//            FileOutputStream write = new FileOutputStream("userInformation.bin");
//            DataOutputStream dw = new DataOutputStream(write);
//               
//               //id,pass,type,
//            dw.writeUTF("1111,1234,Student,1112,12345,Teacher,1113,1235,Department Head,1114,1345,Principle,"
//                    + "1115,9999,Account Officer,1116,1235,Admission Officer,1106,12345,Register Officer,1117,1235,National University,1119,1345,Educational Officer,");
//            dw.close();
//        
        
         
        
        
        
        //-----------------------------------------
        //try {   
        FileInputStream check;
        
            check = new FileInputStream("userInformation.bin");
       
        DataInputStream read = new DataInputStream(check);
        String str = read.readUTF();
        String[] userArray;
        userArray = str.split(",");   //splite each field
        String group = String.valueOf(loginComboBox.getValue().toString());
            
       for(int i=0; i<= (userArray.length-3); i=i+3){
          
           
           if(Integer.parseInt(userArray[i]) == Integer.parseInt(idTextField.getText()) && 
                   Integer.parseInt(userArray[i+1]) == Integer.parseInt(passwordTextField.getText())
                      && userArray[i+2].equals(group)) {
               //System.out.println("passed");
               
                   FileOutputStream t = new FileOutputStream("InformationPass.bin");
            DataOutputStream pass = new DataOutputStream(t);
            pass.writeUTF(idTextField.getText()+","+passwordTextField.getText()+","+group);
            pass.close();
            
            
                     Parent scene2Parent = null;
                    if(group.equals("Student") ){
                        
                        scene2Parent = FXMLLoader.load(getClass().getResource("StudentFXML.fxml"));
                            Scene scene2 = new Scene(scene2Parent);
                            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                            window.setScene(scene2);
                            window.show();
                       
                   }
                   else if(group.equals("Teacher")){
                        scene2Parent = FXMLLoader.load(getClass().getResource("TeacherFXML.fxml"));
                            Scene scene2 = new Scene(scene2Parent);
                            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                            window.setScene(scene2);
                            window.show();
                   }
                   else if (group.equals("Department Head")){
                        scene2Parent = FXMLLoader.load(getClass().getResource("DepartmentHeadFXML.fxml"));
                            Scene scene2 = new Scene(scene2Parent);
                            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                            window.setScene(scene2);
                            window.show();
                   }
                   else if(group.equals("Principle")){
                        scene2Parent = FXMLLoader.load(getClass().getResource("CollegePrincipleFXML.fxml"));
                            Scene scene2 = new Scene(scene2Parent);
                            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                            window.setScene(scene2);
                            window.show();
                   }
                   else if(group.equals("Account Officer")){
                        //System.out.println("acc check");
                        scene2Parent = FXMLLoader.load(getClass().getResource("AccountOfficerFXML.fxml"));
                            Scene scene2 = new Scene(scene2Parent);
                            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                            window.setScene(scene2);
                            window.show();
                   }
                   else if(group.equals("Admission Officer")){
                        
                        scene2Parent = FXMLLoader.load(getClass().getResource("AdmissionOfficerFXML.fxml"));
                            Scene scene2 = new Scene(scene2Parent);
                            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                            window.setScene(scene2);
                            window.show();
                   }
                   else if(group.equals( "Register Officer")){
                       // System.out.println("equal checked");
                        scene2Parent = FXMLLoader.load(getClass().getResource("RegisterOfficeFXML.fxml"));
                            Scene scene2 = new Scene(scene2Parent);
                            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                            window.setScene(scene2);
                            window.show();
                   }
                   else if(group.equals("National University")){
                        scene2Parent = FXMLLoader.load(getClass().getResource("NationalCollegeAdminFXML.fxml"));
                            Scene scene2 = new Scene(scene2Parent);
                            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                            window.setScene(scene2);
                            window.show();
                   }
                   else if(group.equals("Educational Officer")){
                        scene2Parent = FXMLLoader.load(getClass().getResource("EducattionalOfficerFXML.fxml"));
                            Scene scene2 = new Scene(scene2Parent);
                            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                            window.setScene(scene2);
                            window.show();
                   }
               
           }
          
           
       
        }
       statusLabel.setText("LOG In FAILED");
        
         } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
}
