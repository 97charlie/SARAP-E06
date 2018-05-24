package Insercion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Insertar extends javax.swing.JFrame {

    private File fichero; // Ruta del fichero a modificar
    private JFrame ventanaPadre; // Ventana anterior de trabajo
    private LinkedList destinosGuardar = new LinkedList();// Contraseñas a guardar en el archivo

    /**
     * Creates new form Insertar
     */
    public Insertar(JFrame jF, File f) {
        this.ventanaPadre = jF;
        this.fichero = f;
        this.ventanaPadre.setVisible(false);
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelPasswoed = new javax.swing.JLabel();
        JtextFieldClaveusr = new javax.swing.JTextField();
        JtextFieldBus = new javax.swing.JTextField();
        jTextFielDestino = new javax.swing.JTextField();
        jButtonAnadir = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneVer = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mis Password : Insercion.net");
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitulo.setText("NUEVAS RUTAS");

        jLabelNombre.setText("Clave de Usuario");

        jLabelUsuario.setText("Autobus de viaje");

        jLabelPasswoed.setText("Destino usuario");

        jButtonAnadir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAnadir.setText("Añadir");
        jButtonAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnadirActionPerformed(evt);
            }
        });

        jButtonLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jTextPaneVer.setEditable(false);
        jScrollPane2.setViewportView(jTextPaneVer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelUsuario)
                            .addComponent(jLabelPasswoed))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAnadir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(jButtonLimpiar))
                            .addComponent(JtextFieldClaveusr)
                            .addComponent(JtextFieldBus)
                            .addComponent(jTextFielDestino)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButtonCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonGuardar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabelTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelTitulo)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(JtextFieldClaveusr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(JtextFieldBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPasswoed)
                    .addComponent(jTextFielDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpiar)
                    .addComponent(jButtonAnadir))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonGuardar))
                .addGap(25, 25, 25))
        );

        setSize(new java.awt.Dimension(401, 521));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

        this.setVisible(false);
        ventanaPadre.setVisible(true);

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed

        // Limpiamos todos los campos
        JtextFieldClaveusr.setText("");
        JtextFieldBus.setText("");
        jTextFielDestino.setText("");

    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnadirActionPerformed

        String nuevoItem; // String con Clave, autobus y destino que queremos guardar

        // Si algun campo está vacio, mostramos un mensaje informando de que faltan datos
        if (JtextFieldClaveusr.getText().equals("") || JtextFieldBus.getText().equals("") || jTextFielDestino.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "ERROR: Faltan datos", "Mensaje de Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        nuevoItem = JtextFieldClaveusr.getText() + " " + JtextFieldBus.getText() + " " + jTextFielDestino.getText() + " \n";
        destinosGuardar.add(nuevoItem);
        jTextPaneVer.setText(jTextPaneVer.getText() + nuevoItem);
    }//GEN-LAST:event_jButtonAnadirActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

        BufferedWriter writer; //Para escribir en el fichero

        if (fichero == null) {
            //Activamos el filtro para que nos muestre, por defecto, los archivos de texto
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "txt");
            JFileChooser fileChooserGuardar = new JFileChooser();
            fileChooserGuardar.setFileFilter(filtro);
            fileChooserGuardar.setDialogTitle("Guardar");
            int seleccion = fileChooserGuardar.showSaveDialog(this);

            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = fileChooserGuardar.getSelectedFile();
                fileChooserGuardar.setFileSelectionMode(JFileChooser.FILES_ONLY);
                try {
                    writer = new BufferedWriter(new FileWriter(fichero + ".txt")); // Ponemos .txt para darle extension al archivo que creamos
                    while (!destinosGuardar.isEmpty()) {
                        writer.write(destinosGuardar.poll().toString());
                        writer.newLine();
                    }
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Error al guardar el archivo", "Error guardar archivo", JOptionPane.ERROR_MESSAGE);
                }

                JOptionPane.showMessageDialog(this, "El fichero de texto se ha guardado correctamente con los datos introducidos");
            }
        } else if (!(fichero == null)) // Añadimos al fichero existente
        {
            try {
                writer = new BufferedWriter(new FileWriter(fichero, true));
                while (!destinosGuardar.isEmpty()) {
                    writer.write(destinosGuardar.poll().toString());
                    writer.newLine();
                }
                writer.flush();
                writer.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al guardar el archivo", "Error guardar archivo", JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane.showMessageDialog(this, "El fichero de texto se ha guardado correctamente con los datos introducidos");
        } else {
            JOptionPane.showMessageDialog(this, "ERROR: Error al guardar", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }

        // Volvemos al menu principal
        this.setVisible(false);
        ventanaPadre.setVisible(true);
    }//GEN-LAST:event_jButtonGuardarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JtextFieldBus;
    private javax.swing.JTextField JtextFieldClaveusr;
    private javax.swing.JButton jButtonAnadir;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPasswoed;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFielDestino;
    private javax.swing.JTextPane jTextPaneVer;
    // End of variables declaration//GEN-END:variables
}