package scdproject_2;
 

/**
 *
 * @author Hassan
 */
 import internal.Edit_1;
import internal.Frame1_viewstd;
import internal.Frame2_addStudent;
 import internal.Frame4_deleteRecord;
import internal.Frame5_searchStudent;
import internal.Frame6_viewLeftedStudents;
import internal.Frame7_totalInstallment;
import internal.Frame8_SeperateGender;
//import internal.test;
import java.awt.BorderLayout;
import java.awt.Desktop;import java.awt.Desktop.Action.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class MainPanel extends javax.swing.JFrame {

    Frame2_addStudent frm2;
    Frame1_viewstd frm1;  
    Frame4_deleteRecord frm4;
    Frame5_searchStudent frm5;
    Frame6_viewLeftedStudents frm6;
      Frame7_totalInstallment frm7;
      Frame8_SeperateGender frm8;
    Edit_1 frm9;
//    test t;    

     public boolean Action()
     {
           if(frm1!=null)
           frm1.dispose();
        
        if(frm1==null||frm1.isClosed())
        {
                frm1=new Frame1_viewstd();      
               this.jPanel1.add(frm1,BorderLayout.CENTER);
                 frm1.setVisible(true);
//                    frm1.setLocation(400,400);
        }
        return frm1.action();
        
     }
     
      public boolean Action4()
     {
           if(frm6!=null)
           frm6.dispose();
        
        if(frm6==null||frm6.isClosed())
        {
                frm6=new  Frame6_viewLeftedStudents();      
               this.jPanel1.add(frm6,BorderLayout.CENTER);
                 frm6.setVisible(true); 
        }
        return frm6.action();
        
     }
      public boolean Action5()
     {
           if(frm7!=null)
           frm7.dispose();
        
        if(frm7==null||frm7.isClosed())
        {
                frm7=new  Frame7_totalInstallment();      
               this.jPanel1.add(frm7,BorderLayout.CENTER);
                 frm7.setVisible(true); 
        }
        return frm7.action();
        
     }
      public boolean Action6()
     {
           if(frm8!=null)
           frm8.dispose();
        
        if(frm8==null||frm8.isClosed())
        {
                frm8=new  Frame8_SeperateGender();      
               this.jPanel1.add(frm8,BorderLayout.CENTER);
                 frm8.setVisible(true); 
        }
        return frm8.action();
        
     }
       public boolean Action7(String stname, String fname, String dob, String bform,String gender, String stmobile, String fcnic, String fmobile, String program, int Package, int firstinstallment, int  matricrollno, String dateodadmission, int matricmarks, String admissionby, String approachedby, String enteredby,String status )
     {
           if(frm2!=null)
           frm2.dispose();
        
        if(frm2==null||frm2.isClosed())
        {
                frm2=new  Frame2_addStudent();      
               this.jPanel1.add(frm2,BorderLayout.CENTER);
                 frm2.setVisible(true); 
        }
        return frm2.action(stname, fname,  dob,  bform,  gender,  stmobile,  fcnic,  fmobile,  program,  Package,  firstinstallment,   matricrollno,  dateodadmission,  matricmarks,  admissionby,  approachedby,  enteredby, status);
        
     }
         public boolean Action8(String search,String stname, String fname,
                 String dob, String bform,String gender, String stmobile,
                 String fcnic, String fmobile, String program, int Package, 
                 int firstinstallment, int  matricrollno, String dateodadmission,
                 int matricmarks, String admissionby, String approachedby, 
                 String enteredby,String status )
     {
           if(frm9!=null)
           frm9.dispose();
        
        if(frm9==null||frm9.isClosed())
        {
                frm9=new  Edit_1();
               this.jPanel1.add(frm9,BorderLayout.CENTER);
                 frm9.setVisible(true); 
        }
        return frm9.action(search,stname, fname,  dob,  bform,  gender,  stmobile,  fcnic,  fmobile,  program,  Package,  firstinstallment,   matricrollno,  dateodadmission,  matricmarks,  admissionby,  approachedby,  enteredby, status);
        
     }

      public boolean Action2(String name)
     {
           if(frm5!=null)
           frm5.dispose();
        
        if(frm5==null||frm5.isClosed())
        {
                frm5=new Frame5_searchStudent();      
               this.jPanel1.add(frm5,BorderLayout.CENTER);
                 frm5.setVisible(true); 
        }
       return frm5.action(name);
       
     }
      
       public boolean Action3(int no)
     {
           if(frm4!=null)
           frm4.dispose();
        
        if(frm4==null||frm4.isClosed())
        {
                frm4=new Frame4_deleteRecord();      
               this.jPanel1.add(frm4,BorderLayout.CENTER);
                 frm4.setVisible(true); 
        }
       return frm4.action(no);
       
     }
    public MainPanel() {
        initComponents(); 
     setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Main Panel"); 
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AddStudentbtn = new javax.swing.JButton();
        ViewStudentbtn = new javax.swing.JButton();
        SearchStudentbtn = new javax.swing.JButton();
        DeleteStudentbtn = new javax.swing.JButton();
        EditRecordbtn = new javax.swing.JButton();
        ViewLeftedbtn = new javax.swing.JButton();
        SeperateGenderbtn = new javax.swing.JButton();
        TotalInstallmentbtn = new javax.swing.JButton();
        PortalLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(102, 255, 102));

        AddStudentbtn.setBackground(new java.awt.Color(44, 62, 80));
        AddStudentbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddStudentbtn.setForeground(new java.awt.Color(255, 255, 255));
        AddStudentbtn.setText("Add Student Record");
        AddStudentbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddStudentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentbtnActionPerformed(evt);
            }
        });

        ViewStudentbtn.setBackground(new java.awt.Color(44, 62, 80));
        ViewStudentbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewStudentbtn.setForeground(new java.awt.Color(255, 255, 255));
        ViewStudentbtn.setText("View All Students");
        ViewStudentbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewStudentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewStudentbtnActionPerformed(evt);
            }
        });

        SearchStudentbtn.setBackground(new java.awt.Color(44, 62, 80));
        SearchStudentbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SearchStudentbtn.setForeground(new java.awt.Color(255, 255, 255));
        SearchStudentbtn.setText("Search Student");
        SearchStudentbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchStudentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchStudentbtnActionPerformed(evt);
            }
        });

        DeleteStudentbtn.setBackground(new java.awt.Color(44, 62, 80));
        DeleteStudentbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DeleteStudentbtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteStudentbtn.setText("Delete Student Record");
        DeleteStudentbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteStudentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteStudentbtnActionPerformed(evt);
            }
        });

        EditRecordbtn.setBackground(new java.awt.Color(44, 62, 80));
        EditRecordbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditRecordbtn.setForeground(new java.awt.Color(255, 255, 255));
        EditRecordbtn.setText("Edit Record");
        EditRecordbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditRecordbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditRecordbtnActionPerformed(evt);
            }
        });

        ViewLeftedbtn.setBackground(new java.awt.Color(44, 62, 80));
        ViewLeftedbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewLeftedbtn.setForeground(new java.awt.Color(255, 255, 255));
        ViewLeftedbtn.setText("View Lefted Student");
        ViewLeftedbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewLeftedbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewLeftedbtnActionPerformed(evt);
            }
        });

        SeperateGenderbtn.setBackground(new java.awt.Color(44, 62, 80));
        SeperateGenderbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SeperateGenderbtn.setForeground(new java.awt.Color(255, 255, 255));
        SeperateGenderbtn.setText("Seperate Gender");
        SeperateGenderbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SeperateGenderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeperateGenderbtnActionPerformed(evt);
            }
        });

        TotalInstallmentbtn.setBackground(new java.awt.Color(44, 62, 80));
        TotalInstallmentbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TotalInstallmentbtn.setForeground(new java.awt.Color(255, 255, 255));
        TotalInstallmentbtn.setText("Total Installment");
        TotalInstallmentbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TotalInstallmentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalInstallmentbtnActionPerformed(evt);
            }
        });

        PortalLabel.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        PortalLabel.setForeground(new java.awt.Color(51, 51, 51));
        PortalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PortalLabel.setText("Welcome to OfficeBoy Portal ");
        PortalLabel.setAlignmentX(0.9F);
        PortalLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PortalLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EditRecordbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchStudentbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddStudentbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(TotalInstallmentbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SeperateGenderbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteStudentbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(ViewLeftedbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewStudentbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PortalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PortalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddStudentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewStudentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchStudentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteStudentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditRecordbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewLeftedbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeperateGenderbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalInstallmentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddStudentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentbtnActionPerformed
             if(frm2!=null)
           frm2.dispose();
        
        if(frm2==null||frm2.isClosed()){
                frm2=new Frame2_addStudent();
              
              
               this.jPanel1.add(frm2,BorderLayout.CENTER);
                
                 frm2.setVisible(true);
          
//                AddStudent addStudent=new AddStudent();
        }
        else
        {
//           frm.setVisible(true);
        }
     
        
    }//GEN-LAST:event_AddStudentbtnActionPerformed

     
    
    private void EditRecordbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditRecordbtnActionPerformed
        // TODO add your handling code here:
         if(frm9!=null)
           frm9.dispose();
        
        if(frm9==null||frm9.isClosed())
        {
                frm9=new Edit_1();                
                jPanel1.add(frm9,BorderLayout.CENTER);
                frm9.setVisible(true);
            
        }
       
       
    }//GEN-LAST:event_EditRecordbtnActionPerformed

    private void SeperateGenderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeperateGenderbtnActionPerformed
        // TODO add your handling code here:
        if(frm8!=null)
           frm8.dispose();
        
        if(frm8==null||frm8.isClosed()){
                frm8=new Frame8_SeperateGender();
              
                jPanel1.add(frm8,BorderLayout.CENTER);
                frm8.setVisible(true);
           
//                AddStudent addStudent=new AddStudent();
        }
        
    }//GEN-LAST:event_SeperateGenderbtnActionPerformed

    private void ViewStudentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewStudentbtnActionPerformed
       
        if(frm1!=null)
           frm1.dispose();
        
        if(frm1==null||frm1.isClosed()){
                frm1=new Frame1_viewstd();
              
                jPanel1.add(frm1,BorderLayout.CENTER);
                frm1.setVisible(true);
           
//                AddStudent addStudent=new AddStudent();
        }
        else
        {
//           frm.setVisible(true);
        }
    }//GEN-LAST:event_ViewStudentbtnActionPerformed

    private void SearchStudentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchStudentbtnActionPerformed
       
