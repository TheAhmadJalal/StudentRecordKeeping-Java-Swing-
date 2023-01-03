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
public class Frame8_SeperateGender extends javax.swing.JInternalFrame {

    /**
     * Creates new form Frame8_SeperateGender
     */
    public Frame8_SeperateGender() {
        initComponents();
        showMale();
        showFemale();
        setBounds(350,0,700,700);
    }
    
    public boolean action()
    {
        if(viewTable.getRowCount()!=0 && viewTable1.getRowCount()!=0)
            return true;
        
        return false;
    }
    public  void showMale()
    {
        String male="Male";
          try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/user?useSSL=false", "root", "ahmad1122");
           String sql = "Select * from student where gender='"+male+"'";
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
        String P=rs.getString("Package");
        int Package=Integer.parseInt(P);
        String F=rs.getString("FirstInstallment");
        int FirstInstallment=Integer.parseInt(F);
        
        String M=rs.getString("MatricRoll");
        int MatricRoll=Integer.parseInt(M);
        
        String DateOfAdmission=rs.getString("DateOfAdmission");
        String matricmarks=rs.getString("MatricMarks");
        int MatricMarks=Integer.parseInt(matricmarks);
               
        String AdmissionBy=rs.getString("AdmissionBy");
        String ApproachedBy=rs.getString("ApproachedBy");
        String EnteredBy=rs.getString("EnteredBy");
        String Status=rs.getString("Status");

      Object tbData[]= {stname,FName,DOB,BForm,StMobile,FCNIC,FMobile,
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
    
    public  void showFemale()
    {
        String female="Female";
          try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/user?useSSL=false", "root", "ahmad1122");
           String sql = "Select * from student where gender='"+female+"'";
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
        String P=rs.getString("Package");
        int Package=Integer.parseInt(P);
        String F=rs.getString("FirstInstallment");
        int FirstInstallment=Integer.parseInt(F);
        
        String M=rs.getString("MatricRoll");
        int MatricRoll=Integer.parseInt(M);
        
        String DateOfAdmission=rs.getString("DateOfAdmission");
        String matricmarks=rs.getString("MatricMarks");
        int MatricMarks=Integer.parseInt(matricmarks);
               
        String AdmissionBy=rs.getString("AdmissionBy");
        String ApproachedBy=rs.getString("ApproachedBy");
        String EnteredBy=rs.getString("EnteredBy");
        String Status=rs.getString("Status");

      Object tbData[]= {stname,FName,DOB,BForm,StMobile,FCNIC,FMobile,
      Program,Package,FirstInstallment,MatricRoll,DateOfAdmission ,MatricMarks,
      AdmissionBy,ApproachedBy,EnteredBy,Status,gender};
     
     //   String []a={"ali","ahmad","ali","ahmad","ali","ahmad","ali","ahmad","ali","ahmad","ali","ahmad","ali","ahmad","ali","ahmad","ali","ahmad"};
       
     DefaultTableModel tbmodel=(DefaultTableModel)viewTable1.getModel();
     tbmodel.addRow(tbData);

}
                conn.close();
            
            
        }
        catch(Exception e)
                {
                    e.printStackTrace();
                }
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        viewTable1 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Seperate Gender");
        setOpaque(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Female");

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Male");

        viewTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        viewTable1.setAutoResizeMode(0);
        viewTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane3.setViewportView(viewTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(355, Short.MAX_VALUE)))
        );

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable viewTable;
    private javax.swing.JTable viewTable1;
    // End of variables declaration//GEN-END:variables
}
