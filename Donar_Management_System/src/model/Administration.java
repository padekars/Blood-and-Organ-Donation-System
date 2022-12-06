/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;

/**
 *
 * @author snehal
 */
public class Administration {
    String username;
    String password;
//    Connection con;
//    public Administration (Connection conn){
//        this.con = conn;
//    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void getDetails(Connection con) throws SQLException{
                Statement stmt=con.createStatement();
                System.out.println("Connection established!");
                ResultSet rs=stmt.executeQuery("select * from admin");  
                while(rs.next())  
                System.out.println(rs.getString(1)+"  "+rs.getString(2));  
                
    }
    
}
