/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Donor.UI;

import Patient.UI.PatientLoginPage;
import Patient.UI.PatientManageFrame;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ServiceDonor;
import model.ServicePatient;

/**
 *
 * @author Gayatri
 */
public class DonorLoginPage extends javax.swing.JPanel {

    /**
     * Creates new form DonarLoginPage1
     */
    public DonorLoginPage() {
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

        txtusername = new javax.swing.JTextField();
        lbl_username = new javax.swing.JLabel();
        lbl_Hosptitle = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        lbl_pswd = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1509, 999));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 235, 197, -1));

        lbl_username.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_username.setText("Username:");
        add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 209, -1, -1));

        lbl_Hosptitle.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl_Hosptitle.setText("Donor Login");
        add(lbl_Hosptitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 250, 70));

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 305, 197, -1));

        lbl_pswd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_pswd.setText("Password:");
        add(lbl_pswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 279, -1, -1));

        btn_login.setBackground(new java.awt.Color(0, 204, 204));
        btn_login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 368, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Donor2.v4.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-370, -110, 1460, 730));
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        String username = txtusername.getText();
         int i ;
        String password = txtpassword.getText();
        
        ServiceDonor sd = new ServiceDonor();
        
        try {
          i = sd.checklogin(username,password); 
          if(i ==1)
                {

                    DonorManageFrame pjf =  new DonorManageFrame(username,password);
                    pjf.show();


                }
                else{

                         JOptionPane.showMessageDialog(null, "Donor Username and Password does not exist"); 
                }
        } catch (SQLException ex) {
            Logger.getLogger(PatientLoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
      

    }//GEN-LAST:event_btn_loginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_Hosptitle;
    private javax.swing.JLabel lbl_pswd;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
