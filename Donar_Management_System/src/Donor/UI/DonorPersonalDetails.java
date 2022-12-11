/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Donor.UI;

import Patient.UI.*;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Gayatri
 */
public class DonorPersonalDetails extends javax.swing.JPanel {

    /**
     * Creates new form PatientRegistration1
     */
    
    //for validating email id format 
    String PATTERN= "^[a-zA-Z0-9]{0,30}@[a-zA-Z0-9]{0,20}[.][a-zA-Z]{0,5}$";
    Pattern patt= Pattern.compile(PATTERN);
    
    //for validating date format 
    String PATTERNEI = "^[0-9]{2}[/][0-9]{2}[/][0-9]{4}$";
    Pattern pattei = Pattern.compile(PATTERNEI);
    
    
    public DonorPersonalDetails() {
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

        Logout1 = new javax.swing.JButton();
        lbl_address = new javax.swing.JLabel();
        txt_City = new javax.swing.JLabel();
        txt_Zip = new javax.swing.JLabel();
        lbl_gender = new javax.swing.JLabel();
        lbl_telenum = new javax.swing.JLabel();
        lbl_dob = new javax.swing.JLabel();
        txtDonarGender = new javax.swing.JComboBox<>();
        txtDonarUsername = new javax.swing.JTextField();
        txtDonarName = new javax.swing.JTextField();
        txtDonarStreet = new javax.swing.JTextField();
        txtDonarPassword = new javax.swing.JTextField();
        txtDonarContact = new javax.swing.JTextField();
        txtDonarZip = new javax.swing.JTextField();
        txtDonarDOB = new javax.swing.JTextField();
        txtDonarCommunity = new javax.swing.JComboBox<>();
        lbl_title = new javax.swing.JLabel();
        lbl_donorname = new javax.swing.JLabel();
        lbl_uname = new javax.swing.JLabel();
        lbl_pswd = new javax.swing.JLabel();
        DonarUpdateBtn = new javax.swing.JButton();
        lbl_dob1 = new javax.swing.JLabel();
        lbl_dob2 = new javax.swing.JLabel();
        txtDonarBG = new javax.swing.JComboBox<>();
        lbl_telenum1 = new javax.swing.JLabel();
        txtDonarEmail = new javax.swing.JTextField();

        Logout1.setBackground(new java.awt.Color(153, 0, 153));
        Logout1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Logout1.setText("Back");
        Logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout1ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(0, 204, 204));

        lbl_address.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_address.setText("Street Name:");

        txt_City.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_City.setText("Community:");

        txt_Zip.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_Zip.setText("Zip Code:");

        lbl_gender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_gender.setText("Gender:");

        lbl_telenum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_telenum.setText("Phone no.:");

        lbl_dob.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_dob.setText("Date of Birth:");

