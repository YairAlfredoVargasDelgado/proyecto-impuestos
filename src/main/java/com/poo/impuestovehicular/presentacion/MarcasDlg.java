package com.poo.impuestovehicular.presentacion;

import com.poo.impuestovehicular.entidades.Marca;
import com.poo.impuestovehicular.entidades.Vehículo;
import com.poo.impuestovehicular.logica.LógicaMarca;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MarcasDlg extends javax.swing.JDialog {
    
    private Marca marca = null;
    
    private final LógicaMarca lógicaMarca;

    public MarcasDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lógicaMarca = new LógicaMarca();
        consecutivoLbl.setText(((Integer)(lógicaMarca.count() + 1)).toString());        
        cargarTabla();
    }
    
    private void cargarTabla() {
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Id");
        model.addColumn("Nombre");
        
        for (Marca m: lógicaMarca.obtenerTodas(true)) {
            model.addRow(new Object[] {
                m.getCódigo(),
                m.getNombre()
            });
        }
        
        marcasTbl.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        marcasTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nombreTxtFld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        consecutivoLbl = new javax.swing.JLabel();
        buscarBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        eliminarBtn = new javax.swing.JButton();
        modificarBtn = new javax.swing.JButton();
        registrarBtn = new javax.swing.JButton();
        errorNombreLbl = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        marcasTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(marcasTbl);

        jScrollPane2.setViewportView(jScrollPane1);

        jLabel1.setText("Nombre");

        jLabel2.setText("Consecutivo");

        consecutivoLbl.setText("0000");

        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        eliminarBtn.setText("Eliminar");
        eliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBtnActionPerformed(evt);
            }
        });

        modificarBtn.setText("Modificar");
        modificarBtn.setToolTipText("");
        modificarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBtnActionPerformed(evt);
            }
        });

        registrarBtn.setText("Registrar");
        registrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBtnActionPerformed(evt);
            }
        });

        jButton2.setText("Detalles");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(consecutivoLbl)
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombreTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(errorNombreLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(buscarBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registrarBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modificarBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eliminarBtn))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(consecutivoLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorNombreLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombreTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarBtn)
                    .addComponent(modificarBtn)
                    .addComponent(eliminarBtn)
                    .addComponent(buscarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        Marca marca = lógicaMarca.obtener(nombreTxtFld.getText(), true);
        
        if (marca == null) {
            JOptionPane.showMessageDialog(this, "No hay una marca con este nombre");
            return;
        }
        
        consecutivoLbl.setText(marca.getCódigo());
        
        cargarTabla();
    }//GEN-LAST:event_buscarBtnActionPerformed

    private Marca obtenerMarca() {
        Marca marca = new Marca();
        
        marca.setNombre(nombreTxtFld.getText());
        marca.setCódigo(((Integer)(lógicaMarca.count() + 1)).toString());
        marca.setId(((Integer)(lógicaMarca.count() + 1)).toString());
        
        return marca;
    }
    
    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed
        if (!lógicaMarca.registrar(obtenerMarca())) {
            JOptionPane.showMessageDialog(this, "El registro de la marca falló");
            return;
        }
        
        JOptionPane.showMessageDialog(this, "Registro exitoso");
        cargarTabla();
    }//GEN-LAST:event_registrarBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void modificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtnActionPerformed
        if (!lógicaMarca.actualizar(consecutivoLbl.getText(), obtenerMarca())) {
            JOptionPane.showMessageDialog(this, "La modificación falló");
            return;
        }
        
        JOptionPane.showMessageDialog(this, "La modificación fué exitosa");
        cargarTabla();
    }//GEN-LAST:event_modificarBtnActionPerformed

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
        Marca marca = lógicaMarca.obtener(nombreTxtFld.getText(), false);
        if (marca.getVehículos().size() > 0) {
            JOptionPane.showMessageDialog(this, "Esta marca no se puede eliminar porque tiene vehículos registrados");
        }
        
        if (!lógicaMarca.eliminar(nombreTxtFld.getText())) {
            JOptionPane.showMessageDialog(this, "La eliminación falló");
            return;
        }
        
        JOptionPane.showMessageDialog(this, "La eliminación fue exitosa");
        cargarTabla();
    }//GEN-LAST:event_eliminarBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Marca _marca = lógicaMarca.obtener(nombreTxtFld.getText(), false);
        
        if (_marca == null) {
            JOptionPane.showMessageDialog(this, "Esta marca no está registrada");
            return;
        }
        
        new MarcaDetallesDlg((JFrame)this.getOwner(), true, _marca).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBtn;
    private javax.swing.JLabel consecutivoLbl;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JLabel errorNombreLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable marcasTbl;
    private javax.swing.JButton modificarBtn;
    private javax.swing.JTextField nombreTxtFld;
    private javax.swing.JButton registrarBtn;
    // End of variables declaration//GEN-END:variables
}
