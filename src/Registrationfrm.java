
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import server.DBConnection;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Registrationfrm extends javax.swing.JFrame {
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    /**
     * Creates new form Registrationfrm
     */
    public Registrationfrm() {
        initComponents();
        con = DBConnection.Connect();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        txtMName = new javax.swing.JTextField();
        txtSName = new javax.swing.JTextField();
        dcsBDay = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spnAge = new javax.swing.JSpinner();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        rdOthers = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        cbxRole = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtCPassword = new javax.swing.JPasswordField();
        btnClear = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(16, 64, 79));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 755, 90));

        jLabel2.setText("First Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 89, 26));

        jLabel3.setText("Surname");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 89, 26));

        jLabel4.setText("Middle Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 89, 26));
        getContentPane().add(txtFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 117, 29));

        txtMName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtMName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 117, 29));
        getContentPane().add(txtSName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 117, 29));
        getContentPane().add(dcsBDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 134, -1));

        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        jLabel6.setText("Birth Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jLabel7.setText("Age");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));
        getContentPane().add(spnAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 99, -1));

        buttonGroup1.add(rdMale);
        rdMale.setText("Male");
        getContentPane().add(rdMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        buttonGroup1.add(rdFemale);
        rdFemale.setText("Female");
        getContentPane().add(rdFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        buttonGroup1.add(rdOthers);
        rdOthers.setText("others");
        getContentPane().add(rdOthers, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        jLabel8.setText("Role");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        jLabel9.setText("Address");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 289, -1));

        cbxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Head dept", "Manager", "Regular" }));
        cbxRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRoleActionPerformed(evt);
            }
        });
        getContentPane().add(cbxRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 157, -1));

        jLabel12.setText("Password");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 88, -1));

        jLabel13.setText("Confirm Password");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 112, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Log In Credentials");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 750, 43));

        jLabel11.setText("Email");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 88, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 146, -1));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 164, -1));
        getContentPane().add(txtCPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 143, -1));

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 136, 35));

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 186, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMNameActionPerformed

    private void cbxRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxRoleActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String firstName = txtFName.getText();
        String lastName = txtSName.getText();
        String middleName = txtMName.getText();
        String address = txtAddress.getText();
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        String confirmPassword = txtCPassword.getText();
        int age = (int) spnAge.getValue();
        
        if(password.equals(confirmPassword)){
            try{

        //      BIRTHDAY
                Date birthday = dcsBDay.getDate();
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
                String userBirhDay = dateFormat.format(birthday);

        //        RADIO BUTTON
                rdFemale.setActionCommand("Female");
                rdMale.setActionCommand("Male");
                rdOthers.setActionCommand("Other");

                String gender = buttonGroup1.getSelection().getActionCommand();
        //        ComboBOX
                String role = (String) cbxRole.getSelectedItem();

                try {
                    String sql = "insert into useraccount"
                    +"(Firstname, Middlename, Surname, Age, Gender, Address, Roles, Username, Password, Birthday) "
                    + "values (?,?,?,?,?,?,?,?,?,?)";
                    ps = con.prepareStatement(sql);
                    ps.setString(1, firstName);
                    ps.setString(2, middleName);
                    ps.setString(3, lastName);
                    ps.setInt(4, age);
                    ps.setString(5, gender);
                    ps.setString(6, address);
                    ps.setString(7, role);
                    ps.setString(8, email);
                    ps.setString(9, confirmPassword);
                    ps.setString(10, userBirhDay);
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "RECORD SUCCESSFULLY ADDED");
                    LogInfrm login = new LogInfrm();
                    login.setVisible(true);
                    this.dispose();
                    ps.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Please, Complete the user information");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Password doesnt match");
        }
        
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       txtFName.setText("");
       txtSName.setText("");
       txtMName.setText("");
       txtAddress.setText("");
       txtEmail.setText("");
       txtPassword.setText("");
       txtCPassword.getText();
       spnAge.setValue(0);
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(Registrationfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrationfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrationfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrationfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRegister;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxRole;
    private com.toedter.calendar.JDateChooser dcsBDay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JRadioButton rdOthers;
    private javax.swing.JSpinner spnAge;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JPasswordField txtCPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtMName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSName;
    // End of variables declaration//GEN-END:variables
}