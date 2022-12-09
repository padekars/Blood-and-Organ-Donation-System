/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Donor.UI.DonorSignUpPage;
import Patient.UI.PatientSignUpPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.donor.Donor;

/**
 *
 * @author snehal
 */
public class ServiceDonor {
    Connection con;
    public ServiceDonor(){
        try{  
                Class.forName("com.mysql.jdbc.Driver");  
                 this.con=(Connection) DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/AED_DB","root","Snehal1&");  
                
                
            }
        catch(Exception e){ 
                System.out.println(e);
                
        }  
    }
     
     public void adddonordetails(Donor d){
         
         
        System.out.println("in add donor");
        Statement stmt;
        try {    
                System.out.println("Donor Connection established!");
                String sql = "insert into donor (donor_name , donor_username , donor_password ,\n" +
                            "donor_streetname , donor_community , donor_zipcode ,\n" +
                            "donor_gender , donor_phonenumber , donor_emailid) values (?,?,?,?,?,?,?,?,?)";  
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setString(1, d.getDname());
                statement.setString(2, d.getDusername());
                statement.setString(3, d.getDpassword());
                statement.setString(4, d.getDstreetname());
                statement.setString(5, d.getDcommunity());
                statement.setInt(6, d.getDzipcode());
                statement.setString(7, d.getDgender());
                statement.setLong(8, d.getDphonenumber());
                statement.setString(9, d.getDdateofbirth());
        
                int i = statement.executeUpdate();
                
        System.out.println("inserted donor " + i);
        } 
        catch (SQLException ex) {
            Logger.getLogger(DonorSignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
    
    
    public int  checklogin(String username, String password) throws SQLException{
        
     
            Statement stmt = con.createStatement();
            String queryString = "SELECT donor_username, donor_password FROM donor";
            ResultSet results = stmt.executeQuery(queryString);

            while (results.next()) {
            String uname = results.getString(1);
            String pass =  results.getString(2);

               if ((username.equals(uname)) && (password.equals(pass))) {

                  JOptionPane.showMessageDialog(null, "Donor Username and Password exist");  
                  return 1;
            }
        
                }
            return 0;
            }
    
    public void viewdonordetails() throws SQLException{
         Statement stmt = con.createStatement();
         
          String sql = "select * from donor"; 
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
          }
        
               
     }
}