        txtDonarGender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDonarGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        txtDonarName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonarNameActionPerformed(evt);
            }
        });
        txtDonarName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDonarNameKeyPressed(evt);
            }
        });

        txtDonarStreet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDonarStreetKeyPressed(evt);
            }
        });

        txtDonarContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDonarContactKeyPressed(evt);
            }
        });

        txtDonarZip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDonarZipKeyPressed(evt);
            }
        });

        txtDonarDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonarDOBActionPerformed(evt);
            }
        });

        txtDonarCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Allston", "Back Bay", "Bay Village", "Beacon Hill", "Brighton", "Charlestown", "Chinatown – Leather District", "Dorchester", "Downtown", "East Boston", "Fenway-Kenmore", "Hyde Park", "Jamaica Plain", "Mattapan", "Mid-Dorchester", "Mission Hill", "North End", "Roslindale", "Roxbury", "South Boston", "South End", "West End", "West Roxbury", " ", " ", " " }));

        lbl_title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_title.setText("                             Donar Details");

        lbl_donorname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_donorname.setText("Donar Name:");

        lbl_uname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_uname.setText("Username:");

        lbl_pswd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_pswd.setText("Password:");

        DonarUpdateBtn.setBackground(new java.awt.Color(0, 102, 102));
        DonarUpdateBtn.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        DonarUpdateBtn.setText("Update");
        DonarUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonarUpdateBtnActionPerformed(evt);
            }
        });

        lbl_dob1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_dob1.setText("Blood Group:");

        lbl_dob2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_dob2.setText("Contact Details");

        txtDonarBG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A +ve ", "A  -ve", "B +ve", "B -ve", "AB +ve", "AB -ve", "O +ve", "O  -ve", "Kidneys", "Liver", "Lungs", "Heart", "Pancreas", "Intestines", "Eyes", " " }));

        lbl_telenum1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_telenum1.setText("Email ID:");

        txtDonarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonarEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DonarUpdateBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_pswd)
                            .addComponent(lbl_donorname)
                            .addComponent(lbl_uname)
                            .addComponent(lbl_address)
                            .addComponent(txt_City, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Zip)
                            .addComponent(lbl_gender)
                            .addComponent(lbl_telenum)
                            .addComponent(lbl_dob)
                            .addComponent(lbl_dob1)
                            .addComponent(lbl_dob2)
                            .addComponent(lbl_telenum1))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDonarName, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                            .addComponent(txtDonarUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                            .addComponent(txtDonarPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                            .addComponent(txtDonarStreet, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                            .addComponent(txtDonarCommunity, 0, 390, Short.MAX_VALUE)
                            .addComponent(txtDonarZip, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                            .addComponent(txtDonarGender, 0, 390, Short.MAX_VALUE)
                            .addComponent(txtDonarContact)
                            .addComponent(txtDonarDOB)
                            .addComponent(txtDonarBG, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDonarEmail))))
                .addGap(202, 202, 202))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbl_title)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_donorname)
                    .addComponent(txtDonarName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_uname)
                    .addComponent(txtDonarUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pswd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_address)
                    .addComponent(txtDonarStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_City)
                    .addComponent(txtDonarCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Zip, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonarZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_gender)
                    .addComponent(txtDonarGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dob)
                    .addComponent(txtDonarDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dob1)
                    .addComponent(txtDonarBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(lbl_dob2)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telenum)
                    .addComponent(txtDonarContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telenum1)
                    .addComponent(txtDonarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(DonarUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDonarNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonarNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDonarNameActionPerformed

    private void txtDonarDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonarDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDonarDOBActionPerformed

    private void Logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Logout1ActionPerformed

    private void DonarUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonarUpdateBtnActionPerformed
        // TODO add your handling code here:
        String cn= txtDonarContact.getText();        
        int celllength = cn.length();
        
        //for validating email address
        Matcher match=patt.matcher(txtDonarEmail.getText());
        
        //for validating date 
        Matcher matchei=pattei.matcher(txtDonarDOB.getText());
        
        if(txtDonarContact.getText().equals("") || txtDonarDOB.getText().equals("") 
                || txtDonarContact.getText().equals("") || txtDonarName.getText().equals("") || 
                txtDonarEmail.getText().equals("") || txtDonarPassword.getText().equals("") || 
                txtDonarStreet.getText().equals("") || txtDonarUsername.getText().equals("") || 
                txtDonarZip.getText().equals("")){ 
         
            JOptionPane.showMessageDialog(this," All details are not Filled ");
            
        }    
        else if(!matchei.matches())
                {
                 JOptionPane.showMessageDialog(this," Invalid Date format (Valid Format is DD/MM/YYYY)");    
        }
                
                
                
        else if(celllength<10)
                {
                JOptionPane.showMessageDialog(this," Enter 10 digit cell phone number ");
                
            }
        
        else if(!match.matches()){
                 JOptionPane.showMessageDialog(this," Invalid Email id  ");
        }         
        
            
        
        else
        {  
                JOptionPane.showMessageDialog(this," Donor Details Updated ");
                
                
             
                



            txtDonarContact.setText("");
            txtDonarDOB.setText("");
            txtDonarEmail.setText("");
            txtDonarName.setText("");
            txtDonarPassword.setText("");
            txtDonarStreet.setText("");
            txtDonarUsername.setText("");
            txtDonarZip.setText("");
            


       } 
        
        
    }//GEN-LAST:event_DonarUpdateBtnActionPerformed

    private void txtDonarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonarEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDonarEmailActionPerformed

    private void txtDonarNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDonarNameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
            //iso control for edit operation(delete key and backspace key allow)
            //if enter character is letter, space and isocontrol char than allow to edit
            txtDonarName.setEditable(true);
        }else{
            txtDonarName.setEditable(false);
        }
        
        
        
    }//GEN-LAST:event_txtDonarNameKeyPressed

    private void txtDonarStreetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDonarStreetKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
            //iso control for edit operation(delete key and backspace key allow)
            //if enter character is letter, space and isocontrol char than allow to edit
            txtDonarStreet.setEditable(true);
        }else{
            txtDonarStreet.setEditable(false);
        }
        
        
    }//GEN-LAST:event_txtDonarStreetKeyPressed

    private void txtDonarZipKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDonarZipKeyPressed
        // TODO add your handling code here:
        String age= txtDonarZip.getText();
        
        // get length of the string 
        int length = age.length();
        
        char c = evt.getKeyChar();
        
        //check for number 0 to 9 
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            //check for length not more than 10 digit 
            if(length<5){
                //editable true 
                txtDonarZip.setEditable(true);
                //JOptionPane.showMessageDialog(this," Invalid Cell Number ");
                
            }else{
                //not editable if length is more than 10 digit
                txtDonarZip.setEditable(false);
            }
        }else{
            //not allow keys 'backspace' and 'delete' for edit
            if(evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()== KeyEvent.VK_DELETE){
                //than allow editable 
                txtDonarZip.setEditable(true);
            }else{
                txtDonarZip.setEditable(false);
            }
        }
        
        
    }//GEN-LAST:event_txtDonarZipKeyPressed

    private void txtDonarContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDonarContactKeyPressed
        // TODO add your handling code here:
        //action when key is pressed 
        String cell_no= txtDonarContact.getText();
        
        // get length of the string 
        int length = cell_no.length();
        
        char c = evt.getKeyChar();
        
        //check for number 0 to 9 
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            //check for length not more than 10 digit 
            if(length<10){
                //editable true 
                txtDonarContact.setEditable(true);
                //JOptionPane.showMessageDialog(this," Invalid Cell Number ");
                
            }else{
                //not editable if length is more than 10 digit
                txtDonarContact.setEditable(false);
            }
        }else{
            //not allow keys 'backspace' and 'delete' for edit
            if(evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()== KeyEvent.VK_DELETE){
                //than allow editable 
                txtDonarContact.setEditable(true);
            }else{
                txtDonarContact.setEditable(false);
            }
        }
        
        
    }//GEN-LAST:event_txtDonarContactKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DonarUpdateBtn;
    private javax.swing.JButton Logout1;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_dob;
    private javax.swing.JLabel lbl_dob1;
    private javax.swing.JLabel lbl_dob2;
    private javax.swing.JLabel lbl_donorname;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_pswd;
    private javax.swing.JLabel lbl_telenum;
    private javax.swing.JLabel lbl_telenum1;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_uname;
    private javax.swing.JComboBox<String> txtDonarBG;
    private javax.swing.JComboBox<String> txtDonarCommunity;
    private javax.swing.JTextField txtDonarContact;
    private javax.swing.JTextField txtDonarDOB;
    private javax.swing.JTextField txtDonarEmail;
    private javax.swing.JComboBox<String> txtDonarGender;
    private javax.swing.JTextField txtDonarName;
    private javax.swing.JTextField txtDonarPassword;
    private javax.swing.JTextField txtDonarStreet;
    private javax.swing.JTextField txtDonarUsername;
    private javax.swing.JTextField txtDonarZip;
    private javax.swing.JLabel txt_City;
    private javax.swing.JLabel txt_Zip;
    // End of variables declaration//GEN-END:variables
}
