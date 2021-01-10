
package classproject;


public class MonitoringOfficer extends User {
    
    private String officerDesognation;    // proViceChancelor is the nation university officer
    
     public MonitoringOfficer(String name, int id, String gender,
             String officerDesognation){
         super(name, id, gender);
         this.officerDesognation = officerDesognation;
    }
}
