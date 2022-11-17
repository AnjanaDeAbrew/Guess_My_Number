/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import GUI.SignupPage;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author anjana
 */
public class AddNewUser {

    public boolean addNewUser(String name, String email, String password, String confirmpassword) {
        try {
            // TODO add your handling code here:

            DatabaseConnection db = new DatabaseConnection();

            PreparedStatement ps = db.getConnect().prepareStatement("insert into user(name,email,password) values(?,?,?)");
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);

            if (password.equals(confirmpassword)) {
                ps.executeUpdate();
                return true;

            } else {
                return false;
            }

        } catch (Exception ex) {
            Logger.getLogger(SignupPage.class.getName()).log(Level.SEVERE, null, ex);

        }
        return false;
    }

}
