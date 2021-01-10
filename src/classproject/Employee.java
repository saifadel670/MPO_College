/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject;

import java.io.Serializable;
import java.time.LocalDate;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author User
 */
abstract public class Employee extends User implements Serializable {
    protected  SimpleStringProperty salary, contractNumber,employeeType; 
    protected LocalDate joiningDate;
    
   
    public Employee(String name, int id, String gender, int salary, 
            int contractNumber, LocalDate joiningDate, String employeeType) {
        super(name, id, gender);
        this.contractNumber =new SimpleStringProperty(String.valueOf(contractNumber));
        this.employeeType=new SimpleStringProperty(employeeType);
        this.joiningDate = joiningDate;
        this.salary = new SimpleStringProperty(String.valueOf(salary));
       
        
    }
    
     public Employee(String name, int id, String gender, int salary, 
             String employeeType) {
        super(name, id, gender);
        this.employeeType=new SimpleStringProperty(employeeType);
        this.salary = new SimpleStringProperty(String.valueOf(salary));
      
        
    }

    public SimpleStringProperty getSalary() {
        return salary;
    }

    public void setSalary(SimpleStringProperty salary) {
        this.salary = salary;
    }

    public String getContractNumber() {
        return contractNumber.get();
    }

    public void setContractNumber(SimpleStringProperty contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getEmployeeType() {
        return employeeType.get();
    }

    public void setEmployeeType(SimpleStringProperty employeeType) {
        this.employeeType = employeeType;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }
    
}
