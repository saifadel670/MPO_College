/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author User
 */
abstract public class User {
     protected SimpleStringProperty name, id, gender;
 public User(String name, int id, String gender){
         this.name = new SimpleStringProperty(name);
         this.id = new SimpleStringProperty(String.valueOf(id));
         this.gender = new SimpleStringProperty( gender);
         
     }
 
  public User( int id){
        
         this.id = new SimpleStringProperty(String.valueOf(id));
         
     }

    public String getName() {
        return name.get();
    }

    public void setName(SimpleStringProperty name) {
        this.name = name;
    }

    public String getId() {
        return id.get();
    }

    public void setId(SimpleStringProperty id) {
        this.id = id;
    }

    public String getGender() {
        return gender.get();
    }

    public void setGender(SimpleStringProperty gender) {
        this.gender = gender;
    }
     public User(String name, int id){
         this.name = new SimpleStringProperty(name);
         this.id = new SimpleStringProperty(String.valueOf(id));
     }
    
     
}
