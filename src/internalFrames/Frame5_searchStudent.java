/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package internal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hassan
 */
public class Frame5_searchStudent extends javax.swing.JInternalFrame {

    /**
     * Creates new form Frame5_searchStudent
     */
    public Frame5_searchStudent() {
        initComponents();
     
        showRecord();
        setBounds(350,0,700,700);
  
         //setVisible(true);
    }
    public boolean action(String name)
    {
        
        DefaultTableModel model = (DefaultTableModel) StudentRecordTable.getModel();
        model.setRowCount(0);

         try
        {
            SearchField.setText(name);
            String searchStr= SearchField.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/user?useSSL=false", "root", "ahmad1122");
            String sql = "Select * from student where stname ='"+searchStr+"' ";
            PreparedStatement pst = conn.prepareStatement(sql);
//            pst.setString(1,searchStr);
            ResultSet rs=pst.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();
           
               
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

        String tbData[]={stname,FName,DOB,BForm,gender,StMobile,FCNIC,FMobile,
      Program,Package,FirstInstallment,MatricRoll,DateOfAdmission ,MatricMarks,
        AdmissionBy,ApproachedBy,EnteredBy,Status};
        
        DefaultTableModel tbmodel=(DefaultTableModel)StudentRecordTable.getModel();
        tbmodel.addRow(tbData);
}
                conn.close();
            if(StudentRecordTable.getRowCount()!=0)
            { 
                return true;
            }
            else 
                return false;
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
         return false;
    }
    
 public void showRecord()
    {
         try
         {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/user?useSSL=false", "root", "ahmad1122");
          String sql = "Select * from student";
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

        String tbData[]={stname,FName,DOB,BForm,gender,StMobile,FCNIC,FMobile,
      Program,Package,FirstInstallment,MatricRoll,DateOfAdmission ,MatricMarks,
        AdmissionBy,ApproachedBy,EnteredBy,Status};
        
        DefaultTableModel tbmodel=(DefaultTableModel)StudentRecordTable.getModel();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StudentRecordTable = new javax.swing.JTable();
        SearchField = new javax.swing.JTextField();
        Searchbtn = new javax.swing.JButton();

        setClosable(true);
        setTitle("Search Record");
        setEnabled(isOpaque());
        setFocusCycleRoot(false);
        setFocusable(false);
        setOpaque(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 42)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search a Record");
        jLabel1.setToolTipText("");

        StudentRecordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "FatherName", "DOB", "BFormNo", "Student Mobile ", "Father CNIC", "Father Mobile", "Program", "Package", "First Installment", "Matric Roll No", "Matric Marks", "Date of Admission", "Admission By", "Approached By", "Entered By", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StudentRecordTable.setAutoResizeMode(0);
        StudentRecordTable.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(StudentRecordTable);

        Searchbtn.setBackground(new java.awt.Color(44, 62, 80));
        Searchbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Searchbtn.setForeground(new java.awt.Color(255, 255, 255));
        Searchbtn.setText("Search");
        Searchbtn.setBorder(new javax.swing.border.MatteBorder(null));
        Searchbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(Searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) StudentRecordTable.getModel();
        model.setRowCount(0);

        try
        {

            String searchStr= SearchField.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/user?useSSL=false", "root", "ahmad1122");
            String sql = "Select * from student where stname =?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,searchStr);
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

                String tbData[]={stname,FName,DOB,BForm,gender,StMobile,FCNIC,FMobile,
                    Program,Package,FirstInstallment,MatricRoll,DateOfAdmission ,MatricMarks,
                    AdmissionBy,ApproachedBy,EnteredBy,Status};

                DefaultTableModel tbmodel=(DefaultTableModel)StudentRecordTable.getModel();
                tbmodel.addRow(tbData);
            }
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }//GEN-LAST:event_SearchbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SearchField;
    private javax.swing.JButton Searchbtn;
    private javax.swing.JTable StudentRecordTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
