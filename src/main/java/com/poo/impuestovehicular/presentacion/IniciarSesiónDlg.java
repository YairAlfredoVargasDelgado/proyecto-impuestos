package com.poo.impuestovehicular.presentacion;

import com.poo.impuestovehicular.entidades.Administrador;
import com.poo.impuestovehicular.entidades.Cliente;
import com.poo.impuestovehicular.entidades.Usuario;
import com.poo.impuestovehicular.logica.LógicaAdministrador;
import com.poo.impuestovehicular.logica.LógicaCliente;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class IniciarSesiónDlg extends javax.swing.JDialog {

    public IniciarSesiónDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        initComponents();
    }

    private Usuario usuario = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        identificaciónTxtFld = new javax.swing.JTextField();
        contraseñaTxtFld = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Identificación");

        jLabel2.setText("Contraseña");

        identificaciónTxtFld.setToolTipText("");

        jButton1.setText("Iniciar sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registrarse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(identificaciónTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contraseñaTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(identificaciónTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contraseñaTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LógicaCliente lc = new LógicaCliente();
        LógicaAdministrador la = new LógicaAdministrador();

        for (Cliente c : lc.obtenerTodas(false)) {
            if (c.getIdentificación().equals(identificaciónTxtFld.getText())) {
                if (c.getNombre().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Activa tu usuario para poder continuar");
                    return;
                }

                if (!c.getContraseña().equals(Arrays.toString(contraseñaTxtFld.getPassword()))) {
                    JOptionPane.showMessageDialog(this, "La contraseña es incorrecta");
                    return;
                }

                setUsuario(c);
                this.dispose();
                return;
            }
        }

        for (Administrador a : la.obtenerTodas(true)) {
            if (a.getIdentificación().equals(identificaciónTxtFld.getText())) {
                if (a.getNombre().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Activa tu usuario para poder continuar");
                    return;
                }

                if (!a.getContraseña().equals(Arrays.toString(contraseñaTxtFld.getPassword()))) {
                    JOptionPane.showMessageDialog(this, "La contraseña es incorrecta");
                    return;
                }

                setUsuario(a);
                this.dispose();
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Este usuario no está registrado");
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean validar() {
        return true;
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LógicaCliente lc = new LógicaCliente();
        LógicaAdministrador la = new LógicaAdministrador();

        if (!validar()) {
            JOptionPane.showMessageDialog(this, "Los datos son inválidos");
            return;
        }

        Cliente cliente = lc.obtener(identificaciónTxtFld.getText(), true);
        Administrador admin = la.obtener(identificaciónTxtFld.getText(), true);

        if (cliente == null && admin == null) {
            JOptionPane.showMessageDialog(this, "Esta identificación no está registrada");
            return;
        }

        if (cliente != null) {
            if (!cliente.getNombre().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Este usuario ya está activado");
                return;
            }
            new UsuarioDlg(null, true, cliente).setVisible(true);
        }

        if (admin != null) {
            if (!admin.getNombre().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Este usuario ya está activado");
                return;
            }
            new UsuarioDlg(null, true, admin).setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contraseñaTxtFld;
    private javax.swing.JTextField identificaciónTxtFld;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
