/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject;

//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author User
 */
public class StudentFXMLTranscriptController implements Initializable {

    @FXML
    private Label statusLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void downloadButtonOnClick(ActionEvent event) {
        
      /*  try {
             FileInputStream c = new FileInputStream("InformationPass.bin");
            DataInputStream rcv = new DataInputStream(c);
            String str = rcv.readUTF();
           String[] data;
           data = str.split(",");
           
           FileChooser fc = new FileChooser();
                        File f = fc.showSaveDialog(null);
                        Document doc = new Document();
                         PdfWriter writer  = PdfWriter.getInstance(doc,new FileOutputStream(f)); 
                       doc.open();
                        doc.add(new Paragraph("TRANSCRIPT"));
                           doc.add(new Paragraph("\n\n"));
                           doc.add(new Paragraph("STUDENT ID: "+data[0]));
                           doc.add(new Paragraph("\n\n"));
                           
            File f1 = new File("CourseList.txt"); 
           Scanner sc = new Scanner(f1); 
          
            while(sc.hasNextLine()){
                String line=new String();
                 line = sc.nextLine();
                String[]dataField;
                dataField = line.split(",");
                if(dataField[1].equals(data[0])){
                   // if(!dataField[3].equals("R")){     //checking course has done or not
                         
                           doc.add(new Paragraph(dataField[2]+"-"+dataField[3]+"-"+dataField[4]));
                 //   }
           
                }
            }
             doc.close();
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentFXMLTranscriptController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentFXMLTranscriptController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(StudentFXMLTranscriptController.class.getName()).log(Level.SEVERE, null, ex);
        }*/
            
        
    }
    
}
