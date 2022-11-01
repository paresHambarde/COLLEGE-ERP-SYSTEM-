/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rtp;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author windows 8
 */
public class newuser extends javax.swing.JFrame {

    String df = null, in = null;

    /**
     * Creates new form newuser
     */
    public newuser() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tdob = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        tdoa = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tadd = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        tyear = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        tsem = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        tbranch = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        tgender = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        tmothername = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tcontact = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tcast = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        treligion = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        tbg = new javax.swing.JComboBox<>();
        bsave = new javax.swing.JButton();
        bupdate = new javax.swing.JButton();
        bdelete = new javax.swing.JButton();
        bclear = new javax.swing.JButton();
        bnew = new javax.swing.JButton();
        bsearch = new javax.swing.JButton();
        bbrowse = new javax.swing.JButton();
        photo = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ttype = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("New Registration");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 220, 50));

        jLabel3.setText("Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 40, 20));
        getContentPane().add(tname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 210, -1));

        jLabel4.setText("ID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 20, -1));
        getContentPane().add(tid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 110, -1));

        jLabel5.setText("DOB:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, 20));

        tdob.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(tdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 120, 20));

        jLabel6.setText("Date of Admission:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, 20));

        tdoa.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(tdoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 130, 20));

        jLabel7.setText("Address:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        tadd.setColumns(20);
        tadd.setRows(5);
        jScrollPane1.setViewportView(tadd);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 240, 60));

        jLabel8.setText("Year:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 30, -1));

        tyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "1", "2", "3", "4" }));
        getContentPane().add(tyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 120, -1));

        jLabel9.setText("Semester:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        tsem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "1", "2", "3", "4", "5", "6", "7", "8" }));
        getContentPane().add(tsem, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 120, -1));

        jLabel1.setText("Branch:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        tbranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "Computer Science & Engg.", "Mechanical Engg.", "Information Technology", "Civil Engg.", "CSE AI&ML", "Electrical Engg.", "Electromics Engg." }));
        getContentPane().add(tbranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 170, -1));

        jLabel10.setText("Gender: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        tgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "Male", "Female", "Others" }));
        getContentPane().add(tgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 90, 20));

        jLabel11.setText("Mother's Name: ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));
        getContentPane().add(tmothername, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 150, -1));

        jLabel12.setText("Student's Contact No.");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));
        getContentPane().add(tcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 150, -1));

        jLabel13.setText("Cast : ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));
        getContentPane().add(tcast, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 100, -1));

        jLabel14.setText("Religion: ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        treligion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "Hindu", "Bodha", "Sikh", "Muslim", "Others.." }));
        getContentPane().add(treligion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 100, -1));

        jLabel15.setText("Blood Group: ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

        tbg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-", "rH other" }));
        getContentPane().add(tbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 90, -1));

        bsave.setText("Save");
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });
        getContentPane().add(bsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, -1, -1));

        bupdate.setText("Update");
        bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupdateActionPerformed(evt);
            }
        });
        getContentPane().add(bupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, -1, -1));

        bdelete.setText("Delete");
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(bdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, -1, -1));

        bclear.setText("Clear");
        bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclearActionPerformed(evt);
            }
        });
        getContentPane().add(bclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, -1, -1));

        bnew.setText("New");
        bnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnewActionPerformed(evt);
            }
        });
        getContentPane().add(bnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        bsearch.setText("Search");
        bsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsearchActionPerformed(evt);
            }
        });
        getContentPane().add(bsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        bbrowse.setText("Browse");
        bbrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbrowseActionPerformed(evt);
            }
        });
        getContentPane().add(bbrowse, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, -1, -1));

        photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo.setText("Photo");
        photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        photo.setFocusable(false);
        photo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 114, 170, 160));

        jLabel17.setText("Type");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        ttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Teacher" }));
        ttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttypeActionPerformed(evt);
            }
        });
        getContentPane().add(ttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 130, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Back to Login");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        image.setIcon(new javax.swing.ImageIcon("G:\\files\\java\\RTP\\BG\\registration.png")); // NOI18N
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttypeActionPerformed

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed
        if (ttype.getSelectedItem().equals("Student")) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rtp", "root", "");
                String sql2 = "select id from registration where id = '" + tid.getText() + "' ";
                PreparedStatement pst = con.prepareStatement(sql2);
                ResultSet r = pst.executeQuery();
                if (r.next()) {
                    JOptionPane.showMessageDialog(null, "Record Already Exsits");

                } else {

                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    String dob = sdf.format(tdob.getDate());
                    String doa = sdf.format(tdoa.getDate());

                    String religion = "" + treligion.getSelectedItem();
                    String gender = "" + tgender.getSelectedItem();

                    String sql = " insert into registration (id, name, mother_name, cast, religion, gender, contact, dob, doa, address, year, semester, branch, blood,type,photo,password)"
                            + " values('" + tid.getText() + "','" + tname.getText() + "','" + tmothername.getText() + "','" + tcast.getText() + "','" + religion + "','" + gender + "','" + tcontact.getText() + "','" + dob + "','" + doa + "','" + tadd.getText() + "','" + tyear.getSelectedItem() + "','" + tsem.getSelectedItem() + "','" + tbranch.getSelectedItem() + "','" + tbg.getSelectedItem() + "','" + ttype.getSelectedItem() + "','" + in + "','')";
                    PreparedStatement ps = con.prepareStatement(sql);
                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Record Saved Successfully");
                        String password1 = "";
                        password1 = JOptionPane.showInputDialog(null, "ENTER NEW PASSWORD:");
                        String password2 = "";
                        password2 = JOptionPane.showInputDialog(null, "ENTER NEW PASSWORD:");
                        while (!password1.equals(password2)) {
                            password1 = JOptionPane.showInputDialog(null, "ENTER NEW PASSWORD:");
                            password2 = JOptionPane.showInputDialog(null, "ENTER NEW PASSWORD:");
                        }
                        String sql3 = "insert into teacher_data('password')values ('" + password2 + "')";
                        PreparedStatement ps2 = con.prepareStatement(sql3);
                        if (ps2.executeUpdate() > 0) {
                            JOptionPane.showMessageDialog(null, "Password Saved Successfully \n Welcome , " + tname);
                        } else {
                            JOptionPane.showMessageDialog(null, "Some Error occured...\n account creation failed Dear, " + tname);
                        }
                        clear();
                        new login().setVisible(true);
                    }

                

                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if (ttype.getSelectedItem().equals("Teacher")) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rtp", "root", "");
                String sql2 = "select id from teacher_data where id = '" + tid.getText() + "' ";
                PreparedStatement pst = con.prepareStatement(sql2);
                ResultSet r = pst.executeQuery();
                if (r.next()) {
                    JOptionPane.showMessageDialog(null, "Record Already Exsits");

                } else {
                    //System.out.print("done");

                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    String dob = sdf.format(tdob.getDate());
                    String doa = sdf.format(tdoa.getDate());

                    String religion = "" + treligion.getSelectedItem();
                    String gender = "" + tgender.getSelectedItem();

                    String sql = " insert into teacher_data (id, name, mother_name, cast, religion, gender, contact, dob, doa, address, year, semester, branch, blood,type,photo,password)"
                            + " values('" + tid.getText() + "','" + tname.getText() + "','" + tmothername.getText() + "','" + tcast.getText() + "','" + religion + "','" + gender + "','" + tcontact.getText() + "','" + dob + "','" + doa + "','" + tadd.getText() + "','" + tyear.getSelectedItem() + "','" + tsem.getSelectedItem() + "','" + tbranch.getSelectedItem() + "','" + tbg.getSelectedItem() + "','" + ttype.getSelectedItem() + "','" + in + "','')";
                    PreparedStatement ps = con.prepareStatement(sql);
                    //System.out.print("done");
                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Record Saved Successfully");
                        String password1 = "";
                        password1 = JOptionPane.showInputDialog(null, "ENTER NEW PASSWORD:");
                        String password2 = "";
                        password2 = JOptionPane.showInputDialog(null, "ENTER NEW PASSWORD:");
                        while (!password1.equals(password2)) {
                            password1 = JOptionPane.showInputDialog(null, "ENTER NEW PASSWORD:");
                            password2 = JOptionPane.showInputDialog(null, "ENTER NEW PASSWORD:");
                        }
                        String sql3 = "insert into teacher_data('password')values ('" + password2 + "')";
                        PreparedStatement ps2 = con.prepareStatement(sql3);
                        if (ps2.executeUpdate() > 0) {
                            JOptionPane.showMessageDialog(null, "Password Saved Successfully \n Welcome , " + tname);
                        } else {
                            JOptionPane.showMessageDialog(null, "Some Error occured...\n account creation failed Dear, " + tname);
                        }
                        clear();
                        new login().setVisible(true);
                    }

                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }//GEN-LAST:event_bsaveActionPerformed

    private void bnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnewActionPerformed
        if (ttype.getSelectedItem().equals("Student")) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rtp", "root", "");
                String sql = "select max(id) from registration ";
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    tid.setText("" + (id + 1));
                }
                con.close();
                pst.close();
                rs.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (ttype.getSelectedItem().equals("Teacher")) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rtp", "root", "");
                String sql = "select max(id) from teacher_data ";
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    tid.setText("" + (id + 1));
                }
                con.close();
                pst.close();
                rs.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_bnewActionPerformed

    private void bsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsearchActionPerformed
        if (ttype.getSelectedItem().equals("Student")) {
            try {
                byte flag = 0;
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rtp", "root", "");
                String sql = "select * from registration where id = '" + tid.getText() + "'";
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    flag = 1;
                    tid.setText(rs.getString("id"));

                    tname.setText(rs.getString("name"));
                    ttype.setSelectedItem(rs.getString("type"));
                    tmothername.setText(rs.getString("mother_name"));
                    tcast.setText(rs.getString("cast"));
                    treligion.setSelectedItem(rs.getString("religion"));
                    tgender.setSelectedItem(rs.getString("gender"));
                    tcontact.setText(rs.getString("contact"));

                    String d = rs.getString("dob");
                    java.util.Date a = new SimpleDateFormat("dd/MM/yyyy").parse(d);

                    tdob.setDate(a);

                    String d2 = rs.getString("doa");
                    java.util.Date b = new SimpleDateFormat("dd/MM/yyyy").parse(d2);

                    tdoa.setDate(b);
                    tadd.setText(rs.getString("address"));
                    tyear.setSelectedItem(rs.getString("year"));
                    tsem.setSelectedItem(rs.getString("semester"));
                    tbranch.setSelectedItem(rs.getString("branch"));
                    tbg.setSelectedItem(rs.getString("blood"));

                    photo.setText(null);

                    df = "G:\\files\\java\\RTP\\photos\\" + rs.getString("photo");
                    ImageIcon myImg = new ImageIcon(df);
                    Image img = myImg.getImage();
                    Image newImg = img.getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
                    photo.setIcon(new ImageIcon(newImg));

                }
                if (flag == 0) {
                    JOptionPane.showMessageDialog(image, "Record Not Found");
                }
                con.close();
                pst.close();
                rs.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (ttype.getSelectedItem().equals("Teacher")) {
            try {
                byte flag = 0;
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rtp", "root", "");
                String sql = "select * from teacher_data where id = '" + tid.getText() + "' ";
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    flag = 1;
                    tid.setText(rs.getString("id"));

                    tname.setText(rs.getString("name"));
                    ttype.setSelectedItem(rs.getString("type"));
                    tmothername.setText(rs.getString("mother_name"));
                    tcast.setText(rs.getString("cast"));
                    treligion.setSelectedItem(rs.getString("religion"));
                    tgender.setSelectedItem(rs.getString("gender"));
                    tcontact.setText(rs.getString("contact"));

                    String d = rs.getString("dob");
                    java.util.Date a = new SimpleDateFormat("dd/MM/yyyy").parse(d);

                    tdob.setDate(a);

                    String d2 = rs.getString("doa");
                    java.util.Date b = new SimpleDateFormat("dd/MM/yyyy").parse(d2);

                    tdoa.setDate(b);
                    tadd.setText(rs.getString("address"));
                    tyear.setSelectedItem(rs.getString("year"));
                    tsem.setSelectedItem(rs.getString("semester"));
                    tbranch.setSelectedItem(rs.getString("branch"));
                    tbg.setSelectedItem(rs.getString("blood"));

                    photo.setText(null);

                    df = "G:\\files\\java\\RTP\\photos\\" + rs.getString("photo");
                    ImageIcon myImg = new ImageIcon(df);
                    Image img = myImg.getImage();
                    Image newImg = img.getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
                    photo.setIcon(new ImageIcon(newImg));

                }
                if (flag == 0) {
                    JOptionPane.showMessageDialog(image, "Record Not Found");
                }
                con.close();
                pst.close();
                rs.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_bsearchActionPerformed

    private void bbrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbrowseActionPerformed
        if (ttype.getSelectedItem().equals("Student")) {
            try {
                JFileChooser fc = new JFileChooser();
                int p = fc.showOpenDialog(fc);

                if (p == JFileChooser.APPROVE_OPTION) {
                    File f = fc.getSelectedFile();
                    String document = f.getAbsolutePath();
                    ImageIcon myImg = new ImageIcon((document));
                    Image img = myImg.getImage();
                    Image newImg = img.getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
                    photo.setIcon(new ImageIcon(newImg));
                    in = f.getName();

                } else {
                    in = null;
                }

                /*/Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rtp", "root", "");
                String sql = "insert into registration (photo)value('" + in + "') where id = '" + tid.getText() + "' ";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.executeUpdate();/*/
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (ttype.getSelectedItem().equals("Teacher")) {
            try {
                JFileChooser fc = new JFileChooser();
                int p = fc.showOpenDialog(fc);

                if (p == JFileChooser.APPROVE_OPTION) {
                    File f = fc.getSelectedFile();
                    String document = f.getAbsolutePath();
                    ImageIcon myImg = new ImageIcon((document));
                    Image img = myImg.getImage();
                    Image newImg = img.getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
                    photo.setIcon(new ImageIcon(newImg));
                    in = f.getName();

                } else {
                    in = null;
                }

                /*/Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rtp", "root", "");
                String sql = "insert into teacher_data (photo) values('" + in + "') where id='" + tid.getText() + "' ";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.executeUpdate();/*/
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_bbrowseActionPerformed

    private void bclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclearActionPerformed
        clear();
    }//GEN-LAST:event_bclearActionPerformed

    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rtp", "root", "");
            String sql ="";
            if (ttype.getSelectedItem().equals("Student")) {
                 sql = "delete from registration where id ='" + tid.getText() + "'";
            } else if (ttype.getSelectedItem().equals("Teacher")){
                 sql = "delete from teacher_data where id ='" + tid.getText() + "'";
            }
              
            PreparedStatement pst = con.prepareStatement(sql);
            int i = pst.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(bdelete, "Record Deleted Successfully");
                clear();
            }
            else JOptionPane.showMessageDialog(bdelete, "Record Deletion Failed");
            con.close();
            pst.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_bdeleteActionPerformed

    private void bupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdateActionPerformed
           try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rtp", "root", "");
             SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    String dob = sdf.format(tdob.getDate());
                    String doa = sdf.format(tdoa.getDate());
            String sql = "UPDATE `registration` SET `id`='"+tid.getText()+"',`type`='"+ttype.getSelectedItem()+"',`name`='"+tname.getText()+"',`mother_name`='"+tmothername.getText()+"',`cast`='"+tcast.getText()+"',`religion`='"+treligion.getSelectedItem()+"',`gender`='"+tgender.getSelectedItem()+"',`contact`='"+tcontact.getText()+"',`dob`='"+dob+"',`doa`='"+doa+"',`address`='"+tadd.getText()+"',`year`='"+tyear.getSelectedItem()+"',`semester`='"+tsem.getSelectedItem()+"',`branch`='"+tbranch.getSelectedItem()+"',`blood`='"+tbg.getSelectedItem()+"',`photo`='',`password`='' WHERE id = '"+tid.getText()+"'";
            PreparedStatement pst = con.prepareStatement(sql);
            
            int i = pst.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Record Updated SuccessFully");
                clear();
            }else JOptionPane.showMessageDialog(null, "Record Updation Failed");
        } catch (Exception e) {e.printStackTrace();
        }
    }//GEN-LAST:event_bupdateActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        new login().setVisible(true);
    }//GEN-LAST:event_jLabel16MouseClicked

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
            java.util.logging.Logger.getLogger(newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbrowse;
    private javax.swing.JButton bclear;
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bnew;
    private javax.swing.JButton bsave;
    private javax.swing.JButton bsearch;
    private javax.swing.JButton bupdate;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel photo;
    private javax.swing.JTextArea tadd;
    private javax.swing.JComboBox<String> tbg;
    private javax.swing.JComboBox<String> tbranch;
    private javax.swing.JTextField tcast;
    private javax.swing.JTextField tcontact;
    private com.toedter.calendar.JDateChooser tdoa;
    private com.toedter.calendar.JDateChooser tdob;
    private javax.swing.JComboBox<String> tgender;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tmothername;
    private javax.swing.JTextField tname;
    private javax.swing.JComboBox<String> treligion;
    private javax.swing.JComboBox<String> tsem;
    private javax.swing.JComboBox<String> ttype;
    private javax.swing.JComboBox<String> tyear;
    // End of variables declaration//GEN-END:variables

    private void clear() {

        tid.setText("");
        tname.setText("");
        ttype.setSelectedItem(null);
        tmothername.setText("");
        tcast.setText("");
        treligion.setSelectedItem(null);
        tgender.setSelectedItem(null);
        tcontact.setText("");
        tdob.setDateFormatString("");
        tdoa.setDateFormatString("");
        tadd.setText("");
        tyear.setSelectedItem(null);
        tsem.setSelectedItem(null);
        tbranch.setSelectedItem(null);
        tbg.setSelectedItem(null);
        photo.setIcon(null);
    }
}