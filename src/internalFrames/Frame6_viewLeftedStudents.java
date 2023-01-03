/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package internal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hassan
 */
public class Frame6_viewLeftedStudents extends javax.swing.JInternalFrame {

    /**
     * Creates new form Frame6_viewLeftedStudents
     */
    public Frame6_viewLeftedStudents() {
        initComponents();
        showRecord();
        setBounds(350,0,700,700);
        
    }
    public  void showRecord()
    {
        String status_="lefted";
          try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/user?useSSL=false", "root", "ahmad1122");
           String sql = "Select * from student where status='"+status_+"'";
          PreparedStatement pst = conn.prepareStatement(sql);
          ResultSet rs=pst.executeQuery();
       
while(rs.next())
{
        String stname=rs.getString("stname");
        String FName=rs.getString("FName");
        String DOB=rs.getString("DOB");
        String BForm=rs.getString("BForm");
        String gender=rs.getString("gender");
        String StMobile=rs.getString("StMobile");
        String FCNIC=rs.getString("FCNIC");
        String FMobile=rs.getString("FMobile");
        String Program=rs.getString("Program");
        String Package=rs.getString("Package");
        String FirstInstallment=rs.getString("FirstInstallment");
        String MatricRoll=rs.getString("MatricRoll");
        String DateOfAdmission=rs.getString("DateOfAdmission");
        String MatricMarks=rs.getString("MatricMarks");
        String AdmissionBy=rs.getString("AdmissionBy");
        String ApproachedBy=rs.getString("ApproachedBy");
        String EnteredBy=rs.getString("EnteredBy");
        String Status=rs.getString("Status");

      String tbData[]= {stname,FName,DOB,BForm,StMobile,FCNIC,FMobile,
      Program,Package,FirstInstallment,MatricRoll,DateOfAdmission ,MatricMarks,
      AdmissionBy,ApproachedBy,EnteredBy,Status,gender};
     
     //   String []a={"ali","ahmad","ali","ahmad","ali","ahmad","ali","ahmad","ali","ahmad","ali","ahmad","ali","ahmad","ali","ahmad","ali","ahmad"};
       
     DefaultTableModel tbmodel=(DefaultTableModel)viewTable.getModel();
     tbmodel.addRow(tbData);

}
                conn.close();
            
            
        }
        catch(Exception e)
                {
                    e.printStackTrace();
                }
    }
  
     public boolean action()
      {
          showRecord();
          if(viewTable.getRowCount()!=0)
          {
          return true;
          }
        
            return false;
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();

        setClosable(true);
        setOpaque(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Lefted Student Record");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel1)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "FatherName", "DOB", "BFormNo", "Student Mobile ", "Father CNIC", "Father Mobile", "Program", "Package", "First Installment", "Matric Roll No", "Matric Marks", "Date of Admission", "Admission By", "Approached By", "Entered By", "Status", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewTable.setAutoResizeMode(0);
        viewTable.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(viewTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable viewTable;
    // End of variables declaration//GEN-END:variables
}
