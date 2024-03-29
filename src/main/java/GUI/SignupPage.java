/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DataBase.AddNewUser;
import DataBase.DatabaseConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import DataBase.DatabaseConnection;
import User.User;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JOptionPane;

/**
 *
 * @author anjana
 */
public class SignupPage extends javax.swing.JFrame {

    AddNewUser newUser;

    /**
     * Creates new form SignupPage
     */
    public SignupPage() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SignupBtn = new javax.swing.JButton();
        Email = new javax.swing.JTextField();
        UserName = new javax.swing.JTextField();
        passwordEye = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Password = new javax.swing.JPasswordField();
        confirmEye = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CofirmPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 50)); // NOI18N
        jLabel2.setText("Signup");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel3.setText("Username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setText("Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        SignupBtn.setBackground(new java.awt.Color(107, 91, 0));
        SignupBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SignupBtn.setForeground(new java.awt.Color(255, 255, 255));
        SignupBtn.setText("Signup");
        SignupBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        SignupBtn.setBorderPainted(false);
        SignupBtn.setMaximumSize(new java.awt.Dimension(39, 17));
        SignupBtn.setMinimumSize(new java.awt.Dimension(39, 17));
        SignupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SignupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 140, 40));

        Email.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        Email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 280, 40));

        UserName.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        UserName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });
        jPanel1.add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 280, 40));

        passwordEye.setIcon(new javax.swing.ImageIcon("C:\\Users\\anjan\\Desktop\\CIS\\Project\\GuessMyNumber\\src\\main\\java\\Resources\\eye20.png")); // NOI18N
        passwordEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordEyeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                passwordEyeMouseReleased(evt);
            }
        });
        jPanel1.add(passwordEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 20, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 20, 20));

        Password.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        Password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 280, 40));

        confirmEye.setIcon(new javax.swing.ImageIcon("C:\\Users\\anjan\\Desktop\\CIS\\Project\\GuessMyNumber\\src\\main\\java\\Resources\\eye20.png")); // NOI18N
        confirmEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                confirmEyeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                confirmEyeMouseReleased(evt);
            }
        });
        jPanel1.add(confirmEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 20, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 20, 20));

        CofirmPassword.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        CofirmPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(CofirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 280, 40));
        CofirmPassword.getAccessibleContext().setAccessibleName("");

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel6.setText("Confirm Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancel");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 130, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(43, 39, 39));
        jLabel7.setText("Have already account? Login here.");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 415, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\anjan\\Desktop\\CIS\\Project\\GuessMyNumber\\src\\main\\java\\Resources\\SignupBackground.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameActionPerformed

    private void SignupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupBtnActionPerformed
        // TODO add your handling code here:

        String name = UserName.getText();
        String email = Email.getText();
        String password = Password.getText();
        String confirmpassword = CofirmPassword.getText();
        User user = new User(name, email, password);
        newUser = new AddNewUser();
        String userName = null;
        String useremail = null;
        String regEmail = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regEmail);
        Matcher matcher = pattern.matcher(email);
        try {

            DatabaseConnection db = new DatabaseConnection();

            Statement ps = db.getConnect().createStatement();
            ResultSet rs = ps.executeQuery("select name,email from user where name = '" + name + "' or email = '" + user.getEmail() + "'");

            if (rs.next()) {
                userName = rs.getString("name");
                useremail = rs.getString("email");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);

        }

        if (name.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Required to fill user name", "Required Alert", 0);
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Required to fill email", "Required Alert", 0);
        } else if (!matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Check email pattern", "Check Alert", 0);
        } else if (password.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Required to fill password", "Required Alert", 0);
        } else if (password.length() < 8) {
            JOptionPane.showMessageDialog(rootPane, "Password shuld be at least 8 characters", "Check Alert", 0);
        } else if (confirmpassword.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Required to fill confirm password", "Required Alert", 0);
        } else if (confirmpassword.length() < 8) {
            JOptionPane.showMessageDialog(rootPane, "Confirm Password shuld be at least 8 characters", "Check Alert", 0);
        } else if (name.equalsIgnoreCase(userName) || email.equalsIgnoreCase(useremail)) {
            JOptionPane.showMessageDialog(rootPane, "User name or email has already taken", "Warning", 0);
        } else {
            if (newUser.addNewUser(user.getName(), user.getEmail(), user.getPassword(), confirmpassword)) {
                JOptionPane.showMessageDialog(rootPane, "User added successfully", "Successfull", 1);
                this.dispose();
                LoginPage loginPage = new LoginPage();
                loginPage.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Check the confirm password again", "Check Alert", 0);
                CofirmPassword.setText("");
            }
        }


    }//GEN-LAST:event_SignupBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        HomePage homePage = new HomePage();
        homePage.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passwordEyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordEyeMousePressed
        // TODO add your handling code here:
        Password.setEchoChar((char) 0);
    }//GEN-LAST:event_passwordEyeMousePressed

    private void passwordEyeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordEyeMouseReleased
        // TODO add your handling code here:
        Password.setEchoChar('*');
    }//GEN-LAST:event_passwordEyeMouseReleased

    private void confirmEyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmEyeMousePressed
        // TODO add your handling code here:
        CofirmPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_confirmEyeMousePressed

    private void confirmEyeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmEyeMouseReleased
        // TODO add your handling code here:
        CofirmPassword.setEchoChar('*');
    }//GEN-LAST:event_confirmEyeMouseReleased

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        // TODO add your handling code here:
         this.dispose();
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
    }//GEN-LAST:event_jLabel7MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CofirmPassword;
    private javax.swing.JTextField Email;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton SignupBtn;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel confirmEye;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel passwordEye;
    // End of variables declaration//GEN-END:variables
}
