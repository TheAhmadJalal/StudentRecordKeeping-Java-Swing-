package internal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Frame4_deleteRecord extends javax.swing.JInternalFrame {

 
    
    public Frame4_deleteRecord() {
        initComponents();
     
       showRecord();
       setBounds(350,0,700,700);
    }
    public boolean action(int no)
    {
             //  showRecord();
               int check=viewTable.getRowCount();
               if(no>check)
                   return false;
               
        int i=no;
        TableModel tm=viewTable.getModel();
          try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/user?useSSL=false", "root", "ahmad1122");
            String bform=tm.getValueAt(i,3).toString();

            String sql = "DELETE FROM student WHERE BForm='"+bform+"'" ;

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
        
            
            preparedStatement.executeUpdate();

            String stname=tm.getValueAt(i,0).toString();
            String fname=tm.getValueAt(i,1).toString();
            String dob=tm.getValueAt(i,2).toString();

            String stmobile=tm.getValueAt(i,4).toString();
            String fcnic=tm.getValueAt(i,5).toString();
            String fmobile=tm.getValueAt(i,6).toString();
            String program=tm.getValueAt(i,7).toString();
            String _package=tm.getValueAt(i,8).toString();
            String firstinstallment=tm.getValueAt(i,9).toString();
            String matricrollno=tm.getValueAt(i,10).toString();
            String dateodadmission=tm.getValueAt(i,11).toString();
            String matricmarks=tm.getValueAt(i,12).toString();
            String admissionby=tm.getValueAt(i,13).toString();
            String approachedby=tm.getValueAt(i,14).toString();
            String enteredby=tm.getValueAt(i,15).toString();
            String status=tm.getValueAt(i,16).toString();
            String gender1=tm.getValueAt(i,17).toString();
            conn.close();
            DefaultTableModel tbmodel=(DefaultTableModel)viewTable.getModel();
            tbmodel.setRowCount(0);
            showRecord();
           int check2= viewTable.getRowCount();
           if(check2==check-1)
               return true;
           else
               return false;
        }
        

        catch(Exception e)
        {
            e.printStackTrace();
        }
          return true;
    }
    public  void showRecord()
    {
          try{
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

        String tbData[]={stname,FName,DOB,BForm,StMobile,FCNIC,FMobile,
      Program,Package,FirstInstallment,MatricRoll,DateOfAdmission ,MatricMarks,
        AdmissionBy,ApproachedBy,EnteredBy,Status,gender};
        
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
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Delete Record");
        setOpaque(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(isOpaque());

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Delete");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createCompoundBorder()));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

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
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewTable.setAutoResizeMode(0);
        viewTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(viewTable);

        jScrollPane1.setViewportView(jScrollPane2);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 42)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Delete a Record");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 119, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int i=viewTable.getSelectedRow();
        TableModel tm=viewTable.getModel();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/user?useSSL=false", "root", "ahmad1122");
            String bform=tm.getValueAt(i,3).toString();

            String sql = "DELETE FROM student WHERE BForm='"+bform+"'" ;

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            int ii= JOptionPane.showConfirmDialog(Frame4_deleteRecord.this, "Do You Want to Delete.","alert",JOptionPane.OK_CANCEL_OPTION );
if(ii==0)
{
            preparedStatement.executeUpdate();

            String stname=tm.getValueAt(i,0).toString();
            String fname=tm.getValueAt(i,1).toString();
            String dob=tm.getValueAt(i,2).toString();

            String stmobile=tm.getValueAt(i,4).toString();
            String fcnic=tm.getValueAt(i,5).toString();
            String fmobile=tm.getValueAt(i,6).toString();
            String program=tm.getValueAt(i,7).toString();
            String _package=tm.getValueAt(i,8).toString();
            String firstinstallment=tm.getValueAt(i,9).toString();
            String matricrollno=tm.getValueAt(i,10).toString();
            String dateodadmission=tm.getValueAt(i,11).toString();
            String matricmarks=tm.getValueAt(i,12).toString();
            String admissionby=tm.getValueAt(i,13).toString();
            String approachedby=tm.getValueAt(i,14).toString();
            String enteredby=tm.getValueAt(i,15).toString();
            String status=tm.getValueAt(i,16).toString();
            String gender1=tm.getValueAt(i,17).toString();
            conn.close();
            DefaultTableModel tbmodel=(DefaultTableModel)viewTable.getModel();
            tbmodel.setRowCount(0);
            showRecord();
        }
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable viewTable;
    // End of variables declaration//GEN-END:variables
}
