/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Insercion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rudynsky
 */
public class Login extends javax.swing.JFrame {
    private File fichero; // Fichero con el que vamos a trabajar

    /**
     * Creates new form Login
     */
    public Login() {
        
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

        jLabelUsr = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        passTextField = new javax.swing.JTextField();
        IngresarButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RegistrarButton = new javax.swing.JButton();
        apeTextField = new javax.swing.JTextField();
        jLabelEmail1 = new javax.swing.JLabel();
        jLabelUsr1 = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        emailRegistrarTextField = new javax.swing.JTextField();
        jLabelEmail2 = new javax.swing.JLabel();
        jLabelUsr2 = new javax.swing.JLabel();
        passRegistrarTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelUsr.setText("Email");
        getContentPane().add(jLabelUsr);
        jLabelUsr.setBounds(38, 82, 70, 16);

        jLabelEmail.setText("Contraseña");
        getContentPane().add(jLabelEmail);
        jLabelEmail.setBounds(38, 124, 80, 16);
        getContentPane().add(EmailTextField);
        EmailTextField.setBounds(131, 79, 281, 22);
        getContentPane().add(passTextField);
        passTextField.setBounds(131, 121, 281, 22);

        IngresarButton.setText("Ingresar");
        getContentPane().add(IngresarButton);
        IngresarButton.setBounds(210, 160, 83, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setText("Inicio de sesión");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(156, 13, 187, 29);

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Book", 3, 14)); // NOI18N
        jLabel3.setText("¿No, cuentas con un usuario?");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 210, 209, 16);

        RegistrarButton.setText("Registrarse");
        getContentPane().add(RegistrarButton);
        RegistrarButton.setBounds(210, 440, 97, 25);
        getContentPane().add(apeTextField);
        apeTextField.setBounds(130, 300, 281, 22);

        jLabelEmail1.setText("Apellidos");
        getContentPane().add(jLabelEmail1);
        jLabelEmail1.setBounds(30, 300, 70, 16);

        jLabelUsr1.setText("Nombres");
        getContentPane().add(jLabelUsr1);
        jLabelUsr1.setBounds(30, 260, 70, 16);
        getContentPane().add(nombreTextField);
        nombreTextField.setBounds(130, 250, 281, 22);
        getContentPane().add(emailRegistrarTextField);
        emailRegistrarTextField.setBounds(130, 400, 281, 22);

        jLabelEmail2.setText("Email");
        getContentPane().add(jLabelEmail2);
        jLabelEmail2.setBounds(30, 400, 70, 16);

        jLabelUsr2.setText("Contraseña");
        getContentPane().add(jLabelUsr2);
        jLabelUsr2.setBounds(30, 360, 90, 16);
        getContentPane().add(passRegistrarTextField);
        passRegistrarTextField.setBounds(130, 350, 281, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField EmailTextField;
    public javax.swing.JButton IngresarButton;
    public javax.swing.JButton RegistrarButton;
    public javax.swing.JTextField apeTextField;
    public javax.swing.JTextField emailRegistrarTextField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEmail1;
    private javax.swing.JLabel jLabelEmail2;
    private javax.swing.JLabel jLabelUsr;
    private javax.swing.JLabel jLabelUsr1;
    private javax.swing.JLabel jLabelUsr2;
    public javax.swing.JTextField nombreTextField;
    public javax.swing.JTextField passRegistrarTextField;
    public javax.swing.JTextField passTextField;
    // End of variables declaration//GEN-END:variables
}