//        SearchRecord searchRecord =new SearchRecord();
 if(frm5!=null)
           frm5.dispose();
        
        if(frm5==null||frm5.isClosed()){
                frm5=new Frame5_searchStudent();
              
            
                jPanel1.add(frm5,BorderLayout.CENTER);
             
//                frm5.setVisible(true);
                
        }
        else
        {
//           frm.setVisible(true);
        }
                
    }//GEN-LAST:event_SearchStudentbtnActionPerformed

    private void ViewLeftedbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewLeftedbtnActionPerformed
      //  viewLeftedStudent vls=new viewLeftedStudent();        
          if(frm6!=null)
           frm6.dispose();
        
        if(frm6==null||frm6.isClosed())
        {
                frm6=new Frame6_viewLeftedStudents();
              
                jPanel1.add(frm6,BorderLayout.CENTER);

            
        }
        else
        {
//           frm.setVisible(true);
        }
        
        
    }//GEN-LAST:event_ViewLeftedbtnActionPerformed

    private void DeleteStudentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteStudentbtnActionPerformed
        // TODO add your handling code here:
//        DeleteStudent d=new DeleteStudent();
  if(frm4!=null)
           frm4.dispose();
        
        if(frm4==null||frm4.isClosed()){
                frm4=new Frame4_deleteRecord();
              
                jPanel1.add(frm4,BorderLayout.CENTER);
                frm4.setVisible(true);
            
        }
        else
        {
//           frm.setVisible(true);
        }
        
    }//GEN-LAST:event_DeleteStudentbtnActionPerformed

    private void TotalInstallmentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalInstallmentbtnActionPerformed
        // TODO add your handling code here:
         if(frm7!=null)
           frm7.dispose();
        
        if(frm7==null||frm7.isClosed()){
                frm7=new Frame7_totalInstallment();
              
                jPanel1.add(frm7,BorderLayout.CENTER);
                frm7.setVisible(true);
            
        }
        else
        {
//           frm.setVisible(true);
        }
        
        
    }//GEN-LAST:event_TotalInstallmentbtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStudentbtn;
    private javax.swing.JButton DeleteStudentbtn;
    private javax.swing.JButton EditRecordbtn;
    private javax.swing.JLabel PortalLabel;
    private javax.swing.JButton SearchStudentbtn;
    private javax.swing.JButton SeperateGenderbtn;
    private javax.swing.JButton TotalInstallmentbtn;
    private javax.swing.JButton ViewLeftedbtn;
    private javax.swing.JButton ViewStudentbtn;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
