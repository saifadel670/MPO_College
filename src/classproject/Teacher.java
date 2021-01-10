/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject;

import java.time.LocalDate;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author User
 */
public class Teacher   extends Employee implements Informer{
    private  SimpleStringProperty teacherDesignation;

    public Teacher(String name, int id, String gender, int salary,
            int contractNumber, LocalDate joiningDate, String employeeType,String teacherDesignation) {
        super(name, id, gender, salary, contractNumber, joiningDate, employeeType);
        this.teacherDesignation=new SimpleStringProperty(teacherDesignation);
    }

    @Override
    public void salaryInformation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTeacherDesignation() {
        return teacherDesignation.get();
    }

    public void setTeacherDesignation(SimpleStringProperty teacherDesignation) {
        this.teacherDesignation = teacherDesignation;
    }

   
}
