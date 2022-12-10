/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import BloodDonorBank.UI.RequestByHospital;
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
import java.util.ArrayList;
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
     public ArrayList<String> displayhtable() throws SQLException{
         Statement stmt = con.createStatement();
            
            
             String data[] = {};
             ArrayList<String> ar = new ArrayList<String>();
             
            String queryString2 = "SELECT patient_name, patient_requesttype, patient_requestvalue,hospital_username,request_status FROM patientrequests where request_status = " + "'Sent to Bank'";
            ResultSet results2 = stmt.executeQuery(queryString2);
            String pname;
            String retype;
            String reqvalue;
            String huname;
            String reqstatus;
            int i = 0;
            while (results2.next()) {
             pname = results2.getString(1);
             retype = results2.getString(2);
             reqvalue = results2.getString(3);
             huname = results2.getString(4);
             reqstatus = results2.getString(5);
             
            
               ar.add(huname.concat(",").concat(pname).concat(",").concat(retype).concat(",").concat(reqvalue).concat(",").concat(reqstatus));
               
            
             
              
            }
            return ar;
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
     
     
     public void checkForMatch(String selectedhname,String selectedpname,String selectedentitytype,String selectedentityvalue,String reqstatus){
         try {
            // TODO add your handling code here:
            reqstatus ="Closed";
            Statement stmt = con.createStatement();
            
            String queryString2 = "update bankinventory set entityquantity = entityquantity -1 where entityname = '"+selectedentitytype +"' and entityvalue = '" + selectedentityvalue +"' and entityquantity >0 " ;
            int rowsupdated = stmt.executeUpdate(queryString2);
           
            if(rowsupdated>0){
                //update stastus to closed and load table again
                
                String sql = "update patientrequests set request_status = '" + reqstatus +"' where patient_name ='" + selectedpname +"' and hospital_username = '"+selectedhname + "' and patient_requesttype ='"+  selectedentitytype + "' and patient_requestvalue='" + selectedentityvalue +"' and request_status = 'Sent to Bank'" ;  
                
                PreparedStatement statement = con.prepareStatement(sql);
                
                
                int i = statement.executeUpdate();
                System.out.println("query "+sql);
            
                System.out.println("patient row updated to closed "+i);
                
                JOptionPane.showMessageDialog(null, "Request fullfilled by Bank ");
                
            }
            else{
                //send req to lab
                reqstatus = "Sent to Lab";
                String sql = "update patientrequests set request_status = '" + reqstatus +"' where patient_name ='" + selectedpname +"' and hospital_username = '"+selectedhname + "' and patient_requesttype ='"+  selectedentitytype + "' and patient_requestvalue='" + selectedentityvalue +"' and request_status = 'Sent to Bank'" ;  
                
                PreparedStatement statement = con.prepareStatement(sql);
                
                
                int i = statement.executeUpdate();
                
                
                
                  JOptionPane.showMessageDialog(null, "Request sent to lab"); 
            }
      
        } catch (SQLException ex) {
            Logger.getLogger(RequestByHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
     }
     
     
     public ArrayList<String> loadInventoryTable() throws SQLException{
            Statement stmt = con.createStatement();
            String queryString = "SELECT * FROM BANKINVENTORY";
            ResultSet results = stmt.executeQuery(queryString);

             ArrayList<String> ar = new ArrayList<String>();
            while (results.next()) {
            String TYPE = results.getString(1);
            String VALUE =  results.getString(2); 
            String quantity =  results.getString(3);
            
               ar.add(TYPE.concat(",").concat(VALUE).concat(",").concat(quantity));
               
    
     }
     
     return ar;
     }
         public ArrayList<String> loadBankRequests() throws SQLException{
            Statement stmt = con.createStatement();
            String queryString = "select count(*),patient_requesttype,patient_requestvalue,\"Open\" from patientrequests where request_status = 'Sent to Bank' group by patient_requesttype,patient_requestvalue";
            ResultSet results = stmt.executeQuery(queryString);

             ArrayList<String> ar = new ArrayList<String>();
            while (results.next()) {
            String count = results.getString(1);
            String type =  results.getString(2); 
            String value =  results.getString(3);
            String status = results.getString(4);
            
               ar.add(type.concat(",").concat(value).concat(",").concat(count).concat(",").concat(status));
               
    
     }
            
     
     return ar;
     }
         
      public ArrayList<String> loadLabRequests() throws SQLException{
            Statement stmt = con.createStatement();
            String queryString = "select hospital_username,patient_name,patient_requesttype, patient_requestvalue, requst_status from patientrequests where request_status = 'Sent to Lab' group by patient_requesttype,patient_requestvalue";
            ResultSet results = stmt.executeQuery(queryString);

             ArrayList<String> ar = new ArrayList<String>();
            while (results.next()) {
            String hname = results.getString(1);
            String pname =  results.getString(2); 
            String type =  results.getString(3);
            String value = results.getString(4);
            String status = results.getString(5);
            
            ar.add(hname.concat(",").concat(pname).concat(",").concat(type).concat(",").concat(value).concat(",").concat(status));
               
    
     }
            
    
     return ar;
     }    
     
     public void insertRequests(String selectedentitytype,String selectedentityvalue,int quantity,String reqstatus ){
         reqstatus = "Sent to Lab";
                
                  try 
                    {    
                            System.out.println("Connection established!");
                            String sql = "insert into bankrequests(patient_requesttype,patient_requestvalue , quantity , status) values (?, ?, ?, ?)"; 
                            PreparedStatement statement = con.prepareStatement(sql);
                            statement.setString(1, selectedentitytype);
                            statement.setString(2, selectedentityvalue);
                            statement.setInt(3, quantity);
                            statement.setString(4, reqstatus);
                            int i = statement.executeUpdate();

                    System.out.println("inserted hospital" + i);
                    }
                    catch (SQLException ex) {
                        Logger.getLogger(HospitalSignUpPage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                  
     }
}
