
package classproject;

import java.io.Serializable;
import javafx.beans.property.SimpleStringProperty;


public class Student extends User implements Serializable  {
    private String session;
    private SimpleStringProperty extraField;

    public String getExtraField() {
        return extraField.get();
    }

    public void setExtraField(String extraField) {
        this.extraField =new SimpleStringProperty( extraField);
    }

    

    public Student(String name, int id, String gender, String session) {
        super(name, id, gender);
        this.session = session;
    }
    public Student( int id,String extraField){
        super(id);
        this.extraField = new SimpleStringProperty(extraField);
    }
     public Student( int id){
        super(id);
     }
     public Student(String name, int id) {
        super(name, id);
        
    }

    
    

   
     
    
}
