/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import GUI.LoginPage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author anjana
 */
public class UserValidation {

    public boolean userValidate(String email, String password) {
        try {

            DatabaseConnection db = new DatabaseConnection();

            Statement ps = db.getConnect().createStatement();
            ResultSet rs = ps.executeQuery("select email,password from user where email = '" + email + "' and password = '" + password + "'");

            if (rs.next()) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
