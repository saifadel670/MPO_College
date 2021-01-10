/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author User
 */
public class NoticeController implements Initializable {

    @FXML
    private Label senderLabel;
    @FXML
    private TextArea noticeTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void openNoticeOnButtonClick(ActionEvent event) {
        try {
        FileChooser fc = new FileChooser();
        
        File f = fc.showOpenDialog(null);
        if(f != null){
            
                Scanner sc = new Scanner(f);
                String str=new String();
                String str1 = sc.nextLine();
                senderLabel.setText(str1);
                
                while(sc.hasNextLine()){
                    str+=sc.nextLine()+"\r\n";
                }
                noticeTextArea.setText(str);
    }
    
}       catch (FileNotFoundException ex) {
            Logger.getLogger(NoticeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}