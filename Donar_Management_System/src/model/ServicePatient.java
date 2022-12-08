/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Patient.UI.PatientSignUpPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.patient.Patient;
import java.sql.PreparedStatement;

/**
 *
 * @author snehal
 */
public class ServicePatient {
    Connection con;
    public ServicePatient(){
        try{  
                Class.forName("com.mysql.jdbc.Driver");  
                 this.con=(Connection) DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/AED_DB","root","Snehal1&");  
                
                
            }
        catch(Exception e){ 
                System.out.println(e);
                
        }  
    }
     
     public void addpatientdetails(Patient p){
         
         
        System.out.println("in add patient");
        Statement stmt;
        try {    
                System.out.println("patient Connection established!");
                String sql = "insert into patient (patient_name, patient_username, patient_password , \n" +
"patient_streetname, patient_community , patient_zipcode , \n" +
"patient_gender, patient_phonenumber, patient_dateofbirth , patient_emailid,\n" +
"patient_hospitalname) values (?,?,?,?,?,?,?,?,?,?,?)";  
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setString(1, p.getPname());
                statement.setString(2, p.getPusername());
                statement.setString(3, p.getPpassword());
                statement.setString(4, p.getPstreetname());
                statement.setString(5, p.getPcommunity());
                statement.setInt(6, p.getPzipcode());
                statement.setString(7, p.getPgender());
                statement.setLong(8, p.getPphonenumber());
                statement.setString(9, p.getPdateofbirth());
                statement.setString(10, p.getPemailid());
                statement.setString(11, p.getPhospital());
        
                int i = statement.executeUpdate();
                
        System.out.println("inserted patient " + i);
        } 
        catch (SQLException ex) {
            Logger.getLogger(PatientSignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
    public void sendRequest(String organ, String hname, String pusername, String entitytype, String entityvalue){
        
        System.out.println("in add patient");
        Statement stmt;
        try {    
                System.out.println("patient Connection established!");
                String sql = "insert into patientrequests (hospital_username, patient_name, patient_username, patient_requesttype , \n" +
"patient_requestvalue, request_status ) values (?,?,?,?,?,?)";  
                String req = "opened";
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setString(1, hname);
                statement.setString(2, pusername);
                statement.setString(3, pusername);
                statement.setString(4, entitytype);
                statement.setString(5, entityvalue);
                statement.setString(6, req);
        
                int i = statement.executeUpdate();
                
        System.out.println("inserted patient request" + i);
        } 
        catch (SQLException ex) {
            Logger.getLogger(PatientSignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   
}
