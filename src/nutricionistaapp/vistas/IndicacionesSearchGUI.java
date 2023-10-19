package nutricionistaapp.vistas;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.NumberFormatter;
import nutricionistaapp.accesoDatos.DietaData;
import nutricionistaapp.entidades.Dieta;
import nutricionistaapp.entidades.Paciente;
import nutricionistaapp.entidades.Profesional;

public class IndicacionesSearchGUI extends javax.swing.JDialog {

    private List<Dieta> listaDietas;
    private JComboBox comboBox;

    public IndicacionesSearchGUI(java.awt.Frame parent, boolean modal, JComboBox comboBox) {
        super(parent, modal);
        initComponents();

        this.comboBox = comboBox;

        setTablaDietas();
        formatearSpinners();
        setSpinnerListeners();
        setSelectionListener();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCriterios = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfDieta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfNombrePaciente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfApellidoPaciente = new javax.swing.JTextField();
        jtfNombreProfesional = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtfApelllidoProfesional = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jspinPesoInicial = new javax.swing.JSpinner();
        jspinPesoFinal = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jpResultados = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDietas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jbSeleccionar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Búsqueda avanzada");
        setResizable(false);

        jpCriterios.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), " Criterios ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel2.setText("Nombre de dieta:");

        jtfDieta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfDietaKeyReleased(evt);
            }
        });

        jLabel9.setText("Nombre de paciente:");

        jtfNombrePaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNombrePacienteKeyReleased(evt);
            }
        });

        jLabel10.setText("Apellido de paciente:");

        jtfApellidoPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfApellidoPacienteKeyReleased(evt);
            }
        });

        jtfNombreProfesional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNombreProfesionalKeyReleased(evt);
            }
        });

        jLabel11.setText("Nombre de profesional:");

        jLabel12.setText("Apellido de profesional:");

        jtfApelllidoProfesional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfApelllidoProfesionalKeyReleased(evt);
            }
        });

        jLabel13.setText("Peso inicial:");

        jLabel14.setText("Peso final:");

        jspinPesoInicial.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jspinPesoInicialStateChanged(evt);
            }
        });

        jspinPesoFinal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jspinPesoFinalStateChanged(evt);
            }
        });

        jLabel15.setText("kg");

        jLabel16.setText("kg");

        javax.swing.GroupLayout jpCriteriosLayout = new javax.swing.GroupLayout(jpCriterios);
        jpCriterios.setLayout(jpCriteriosLayout);
        jpCriteriosLayout.setHorizontalGroup(
            jpCriteriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCriteriosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpCriteriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCriteriosLayout.createSequentialGroup()
                        .addGroup(jpCriteriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpCriteriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfDieta)
                            .addComponent(jtfNombrePaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpCriteriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCriteriosLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfNombreProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCriteriosLayout.createSequentialGroup()
                                .addGroup(jpCriteriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpCriteriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfApelllidoProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpCriteriosLayout.createSequentialGroup()
                                        .addComponent(jspinPesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15))
                                    .addGroup(jpCriteriosLayout.createSequentialGroup()
                                        .addComponent(jspinPesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16))))))
                    .addGroup(jpCriteriosLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfApellidoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jpCriteriosLayout.setVerticalGroup(
            jpCriteriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCriteriosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCriteriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jtfNombreProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCriteriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtfNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jtfApelllidoProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCriteriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtfApellidoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jspinPesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCriteriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jspinPesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtDietas.setModel(new javax.swing.table.DefaultTableModel(
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
        jtDietas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jtDietas);

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Resultados de la búsqueda");

        jbSeleccionar.setText("Seleccionar");
        jbSeleccionar.setEnabled(false);
        jbSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpResultadosLayout = new javax.swing.GroupLayout(jpResultados);
        jpResultados.setLayout(jpResultadosLayout);
        jpResultadosLayout.setHorizontalGroup(
            jpResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                    .addGroup(jpResultadosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addGroup(jpResultadosLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jbSeleccionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpResultadosLayout.setVerticalGroup(
            jpResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jpResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSeleccionar)
                    .addComponent(jbCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpCriterios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jpCriterios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfDietaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDietaKeyReleased

        aplicarFiltros();

    }//GEN-LAST:event_jtfDietaKeyReleased

    private void jtfNombrePacienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombrePacienteKeyReleased

        aplicarFiltros();

    }//GEN-LAST:event_jtfNombrePacienteKeyReleased

    private void jtfApellidoPacienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApellidoPacienteKeyReleased

        aplicarFiltros();

    }//GEN-LAST:event_jtfApellidoPacienteKeyReleased

    private void jtfNombreProfesionalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreProfesionalKeyReleased

        aplicarFiltros();

    }//GEN-LAST:event_jtfNombreProfesionalKeyReleased

    private void jtfApelllidoProfesionalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApelllidoProfesionalKeyReleased

        aplicarFiltros();

    }//GEN-LAST:event_jtfApelllidoProfesionalKeyReleased

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed

        dispose();

    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jspinPesoInicialStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jspinPesoInicialStateChanged

        aplicarFiltros();

    }//GEN-LAST:event_jspinPesoInicialStateChanged

    private void jspinPesoFinalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jspinPesoFinalStateChanged

        aplicarFiltros();

    }//GEN-LAST:event_jspinPesoFinalStateChanged

    private void jbSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarActionPerformed

        seleccionarDieta();
        dispose();

    }//GEN-LAST:event_jbSeleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSeleccionar;
    private javax.swing.JPanel jpCriterios;
    private javax.swing.JPanel jpResultados;
    private javax.swing.JSpinner jspinPesoFinal;
    private javax.swing.JSpinner jspinPesoInicial;
    private javax.swing.JTable jtDietas;
    private javax.swing.JTextField jtfApellidoPaciente;
    private javax.swing.JTextField jtfApelllidoProfesional;
    private javax.swing.JTextField jtfDieta;
    private javax.swing.JTextField jtfNombrePaciente;
    private javax.swing.JTextField jtfNombreProfesional;
    // End of variables declaration//GEN-END:variables

    private void setTablaDietas() {

        listaDietas = DietaData.listarDietas();
        DefaultTableModel tableModel = new DefaultTableModel();

        tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int col) {
                return false;
            }
        };

        tableModel.addColumn("ID");
        tableModel.addColumn("Dieta");
        tableModel.addColumn("Paciente");
        tableModel.addColumn("Profesional");
        tableModel.addColumn("Peso Inicial (kg)");
        tableModel.addColumn("Peso Final (kg)");

        for (Dieta dieta : listaDietas) {

            Paciente paciente = dieta.getPaciente();
            Profesional profesional = dieta.getProfesional();
            String nombrePaciente = paciente.getNombre() + " " + paciente.getApellido();
            String nombreProfesional = profesional.getNombre() + " " + profesional.getApellido();

            Object[] fila = {dieta.getIdDieta(), dieta.getNombre(), nombrePaciente,
                nombreProfesional, dieta.getPesoInicial(), dieta.getPesoFinal()};
            tableModel.addRow(fila);
        }
        jtDietas.setModel(tableModel);
    }

    private void formatearSpinners() {

        SpinnerModel model1 = new SpinnerNumberModel(0, 0, 9999, 1);
        SpinnerModel model2 = new SpinnerNumberModel(0, 0, 9999, 1);
        jspinPesoInicial.setModel(model1);
        jspinPesoFinal.setModel(model2);

        JFormattedTextField textField1 = ((JSpinner.DefaultEditor) jspinPesoInicial.getEditor()).getTextField();
        NumberFormatter formatter1 = (NumberFormatter) textField1.getFormatter();
        JFormattedTextField textField2 = ((JSpinner.DefaultEditor) jspinPesoFinal.getEditor()).getTextField();
        NumberFormatter formatter2 = (NumberFormatter) textField2.getFormatter();

        formatter1.setAllowsInvalid(false);
        formatter2.setAllowsInvalid(false);

    }

    private void aplicarFiltros() {

        DefaultTableModel tableModel = (DefaultTableModel) jtDietas.getModel();
        tableModel.setRowCount(0);

        String critDieta = jtfDieta.getText().trim().toLowerCase();
        String critNombrePaciente = jtfNombrePaciente.getText().trim().toLowerCase();
        String critApellidoPaciente = jtfApellidoPaciente.getText().trim().toLowerCase();
        String critNombreProfesional = jtfNombreProfesional.getText().trim().toLowerCase();
        String critApellidoProfesional = jtfApelllidoProfesional.getText().trim().toLowerCase();
        double critPesoInicial = (double) (int) jspinPesoInicial.getValue();
        double critPesoFinal = (double) (int) jspinPesoFinal.getValue();

        for (Dieta dieta : listaDietas) {

            Paciente paciente = dieta.getPaciente();
            Profesional profesional = dieta.getProfesional();
            String fullNamePaciente = paciente.getNombre() + " " + paciente.getApellido();
            String fullNameProfesional = profesional.getNombre() + " " + profesional.getApellido();

            String nombreDieta = dieta.getNombre().trim().toLowerCase();
            String nombrePaciente = dieta.getPaciente().getNombre().trim().toLowerCase();
            String apellidoPaciente = dieta.getPaciente().getApellido().trim().toLowerCase();
            String nombreProfesional = dieta.getProfesional().getNombre().trim().toLowerCase();
            String apellidoProfesional = dieta.getProfesional().getApellido().trim().toLowerCase();
            double pesoInicial = dieta.getPesoInicial();
            double pesoFinal = dieta.getPesoFinal();

            if (nombreDieta.startsWith(critDieta) && nombrePaciente.startsWith(critNombrePaciente)
                    && apellidoPaciente.startsWith(critApellidoPaciente)
                    && nombreProfesional.startsWith(critNombreProfesional)
                    && apellidoProfesional.startsWith(critApellidoProfesional)
                    && pesoInicial >= critPesoInicial && pesoFinal >= critPesoFinal) {

                Object[] fila = {dieta.getIdDieta(), dieta.getNombre(), fullNamePaciente,
                    fullNameProfesional, dieta.getPesoInicial(), dieta.getPesoFinal()};
                tableModel.addRow(fila);

            }
        }
    }

    private void setSpinnerListeners() {

        JComponent editor1 = jspinPesoInicial.getEditor();
        JComponent editor2 = jspinPesoFinal.getEditor();
        JFormattedTextField textField1 = ((JSpinner.DefaultEditor) editor1).getTextField();
        JFormattedTextField textField2 = ((JSpinner.DefaultEditor) editor2).getTextField();

        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                aplicarFiltros();
            }
        });
        textField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                aplicarFiltros();
            }
        });
    }

    private void setSelectionListener() {

        ListSelectionModel selectionModelIndicaciones = jtDietas.getSelectionModel();

        // Listeners que controlan si hay una fila seleccionada
        selectionModelIndicaciones.addListSelectionListener((ListSelectionEvent lse) -> {
            if (!lse.getValueIsAdjusting()) {

                if (jtDietas.getSelectedRow() == -1) {
                    jbSeleccionar.setEnabled(false);
                } else {
                    jbSeleccionar.setEnabled(true);
                }
            }
        });
    }

    private void seleccionarDieta() {

        int idDieta = (int) jtDietas.getValueAt(jtDietas.getSelectedRow(), 0);
        int modelSize = comboBox.getModel().getSize();

        // Bucle para recorrer la lista del ComboBox
        // Si hay coincidencia, se selecciona el item, rompe el bucle y cierra la ventana
        for (int i = 0; i < modelSize; i++) {
            Dieta dieta = (Dieta) comboBox.getModel().getElementAt(i);

            if (dieta.getIdDieta() == idDieta) {
                comboBox.setSelectedIndex(i);
                break;
            }
        }
    }

}
