
package classproject;

import java.io.Serializable;
import java.time.LocalDate;
import javafx.beans.property.SimpleStringProperty;


public class Officer extends Employee implements Serializable,Informer {
    private String officeName,extraField;
    
    public Officer(String name, int id, String gender,int salary, 
            int contractNumber, LocalDate joiningDate, String employeeType, String officeName)
    {
        super(name, id, gender,salary,contractNumber,joiningDate,employeeType ); 
        this.officeName = officeName;
    }
    
     public Officer(String name, int id, String gender, int salary, 
             String employeeType, String extraField) {
        super(name, id, gender,salary,employeeType);
       
       this.extraField = extraField;
        
    }

    public String getExtraField() {
        return extraField;
    }

    public void setExtraField(String extraField) {
        this.extraField = extraField;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }
    
    
    
    @Override
     public void salaryInformation(){
         
     }
}
