/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import Hospital.UI.HospitalSignUpPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import model.hospital.Hospital;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author snehal
 */
public class ServiceHospital {
    Connection con;
    public ServiceHospital(){
        try{  
                Class.forName("com.mysql.jdbc.Driver");  
                 this.con=(Connection) DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/AED_DB","root","Snehal1&");  
                
                
            }
        catch(Exception e){ 
                System.out.println(e);
                
        }  
    }
     
     public void addhospitaldetails(Hospital h){
         
         
        System.out.println("in add hospital");
        try 
        {    
                System.out.println("Connection established!");
                String sql = "insert into hospital(hospital_name, hospital_username, hospital_password, hospital_streetname , \n" +
                        "hospital_community, hospital_zipcode) values (?, ?, ?, ?, ?, ?)"; 
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setString(1, h.getHname());
                statement.setString(2, h.getHusername());
                statement.setString(3, h.getHpassword());
                statement.setString(4, h.getHstreetname());
                statement.setString(5, h.getHcommunity());
                statement.setInt(6, h.getHzipcode());
                int i = statement.executeUpdate();
                
        System.out.println("inserted hospital" + i);
        }
        catch (SQLException ex) {
            Logger.getLogger(HospitalSignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
     public void loadpatientrequests() throws SQLException{
         Statement stmt = con.createStatement();
         
          String sql = "select * from patientrequests"; 
          ResultSet rs =  stmt.executeQuery(sql);
          while(rs.next()){
              System.out.println(rs.getString(1) );
              System.out.println(rs.getString(2) );
              System.out.println(rs.getString(3) );
          }
        
               
     }
     
     
     public int  checklogin(String username, String password) throws SQLException{
        
     
            Statement stmt = con.createStatement();
            String queryString = "SELECT hospital_username, hospital_password FROM hospital";
            ResultSet results = stmt.executeQuery(queryString);

            while (results.next()) {
            String uname = results.getString(1);
            String pass =  results.getString(2);

               if ((username.equals(uname)) && (password.equals(pass))) {

                  JOptionPane.showMessageDialog(null, "Hospital Username and Password exist");  
                  return 1;
            }
        
                }
            return 0;
            }
     
      public void viewhospitaldetails() throws SQLException{
          Statement stmt = con.createStatement();
          String sql = "select * from hospital"; 
          ResultSet rs =  stmt.executeQuery(sql);
          while(rs.next()){
              System.out.println(rs.getString(1) );
              System.out.println(rs.getString(2) );
              System.out.println(rs.getString(3) );
              System.out.println(rs.getString(4) );
              System.out.println(rs.getString(5) );
              System.out.println(rs.getString(6) );
            }
        
               
     }
     public void viewhtable(String username, String password) throws SQLException{ 
         Statement stmt = con.createStatement();
         
            System.out.println("in view details  "+username+ password);
          String sql = "select * from hospital where hospital_username = '" + username + "' and hospital_password = '" + password+"'"; 
          ResultSet rs =  stmt.executeQuery(sql);
          while(rs.next()){
              System.out.println(rs.getString(1) );
              System.out.println(rs.getString(2) );
              System.out.println(rs.getString(3) );
              System.out.println(rs.getString(4) );
              System.out.println(rs.getString(5) );
              System.out.println(rs.getString(6) );
          }
     }
    
}
