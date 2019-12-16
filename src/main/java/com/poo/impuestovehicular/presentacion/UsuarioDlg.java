package com.poo.impuestovehicular.presentacion;

import com.poo.impuestovehicular.entidades.Administrador;
import com.poo.impuestovehicular.entidades.Cliente;
import com.poo.impuestovehicular.entidades.Usuario;
import com.poo.impuestovehicular.logica.LógicaAdministrador;
import com.poo.impuestovehicular.logica.LógicaCliente;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class UsuarioDlg extends javax.swing.JDialog {

    private Usuario usuario;

    public UsuarioDlg(java.awt.Frame parent, boolean modal, Usuario usuario) {
        super(parent, modal);
        initComponents();
        this.usuario = usuario;
        this.setLocationRelativeTo(parent);

        saludoLbl.setText("Hola " + usuario.getNombres() + " " + usuario.getPrimerApellido() + " " + usuario.getSegundoApellido());
        saludo2Lbl.setText("Por favor completa los campos abajo para activar tu usuario");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreUsuarioTxtFld = new javax.swing.JTextField();
        contraseñaTxtFld = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        confirmarContraseñaTxtFld = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        saludoLbl = new javax.swing.JLabel();
        saludo2Lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre de usuario");

        jLabel2.setText("Contraseña");

        jLabel3.setText("Confirmar contraseña");

        jButton1.setText("Activar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saludoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contraseñaTxtFld, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(nombreUsuarioTxtFld)))
                    .addComponent(saludo2Lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(25, 25, 25)
                        .addComponent(confirmarContraseñaTxtFld)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saludoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saludo2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreUsuarioTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(contraseñaTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(confirmarContraseñaTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!(Arrays.equals(contraseñaTxtFld.getPassword(), confirmarContraseñaTxtFld.getPassword()))) {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden");
            return;
        }

        if (Arrays.toString(contraseñaTxtFld.getPassword()).length() < 6) {
            JOptionPane.showMessageDialog(this, "La contraseña es muy corta");
            return;
        }

        if (nombreUsuarioTxtFld.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El usuario es inválido");
            return;
        }

        usuario.setNombre(nombreUsuarioTxtFld.getText());
        usuario.setContraseña(Arrays.toString(contraseñaTxtFld.getPassword()));

        if (usuario instanceof Cliente) {
            if (!new LógicaCliente().actualizar(usuario.getIdentificación(), (Cliente) usuario)) {
                JOptionPane.showMessageDialog(this, "Error activando usuario, comuníquese con un administrador");
                return;
            }
        }
        
        if (usuario instanceof Administrador) {
            if (!new LógicaAdministrador().actualizar(usuario.getIdentificación(), (Administrador) usuario)) {
                JOptionPane.showMessageDialog(this, "Error activando usuario, comuníquese con un administrador");
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Activación de usuario exitosa");
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmarContraseñaTxtFld;
    private javax.swing.JPasswordField contraseñaTxtFld;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nombreUsuarioTxtFld;
    private javax.swing.JLabel saludo2Lbl;
    private javax.swing.JLabel saludoLbl;
    // End of variables declaration//GEN-END:variables
}
