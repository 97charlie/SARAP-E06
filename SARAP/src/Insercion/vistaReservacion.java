/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Insercion;

/**
 *
 * @author MS
 */
public class vistaReservacion extends javax.swing.JFrame {

    /**
     * Creates new form vistaReservacion
     */
    public vistaReservacion() {
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

        jLabel1 = new javax.swing.JLabel();
        AgregarButton = new javax.swing.JButton();
        EliminarButton = new javax.swing.JButton();
        LimpiarButton = new javax.swing.JButton();
        OrigenTextField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        DestinoTextField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        DiaSalidaTextField = new javax.swing.JTextField();
        mesSalidaTextField = new javax.swing.JTextField();
        anioSalidaTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        anioRegresoTextField = new javax.swing.JTextField();
        mesRegresoTextField = new javax.swing.JTextField();
        diaRegresoTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        minutosTextField = new javax.swing.JTextField();
        horasTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ViajesTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        CerrarSesionButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(480, 600));
        setSize(new java.awt.Dimension(480, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Viajes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 250, 80, 30);

        AgregarButton.setText("Agregar");
        getContentPane().add(AgregarButton);
        AgregarButton.setBounds(20, 210, 79, 25);

        EliminarButton.setText("Eliminar");
        getContentPane().add(EliminarButton);
        EliminarButton.setBounds(110, 210, 79, 25);

        LimpiarButton.setText("Limpiar");
        getContentPane().add(LimpiarButton);
        LimpiarButton.setBounds(200, 210, 75, 25);

        OrigenTextField.setToolTipText("");
        getContentPane().add(OrigenTextField);
        OrigenTextField.setBounds(20, 80, 90, 22);

        jLabel20.setText("Origen");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(50, 60, 40, 16);

        DestinoTextField.setToolTipText("");
        getContentPane().add(DestinoTextField);
        DestinoTextField.setBounds(130, 80, 90, 22);

        jLabel21.setText("Destino");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(150, 60, 50, 16);

        DiaSalidaTextField.setToolTipText("");
        getContentPane().add(DiaSalidaTextField);
        DiaSalidaTextField.setBounds(20, 160, 40, 22);

        mesSalidaTextField.setToolTipText("");
        getContentPane().add(mesSalidaTextField);
        mesSalidaTextField.setBounds(60, 160, 40, 22);

        anioSalidaTextField.setToolTipText("");
        getContentPane().add(anioSalidaTextField);
        anioSalidaTextField.setBounds(100, 160, 60, 22);

        jLabel9.setText("Fecha salida");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 140, 80, 16);

        anioRegresoTextField.setToolTipText("");
        getContentPane().add(anioRegresoTextField);
        anioRegresoTextField.setBounds(260, 160, 60, 22);

        mesRegresoTextField.setToolTipText("");
        getContentPane().add(mesRegresoTextField);
        mesRegresoTextField.setBounds(220, 160, 40, 22);

        diaRegresoTextField.setToolTipText("");
        getContentPane().add(diaRegresoTextField);
        diaRegresoTextField.setBounds(180, 160, 40, 22);

        jLabel10.setText("Fecha regreso");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(190, 140, 90, 16);

        minutosTextField.setToolTipText("");
        getContentPane().add(minutosTextField);
        minutosTextField.setBounds(390, 160, 40, 22);

        horasTextField.setToolTipText("");
        getContentPane().add(horasTextField);
        horasTextField.setBounds(350, 160, 40, 22);

        jLabel17.setText("Hora Llegada");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(350, 140, 80, 20);

        ViajesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Origen", "Destino", "Salida", "Llegada", "Precio", "Marca"
            }
        ));
        jScrollPane1.setViewportView(ViajesTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 290, 430, 240);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Reservacion");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 150, 30);

        CerrarSesionButton.setText("Cerrar Sesión");
        getContentPane().add(CerrarSesionButton);
        CerrarSesionButton.setBounds(320, 20, 130, 25);

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
            java.util.logging.Logger.getLogger(vistaReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaReservacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AgregarButton;
    public javax.swing.JButton CerrarSesionButton;
    public javax.swing.JTextField DestinoTextField;
    public javax.swing.JTextField DiaSalidaTextField;
    public javax.swing.JButton EliminarButton;
    public javax.swing.JButton LimpiarButton;
    public javax.swing.JTextField OrigenTextField;
    public javax.swing.JTable ViajesTable;
    public javax.swing.JTextField anioRegresoTextField;
    public javax.swing.JTextField anioSalidaTextField;
    public javax.swing.JTextField diaRegresoTextField;
    public javax.swing.JTextField horasTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField mesRegresoTextField;
    public javax.swing.JTextField mesSalidaTextField;
    public javax.swing.JTextField minutosTextField;
    // End of variables declaration//GEN-END:variables
}
