/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package internal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import scdproject_2.Student;

/**
 *
 * @author Hassan
 */
public class Frame2_addStudent extends javax.swing.JInternalFrame {

 
    /**
     * Creates new form Frame2_addStudent
     */
    public Frame2_addStudent(){
        initComponents();
        setBounds(350,0,700,700);
         
    }
public boolean action(String stname, String fname, String dob, String bform, String gender, String stmobile, String fcnic, String fmobile,
        String program, int Package, int firstinstallment,
        int  matricrollno, String dateodadmission, int matricmarks, 
        String admissionby, String approachedby, String enteredby,String status)
{
        StudentNametf.setText(stname);
     String stname_=StudentNametf.getText();
     
     FatherNametf.setText(fname);
        String fname_=FatherNametf.getText();
        
        DOB.setText(dob);
        String dob_=DOB.getText();
        
        BFormtf.setText(bform);
        String bform_=BFormtf.getText();
        
         boolean gen1=false;
         boolean gen2=false;

         if(gender.equals("Male"))
         {
             Malecheck.setSelected(true);
             gen1=true;
         }
         else
         {
             FemaleCheck.setSelected(true);
             gen2=true;
         }
         
         StudentMobiletf.setText(stmobile);
        String stmobile_=StudentMobiletf.getText();
        
        FatherCNICtf.setText(fcnic);
        String fcnic_=FatherCNICtf.getText();
        
        FatherMobiletf.setText(fmobile);
        String fmobile_=FatherMobiletf.getText();
        
        Programtf.setText(program);
        String program_=Programtf.getText();
        
        Packagetf.setText(String.valueOf(Package));
        String _pac=Packagetf.getText();
         
        FirstInstallmenttf.setText(String.valueOf(firstinstallment));
        String FI=FirstInstallmenttf.getText();
        
           MatricRolltf.setText(String.valueOf(matricrollno));
        String MR=MatricRolltf.getText();
        
           AdmissionDatetf.setText(dateodadmission);
        String Ad=AdmissionDatetf.getText();
        
        
           MatricMarkstf.setText(String.valueOf(matricmarks));
        String MM=MatricMarkstf.getText();
        
           AdmissionBytf.setText(admissionby);
        String adby=AdmissionBytf.getText();
        
          ApproachedBytf.setText(approachedby);
        String APby=ApproachedBytf.getText();
          
           EnteredBytf.setText(enteredby);
        String enterby=EnteredBytf.getText();
            
        Statustf.setText(status);
        String status_=Statustf.getText();
           
     
         

        student=addStudentToDatabase(stname_,fname_,dob_,bform_,gen1,gen2,stmobile_,
                fcnic_,fmobile_,program_,Integer.parseInt(_pac),Integer.parseInt(FI),
                Integer.parseInt(MR),
                Ad,Integer.parseInt(MM), 
                adby,APby,enterby,status_);
        if(student!=null)
        {
            dispose();
            return true;
        }
        else 
        {
//                    JOptionPane.showMessageDialog(this,
//                    "Failed to add record.",
//                    "Try again",
//                    JOptionPane.ERROR_MESSAGE);
        } 

      
      return false;
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Jpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        StudentNametf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FatherNametf = new javax.swing.JTextField();
        DOB = new javax.swing.JTextField();
        StudentMobiletf = new javax.swing.JTextField();
        FatherCNICtf = new javax.swing.JTextField();
        BFormtf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        FatherMobiletf = new javax.swing.JTextField();
        Programtf = new javax.swing.JTextField();
        Packagetf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        FirstInstallmenttf = new javax.swing.JTextField();
        MatricRolltf = new javax.swing.JTextField();
        MatricMarkstf = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        AdmissionDatetf = new javax.swing.JTextField();
        AdmissionBytf = new javax.swing.JTextField();
        ApproachedBytf = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        EnteredBytf = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Statustf = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Malecheck = new javax.swing.JRadioButton();
        FemaleCheck = new javax.swing.JRadioButton();
        Registerbtn = new javax.swing.JButton();
        Cancelbtn = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("AddStudentRecord");
        setOpaque(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        Jpanel.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Student Record");

        StudentNametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentNametfActionPerformed(evt);
            }
        });

        jLabel3.setText("Student Full Name");

        jLabel4.setText("FatherName");

        jLabel5.setText("DOB");

        FatherNametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FatherNametfActionPerformed(evt);
            }
        });

        DOB.setAlignmentX(0.0F);
        DOB.setMinimumSize(new java.awt.Dimension(64, 30));

        StudentMobiletf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentMobiletfActionPerformed(evt);
            }
        });

        FatherCNICtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FatherCNICtfActionPerformed(evt);
            }
        });

        BFormtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFormtfActionPerformed(evt);
            }
        });

        jLabel6.setText("BFormNo");

        jLabel7.setText("StudentMobile");

        jLabel8.setText("FatherCNIC");

        jLabel9.setText("FatherMobile");

        jLabel10.setText("Program");

        jLabel11.setText("Package");

        Packagetf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackagetfActionPerformed(evt);
            }
        });

        jLabel12.setText("First Installment");

        jLabel13.setText("Matric RollNo");

        jLabel14.setText("Matric Marks");

        jLabel15.setText("Admission Date");

        jLabel16.setText("Admission By");

        jLabel17.setText("Approached By");

        AdmissionBytf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmissionBytfActionPerformed(evt);
            }
        });

        jLabel18.setText("Entered By");

        jLabel19.setText("Status");

        jLabel20.setText("Gender");

        buttonGroup1.add(Malecheck);
        Malecheck.setText("Male");

        buttonGroup1.add(FemaleCheck);
        FemaleCheck.setText("Female");

        Registerbtn.setBackground(new java.awt.Color(44, 62, 80));
        Registerbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Registerbtn.setForeground(new java.awt.Color(255, 255, 255));
        Registerbtn.setText("Register");
        Registerbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterbtnActionPerformed(evt);
            }
        });

        Cancelbtn.setBackground(new java.awt.Color(44, 62, 80));
        Cancelbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        Cancelbtn.setText("Cancel");
        Cancelbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpanelLayout = new javax.swing.GroupLayout(Jpanel);
        Jpanel.setLayout(JpanelLayout);
        JpanelLayout.setHorizontalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(StudentNametf)
                        .addComponent(BFormtf, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addComponent(FirstInstallmenttf))
                    .addComponent(AdmissionDatetf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FatherMobiletf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelLayout.createSequentialGroup()
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FatherNametf, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(StudentMobiletf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JpanelLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(158, 158, 158)
                                        .addComponent(jLabel8))
                                    .addGroup(JpanelLayout.createSequentialGroup()
                                        .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(FatherCNICtf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(JpanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Malecheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FemaleCheck)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(117, 117, 117)
                                .addComponent(jLabel20))
                            .addGroup(JpanelLayout.createSequentialGroup()
                                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MatricRolltf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(JpanelLayout.createSequentialGroup()
                                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AdmissionBytf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16))
                                        .addGap(39, 39, 39)
                                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MatricMarkstf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ApproachedBytf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel14)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelLayout.createSequentialGroup()
                                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Programtf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(Statustf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EnteredBytf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addComponent(Packagetf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))))
                        .addGap(0, 6, Short.MAX_VALUE))))
            .addGroup(JpanelLayout.createSequentialGroup()
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(Registerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(Cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JpanelLayout.setVerticalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(StudentNametf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FatherNametf, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Malecheck)
                        .addComponent(FemaleCheck)))
                .addGap(48, 48, 48)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StudentMobiletf, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(BFormtf, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(FatherCNICtf)
                    .addComponent(DOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FatherMobiletf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Programtf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Statustf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Packagetf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstInstallmenttf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MatricRolltf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MatricMarkstf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnteredBytf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApproachedBytf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdmissionBytf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdmissionDatetf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Registerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentNametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentNametfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentNametfActionPerformed

    private void FatherNametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FatherNametfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FatherNametfActionPerformed

    private void StudentMobiletfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentMobiletfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentMobiletfActionPerformed

    private void FatherCNICtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FatherCNICtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FatherCNICtfActionPerformed

    private void BFormtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFormtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BFormtfActionPerformed

    private void PackagetfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackagetfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PackagetfActionPerformed

    private void AdmissionBytfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmissionBytfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdmissionBytfActionPerformed

    private void RegisterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterbtnActionPerformed
        // TODO add your handling code here:
        registerStudent();
    }//GEN-LAST:event_RegisterbtnActionPerformed

    private void CancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelbtnActionPerformed
        dispose();
    }//GEN-LAST:event_CancelbtnActionPerformed

private void registerStudent() {

        String stname=StudentNametf.getText();
        String fname=FatherNametf.getText();
        String dob=DOB.getText();
        String bform=BFormtf.getText();
        boolean gender1=Malecheck.isSelected();
        boolean gender2=FemaleCheck.isSelected();
        String stmobile=StudentMobiletf.getText();
        String fcnic=FatherCNICtf.getText();
        String fmobile=FatherMobiletf.getText();
        String program=Programtf.getText();
        String _pac=Packagetf.getText();
        
         int _package=0;
        if(_pac.isEmpty()==false)
        _package=Integer.parseInt(_pac);
        
         int firstinstallment=0;
        String FI=FirstInstallmenttf.getText();
        if(FI.isEmpty()==false)
         firstinstallment=Integer.parseInt(FI);
        
       int matricrollno=0;
        String MR=MatricRolltf.getText();
           if(MR.isEmpty()==false)
          matricrollno=Integer.parseInt(MR);
         
        String dateodadmission=AdmissionDatetf.getText();
        
          int matricmarks=0;
        String MM=MatricMarkstf.getText();
          if(MM.isEmpty()==false)
        matricmarks=Integer.parseInt(MM);
        
         
        String admissionby=AdmissionBytf.getText();
        String approachedby=ApproachedBytf.getText();
        String enteredby=EnteredBytf.getText();
        String status=Statustf.getText();
        boolean gen = true;
        if((gender1==false&&gender2==false))
        {
               gen=false;
        }
        if (stname.isEmpty() || fname.isEmpty() || dob.isEmpty() || bform.isEmpty()
                || stmobile.isEmpty()||fcnic.isEmpty() || fmobile.isEmpty() || program.isEmpty() || _pac.isEmpty()
                || FI.isEmpty()||MM.isEmpty() || MR.isEmpty() || dateodadmission.isEmpty()
                || admissionby.isEmpty()||approachedby.isEmpty() || enteredby.isEmpty() || status.isEmpty()
                || gen==false )
        {
            JOptionPane.showMessageDialog(this,
                    "Please enter all fields",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        student=addStudentToDatabase(stname,fname,dob,bform,gender1,gender2,stmobile,fcnic,fmobile,program,_package,firstinstallment,matricrollno,dateodadmission,matricmarks, admissionby,approachedby,enteredby,status);
        if(student!=null)
        {
            dispose(); 
        }
        else 
        {
                    JOptionPane.showMessageDialog(this,
                    "Failed to add record.",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
        } 

    }

    public Student  student;
    private Student addStudentToDatabase(String stname, String fname, String dob, String bform, boolean gender1, boolean gender2, String stmobile, String fcnic, String fmobile, String program, int Package, int firstinstallment, int  matricrollno, String dateodadmission, int matricmarks, String admissionby, String approachedby, String enteredby,String status) {
    
        
        Student student=null;    
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/user?useSSL=false", "root", "ahmad1122");
    
            String sql = "INSERT INTO student (stname,FName,DOB,BForm,gender,StMobile,FCNIC,FMobile,Program,Package,FirstInstallment,MatricRoll,DateOfAdmission,MatricMarks,AdmissionBy,ApproachedBy,EnteredBy,Status)" +
                         "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
          
            preparedStatement.setString(1, stname);
            preparedStatement.setString(2, fname);
            preparedStatement.setString(3, dob);
            preparedStatement.setString(4, bform);

            String Gender=null;
            if(gender1==true)
            {
                Gender="Male";
            }
            else if(gender2==true)
            {
                Gender="Female";
            }
            preparedStatement.setString(5, Gender);
            preparedStatement.setString(6, stmobile);
            preparedStatement.setString(7, fcnic);
            preparedStatement.setString(8, fmobile);
            preparedStatement.setString(9, program);
            preparedStatement.setInt(10, Package);
            preparedStatement.setInt(11, firstinstallment);
            preparedStatement.setInt(12, matricrollno);
            preparedStatement.setString(13, dateodadmission);
            preparedStatement.setInt(14, matricmarks);
            preparedStatement.setString(15, admissionby);
            preparedStatement.setString(16, approachedby);
            preparedStatement.setString(17, enteredby);
            preparedStatement.setString(18, status);

            int addrows = preparedStatement.executeUpdate();

            if (addrows>0) {
                student = new Student();
                student.StName = stname;
                student.FatherName =fname;
            }

            //stmt.close();
            conn.close();

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Something went wrong!");
        }


    return student;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdmissionBytf;
    private javax.swing.JTextField AdmissionDatetf;
    private javax.swing.JTextField ApproachedBytf;
    private javax.swing.JTextField BFormtf;
    private javax.swing.JButton Cancelbtn;
    private javax.swing.JTextField DOB;
    private javax.swing.JTextField EnteredBytf;
    private javax.swing.JTextField FatherCNICtf;
    private javax.swing.JTextField FatherMobiletf;
    private javax.swing.JTextField FatherNametf;
    private javax.swing.JRadioButton FemaleCheck;
    private javax.swing.JTextField FirstInstallmenttf;
    private javax.swing.JPanel Jpanel;
    private javax.swing.JRadioButton Malecheck;
    private javax.swing.JTextField MatricMarkstf;
    private javax.swing.JTextField MatricRolltf;
    private javax.swing.JTextField Packagetf;
    private javax.swing.JTextField Programtf;
    private javax.swing.JButton Registerbtn;
    private javax.swing.JTextField Statustf;
    private javax.swing.JTextField StudentMobiletf;
    private javax.swing.JTextField StudentNametf;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
