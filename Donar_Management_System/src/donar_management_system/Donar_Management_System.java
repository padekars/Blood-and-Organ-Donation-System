/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donar_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Administration;

/**
 *
 * @author Gayatri
 */
public class Donar_Management_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{  
                Class.forName("com.mysql.jdbc.Driver");  
                Connection con=(Connection) DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/AED_DB","root","Snehal1&");  
                //here sonoo is database name, root is username and password  
                Administration a = new Administration();
                a.getDetails(con);
                
            }
        catch(Exception e){ 
                System.out.println(e);
                
        }  
    }
    
}


