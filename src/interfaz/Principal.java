/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Password;
import javax.swing.JOptionPane;

/**
 *
 * @author liborio
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    int l;
    Password c;
    String Contraseña;

    public Principal() {
        initComponents();
        cmdIngresar.setEnabled(true);
        cmdTipoS.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdCambiar.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        cmdIngresar = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdCambiar = new javax.swing.JButton();
        txtMContra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDContra = new javax.swing.JPasswordField();
        cmdTipoS = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtL = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("Digite Su Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        cmdIngresar.setText("Ingresar");
        cmdIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 80, -1));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        cmdCambiar.setText("Cambiar");
        cmdCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCambiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        txtMContra.setEditable(false);
        txtMContra.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtMContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 160, 60));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));
        jPanel1.add(txtDContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 130, -1));

        cmdTipoS.setText("TIpo De Seguridad");
        cmdTipoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTipoSActionPerformed(evt);
            }
        });
        jPanel1.add(cmdTipoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("Digite Su Longitud");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));
        jPanel1.add(txtL, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 321));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIngresarActionPerformed

        Password C;
        if (txtDContra.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite Su Contraseña", "Error", JOptionPane.ERROR_MESSAGE);
            txtDContra.requestFocusInWindow();
        } else {
            Contraseña = txtDContra.getText();
            l = Contraseña.length();
            C = new Password(l, Contraseña);
            JOptionPane.showMessageDialog(this, "Su Contraseña Ha Sido Guardada Correctamente");

        }
        cmdIngresar.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdCambiar.setEnabled(true);
        cmdTipoS.setEnabled(true);
        txtL.setEditable(false);
        txtDContra.setEditable(false);
    }//GEN-LAST:event_cmdIngresarActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed

        try {
            Password pass2;
            int longitud = 8;
            String pass;
            pass = txtDContra.getText();
            pass2 = new Password(longitud, pass);
            longitud = Integer.parseInt(txtL.getText());
            pass2.setLongitud(longitud);
            if (txtDContra.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por Favor No Deje Espacios Vacios", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtDContra.requestFocusInWindow();
            } else if (longitud != pass.length()) {
                JOptionPane.showMessageDialog(this, "La Contraseña No Coincide Con La Longitud", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                String A;
                txtMContra.setText("");
                A = txtDContra.getText();
                txtMContra.setText(A);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Campos Invalidos", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtDContra.setText("");
            txtL.setText("8");
            txtL.selectAll();
        }
        cmdIngresar.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdCambiar.setEnabled(true);
        cmdTipoS.setEnabled(false);
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCambiarActionPerformed

        Password pass2;
        int longitud = Integer.parseInt(txtL.getText());
        String pass;
        pass = txtDContra.getText();
        pass2 = new Password(longitud, pass);
        pass2.setContraseña(pass);
        if (txtDContra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por Favor No Deje Espacios Vacios", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtDContra.requestFocusInWindow();
        } else if (longitud != pass.length()) {
            JOptionPane.showMessageDialog(this, "La Contraseña No Coincide Con La Longitud", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtDContra.requestFocusInWindow();
        } else {
            JOptionPane.showMessageDialog(this, "Por Favor Digite Su Longitud Y Contraseña Nuevamente");
        }

        txtL.setEditable(true);
        txtDContra.setEditable(true);
        txtDContra.setText("");
        txtMContra.setText("");
        txtL.setText("");
        txtL.selectAll();
        cmdIngresar.setEnabled(true);
        cmdMostrar.setEnabled(false);
        cmdCambiar.setEnabled(false);
        cmdTipoS.setEnabled(false);
        txtL.requestFocusInWindow();


    }//GEN-LAST:event_cmdCambiarActionPerformed

    private void cmdTipoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTipoSActionPerformed

        try {
            Password pass2;
            int longitud = 8;
            String pass;
            pass = txtDContra.getText();
            pass2 = new Password(longitud, pass);
            longitud = Integer.parseInt(txtL.getText());
            pass2.setLongitud(longitud);
            if (txtDContra.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Campo vacío. Por favor llénelo", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtDContra.requestFocusInWindow();
            } else if (longitud != pass.length()) {
                JOptionPane.showMessageDialog(this, "La Contraseña No Coincide Con La Longitud", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (pass2.Fuerte()) {
                JOptionPane.showMessageDialog(this, "Su Contraseña  Es Fuerte");
            } else {
                JOptionPane.showMessageDialog(this, "Su Contraseña Es Debil");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Campos Invalidos", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtDContra.setText("");
            txtL.setText("8");
            txtL.selectAll();

        }
        cmdIngresar.setEnabled(false);
        cmdMostrar.setEnabled(true);
        cmdCambiar.setEnabled(true);
        cmdTipoS.setEnabled(false);

    }//GEN-LAST:event_cmdTipoSActionPerformed
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCambiar;
    private javax.swing.JButton cmdIngresar;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdTipoS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtDContra;
    private javax.swing.JTextField txtL;
    private javax.swing.JTextField txtMContra;
    // End of variables declaration//GEN-END:variables

    private void txtMContra(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
