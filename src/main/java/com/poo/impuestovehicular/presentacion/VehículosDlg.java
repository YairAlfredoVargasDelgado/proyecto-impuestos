package com.poo.impuestovehicular.presentacion;

import com.poo.impuestovehicular.entidades.ClaseDeVehículo;
import com.poo.impuestovehicular.entidades.Cliente;
import com.poo.impuestovehicular.entidades.Impuesto;
import com.poo.impuestovehicular.entidades.Marca;
import com.poo.impuestovehicular.entidades.TipoDeVehículo;
import com.poo.impuestovehicular.entidades.Vehículo;
import com.poo.impuestovehicular.logica.LógicaCliente;
import com.poo.impuestovehicular.logica.LógicaImpuesto;
import com.poo.impuestovehicular.logica.LógicaMarca;
import com.poo.impuestovehicular.logica.LógicaVehículo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class VehículosDlg extends javax.swing.JDialog {

    private final LógicaMarca lógicaMarca;
    private final LógicaVehículo lógicaVehículo;

    private Cliente cliente;

    public VehículosDlg(java.awt.Frame parent, boolean modal, Cliente cliente) {
        super(parent, modal);
        initComponents();
        this.cliente = cliente;
        lógicaMarca = new LógicaMarca();
        lógicaVehículo = new LógicaVehículo();
        cargarMarcaCmbBx();
        cargarClaseCmbBx();
        cargarTipoCmbBx();
        cargarVehículosTbl();
    }

    private void cargarMarcaCmbBx() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();

        for (Marca m: lógicaMarca.obtenerTodas(true)) {
            model.addElement(m);
        }

        marcaCmbBx.setModel(model);
        marcaCmbBx.setSelectedIndex(0);
    }

    private void cargarClaseCmbBx() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Automóvil");
        lista.add("Carga");
        lista.add("Pasajero");
        lista.add("Motocicleta");

        model.addAll(lista);

        claseCmbBx.setModel(model);
        claseCmbBx.setSelectedIndex(0);
    }

    private void cargarTipoCmbBx() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();

        model.addElement("Particular");
        model.addElement("Público");

        tipoCmbBx.setModel(model);
        tipoCmbBx.setSelectedIndex(0);
    }

    private void cargarVehículosTbl() {
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Placa");
        model.addColumn("Marca");
        model.addColumn("Clase");
        model.addColumn("Tipo");
        model.addColumn("Modelo");
        model.addColumn("Avalúo");
        model.addColumn("Capacidad");

        if (cliente != null) {
            if (cliente.getVehículos() != null) {
                for (Vehículo v : cliente.getVehículos()) {
                    model.addRow(new Object[]{
                        v.getPlaca(),
                        v.getMarca(),
                        v.getClase(),
                        v.getTipo(),
                        v.getModelo(),
                        v.getAvaluo(),
                        v.getCapacidad()
                    });
                }
            } else {
                for (Vehículo v : lógicaVehículo.obtenerTodas(false)) {
                    model.addRow(new Object[]{
                        v.getPlaca(),
                        v.getMarca(),
                        v.getClase(),
                        v.getTipo(),
                        v.getModelo(),
                        v.getAvaluo(),
                        v.getCapacidad()
                    });
                }
            }
        } else {
            for (Vehículo v : lógicaVehículo.obtenerTodas(false)) {
                model.addRow(new Object[]{
                    v.getPlaca(),
                    v.getMarca(),
                    v.getClase(),
                    v.getTipo(),
                    v.getModelo(),
                    v.getAvaluo(),
                    v.getCapacidad()
                });
            }
        }

        vehículosTbl.setModel(model);
    }

    private Vehículo obtenerVehículo() {
        Vehículo vehículo = new Vehículo();

        vehículo.setId(placaTxtFld.getText());
        vehículo.setPlaca(placaTxtFld.getText());
        vehículo.setModelo(modeloTxtFld.getText());
        vehículo.setClase(ClaseDeVehículo.valueOf(claseCmbBx.getSelectedItem().toString().toUpperCase()));
        vehículo.setTipo(TipoDeVehículo.valueOf(tipoCmbBx.getSelectedItem().toString().toUpperCase()));
        vehículo.setIdMarca(marcaCmbBx.getSelectedItem().toString());
        vehículo.setAvaluo(Double.parseDouble(avalúoTxtFld.getText()));
        vehículo.setCapacidad(Integer.parseInt(capacidadTxtFld.getText()));
        vehículo.setCédulaCliente(cliente.getIdentificación());
        vehículo.setBaseGravable(Float.parseFloat(baseGravableTxtFld.getText()));
        vehículo.setFechaDeCompra(LocalDate.now());

        return vehículo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        placaTxtFld = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        marcaCmbBx = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        vehículosTbl = new javax.swing.JTable();
        claseCmbBx = new javax.swing.JComboBox<>();
        tipoCmbBx = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        modeloTxtFld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        avalúoTxtFld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        capacidadTxtFld = new javax.swing.JTextField();
        baseGravableLbl = new javax.swing.JLabel();
        baseGravableTxtFld = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setText("Avalúo");
        jLabel5.setToolTipText("");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo");

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Capacidad");

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        marcaCmbBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        vehículosTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(vehículosTbl);

        claseCmbBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tipoCmbBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("Placa");

        jLabel2.setText("Marca");

        jLabel3.setText("Clase");

        jLabel6.setText("$");

        jLabel4.setText("Modelo");

        baseGravableLbl.setText("Base gravable");

        jLabel10.setText("$");

        jButton6.setText("Liquidar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(baseGravableLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(baseGravableTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(capacidadTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(avalúoTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(modeloTxtFld)
                                        .addComponent(tipoCmbBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(claseCmbBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(placaTxtFld)
                                        .addComponent(marcaCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addComponent(jButton6)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(placaTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcaCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(claseCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modeloTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avalúoTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(capacidadTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(baseGravableLbl)
                            .addComponent(baseGravableTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(14, 14, 14)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!lógicaVehículo.registrar(obtenerVehículo())) {
            JOptionPane.showMessageDialog(this, "El registro del vehículo falló");
            return;
        }

        JOptionPane.showMessageDialog(this, "Registro de vehículo exitoso");

        cliente = new LógicaCliente().obtener(cliente.getIdentificación(), false);

        cargarVehículosTbl();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Vehículo v = lógicaVehículo.obtener(placaTxtFld.getText(), false);
        modeloTxtFld.setText(v.getModelo());
        avalúoTxtFld.setText(v.getAvaluo().toString());
        capacidadTxtFld.setText(v.getCapacidad().toString());
        baseGravableTxtFld.setText(v.getBaseGravable().toString());

        this.cliente = v.getCliente();
        cargarVehículosTbl();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!lógicaVehículo.actualizar(placaTxtFld.getText(), obtenerVehículo())) {
            JOptionPane.showMessageDialog(this, "La actualización falló");
            return;
        }

        JOptionPane.showMessageDialog(this, "La actualización fué exitosa");
        cargarVehículosTbl();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!lógicaVehículo.eliminar(placaTxtFld.getText())) {
            JOptionPane.showMessageDialog(this, "La eliminación del vehículo falló");
            return;
        }

        JOptionPane.showMessageDialog(this, "La eliminación del vehículo fue correcta");
        cargarVehículosTbl();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Vehículo vehículo = new LógicaVehículo().obtener(placaTxtFld.getText(), false);
        
        if (vehículo == null) {
            JOptionPane.showMessageDialog(this, "Este vehículo no está registrado");
            return;
        }
        
        LógicaImpuesto li = new LógicaImpuesto();
        Impuesto impuesto = new Impuesto();
        
        impuesto.setId(((Integer)(li.count() + 1)).toString());
        impuesto.setPagado(false);
        impuesto.setIdVehículo(vehículo.getId());
        impuesto.setFechaDeLiquidación(LocalDate.now());
        impuesto.setVehículo(vehículo);
        impuesto.setTarifa();
        impuesto.liquidar();
        
        if (!li.registrar(impuesto)) {
            JOptionPane.showMessageDialog(this, "La liquidación falló");
            return;
        }
        
        JOptionPane.showMessageDialog(this, "La liquidación fue exitosa");
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField avalúoTxtFld;
    private javax.swing.JLabel baseGravableLbl;
    private javax.swing.JTextField baseGravableTxtFld;
    private javax.swing.JTextField capacidadTxtFld;
    private javax.swing.JComboBox<String> claseCmbBx;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> marcaCmbBx;
    private javax.swing.JTextField modeloTxtFld;
    private javax.swing.JTextField placaTxtFld;
    private javax.swing.JComboBox<String> tipoCmbBx;
    private javax.swing.JTable vehículosTbl;
    // End of variables declaration//GEN-END:variables
}
