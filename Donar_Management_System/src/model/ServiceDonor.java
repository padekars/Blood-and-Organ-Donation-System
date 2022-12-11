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
import java.util.ArrayList;
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
                            "donor_streetname , donor_community , donor_zipcode ,donor_dob,\n" +
                            "donor_gender , donor_phonenumber , donor_emailid,donor_bloodgroup) values (?,?,?,?,?,?,?,?,?,?,?)";  
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setString(1, d.getDname());
                statement.setString(2, d.getDusername());
                statement.setString(3, d.getDpassword());
                statement.setString(4, d.getDstreetname());
                statement.setString(5, d.getDcommunity());
                statement.setString(6, d.getDzipcode());
                statement.setString(7, d.getDdateofbirth());
                statement.setString(8, d.getDgender());
                statement.setString(9, d.getDphonenumber());
                statement.setString(10, d.getDdateofbirth());
                
                statement.setString(11, d.getDbloodgroup());
        
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
    
    
    public void adddonordonations(String duname) throws SQLException{
         
         Statement stmt = con.createStatement();
        String dname = "";
        String dbg = "";
        try {    
                String queryString = "SELECT donor_name,donor_bloodgroup from donor where donor_username = '" + duname +"'";
                ResultSet results = stmt.executeQuery(queryString);

                while (results.next()) {
                 dname = results.getString(1);
                 dbg = results.getString(2);
                }
                
                
                String sql = "insert into donordonations (donor_name , donor_username , donor_donationtype ,\n" +
"donor_donationvalue , availability  ) values (?,?,?,?,?)";  
                String req = "Open";
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setString(1, dname);
                statement.setString(2, duname);
                statement.setString(3, "Blood");
                statement.setString(4,dbg );
                statement.setString(5, "Yes");
        
                int i = statement.executeUpdate();
                
        } 
        catch (SQLException ex) {
            Logger.getLogger(PatientSignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
     }
    
    
    public void adddonororgandonations(String organ,String duname) throws SQLException{
         
         Statement stmt = con.createStatement();
        String dname = "";
        String dbg = "";
        try {    
                String queryString = "SELECT donor_name from donor where donor_username = '" + duname +"'";
                ResultSet results = stmt.executeQuery(queryString);

                while (results.next()) {
                 dname = results.getString(1);
                }
                
                
                String sql = "insert into donordonations (donor_name , donor_username , donor_donationtype ,\n" +
"donor_donationvalue , availability  ) values (?,?,?,?,?)";  
                String req = "Open";
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setString(1, dname);
                statement.setString(2, duname);
                statement.setString(3, "Organ");
                statement.setString(4,organ );
                statement.setString(5, "Yes");
        
                int i = statement.executeUpdate();
                
        } 
        catch (SQLException ex) {
            Logger.getLogger(PatientSignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
     }
    
            
         public ArrayList<String> loadDonorDonationsTable() throws SQLException{
            Statement stmt = con.createStatement();
            String queryString = "select donor_name,donor_donationtype,donor_donationvalue,availability from donordonations";
            ResultSet results = stmt.executeQuery(queryString);

             ArrayList<String> ar = new ArrayList<String>();
            while (results.next()) {
            String dname = results.getString(1);
            String type =  results.getString(2); 
            String value =  results.getString(3);
            String avail = results.getString(4);
            System.out.println(dname +type+value+avail);
            
            ar.add(dname.concat(",").concat(type).concat(",").concat(value).concat(",").concat(avail));
            }
            return ar;
            }
         
            public ArrayList<String> loadDonorTable() throws SQLException{
            Statement stmt = con.createStatement();
            String queryString = "select donor_name ,\n" +
" donor_community , \n" +
"donor_gender , donor_phonenumber , donor_emailid ,donor_bloodgroup from donor";
            ResultSet results = stmt.executeQuery(queryString);

             ArrayList<String> ar = new ArrayList<String>();
            while (results.next()) {
            String dname = results.getString(1);
            String community = results.getString(2);
            String gender =  results.getString(3);
            String phonenumber = results.getString(4);
            String emailid =  results.getString(5);
            
            ar.add(dname.concat(",").concat(community).concat(",").concat(gender).concat(",").concat(phonenumber).concat(",").concat(emailid));
            }
            return ar;
            }
            
            public void viewdtable(String username, String password) throws SQLException{ 
         Statement stmt = con.createStatement();
         
            System.out.println("in view details  "+username+ password);
          String sql = "select * from donor where donor_username = '" + username + "' and donor_password = '" + password+"'"; 
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
          }
     }
    
}
