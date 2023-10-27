/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionistaapp.vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nutricionistaapp.accesoDatos.PacienteData;
import nutricionistaapp.accesoDatos.RegistroData;
import nutricionistaapp.entidades.Paciente;
import nutricionistaapp.entidades.Registro;

public class RegistroPesoGUI extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int col) {
            return false;
        }
    };

    public RegistroPesoGUI(Dimension size) {
        initComponents();
        centrarVentana(size);
        cabeza();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jtfdni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableRegistro = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jtpaciente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfPeso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Registro de Peso");

        jPanel1.setForeground(new java.awt.Color(153, 153, 255));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtfdni.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jtfdni.setForeground(new java.awt.Color(153, 153, 153));
        jtfdni.setText("Ingrese el  D.N.I");
        jtfdni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfdniFocusGained(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Peso");

        jtableRegistro.setModel(new javax.swing.table.DefaultTableModel(
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
        jtableRegistro.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jtableRegistro);

        jButton2.setText("Limpiar datos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cerrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jtpaciente.setEditable(false);
        jtpaciente.setText(" ");
        jtpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtpacienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Paciente");

        jLabel3.setText("Agregar Nuevo Registro:");

        jtfPeso.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jtfPeso.setForeground(new java.awt.Color(153, 153, 153));
        jtfPeso.setText("Peso");
        jtfPeso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfPesoFocusGained(evt);
            }
        });

        jLabel4.setText("Kg.");

        jButton4.setText("Agregar");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel2)
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfdni, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(30, 30, 30)
                                .addComponent(jButton4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jtfdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        limpiar();
        try {
            int dni = Integer.parseInt(jtfdni.getText());
            Paciente pacientx = PacienteData.buscarPacienteDNI(jtfdni.getText());
            jtpaciente.setText(pacientx.getNombre() + "  " + pacientx.getApellido());

            ArrayList<Registro> reg = (ArrayList<Registro>) RegistroData.listaRegistrosPorDni(pacientx.getDni());
            for (Registro x : reg) {
                modelo.addRow(new Object[]{x.getIdRegistro(), x.getPaciente(), x.getPeso(), x.getFecha()});
                jtableRegistro.setModel(modelo);
            }
            
            jButton4.setEnabled(true);
            
        } catch (NumberFormatException xe) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor válido");
            jButton4.setEnabled(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    private void jtpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtpacienteActionPerformed
//ssssssssssssssssssssssssssssssssssssss//     
    }//GEN-LAST:event_jtpacienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        limpiar();
        jtpaciente.setText("");
        formatearTexto();
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {

            String pesox = jtfPeso.getText();
            double nuevoReg = Double.parseDouble(pesox);
            Paciente paciente = PacienteData.buscarPacienteDNI(jtfdni.getText());
            LocalDate fecha = LocalDate.now();
            Registro registro = new Registro(paciente, nuevoReg, fecha, true);
            RegistroData.agregarRegistro(registro);
            limpiar();
            ArrayList<Registro> reg = (ArrayList<Registro>) RegistroData.listaRegistrosPorDni(paciente.getDni());

            for (Registro x : reg) {
                modelo.addRow(new Object[]{x.getIdRegistro(), x.getPaciente(), x.getPeso(), x.getFecha()});
                jtableRegistro.setModel(modelo);
            }

            jButton4.setEnabled(false);
            formatearTexto();

        } catch (NumberFormatException xe) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor valido");
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jtfdniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfdniFocusGained
        if (jtfdni.getText().equals("Ingrese el  D.N.I")) {
            jtfdni.setText("");
            jtfdni.setFont(new Font("Arial", Font.PLAIN, 12));
            jtfdni.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jtfdniFocusGained

    private void jtfPesoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfPesoFocusGained

        if (jtfPeso.getText().equals("Peso")) {
            jtfPeso.setText("");
            jtfPeso.setFont(new Font("Arial", Font.PLAIN, 12));
            jtfPeso.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_jtfPesoFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableRegistro;
    private javax.swing.JTextField jtfPeso;
    private javax.swing.JTextField jtfdni;
    private javax.swing.JTextField jtpaciente;
    // End of variables declaration//GEN-END:variables

    private void cabeza() {
//idRegistro	
//idPaciente
//peso
//fecha
//estado
        modelo.addColumn("IdRegistro");
        modelo.addColumn("IdPaciente");
        modelo.addColumn("Peso (kg)");
        modelo.addColumn("Fecha");
        jtableRegistro.setModel(modelo);

    }
//PROBAR PROBAR
/*11111*/
    public void limpiar() {
        int filas = jtableRegistro.getRowCount() - 1;
        for (int f = filas; f > -1; f--) {
            modelo.removeRow(f);
        }
    }

    public void formatearTexto() {
        jtfPeso.setText("Peso");
        jtfPeso.setForeground(new Color(153, 153, 153));
        jtfPeso.setFont(new Font("Arial", Font.ITALIC, 12));
        jtfdni.setText("Ingrese el  D.N.I");
        jtfdni.setForeground(new Color(153, 153, 153));
        jtfdni.setFont(new Font("Arial", Font.ITALIC, 12));
    }

    private void centrarVentana(Dimension size) {
        Dimension internalFrameSize = this.getSize();

        setLocation((size.width - internalFrameSize.width) / 2,
                (size.height - internalFrameSize.height) / 2);
    }

}
