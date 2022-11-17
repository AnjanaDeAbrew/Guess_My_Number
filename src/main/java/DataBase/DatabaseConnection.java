/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author anjana
 */
public class DatabaseConnection {
    
   
    private static Connection connect(){

    Connection con=null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/guessmynumber","root","");
        System.out.println("connection is ok");
    }catch (Exception e){
        System.out.println("db connection is not"+e);
    }
    return con;
}
    
    public static Connection getConnect(){
        return connect();
    }

    
}
        