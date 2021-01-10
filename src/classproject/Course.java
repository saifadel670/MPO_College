
package classproject;

import javafx.beans.property.SimpleStringProperty;


public class Course {
    private SimpleStringProperty coursName, grade, extra;
    private int  credit;
    
    public Course(String coursName,int credit, String grade  ){
        this.coursName =  new SimpleStringProperty(coursName);
        this.grade =new SimpleStringProperty(grade);
        this.credit = credit;
    }
    public Course(String coursName,  int credit ){
        this.coursName =  new SimpleStringProperty(coursName);
        this.grade =null;
        this.credit = credit;
    }
    public Course(String coursName, String grade ){
        this.coursName =  new SimpleStringProperty(coursName);
        this.grade =new SimpleStringProperty(grade);
       
    }
    
    public Course( String grade, int a, boolean c ){
        
        this.grade =new SimpleStringProperty(grade);
        this.extra =  new SimpleStringProperty(String.valueOf(a));
       
    }

    public String getExtra() {
        return extra.get();
    }

    public void setExtra(SimpleStringProperty extra) {
        this.extra = extra;
    }

    public String getCoursName() {
        return coursName.get();
    }

    public void setCoursName(SimpleStringProperty coursName) {
        this.coursName = coursName;
    }

    public String getGrade() {
        return grade.get();
    }

    public void setGrade(SimpleStringProperty grade) {
        this.grade = grade;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    
}
