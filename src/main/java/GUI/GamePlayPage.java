/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DataBase.AddPoint;
import Engine.GameEngine;
import Engine.Timer;
import static GUI.LoginPage.LoggedPlayer;
import java.awt.Button;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author anjana
 */
public class GamePlayPage extends javax.swing.JFrame {

    /**
     * Creates new form GamePlayPage
     */
    public static int Gameoverpoint;
    GameEngine game = null;
    BufferedImage currentRound = null;
    int count = 1;

    AddPoint sendpoint;
    Timer timer;

    public GamePlayPage() {
        initComponents();
        playGame(null);
        timer = new Timer();
        timer.start(SecondLabel, MinuteLabel);
    }

    private void playGame(String player) {

        game = new GameEngine(player);
        currentRound = game.nextRound();

        ImageIcon imageIcon = new ImageIcon(currentRound);
        gameImage.setIcon(imageIcon);
        RoundLabel.setText("" + count);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textNumber = new javax.swing.JTextField();
        GuessBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        PointLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gameImage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        RoundLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        MinuteLabel = new javax.swing.JLabel();
        SecondLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setText("Guess the number");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 485, 180, 30));

        textNumber.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        textNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(textNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 70, 40));

        GuessBtn.setBackground(new java.awt.Color(132, 61, 20));
        GuessBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        GuessBtn.setForeground(new java.awt.Color(255, 255, 255));
        GuessBtn.setText("Guess");
        GuessBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        GuessBtn.setBorderPainted(false);
        GuessBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuessBtnActionPerformed(evt);
            }
        });
        jPanel2.add(GuessBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 160, 40));

        jPanel1.setBackground(new java.awt.Color(0, 158, 94));

        PointLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        PointLabel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Points");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PointLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PointLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 120, 40));
        jPanel2.add(gameImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 660, 360));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Round");

        RoundLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        RoundLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RoundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(RoundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 120, 50));

        jPanel4.setBackground(new java.awt.Color(153, 153, 0));

        MinuteLabel.setFont(new java.awt.Font("Bahnschrift", 1, 32)); // NOI18N
        MinuteLabel.setForeground(new java.awt.Color(255, 255, 255));
        MinuteLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        SecondLabel.setFont(new java.awt.Font("Bahnschrift", 1, 32)); // NOI18N
        SecondLabel.setForeground(new java.awt.Color(255, 255, 255));
        SecondLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MinuteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SecondLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MinuteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(SecondLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 180, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\anjan\\Desktop\\CIS\\Project\\GuessMyNumber\\src\\main\\java\\Resources\\GameplayBackground.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuessBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuessBtnActionPerformed
        // TODO add your handling code here:
        try {
            int number = Integer.parseInt(textNumber.getText());
            boolean correct = game.checkNumber(number);
            int answer = game.checkSolutionReturn();
            int point = game.getScore();

            if (correct) {

                currentRound = game.nextRound();
                ImageIcon imageIcon = new ImageIcon(currentRound);
                gameImage.setIcon(imageIcon);

                PointLabel.setText("" + point);
                count++;
                textNumber.setText("");
                RoundLabel.setText("" + count);

            } else {
                timer.stop();
                Gameoverpoint = point;
                JOptionPane.showMessageDialog(rootPane, "Wrong Answer", "Wrong Answer", 0);
                sendpoint = new AddPoint();
                DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy/MM/dd   HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                String date = dt.format(now);
                sendpoint.addPoints(LoggedPlayer, point, timer.getSeconds(), timer.getMinutes(), date);
                timer.reset();
                this.dispose();
                EndPage endPage = new EndPage();
                endPage.setVisible(true);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "First enter number", "Alert", 2);
            textNumber.requestFocus();
        }


    }//GEN-LAST:event_GuessBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GamePlayPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePlayPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePlayPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePlayPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePlayPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuessBtn;
    private javax.swing.JLabel MinuteLabel;
    private javax.swing.JLabel PointLabel;
    private javax.swing.JLabel RoundLabel;
    private javax.swing.JLabel SecondLabel;
    private javax.swing.JLabel gameImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField textNumber;
    // End of variables declaration//GEN-END:variables
}
