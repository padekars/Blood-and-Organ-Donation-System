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
import java.sql.*;
import javax.swing.JOptionPane;

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
"patient_gender, patient_phonenumber, patient_dateofbirth ,patient_bloodgroup, patient_emailid,\n" +
"patient_hospitalname) values (?,?,?,?,?,?,?,?,?,?,?,?)";  
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setString(1, p.getPname());
                statement.setString(2, p.getPusername());
                statement.setString(3, p.getPpassword());
                statement.setString(4, p.getPstreetname());
                statement.setString(5, p.getPcommunity());
                statement.setInt(6, p.getPzipcode());
                statement.setString(7, p.getPgender());
                statement.setString(9, p.getPdateofbirth());
                statement.setLong(8, p.getPphonenumber());
                statement.setString(10, p.getPbloodgroup());
                statement.setString(11, p.getPemailid());
                statement.setString(12, p.getPhospital());
        
                int i = statement.executeUpdate();
                
        System.out.println("inserted patient " + i);
        } 
        catch (SQLException ex) {
            Logger.getLogger(PatientSignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
    public void sendBloodRequest(String pusername, String password) throws SQLException{

        Statement stmt = con.createStatement();
        String hname = "";
        String pname = "";
        String puname = "";
        String pbg = "";
        try {    
                System.out.println("patient Connection established!");
                String queryString = "SELECT patient_hospitalname, patient_name, patient_username, patient_bloodgroup FROM patient where patient_username = '" + pusername + "' and patient_password = '" + password+"'";
                ResultSet results = stmt.executeQuery(queryString);

                while (results.next()) {
                 hname = results.getString(1);
                 pname =  results.getString(2);
                 puname = results.getString(3);
                 pbg = results.getString(4);
                }
                
                
                String sql = "insert into patientrequests (hospital_username, patient_name, patient_username, patient_requesttype , \n" +
"patient_requestvalue, request_status ) values (?,?,?,?,?,?)";  
                String req = "Open";
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setString(1, hname);
                statement.setString(2, pname);
                statement.setString(3, pusername);
                statement.setString(4, "Blood");
                statement.setString(5, pbg);
                statement.setString(6, req);
        
                int i = statement.executeUpdate();
                
        System.out.println("inserted patient request" + i);
        } 
        catch (SQLException ex) {
            Logger.getLogger(PatientSignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void sendOrganRequest(String pusername, String password, String organ) throws SQLException{

        Statement stmt = con.createStatement();
        String hname = "";
        String pname = "";
        String puname = "";
        String pbg = "";
        String org = organ;
        try {    
                String queryString = "SELECT patient_hospitalname, patient_name, patient_username, patient_bloodgroup FROM patient where patient_username = '" + pusername + "' and patient_password = '" + password+"'";
                ResultSet results = stmt.executeQuery(queryString);

                while (results.next()) {
                 hname = results.getString(1);
                 pname =  results.getString(2);
                 puname = results.getString(3);
                 pbg = results.getString(4);
                }
                
                
                String sql = "insert into patientrequests (hospital_username, patient_name, patient_username, patient_requesttype , \n" +
"patient_requestvalue, request_status ) values (?,?,?,?,?,?)";  
                String req = "Open";
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setString(1, hname);
                statement.setString(2, pname);
                statement.setString(3, pusername);
                statement.setString(4, "Organ");
                statement.setString(5, organ);
                statement.setString(6, req);
        
                int i = statement.executeUpdate();
                
        System.out.println("inserted patient request" + i);
        } 
        catch (SQLException ex) {
            Logger.getLogger(PatientSignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public int  checklogin(String username, String password) throws SQLException{
        
     
            Statement stmt = con.createStatement();
            String queryString = "SELECT patient_username, patient_password FROM patient";
            ResultSet results = stmt.executeQuery(queryString);

            while (results.next()) {
            String uname = results.getString(1);
            String pass =  results.getString(2);

               if ((username.equals(uname)) && (password.equals(pass))) {

                  JOptionPane.showMessageDialog(null, "Patient Username and Password exist");  
                  return 1;
            }
        
                }
            return 0;
            }
    
    public void viewpatientdetails() throws SQLException{
         Statement stmt = con.createStatement();
         
          String sql = "select * from patient"; 
          ResultSet rs =  stmt.executeQuery(sql);
          while(rs.next()){
              System.out.println(rs.getString(1) );
              System.out.println(rs.getString(2) );
              System.out.println(rs.getString(3) );
              System.out.println(rs.getString(4) );
              System.out.println(rs.getString(5) );
              System.out.println(rs.getString(6) );
              System.out.println(rs.getString(7) );
              System.out.println(rs.getString(8) );
              System.out.println(rs.getString(9) );
              System.out.println(rs.getString(10) );
              System.out.println(rs.getString(11) );
              System.out.println(rs.getString(12) );
          }
        
               
     }
    
      public void viewptable(String username, String password) throws SQLException{ 
         Statement stmt = con.createStatement();
         
            System.out.println("in view details  "+username+ password);
          String sql = "select * from patient where patient_username = '" + username + "' and patient_password = '" + password+"'"; 
          ResultSet rs =  stmt.executeQuery(sql);
          while(rs.next()){
              System.out.println(rs.getString(1) );
              System.out.println(rs.getString(2) );
              System.out.println(rs.getString(3) );
              System.out.println(rs.getString(4) );
              System.out.println(rs.getString(5) );
              System.out.println(rs.getString(6) );
              System.out.println(rs.getString(7) );
              System.out.println(rs.getString(8) );
              System.out.println(rs.getString(9) );
              System.out.println(rs.getString(10) );
              System.out.println(rs.getString(11) );
              System.out.println(rs.getString(12) );
          }
     }
     
     
    
}