package com.poo.impuestovehicular.presentacion;

import com.poo.impuestovehicular.entidades.Administrador;
import com.poo.impuestovehicular.logica.LógicaAdministrador;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdministradorDlg extends javax.swing.JDialog {
    
    private LógicaAdministrador lógicaAdministrador;

    public AdministradorDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarRolCmbBx();
        lógicaAdministrador = new LógicaAdministrador();
    }
    
    private void cargarRolCmbBx() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        
        ArrayList<String> list = new ArrayList<String>();
        
        model.addElement("Administrador");
        model.addElement("Intermediario");
        
        rolCmbBx.setModel(model);
        rolCmbBx.setSelectedIndex(0);
    }

    private void cargarTabla() {
        DefaultTableModel model = new DefaultTableModel();

        administradoresTbl.setModel(model);

        model.addColumn("Identificación");
        model.addColumn("Nombres");
        model.addColumn("Primer apellido");
        model.addColumn("Segundo apellido");
        model.addColumn("Edad");

        for (Administrador c : lógicaAdministrador.obtenerTodas(false)) {
            model.addRow(new Object[]{
                c.getIdentificación(),
                c.getNombres(),
                c.getPrimerApellido(),
                c.getSegundoApellido(),
                c.getEdad()
            });
        }
    }

    private boolean validarDatos() {
        Boolean valid = true;

        if (identificaciónTxtFld.getText().isEmpty()) {
            identificaciónError.setText("La identificacion debe tener un valor");
            valid = false;
        }

        if (identificaciónTxtFld.getText().length() < 7 || identificaciónTxtFld.getText().length() < 10) {
            identificaciónError.setText("La identificación debe tener de 7 a 10 números");
            valid = false;
        }

        try {
            Integer.parseInt(identificaciónTxtFld.getText());
        } catch (NumberFormatException e) {
            identificaciónError.setText("La identificación solo debe contener números");
            valid = false;
        }

        if (nombresTxtFld.getText().isEmpty()) {
            nombresError.setText("EL nombre es inválido");
            valid = false;
        }

        if (primerApellidoTxtFld.getText().isEmpty()) {
            primerApellidoError.setText("El primer apellido es inválido");
            valid = false;
        }

        if (segundoApellidoTxtFld.getText().isEmpty()) {
            segundoApellidoError.setText("El segundo apellido es inválido");
            valid = false;
        }

        try {
            int edad = Integer.parseInt(edadTxtFld.getText());

            if (edad < 16 || edad > 100) {
                edadError.setText("La edad es inválida");
                valid = false;
            }
        } catch (NumberFormatException e) {
            edadError.setText("La edad deber se un número entre 16 y 100");
            valid = false;
        }

        return valid;
    }

    private void limpiarCampos() {
        identificaciónTxtFld.setText("");
        nombresTxtFld.setText("");
        primerApellidoTxtFld.setText("");
        segundoApellidoTxtFld.setText("");
        edadTxtFld.setText("");
        nombreUsuarioTxtFld.setText("");
    }

    private Administrador obtenerAdministrador() {
        Administrador c = new Administrador();

        c.setId(identificaciónTxtFld.getText());
        c.setIdentificación(identificaciónTxtFld.getText());
        c.setNombres(nombresTxtFld.getText());
        c.setPrimerApellido(primerApellidoTxtFld.getText());
        c.setSegundoApellido(segundoApellidoTxtFld.getText());
        c.setEdad(Integer.parseInt(edadTxtFld.getText()));
        c.setNombre("");
        c.setContraseña("");

        return c;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        identificaciónTxtFld = new javax.swing.JTextField();
        nombresError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombresTxtFld = new javax.swing.JTextField();
        identificaciónError = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        segundoApellidoTxtFld = new javax.swing.JTextField();
        nombreUsuarioTxtFld = new javax.swing.JTextField();
        primerApellidoError = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        segundoApellidoError = new javax.swing.JLabel();
        registrarBtn = new javax.swing.JButton();
        buscarBtn = new javax.swing.JButton();
        eliminarBtn = new javax.swing.JButton();
        edadError = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        modificarBtn = new javax.swing.JButton();
        edadTxtFld = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        primerApellidoTxtFld = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        administradoresTbl = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        rolCmbBx = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nombresError.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setText("Identificación");

        jLabel3.setText("Primer apellido");

        identificaciónError.setForeground(new java.awt.Color(255, 0, 0));

        jLabel6.setText("Nombre de usuario");

        nombreUsuarioTxtFld.setEnabled(false);

        primerApellidoError.setForeground(new java.awt.Color(255, 0, 0));

        jLabel4.setText("Segundo apellido");

        segundoApellidoError.setForeground(new java.awt.Color(255, 0, 0));

        registrarBtn.setText("Registrar");
        registrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBtnActionPerformed(evt);
            }
        });

        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        eliminarBtn.setText("Eliminar");
        eliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBtnActionPerformed(evt);
            }
        });

        edadError.setForeground(new java.awt.Color(255, 0, 0));

        jLabel7.setText("Nombres");

        modificarBtn.setText("Modificar");
        modificarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("Edad");

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        administradoresTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(administradoresTbl);

        jScrollPane2.setViewportView(jScrollPane3);

        jLabel9.setText("Rol");

        rolCmbBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(21, 21, 21)
                                .addComponent(identificaciónTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(45, 45, 45)
                                .addComponent(nombresTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(14, 14, 14)
                                .addComponent(primerApellidoTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edadTxtFld, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(segundoApellidoTxtFld, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(rolCmbBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nombresError, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(primerApellidoError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(segundoApellidoError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edadError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(identificaciónError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombreUsuarioTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modificarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registrarBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(identificaciónTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombresTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(primerApellidoTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(segundoApellidoTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edadTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(identificaciónError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombresError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(primerApellidoError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(segundoApellidoError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edadError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rolCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreUsuarioTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(buscarBtn)
                    .addComponent(modificarBtn)
                    .addComponent(eliminarBtn)
                    .addComponent(registrarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed
        if (lógicaAdministrador.obtener(identificaciónTxtFld.getText(), true) != null) {
            JOptionPane.showMessageDialog(this, "Este administador ya se encuentra registrado");
            return;
        }

        if (!validarDatos()) {
            return;
        }

        if (lógicaAdministrador.registrar(obtenerAdministrador())) {
            JOptionPane.showMessageDialog(this, "Registro de administrador exitoso");
            limpiarCampos();
            cargarTabla();
            return;
        }

        JOptionPane.showMessageDialog(this, "El registro de administrador falló");
    }//GEN-LAST:event_registrarBtnActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        Administrador c = lógicaAdministrador.obtener(identificaciónTxtFld.getText(), true);

        if (c == null) {
            JOptionPane.showMessageDialog(this, "Este administrador no está registrado");
            return;
        }

        nombresTxtFld.setText(c.getNombres());
        primerApellidoTxtFld.setText(c.getPrimerApellido());
        segundoApellidoTxtFld.setText(c.getSegundoApellido());
        edadTxtFld.setText(c.getEdad().toString());
        nombreUsuarioTxtFld.setText(c.getNombre());
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
        if (lógicaAdministrador.obtener(identificaciónTxtFld.getText(), false) == null) {
            JOptionPane.showMessageDialog(this, "El administrador no se encuentra registrado");
            return;
        }

        if (lógicaAdministrador.eliminar(identificaciónTxtFld.getText())) {
            JOptionPane.showMessageDialog(this, "El administrador se ha eliminado correctamente");
            limpiarCampos();
            cargarTabla();
            return;
        }

        JOptionPane.showMessageDialog(this, "La eliminación del administrador falló");
    }//GEN-LAST:event_eliminarBtnActionPerformed

    private void modificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtnActionPerformed
        if (lógicaAdministrador.obtener(identificaciónTxtFld.getText(), false) == null) {
            JOptionPane.showMessageDialog(this, "Este administrador no se encuentra registrado");
            return;
        }

        if (!validarDatos()) {
            return;
        }

        if (lógicaAdministrador.actualizar(identificaciónTxtFld.getText(), obtenerAdministrador())) {
            JOptionPane.showMessageDialog(this, "Actualización correcta");
            limpiarCampos();
            cargarTabla();
            return;
        }

        JOptionPane.showMessageDialog(this, "La actualización falló");
    }//GEN-LAST:event_modificarBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable administradoresTbl;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JLabel edadError;
    private javax.swing.JTextField edadTxtFld;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JLabel identificaciónError;
    private javax.swing.JTextField identificaciónTxtFld;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton modificarBtn;
    private javax.swing.JTextField nombreUsuarioTxtFld;
    private javax.swing.JLabel nombresError;
    private javax.swing.JTextField nombresTxtFld;
    private javax.swing.JLabel primerApellidoError;
    private javax.swing.JTextField primerApellidoTxtFld;
    private javax.swing.JButton registrarBtn;
    private javax.swing.JComboBox<String> rolCmbBx;
    private javax.swing.JLabel segundoApellidoError;
    private javax.swing.JTextField segundoApellidoTxtFld;
    // End of variables declaration//GEN-END:variables
}
