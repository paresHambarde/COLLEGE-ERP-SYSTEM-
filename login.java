/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rtp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import rtp.newuser;

/**
 *
 * @author windows 8
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        time.setText("" + java.time.LocalDate.now());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tid = new javax.swing.JTextField();
        bsubmit = new javax.swing.JButton();
        tpass = new javax.swing.JPasswordField();
        signup = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidActionPerformed(evt);
            }
        });
        getContentPane().add(tid, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 170, -1));

        bsubmit.setText("submit");
        bsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(bsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));
        getContentPane().add(tpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 170, -1));

        signup.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        signup.setText("New?  SignUp");
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
        });
        getContentPane().add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        time.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 90, 10));

        photo.setIcon(new javax.swing.ImageIcon("G:\\files\\java\\RTP\\style\\Mask group.png")); // NOI18N
        getContentPane().add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tidActionPerformed

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
        new newuser().setVisible(true);
    }//GEN-LAST:event_signupMouseClicked

    private void bsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsubmitActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rtp", "root", "");
            String sql ="";
            if(Integer.parseInt(tid.getText())>2000)
               sql = "select * from registration where id ='" + tid.getText() + "'";
            if(Integer.parseInt(tid.getText())<2000&&Integer.parseInt(tid.getText())>1000)
               sql = "select * from teacher_data where id ='" + tid.getText() + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String pass = new String(tpass.getPassword());
                if (rs.getString("id").equals(tid.getText()) && rs.getString("password").equals(pass)) {
                    JOptionPane.showMessageDialog(photo, "Access Granted,\n WelCome " + rs.getString("name"));
                    new FirstScreen(rs.getString("name"), rs.getString("type"), rs.getInt("id")).setVisible(true);

                } else {
                    if (!rs.getString("id").equals(tid.getText())) {
                        JOptionPane.showMessageDialog(photo, "Wrong ID Entered..");
                    } else if (!rs.getString("password").equals(pass)) {
                        JOptionPane.showMessageDialog(photo, "Wrong Password Entered..");
                    } else {
                        JOptionPane.showMessageDialog(photo, "Sorry!!! Unexpected error Occured");
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }//GEN-LAST:event_bsubmitActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bsubmit;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel signup;
    private javax.swing.JTextField tid;
    private javax.swing.JLabel time;
    private javax.swing.JPasswordField tpass;
    // End of variables declaration//GEN-END:variables
}
