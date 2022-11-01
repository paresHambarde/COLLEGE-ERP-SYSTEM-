/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rtp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author windows 8
 */
public class InternalMarks extends javax.swing.JFrame {
    int id;
    /**
     * Creates new form InternalMarks
     */
    public InternalMarks(int id) {
        initComponents();
        this.id = id;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        tsem = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        tsub = new javax.swing.JComboBox<>();
        label = new javax.swing.JLabel();
        tcc = new javax.swing.JLabel();
        tsubject = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tmse1 = new javax.swing.JTextField();
        tmse2 = new javax.swing.JTextField();
        tta = new javax.swing.JTextField();
        tinternal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tteachername = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Select Semester:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 110, -1));

        tsem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        tsem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsemActionPerformed(evt);
            }
        });
        getContentPane().add(tsem, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 50, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Select Subject: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        tsub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-" }));
        tsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsubActionPerformed(evt);
            }
        });
        getContentPane().add(tsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 190, -1));

        label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 570, 30));

        tcc.setText("Course Code:");
        getContentPane().add(tcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 174, 70, 20));

        tsubject.setText("Subject");
        getContentPane().add(tsubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 174, 220, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("MSE 1 :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 40, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("MSE 2 :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 40, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("TA       : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 60, 20));

        jLabel6.setText("------------------------------------------------------------------------------------------------------------------------------------------");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 560, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Total Internal Marks: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        tmse1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tmse1.setEnabled(false);
        getContentPane().add(tmse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 140, -1));

        tmse2.setEnabled(false);
        getContentPane().add(tmse2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 140, -1));

        tta.setEnabled(false);
        tta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttaActionPerformed(evt);
            }
        });
        getContentPane().add(tta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 140, -1));

        tinternal.setEnabled(false);
        tinternal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tinternalMouseClicked(evt);
            }
        });
        tinternal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinternalActionPerformed(evt);
            }
        });
        getContentPane().add(tinternal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 60, -1));

        jLabel8.setText("/60");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Teacher : ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));
        getContentPane().add(tteachername, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 454, 280, 20));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("* Contact Subject Teacher for any queries regarding marks..");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, 300, -1));

        photo.setIcon(new javax.swing.ImageIcon("G:\\files\\java\\RTP\\style\\mse.png")); // NOI18N
        getContentPane().add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 914, 582));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ttaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttaActionPerformed

    private void tinternalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinternalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tinternalActionPerformed

    private void tsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsubActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/rtp", "root", "");
            String sql= "select * from marks where id = '"+id+"' and sem = '"+tsem.getSelectedItem()+"' and subject = '"+tsub.getSelectedItem()+"'" ;
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet r = pst.executeQuery();
            while(r.next()){
            tmse1.setText(r.getString("mse1"));
            tmse2.setText(r.getString("mse2"));
            tta.setText(r.getString("ta"));
            tteachername.setText(r.getString("teacher"));
            //tinternal.setText(r.getString("internal"));
            }
            tinternal.setText(String.valueOf(Integer.parseInt(tmse1.getText())+Integer.parseInt(tmse2.getText())+Integer.parseInt(tta.getText())));
            
        } catch (Exception e) {e.printStackTrace();
        }
    }//GEN-LAST:event_tsubActionPerformed

    private void tsemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsemActionPerformed
        if(tsem.getSelectedItem().equals("1")){
          tsub.addItem("M1");
          tsub.addItem("E chemistry");
          tsub.addItem("E Graphics");
          tsub.addItem("ELectrical E");
          tsub.addItem("Basic Electronics");
        }
        else if(tsem.getSelectedItem().equals("2")){
          tsub.addItem("M2");
          tsub.addItem("ITCP");
          tsub.addItem("E. Machanics");
          tsub.addItem("Communication Skills");
          tsub.addItem("E. Physics");
        }
        else if(tsem.getSelectedItem().equals("3")){
          tsub.addItem("M3");
          tsub.addItem("CAO");
          tsub.addItem("OOP");
          tsub.addItem("DS1");
        }
        else if(tsem.getSelectedItem().equals("4")){
          tsub.addItem("DMGT");
          tsub.addItem("OS");
          tsub.addItem("DS2");
          tsub.addItem("IDA");
          tsub.addItem("TOC");
        }
        else if(tsem.getSelectedItem().equals("5")){
          tsub.addItem("DBMS");
          tsub.addItem("DAA");
          tsub.addItem("PE1");
          tsub.addItem("OE1");
          tsub.addItem("OE2");
        }
        else if(tsem.getSelectedItem().equals("6")){
          tsub.addItem("CN");
          tsub.addItem("COMPILERS");
          tsub.addItem("SE");
          tsub.addItem("PE2");
          tsub.addItem("OE3");
          tsub.addItem("OE4");
          
        }
        else if(tsem.getSelectedItem().equals("7")){
          tsub.addItem("AI");
          tsub.addItem("CNS");
          tsub.addItem("PE3");
          tsub.addItem("PE4");
          tsub.addItem("PE5");
        }
    }//GEN-LAST:event_tsemActionPerformed

    private void tinternalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tinternalMouseClicked
        tinternal.setText(String.valueOf(Integer.parseInt(tmse1.getText())+Integer.parseInt(tmse2.getText())+Integer.parseInt(tta.getText())));
    }//GEN-LAST:event_tinternalMouseClicked

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
            java.util.logging.Logger.getLogger(InternalMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InternalMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InternalMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InternalMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new InternalMarks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel tcc;
    private javax.swing.JTextField tinternal;
    private javax.swing.JTextField tmse1;
    private javax.swing.JTextField tmse2;
    private javax.swing.JComboBox<String> tsem;
    private javax.swing.JComboBox<String> tsub;
    private javax.swing.JLabel tsubject;
    private javax.swing.JTextField tta;
    private javax.swing.JLabel tteachername;
    // End of variables declaration//GEN-END:variables
}