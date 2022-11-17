/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import GUI.SignupPage;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anjana
 */
public class AddPoint {
    public void addPoints(String email, int point, int second,int  minute,String date) {
       
        try {
            // TODO add your handling code here:

            DatabaseConnection db = new DatabaseConnection();

            PreparedStatement ps = db.getConnect().prepareStatement("insert into point(email,point,second,minute,date) values(?,?,?,?,?)");
            ps.setString(1, email);
            ps.setInt(2, point);
            ps.setInt(3, second);
            ps.setInt(4, minute);
            ps.setString(5, date);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AddPoint.class.getName()).log(Level.SEVERE, null, ex);
        }

            

       
    
    }
}
