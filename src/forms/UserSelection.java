package scdproject_2;
import javax.swing.JFrame;

public class UserSelection extends javax.swing.JFrame
{
    public UserSelection()
    {
         initComponents();
         setBounds(0,0,680,500);
         setTitle("User Seletion");
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        Adminbtn = new javax.swing.JButton();
        OfficeBoybtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Adminbtn.setBackground(new java.awt.Color(44, 62, 80));
        Adminbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Adminbtn.setForeground(new java.awt.Color(255, 255, 255));
        Adminbtn.setText("Admin");
        Adminbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Adminbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Adminbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Adminbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 138, 139, 54));

        OfficeBoybtn.setBackground(new java.awt.Color(44, 62, 80));
        OfficeBoybtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        OfficeBoybtn.setForeground(new java.awt.Color(255, 255, 255));
        OfficeBoybtn.setText("Office Boy");
        OfficeBoybtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        OfficeBoybtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OfficeBoybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OfficeBoybtnActionPerformed(evt);
            }
        });
        jPanel1.add(OfficeBoybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 138, 139, 55));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select User");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 649, 114));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hassan\\Downloads\\selecting-user-vector-10551826.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OfficeBoybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OfficeBoybtnActionPerformed
      // MainPanel mp=new MainPanel();
        OfficeBoyLogin obl=new OfficeBoyLogin();
        
        
    }//GEN-LAST:event_OfficeBoybtnActionPerformed

    private void AdminbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminbtnActionPerformed
        // TODO add your handling code here:
        AdminLogin ALogin=new AdminLogin();
    }//GEN-LAST:event_AdminbtnActionPerformed

     
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
            java.util.logging.Logger.getLogger(UserSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adminbtn;
    private javax.swing.JButton OfficeBoybtn;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
