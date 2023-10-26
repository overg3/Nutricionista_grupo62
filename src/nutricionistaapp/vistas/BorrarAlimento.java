/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionistaapp.vistas;

import java.text.Normalizer;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import nutricionistaapp.accesoDatos.ComidaData;

import nutricionistaapp.entidades.Comida;

/**
 *
 * @author Agustín Nieva
 */
public class BorrarAlimento extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTabla;
    private List<Comida> listarAlimentos;

    public BorrarAlimento() {
        initComponents();
        nuevoModeloTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLbscr = new javax.swing.JLabel();
        jTBscr = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAlimentos = new javax.swing.JTable();
        jBbrr = new javax.swing.JButton();
        jBCanc = new javax.swing.JButton();

        jLabel1.setText("Borrar Alimento");

        jLbscr.setText("Buscar Alimento:");

        jTBscr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBscrActionPerformed(evt);
            }
        });
        jTBscr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBscrKeyReleased(evt);
            }
        });

        jTAlimentos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTAlimentos);

        jBbrr.setText("Borrar Alimento");
        jBbrr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbrrActionPerformed(evt);
            }
        });

        jBCanc.setText("Cancelar");
        jBCanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jBbrr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBCanc))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLbscr, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTBscr, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(105, 105, 105))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTBscr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbscr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBbrr)
                    .addComponent(jBCanc))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTBscrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBscrActionPerformed

    }//GEN-LAST:event_jTBscrActionPerformed

    private void jBCancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancActionPerformed
        dispose();
    }//GEN-LAST:event_jBCancActionPerformed

    private void jBbrrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbrrActionPerformed
        int fila = jTAlimentos.getSelectedRow();
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea "
                + "borrar alimento?", " Borrar",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == 0) {
            String NombreComida = (String) jTAlimentos.getValueAt(fila, 0);
            Comida comida = ComidaData.buscarComidaNombre(NombreComida);
            ComidaData.bajaComida(comida.getIdComida());

            iniciarListaAlimentos();
            
        }

    }//GEN-LAST:event_jBbrrActionPerformed

    private void jTBscrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBscrKeyReleased
        limpiarTabla();
        String BuscarComida = quitarAcentos(jTBscr.getText().trim().toLowerCase());
        DefaultTableModel modelo = (DefaultTableModel) jTAlimentos.getModel();
        listarAlimentos = ComidaData.listarAlimentos();

        for (Comida Comida : listarAlimentos) {
            if (Comida.getNombre().toLowerCase().startsWith(BuscarComida)) {
                Object[] fila = {Comida.getNombre(), Comida.getCalorias(),
                    Comida.getTipo(), Comida.getIdComida()};
                modelo.addRow(fila);
            }
        }


    }//GEN-LAST:event_jTBscrKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCanc;
    private javax.swing.JButton jBbrr;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLbscr;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAlimentos;
    private javax.swing.JTextField jTBscr;
    // End of variables declaration//GEN-END:variables
public void nuevoModeloTabla() {

        listarAlimentos = null;

        modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int col) {
                return false;
            }
        };

        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Tipo");
        modeloTabla.addColumn("Calorias");
        modeloTabla.addColumn("Estado");

        listarAlimentos = ComidaData.listarAlimentos();

        for (Comida Comida : listarAlimentos) {
            Object[] fila = {Comida.getNombre(), Comida.getCalorias(),
                Comida.getTipo(), Comida.getIdComida()};
            modeloTabla.addRow(fila);
        }

        jTAlimentos.setModel(modeloTabla);

    }

    private void limpiarTabla() {
        modeloTabla.setRowCount(0);
    }

    private void iniciarListaAlimentos() {
        limpiarTabla();
        listarAlimentos = ComidaData.listarAlimentos();
        for (Comida comida : listarAlimentos) {
            Object[] fila = {comida.getNombre(), comida.getCalorias(),
                comida.getTipo(), comida.getIdComida()};
            modeloTabla.addRow(fila);
        }

    }

    private String quitarAcentos(String cadena) {
        String cadenaNormalizada = Normalizer.normalize(cadena, Normalizer.Form.NFD);
        return cadenaNormalizada.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }
}
