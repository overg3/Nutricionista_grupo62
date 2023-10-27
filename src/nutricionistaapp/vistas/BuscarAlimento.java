package nutricionistaapp.vistas;

import java.awt.Dimension;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import nutricionistaapp.accesoDatos.ComidaData;
import nutricionistaapp.categorias.ComidaTipo;
import nutricionistaapp.entidades.Comida;

public class BuscarAlimento extends javax.swing.JInternalFrame {

    private List<Comida> listaComidas;
    private Comida comidaSeleccionada;

    public BuscarAlimento(Dimension size) {
        initComponents();
        centrarVentana(size);

        setTableModelAlimentos();
        setListaTiposAlimentosComboModel();
        setTableListenerYInfo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlimentos = new javax.swing.JTable();
        jbCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfCalorias = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcbTipos = new javax.swing.JComboBox();
        jtfNombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfCaloriasMod = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jcbTiposMod = new javax.swing.JComboBox();
        jtfNombreMod = new javax.swing.JTextField();
        jbMod = new javax.swing.JButton();

        setClosable(true);
        setTitle(" Buscar / Modificar Alimento");

        jtAlimentos.setModel(new javax.swing.table.DefaultTableModel(
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
        jtAlimentos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jtAlimentos);

        jbCancelar.setText("Cerrar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), " Filtrar Lista ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel1.setText("Filtrar por nombre:");

        jLabel2.setText("Filtrar por categoría:");

        jLabel4.setText("Filtrar calorías:");

        jtfCalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCaloriasActionPerformed(evt);
            }
        });
        jtfCalorias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCaloriasKeyReleased(evt);
            }
        });

        jLabel3.setText("(Kcal.)");

        jcbTipos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbTiposItemStateChanged(evt);
            }
        });

        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });
        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNombreKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbTipos, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), " Modificar Alimento ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel5.setText("Cambiar nombre:");

        jLabel6.setText("Cambiar categoría:");

        jLabel7.setText("Cambiar calorías:");

        jtfCaloriasMod.setEnabled(false);
        jtfCaloriasMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCaloriasModActionPerformed(evt);
            }
        });
        jtfCaloriasMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCaloriasModKeyReleased(evt);
            }
        });

        jLabel8.setText("(Kcal.)");

        jcbTiposMod.setEnabled(false);
        jcbTiposMod.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbTiposModItemStateChanged(evt);
            }
        });

        jtfNombreMod.setEnabled(false);
        jtfNombreMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreModActionPerformed(evt);
            }
        });
        jtfNombreMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNombreModKeyReleased(evt);
            }
        });

        jbMod.setText("Modificar Alimento");
        jbMod.setEnabled(false);
        jbMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfNombreMod)
                                .addComponent(jcbTiposMod, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtfCaloriasMod, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbMod)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfNombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbTiposMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfCaloriasMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jbMod)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbCancelar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCaloriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCaloriasActionPerformed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtfNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyReleased

        jcbTipos.setSelectedIndex(0);
        jtfCalorias.setText("");
        String nombre = jtfNombre.getText().trim().toLowerCase();
        DefaultTableModel tableModel = (DefaultTableModel) jtAlimentos.getModel();

        // Se pasa el nombre de la comida y el modelo de tabla por parametro
        filtrarComidasPorNombre(nombre, tableModel);

    }//GEN-LAST:event_jtfNombreKeyReleased

    private void jcbTiposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbTiposItemStateChanged

        jtfCalorias.setText("");
        jtfNombre.setText("");
        ComidaTipo tipo = (ComidaTipo) jcbTipos.getSelectedItem();
        DefaultTableModel tableModel = (DefaultTableModel) jtAlimentos.getModel();

        // Se pasa el tipo y el modelo de tabla por parametro 
        filtrarComidasPorTipo(tipo, tableModel);

    }//GEN-LAST:event_jcbTiposItemStateChanged

    private void jtfCaloriasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCaloriasKeyReleased

        jtfNombre.setText("");
        jcbTipos.setSelectedIndex(0);
        try {
            int calorias = Integer.parseInt(jtfCalorias.getText().trim());
            DefaultTableModel tableModel = (DefaultTableModel) jtAlimentos.getModel();
            // Se pasa el nombre de la comida y el modelo de tabla por parametro
            filtrarComidasPorCalorias(calorias, tableModel);
        } catch (NumberFormatException e) {
        }


    }//GEN-LAST:event_jtfCaloriasKeyReleased

    private void jtfCaloriasModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCaloriasModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCaloriasModActionPerformed

    private void jtfCaloriasModKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCaloriasModKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCaloriasModKeyReleased

    private void jcbTiposModItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbTiposModItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTiposModItemStateChanged

    private void jtfNombreModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreModActionPerformed

    private void jtfNombreModKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreModKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreModKeyReleased

    private void jbModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModActionPerformed

        try {
            if (!jtfNombreMod.getText().trim().isEmpty()
                    && !jtfCaloriasMod.getText().trim().isEmpty()) {

                comidaSeleccionada = obtenerCambios();
                ComidaData.modificarComida(comidaSeleccionada);

                refrescarTabla();
                limpiarComponentes();

            } else {
                JOptionPane.showMessageDialog(null, "Hay campos sin completar",
                        " Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, " Ingrese un valor válido para "
                    + "las calorías", " Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jbModActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbMod;
    private javax.swing.JComboBox jcbTipos;
    private javax.swing.JComboBox jcbTiposMod;
    private javax.swing.JTable jtAlimentos;
    private javax.swing.JTextField jtfCalorias;
    private javax.swing.JTextField jtfCaloriasMod;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfNombreMod;
    // End of variables declaration//GEN-END:variables

    private void centrarVentana(Dimension size) {
        Dimension internalFrameSize = this.getSize();

        setLocation((size.width - internalFrameSize.width) / 2,
                (size.height - internalFrameSize.height) / 2);
    }

    private void setTableModelAlimentos() {

        listaComidas = null;

        // Instanciar nuevo modelo de tabla con celdas NO editables
        DefaultTableModel tableModelAlimentos = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int col) {
                return false;
            }
        };

        tableModelAlimentos.addColumn("Alimento");
        tableModelAlimentos.addColumn("Tipo");
        tableModelAlimentos.addColumn("Calorías (kcal)");

        // Importar la lista de alimentos de la base de datos 
        // y agregar las filas a la tabla
        listaComidas = ComidaData.listarAlimentos();

        for (Comida comida : listaComidas) {
            Object[] fila = {comida.getNombre(), comida.getTipo(),
                comida.getCalorias()};
            tableModelAlimentos.addRow(fila);
        }

        // Setear el modelo creado al componente JTable
        jtAlimentos.setModel(tableModelAlimentos);
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tableModelAlimentos);
        jtAlimentos.setRowSorter(sorter);

    }

    private void setListaTiposAlimentosComboModel() {

        DefaultComboBoxModel<ComidaTipo> comboBoxModel_1 = new DefaultComboBoxModel<>();
        DefaultComboBoxModel<ComidaTipo> comboBoxModel_2 = new DefaultComboBoxModel<>();

        comboBoxModel_1.addElement(null);

        for (ComidaTipo value : ComidaTipo.values()) {
            comboBoxModel_1.addElement(value);
            comboBoxModel_2.addElement(value);
        }
        jcbTipos.setModel(comboBoxModel_1);
        jcbTiposMod.setModel(comboBoxModel_2);
    }

    private void filtrarComidasPorNombre(String nombre, DefaultTableModel tableModel) {

        // Se eliminan todas filas de la tabla
        tableModel.setRowCount(0);

        // Se recorre la lista de comidas y se agregan a la tabla si el nombre
        // de la comida coincide
        for (Comida comida : listaComidas) {
            if (comida.getNombre().toLowerCase().startsWith(nombre)) {
                Object[] fila = {comida.getNombre(), comida.getTipo(),
                    comida.getCalorias()};
                tableModel.addRow(fila);
            }
        }
    }

    private void filtrarComidasPorTipo(ComidaTipo tipo, DefaultTableModel tableModel) {

        // Se borran las filas de la tabla de comidas
        tableModel.setRowCount(0);

        // Si el tipo está vacío se rellenan las filas con todas las comidas
        // Sino se agregan las comidas que coincidan con el tipo seleccionado
        if (tipo == null) {
            for (Comida comida : listaComidas) {
                Object[] fila = {comida.getNombre(), comida.getTipo(),
                    comida.getCalorias()};
                tableModel.addRow(fila);
            }
        } else {
            for (Comida comida : listaComidas) {
                if (comida.getTipo().equals(tipo)) {
                    Object[] fila = {comida.getNombre(), comida.getTipo(),
                        comida.getCalorias()};
                    tableModel.addRow(fila);
                }
            }
        }
    }

    private void filtrarComidasPorCalorias(int calorias, DefaultTableModel tableModel) {

        // Se eliminan todas filas de la tabla
        tableModel.setRowCount(0);

        // Se recorre la lista de comidas y se agregan a la tabla si el nombre
        // de la comida coincide
        for (Comida comida : listaComidas) {
            if (comida.getCalorias() >= calorias) {
                Object[] fila = {comida.getNombre(), comida.getTipo(),
                    comida.getCalorias()};
                tableModel.addRow(fila);
            }
        }
    }

    private void setTableListenerYInfo() {

        ListSelectionModel selectionModel = jtAlimentos.getSelectionModel();

        // Listener que controla si hay una fila seleccionada
        selectionModel.addListSelectionListener((ListSelectionEvent lse) -> {
            if (!lse.getValueIsAdjusting()) {

                int fila = jtAlimentos.getSelectedRow();

                if (fila == -1) {
                    jtfNombreMod.setEnabled(false);
                    jtfCaloriasMod.setEnabled(false);
                    jcbTiposMod.setEnabled(false);
                    jbMod.setEnabled(false);
                } else {
                    jtfNombreMod.setEnabled(true);
                    jtfCaloriasMod.setEnabled(true);
                    jcbTiposMod.setEnabled(true);
                    jbMod.setEnabled(true);
                    String nombre = (String) jtAlimentos.getValueAt(fila, 0);

                    comidaSeleccionada = ComidaData.buscarComidaNombre(nombre);

                    jtfNombreMod.setText(comidaSeleccionada.getNombre());
                    jtfCaloriasMod.setText("" + comidaSeleccionada.getCalorias());
                    jcbTiposMod.setSelectedItem(comidaSeleccionada.getTipo());
                }
            }
        });
    }

    private void refrescarTabla() {

        // Obtener el modelo de tabla y
        // obtener la lista actualizada de alimentos
        DefaultTableModel tableModel = (DefaultTableModel) jtAlimentos.getModel();
        listaComidas = ComidaData.listarAlimentos();

        // Eliminar las filas de la tabla y volver a insertar los alimentos
        tableModel.setRowCount(0);

        for (Comida comida : listaComidas) {

            Object[] fila = {comida.getNombre(), comida.getTipo(),
                comida.getCalorias()};
            tableModel.addRow(fila);
        }

    }

    private void limpiarComponentes() {

        jtfNombreMod.setText("");
        jtfNombre.setText("");
        jtfCaloriasMod.setText("");
        jtfCalorias.setText("");
        jcbTiposMod.setSelectedIndex(0);
        jcbTipos.setSelectedIndex(0);

    }

    private Comida obtenerCambios() {

        String nombre = jtfNombreMod.getText().trim();
        double calorias = Double.parseDouble(jtfCaloriasMod.getText().trim());
        ComidaTipo tipo = (ComidaTipo) jcbTiposMod.getSelectedItem();

        comidaSeleccionada.setNombre(nombre);
        comidaSeleccionada.setTipo(tipo);
        comidaSeleccionada.setCalorias(calorias);

        return comidaSeleccionada;

    }

}
