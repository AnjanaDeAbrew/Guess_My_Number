/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import GUI.LoginPage;
import static GUI.LoginPage.LoggedPlayer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anjana
 */
public class ViewPoint {
    public void viewPoint(int point,int second, int minute,String date){
        try {
          
            DatabaseConnection db = new DatabaseConnection();
            
            Statement ps = db.getConnect().createStatement();
            ResultSet rs=ps.executeQuery("select point,second,minute,date from point where email = '"+LoggedPlayer);
           // DefaultTableModel model=(DefaultTableModel)pointTable.getModel();
            while(rs.next()){
               // String point=String.valueOf(rs.getInt(point));
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
           // return false;
        }
    }
}
