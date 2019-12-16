package com.poo.impuestovehicular.presentacion;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.poo.impuestovehicular.entidades.Cliente;
import com.poo.impuestovehicular.logica.LógicaCliente;
import javax.swing.JFrame;

public class ClientesDlg extends javax.swing.JDialog {

    private static final long serialVersionUID = -1977158615341235592L;
    private LógicaCliente lógicaCliente = new LógicaCliente();

    public ClientesDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        registrarBtn = new javax.swing.JButton();
        eliminarBtn = new javax.swing.JButton();
        modificarBtn = new javax.swing.JButton();
        primerApellidoTxtFld = new javax.swing.JTextField();
        nombresError = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        identificaciónError = new javax.swing.JLabel();
        segundoApellidoTxtFld = new javax.swing.JTextField();
        primerApellidoError = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        segundoApellidoError = new javax.swing.JLabel();
        buscarBtn = new javax.swing.JButton();
        edadError = new javax.swing.JLabel();
        edadTxtFld = new javax.swing.JTextField();
        identificaciónTxtFld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nombresTxtFld = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nombreUsuarioTxtFld = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        clientesTbl = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        registrarBtn.setText("Registrar");
        registrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBtnActionPerformed(evt);
            }
        });

        eliminarBtn.setText("Eliminar");
        eliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBtnActionPerformed(evt);
            }
        });

        modificarBtn.setText("Modificar");
        modificarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBtnActionPerformed(evt);
            }
        });

        nombresError.setForeground(new java.awt.Color(255, 0, 0));

        jLabel3.setText("Primer apellido");

        identificaciónError.setForeground(new java.awt.Color(255, 0, 0));

        primerApellidoError.setForeground(new java.awt.Color(255, 0, 0));

        jLabel4.setText("Segundo apellido");

        segundoApellidoError.setForeground(new java.awt.Color(255, 0, 0));

        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        edadError.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setText("Identificación");

        jLabel6.setText("Nombre de usuario");

        nombreUsuarioTxtFld.setEnabled(false);

        clientesTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(clientesTbl);

        jScrollPane2.setViewportView(jScrollPane3);

        jButton3.setText("Ver vehículos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Nombres");

        jLabel8.setText("Edad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(edadTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(segundoApellidoTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(nombreUsuarioTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(14, 14, 14)
                                                .addComponent(primerApellidoTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addGap(21, 21, 21))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(nombresTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(identificaciónTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(nombresError, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(primerApellidoError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(segundoApellidoError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(edadError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(identificaciónError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buscarBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(modificarBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(eliminarBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(registrarBtn)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(identificaciónTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(identificaciónError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombresError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombresTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(primerApellidoTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(primerApellidoError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(segundoApellidoError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(segundoApellidoTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edadError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edadTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nombreUsuarioTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(buscarBtn)
                    .addComponent(modificarBtn)
                    .addComponent(eliminarBtn)
                    .addComponent(registrarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarTabla() {
        DefaultTableModel model = new DefaultTableModel();

        clientesTbl.setModel(model);

        model.addColumn("Nombres");
        model.addColumn("Primer apellido");
        model.addColumn("Segundo apellido");
        model.addColumn("Edad");
        model.addColumn("Usuario");

        for (Cliente c : lógicaCliente.obtenerTodas(false)) {
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

        if (identificaciónTxtFld.getText().length() < 7 || identificaciónTxtFld.getText().length() > 10) {
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

    private Cliente obtenerCliente() {
        Cliente c = new Cliente();

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

    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed
        if (lógicaCliente.obtener(identificaciónTxtFld.getText(), true) != null) {
            JOptionPane.showMessageDialog(this, "Este cliente ya se encuentra registrado");
            return;
        }

        if (!validarDatos()) {
            return;
        }

        if (lógicaCliente.registrar(obtenerCliente())) {
            JOptionPane.showMessageDialog(this, "Registro de cliente exitoso");
            limpiarCampos();
            cargarTabla();
            return;
        }

        JOptionPane.showMessageDialog(this, "El registro de cliente falló");
    }//GEN-LAST:event_registrarBtnActionPerformed

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
        Cliente cliente = lógicaCliente.obtener(identificaciónTxtFld.getText(), false);
        
        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "El cliente no se encuentra registrado");
            return;
        }
        
        if (cliente.getVehículos().size() > 0) {
            JOptionPane.showMessageDialog(this, "Este cliente no se puede eliminar porque tiene vehículos asociados");
            return;
        }

        if (lógicaCliente.eliminar(identificaciónTxtFld.getText())) {
            JOptionPane.showMessageDialog(this, "El cliente se ha eliminado correctamente");
            limpiarCampos();
            cargarTabla();
            return;
        }

        JOptionPane.showMessageDialog(this, "La eliminación del cliente falló");
    }//GEN-LAST:event_eliminarBtnActionPerformed

    private void modificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtnActionPerformed
        if (lógicaCliente.obtener(identificaciónTxtFld.getText(), false) == null) {
            JOptionPane.showMessageDialog(this, "Este cliente no se encuentra registrado");
            return;
        }

        if (!validarDatos()) {
            return;
        }

        if (lógicaCliente.actualizar(identificaciónTxtFld.getText(), obtenerCliente())) {
            JOptionPane.showMessageDialog(this, "Actualización correcta");
            limpiarCampos();
            cargarTabla();
            return;
        }

        JOptionPane.showMessageDialog(this, "La actualización falló");
    }//GEN-LAST:event_modificarBtnActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        Cliente c = lógicaCliente.obtener(identificaciónTxtFld.getText(), true);

        if (c == null) {
            JOptionPane.showMessageDialog(this, "Este cliente no está registrado");
            return;
        }

        nombresTxtFld.setText(c.getNombres());
        primerApellidoTxtFld.setText(c.getPrimerApellido());
        segundoApellidoTxtFld.setText(c.getSegundoApellido());
        edadTxtFld.setText(c.getEdad().toString());
        nombreUsuarioTxtFld.setText(c.getNombre());
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (identificaciónTxtFld.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El cliente no está registado");
            return;
        }

        Cliente cliente = lógicaCliente.obtener(identificaciónTxtFld.getText(), false);
        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "Este cliente no está registrado");
            return;
        }

        new ClienteFrm((JFrame) this.getOwner(), true, new LógicaCliente().obtener(identificaciónTxtFld.getText(), false)).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTable clientesTbl;
    private javax.swing.JLabel edadError;
    private javax.swing.JTextField edadTxtFld;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JLabel identificaciónError;
    private javax.swing.JTextField identificaciónTxtFld;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton modificarBtn;
    private javax.swing.JTextField nombreUsuarioTxtFld;
    private javax.swing.JLabel nombresError;
    private javax.swing.JTextField nombresTxtFld;
    private javax.swing.JLabel primerApellidoError;
    private javax.swing.JTextField primerApellidoTxtFld;
    private javax.swing.JButton registrarBtn;
    private javax.swing.JLabel segundoApellidoError;
    private javax.swing.JTextField segundoApellidoTxtFld;
    // End of variables declaration//GEN-END:variables
}
