package nutricionistaapp.vistas;

import java.awt.Dimension;
import java.text.Normalizer;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import nutricionistaapp.accesoDatos.ComidaData;
import nutricionistaapp.entidades.Comida;

public class BorrarAlimento extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTabla;
    private List<Comida> listarAlimentos;

    public BorrarAlimento(Dimension size) {
        initComponents();
        centrarVentana(size);
        nuevoModeloTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jLbscr = new javax.swing.JLabel();
        jTBscr = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAlimentos = new javax.swing.JTable();
        jBbrr = new javax.swing.JButton();
        jBCanc = new javax.swing.JButton();

        setClosable(true);
        setTitle("Borrar Alimento");

        jLbscr.setText("Buscar Alimento:");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLbscr, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTBscr, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jBbrr)
                        .addGap(18, 18, 18)
                        .addComponent(jBCanc)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTBscr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbscr))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBbrr)
                    .addComponent(jBCanc))
                .addGap(57, 57, 57))
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

    private void jBCancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancActionPerformed

        dispose();

    }//GEN-LAST:event_jBCancActionPerformed

    private void jBbrrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbrrActionPerformed

        int fila = jTAlimentos.getSelectedRow();

        if (fila > -1) {

            int respuesta = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea "
                    + "borrar el alimento?", " Borrar",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (respuesta == 0) {

                String NombreComida = (String) jTAlimentos.getValueAt(fila, 0);
                Comida comida = ComidaData.buscarComidaNombre(NombreComida);
                ComidaData.bajaComida(comida.getIdComida());

                iniciarListaAlimentos();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila",
                    " Advertencia", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_jBbrrActionPerformed

    private void jTBscrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBscrKeyReleased

        limpiarTabla();
        String buscarComida = quitarAcentos(jTBscr.getText().trim().toLowerCase());
        DefaultTableModel modelo = (DefaultTableModel) jTAlimentos.getModel();
        listarAlimentos = ComidaData.listarAlimentos();

        for (Comida comida : listarAlimentos) {
            if (comida.getNombre().toLowerCase().startsWith(buscarComida)) {
                Object[] fila = {comida.getNombre(), comida.getTipo(), comida.getCalorias()};
                modelo.addRow(fila);
            }
        }

    }//GEN-LAST:event_jTBscrKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCanc;
    private javax.swing.JButton jBbrr;
    private javax.swing.JColorChooser jColorChooser1;
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
        modeloTabla.addColumn("Calorías (kcal)");

        listarAlimentos = ComidaData.listarAlimentos();

        for (Comida comida : listarAlimentos) {
            Object[] fila = {comida.getNombre(), comida.getTipo(), comida.getCalorias()};
            modeloTabla.addRow(fila);
        }

        jTAlimentos.setModel(modeloTabla);
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
        jTAlimentos.setRowSorter(sorter);
    }

    private void limpiarTabla() {
        modeloTabla.setRowCount(0);
    }

    private void iniciarListaAlimentos() {

        limpiarTabla();
        listarAlimentos = ComidaData.listarAlimentos();

        for (Comida comida : listarAlimentos) {
            Object[] fila = {comida.getNombre(), comida.getTipo(), comida.getCalorias()};
            modeloTabla.addRow(fila);
        }
    }

    private String quitarAcentos(String cadena) {

        String cadenaNormalizada = Normalizer.normalize(cadena, Normalizer.Form.NFD);
        return cadenaNormalizada.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }

    private void centrarVentana(Dimension size) {

        Dimension internalFrameSize = this.getSize();
        setLocation((size.width - internalFrameSize.width) / 2,
                (size.height - internalFrameSize.height) / 2);
    }

}
